Spring security é um framewor de autenticação.
Autenticação é o processo de verfiicar a identidade de um usuário, e a autorização é o processo de determinar se um usuário autenticado tem permissão pra acessar um recurso específico do sistea.
JWT - JSON WEB TOKEN 
Stateful - usam cookies- variável de sessão, usa memória ram.
Stateless- usa mais, economiza recurso.
Com o lombok evita escrever os getters and setters e a parte de hashcode


package br.com.fiap.contato.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "tbl_usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Usuario implements UserDetails {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_USUARIOS"
    )
    @SequenceGenerator(name = "SEQ_USUARIOS", sequenceName = "SEQ_USUARIOS", allocationSize = 1)

    @Column(name = "usuario_id")
    private Long usuarioId;
    private String nome;
    private String email;
    private String senha;

    @Enumerated(EnumType.STRING)
    private UsuarioRole role;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

getAuthorities - quais são as autorizações que o usuário tem. 

Vamos fazer os filtros de segurança

csrf - falsificação entre sites

.sessionManagement(SessionCreationPolicy.STATELESS) - estamos dizendo se vai ser stateless

package br.com.fiap.contato.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filtrarCadeiaDeSeguranca(HttpSecurity httpSecurity) throws Exception{

        return httpSecurity.csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(HttpMethod.GET,"/api/contatos")
                        .permitAll()
                        .anyRequest()
                        .authenticated())
                .build();

    }
}

get pode , post não pode

Criação d controlador de autenticação

endpoint que precisa se autenticar:

@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid UsuarioCadastroDto usuarioCadastroDto){
        UsernamePasswordAuthenticationToken usernamePassword = 
                new UsernamePasswordAuthenticationToken(
                        usuarioCadastroDto.email(), 
                        usuarioCadastroDto.senha());
        
        Authentication auth = authenticationManager.authenticate(usernamePassword);
        
        return ResponseEntity.ok().build();
    }
    
}


precisa ter o authenticationManager-     @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
        
        return authenticationConfiguration.getAuthenticationManager();
    }


Criação do registro do usuário, quando vai gravar a senha vai gravar de forma criptografada

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioExibicaoDto registrar(@RequestBody @Valid UsuarioCadastroDto usuarioCadastroDto){
           UsuarioExibicaoDto usuarioSalvo = null;
           usuarioSalvo = service.gravar(usuarioCadastroDto);
           return usuarioSalvo;
    }


public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioExibicaoDto gravar(UsuarioCadastroDto usuarioCadastroDto){

        String senhaCriptografada = new BCryptPasswordEncoder().encode(usuarioCadastroDto.senha());

        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(usuarioCadastroDto, usuario);
        usuario.setSenha(senhaCriptografada);
        return new UsuarioExibicaoDto(usuarioRepository.save(usuario));
    }

