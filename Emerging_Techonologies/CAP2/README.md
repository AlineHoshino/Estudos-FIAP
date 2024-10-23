

### Resumo da Aula sobre Testes Automatizados e BDD

1. **Introdução ao BDD**
   - Os testes automatizados são essenciais para garantir o comportamento esperado das aplicações, reduzindo erros e aumentando a eficiência.
   - O Behavior Driven Development (BDD) facilita a comunicação entre desenvolvedores e stakeholders, utilizando a linguagem Gherkin para cenários compreensíveis.

2. **História e Frameworks do BDD**
   - O BDD é uma evolução do Test Driven Development (TDD), com Cucumber sendo a ferramenta mais popular. Outros frameworks incluem SpecFlow e Behave.

3. **Estruturação de Cenários em BDD**
   - Cenários devem ser escritos na estrutura “Dado-Quando-Então”, priorizando a perspectiva do usuário e evitando jargões técnicos.

4. **Configuração de Ambiente**
   - Inclui instalação da IDE IntelliJ, configuração de projetos com Maven e dependências como Cucumber e Rest Assured.

5. **Implementação de Testes**
   - Os alunos aprendem a implementar cenários de teste de APIs, validando respostas e tratando erros.

6. **Contextos e Testes de Contrato**
   - A utilização de contextos para manter testes independentes e o uso de JSON Schema para testes de contrato garantem integridade nas respostas da API.

7. **Organização de Testes via Tags**
   - As tags no Gherkin permitem categorizar e gerenciar os testes, como @regressivo e @funcional.

8. **TestRunner e Hooks**
   - Configuração do TestRunner para gerenciar a execução dos testes e uso de Hooks para executar código automaticamente antes ou depois dos testes.

9. **Execução de Testes com Maven**
   - Como executar testes fora da IDE através do Maven, com configurações no `pom.xml`.

10. **Integração em Pipeline CI/CD**
    - Demonstração de como integrar testes em uma pipeline CI/CD usando GitHub Actions.

11. **Conclusão e Importância dos Testes Automatizados**
    - Enfatiza a relevância dos testes automatizados para a qualidade do software e a prevenção de bugs.

12. **Recursos e Referências**
    - Sugestões para aprofundamento na área de testes automatizados e links para repositório GitHub com soluções da aula.

A aula também incentiva os alunos a entender e praticar os conceitos discutidos, além de compartilhar experiências e aprendizados na implementação de testes durante o desenvolvimento de software.

Optar pelo BDD garante que o software atenda as necessidades de negócios de forma clara para todos os envolvidos.

![BDD](img/bdd.png)
baixar projeto, subir docker, depois no intellij ir em settings, plugin - pesquisar Cucumber for java , fazer o mesmo com o lombok
Em settings Editor, inspections- procure Typo e desligue a opção proofreading- apply -ok 
Criar uma pasta features dentro de src/test/resources
cirar um pacote dentro de src/test/javacriar um pacote dentro de src/test/java/sevices, tb uma pasta model
criar um arquivo Cadastro.feature, e criar o teste
Colocar feature no singular em vez de no plural.
# language: pt
Funcionalidade: Cadastro de nova entrega
  Como usuário da API
  Quero cadastrar uma nova entrega
  Para que o registro seja salvo corretamente no sistema
  Cenário: Cadastro bem-sucedido de entrega
    Dado que eu tenha os seguintes dados da entrega:
      | campo          | valor        |
      | numeroPedido   | 1            |
      | nomeEntregador | Ana Silva    |
      | statusEntrega  | EM_SEPARACAO |
      | dataEntrega    | 2024-08-22   |
    Quando eu enviar a requisição para o endpoint "/entregas" de cadastro de entregas
    Então o status code da resposta deve ser 201

Clicar nesse arquivo na lampada na opção steps. Em file-name - CadastroEntregasSteps
campo file-type - java
fole location - src/test/java/steps
Depois alterar o arquivo CadastroEntregasSteps:

package steps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
public class CadastroEntregasSteps {
    @Dado("que eu tenha os seguintes dados da entrega:")
    public void queEuTenhaOsSeguintesDadosDaEntrega() {
    }
    @Quando("eu enviar a requisição para o endpoint {string} de cadastro de entregas")
    public void euEnviarARequisiçãoParaOEndpointDeCadastroDeEntregas(String endPoint) {
    }
    @Então("o status code da resposta deve ser {int}")
    public void oStatusCodeDaRespostaDeveSer(int statusCode) {
    }
}


Vamos criar a model:

package model;
import com.google.gson.annotations.Expose;
import lombok.Data;
@Data
public class EntregaModel {
    @Expose(serialize = false)
    private int numeroEntrega;
    @Expose
    private int numeroPedido;
    @Expose
    private String nomeEntregador;
    @Expose
    private String statusEntrega;
    @Expose
    private String dataEntrega;
}
@Expose(serialize = false)- numero da entrega seja excluído do processo de serialização(obj java é convertido para JSON)
@Data- gera getters ands setters- implementa os equals and hashcodes.

