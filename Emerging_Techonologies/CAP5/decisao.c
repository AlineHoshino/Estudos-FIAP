#include <stdio.h>
  int main(void)
  {
    int N1, N2, Soma;
    printf("Digite um número inteiro: ");
    scanf("%d", &N1);
    
    printf("Digite um número inteiro: ");
    scanf("%d", &N2);
    
    Soma = N1 + N2;
    printf("O Valor da soma = %d\n", Soma);
    
    if(Soma > 10)
    {
      printf("O valor da soma é maior que 10\n");
    }
    else
    {
      printf("Valor menor ou igual a 10\n");
    }
  }