#include <stdio.h>

char avaliacao (float peso1, float peso2)
{
if (peso1 == peso2)
   return 'p';     //permanece igual
else if (peso1 > peso2)
        return 'd'; //diminuiu o peso
     else 
        return 'a'; //aumentou o peso 
}

int main()
{
char situacao;
float peso_inicial, peso_final;
printf("Digite peso antes e depois da dieta");
scanf("%f%f", &peso_inicial, &peso_final);
situacao = avaliacao (peso_inicial, peso_final);

if (situacao == 'p')
    printf("O paciente não emagreceu\n");
else if (situacao == 'd')
         printf("O paciente emagreceu\n");
     else 
         printf("O paciente engordou\n");

return 0;
}