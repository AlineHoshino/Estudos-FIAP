#include<stdio.h>
#include<string.h> 

struct prod{		
    int cod;
    float preco;
};

//parametro de saida p_cad é ponteiro para struct prod
void le_registro(struct prod *p_cad) 
{  
printf("Digite codigo do produto e preco\n");
scanf("%d", &p_cad->cod);               
scanf("%f", &p_cad->preco);   
}

//parametro de entrad cad é uma struct prod
void escreve(struct prod reg) {
printf(" Codigo e preco do produto são: %d R$%.2f \n", reg.cod, reg.preco);
}

int  main() {
struct prod cad;
//chama função passando o endereço da variável cad 
le_registro (&cad);
//chama função passando o valor da variável cad 
escreve(cad);	 

return 0;	 
}