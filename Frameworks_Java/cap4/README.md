Com o DTO a gente entrega só os dados que ele precisa.
Na hora de cadastrar:

    @Autowired
    private ContatoRepository contatoRepository;

    public ContatoExibicaoDto gravar(ContatoCadastroDto contatoCadastroDto){
        Contato contato = new Contato();
        BeanUtils.copyProperties(contatoCadastroDto, contato);
        return new ContatoExibicaoDto(contatoRepository.save(contato));
    }


    O usuário passa só os dados princiapis e eu crio a classe contato internamente usando o BeanUtils

    BeanValidation - fazer as validações - garanatir que receba os dados de forma correta


package br.com.fiap.contato.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record ContatoCadastroDto(
        Long id,

        @NotBlank(message = "Nome do contato é obrigatório!")
        String nome,

        @NotBlank(message = "E-mail é obrigatório")
        @Email(message = "O email está em formato inválido")
        String email,

        @NotBlank(message = "A senha é obrigatória")
                @Size(min = 6, max = 10, message = "A senha deve ter entre 6 e 10 caracteres")

        @NotBlank(message = "Data de nasciemnto obrigatória")
        String senha,
        LocalDate dataNascimento
) {
}

No controller colocar o @Valid - para dizer que tem de passar pela validação

Customizando mensagens de erro: package br.com.fiap.contato.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNaoEncontradoException extends RuntimeException{

    public UsuarioNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}

server.error.include-binding-errors=always - objeto json com os errors


RestControllerAdvice - qualquer exceção essa classe vai tratar

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> manusearArgumentosInvalidos(MethodArgumentNotValidException erro){
        Map<String, String> mapaDeErro = new HashMap<>();
        List<FieldError> campos = erro.getBindingResult().getFieldErrors();

        for(FieldError campo : campos){
            mapaDeErro.put(campo.getField(), campo.getDefaultMessage());
        }

        return mapaDeErro;
    }

}

    @Query("SELECT c ROM Contato c WHERE c.nome = :nome")
    Optional<Contato> buscarContatoPeloNome(@Param("nome") String nome);

    Voce pode fazer consutas de duas formas ou pelo JPQL ou por consultas derivadas de método - que é o findByEmail

    Implementar paginação

    Pageable - spring framework domain

    http://localhost:8080/api/contatos?size=2 2 itens por vez

    http://localhost:8080/api/contatos?size=2&page=1 - page começa em 0 - page1 - estou na segunda pagina

    http://localhost:8080/api/contatos?sort=id,DESC  - ordenação já vem pronto 

    http://localhost:8080/api/contatos?sort=nome&size=2 da para juntar com o size também.

        @ResponseStatus(HttpStatus.OK)
    @GetMapping("/contatos")
    public Page<ContatoExibicaoDto> listarTodosOsContatos(Pageable paginacao){
        return service.listarTodosOsContatos(paginacao);
    }


    public Page<ContatoExibicaoDto> listarTodosOsContatos(Pageable paginacao){
        return contatoRepository.
                findAll(paginacao)
                .map(ContatoExibicaoDto::new);
    }