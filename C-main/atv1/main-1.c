//Gabriel da Silva Reis (12121BSI241)
//exercicio 1

#include <stdio.h>
#include <stdlib.h>

int main() {
   
   int quebrado;
   char tipo;
   float tabela[4][3];
    tabela[ 0 ][ 0 ] = 170.00;
    tabela[ 0 ][ 1 ] = 151.30;
    tabela[ 0 ][ 2 ] = 139.20;
    tabela[ 1 ][ 0 ] = 153.00;
    tabela[ 1 ][ 1 ] = 136.17;
    tabela[ 1 ][ 2 ] = 125.28;
    tabela[ 2 ][ 0 ] = 139.23;
    tabela[ 2 ][ 1 ] = 123.91;
    tabela[ 2 ][ 2 ] = 112.76;
    tabela[ 3 ][ 0 ] = 128.09;
    tabela[ 3 ][ 1 ] = 117.84;
    tabela[ 3 ][ 2 ] = 104.88;
  printf("\t\t\tTABELA DE GRAOS\n");
  printf("\t\t\tTipos= A, B, C, D \n\n \t\t\tQuantidade de graos\n\t\t\tquebrados= 3, 4, 5\n\n");
  printf("digite o tipo e a quantidade de grãos quebrados para saber o preco...\n ");
  printf("tecle 0 se quiser sair do programa.\n");
    printf("\nTipo=");
    scanf("%c",&tipo);
    printf("Graos quebrados=");
    scanf("%d",&quebrado);
    if(tipo=='A' && quebrado==3){
      printf ("valor e de %fR$\n", tabela[ 0 ][ 0 ]);
    }
    else if(tipo=='A' && quebrado==4){
      printf ("valor e de %fR$\n", tabela[ 0 ][ 1]);
    }
    else if(tipo=='A' && quebrado==5){
      printf ("valor e de %fR$\n", tabela[ 0 ][ 2]);
    }
    else if(tipo=='B' && quebrado==3){
      printf ("valor e de %fR$\n", tabela[ 1 ][ 0]);
    }
    else if(tipo=='B' && quebrado==4){
      printf ("valor e de %fR$\n", tabela[ 1 ][ 1]);
    }
    else if(tipo=='B' && quebrado==5){
      printf ("valor e de %fR$\n", tabela[ 1 ][ 2]);
    }
    else if(tipo=='C' && quebrado==3){
      printf ("valor e de %fR$\n", tabela[ 2 ][ 0]);
    }
    else if(tipo=='C' && quebrado==4){
      printf ("valor e de %fR$\n", tabela[ 2 ][ 1]);
    }
    else if(tipo=='C' && quebrado==5){
      printf ("valor e de %fR$\n", tabela[ 2 ][ 2]);
    }
    else if(tipo=='D' && quebrado==3){
      printf ("valor e de %fR$\n", tabela[ 3 ][ 0]);
    }
    else if(tipo=='D' && quebrado==4){
      printf ("valor e de %fR$\n", tabela[ 3 ][ 1]);
    }
    else if(tipo=='D' && quebrado==5){
      printf ("valor e de %fR$\n", tabela[ 3 ][ 2]);
    }
    else{
      printf(" digite valores validos");
    }
  return 0;
}