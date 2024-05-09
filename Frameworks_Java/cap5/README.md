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