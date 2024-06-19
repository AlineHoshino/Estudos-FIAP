class Program
{
    static void Main()
    {
        Mensageiro mensageiro = new Mensageiro();
        mensageiro.EnviarMensagem("Olá, mundo!");
    }
}
public class Mensageiro
{
    public void EnviarMensagem(string mensagem)
    {
        Console.WriteLine(mensagem);
    }
}






class Program
{
    static void Main()
    {
        IMensageiro mensageiro = new Mensageiro();
        EnviadorDeMensagem enviador = new EnviadorDeMensagem(mensageiro);
        enviador.Enviar("Olá, mundo DI!");
    }
}
public interface IMensageiro
{
    void EnviarMensagem(string mensagem);
}
public class Mensageiro : IMensageiro
{
    public void EnviarMensagem(string mensagem)
    {
        Console.WriteLine(mensagem);
    }
}
public class EnviadorDeMensagem
{
    private readonly IMensageiro _mensageiro;
    public EnviadorDeMensagem(IMensageiro mensageiro)
    {
        _mensageiro = mensageiro;
    }
    public void Enviar(string mensagem)
    {
        _mensageiro.EnviarMensagem(mensagem);
    }
}

Criando os testes:

No Fiap.Alunos.Test existe uma pasta dependencias botao direito - adicionar referencia do projeto 

Vou simular o databasecontext
Moq cria objetos mocados

AutoMapper - Converte objetos


#region AutoMapper

// Configuração do AutoMapper
var mapperConfig = new AutoMapper.MapperConfiguration(c => {
    // Permite que coleções nulas sejam mapeadas
    c.AllowNullCollections = true;
    // Permite que valores de destino nulos sejam mapeados
    c.AllowNullDestinationValues = true;

    // Define o mapeamento de ClienteModel para ClienteCreateViewModel
    c.CreateMap<ClienteModel, ClienteCreateViewModel>();
    // Define o mapeamento reverso de ClienteCreateViewModel para ClienteModel
    c.CreateMap<ClienteCreateViewModel, ClienteModel>();
});

// Cria o mapper com base na configuração definida
IMapper mapper = mapperConfig.CreateMapper();

// Registra o IMapper como um serviço singleton no container de DI do ASP.NET Core
builder.Services.AddSingleton(mapper);

#endregion

