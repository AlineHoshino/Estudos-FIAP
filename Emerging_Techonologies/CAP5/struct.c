
#include <stdlib.h>
  #include <stdio.h>
  #include <string.h>
  
  struct Caderno_Papelaria {
       char fabricante[25];
       int num_folhas;
       char tipo_de_capa[12];
       char tamanho[10];
       float preco;
      };
  
  int main(){
  /* declaração das variáveis */
    struct Caderno_Papelaria caderno_cadastro, caderno_venda; 
  
  /*Leitura de uma variável do tipo struct: o caderno a ser cadastrado*/
        printf("**************************************\n");
        printf("* Digite o caderno a ser cadastrado: *\n");
        printf("**************************************\n");
  
        printf("\nDigite o fabricante: ");
        fgets(caderno_cadastro.fabricante, sizeof(caderno_cadastro.fabricante), stdin);
        
        printf( "digite o número de folhas: ");
        scanf("%d", &caderno_cadastro.num_folhas);
        
        printf( "digite o tipo de capa: (dura/brochura)");
        
        scanf("%s",caderno_cadastro.tipo_de_capa);
        
        printf( "digite a dimensão: ");
        scanf("%s",caderno_cadastro.tamanho);
        
        printf( "digite o preço: ");
        scanf ("%f", &caderno_cadastro.preco);
  
  /*Supondo que o caderno cadastrado seja vendido*/      
       caderno_venda = caderno_cadastro;
  
  /*Escrita das informações do caderno que é vendido*/
        printf("***********************************\n");
        printf("* Apresentacao do caderno vendido *\n");
        printf("***********************************\n");
  
        printf("\nfabricante:%s", caderno_cadastro.fabricante);
        printf("num. de folhas: %d \n", caderno_venda.num_folhas);
        printf( "tipo de capa: %s \n",caderno_venda.tipo_de_capa);
        printf( "dimensao: %s \n",caderno_venda.tamanho);
        printf( "preco: R$%0.2f \n", caderno_venda.preco);

  }