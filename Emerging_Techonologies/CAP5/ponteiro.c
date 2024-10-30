#include <stdio.h>
int main()
{
int x = 3;
int *ptr;
ptr = &x;
printf(" x=%d ptr=%d conteudo do que ptr aponta %d \n",x, ptr, *ptr);
//conteúdo do que ptr aponta recebe o valor 7
*ptr = 7; 
printf(" x=%d ptr=%d conteudo do que ptr aponta %d \n",x, ptr, *ptr);
}