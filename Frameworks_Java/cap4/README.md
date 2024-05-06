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
