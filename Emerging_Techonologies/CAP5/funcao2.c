#include <stdio.h>

void exemplo (int n, int *res, float *v)
  {
  n++; // n =a que vale 1, sofre um incremento vira 2
  *res = n + *res; // d vale 2, mas como estou atualizando o ponteiro daí por referência vou atualizar o d =>2 +2 - então d vira 4
  *v = n * 2.1;  // m começa com 0, vai atualizar o ponteiro -> 2*2,1 = 4.2 -> m vira 4.2
  }

int main()  
{
int a = 1,d =2;
float m = 0;
exemplo (a, &d, &m);// chama a função
printf("a= %d  \t  y = %d\t e m = %.1f\n",a,d,m);
}