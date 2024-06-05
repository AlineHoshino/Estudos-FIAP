Program.cs
Class , e método main o Microsoft facilitou essa parte e não tem na Program.cs

int idade = 12;
float salario = 1000.23
double
decimal
string
char

namespace é coomo se fosse um pacote 

Como criar uma classe botão direito, criar Classe

Usa o using

using OlaMundo.Services;

public class Program
{
    public static void Main(string[] args)
    {

        MensageriaSMS sms = new MensageriaSMS();
        sms.EnviarMensagem("Teste");
    }
}


Utilize pastas para deixar mais organizado

string[] nomes = { "Thiago", "João", "Rita" };
foreach (string nome in nomes)
{
    Console.WriteLine(nome);
}

try
{
    int divisor = 0;
    int resultado = 10 / divisor;
}
catch (Exception ex)
{
    Console.WriteLine("Ocorreu um erro: " + ex.Message);
}