//Gabriel da Silva Reis (12121BSI241)
//exercicio 3
#include <stdio.h>

int main(void) {
  int matriz[6][6],soma=0;
  printf("entre os valores da matriz=");
  for(int i=0; i<6; i++){
    for(int j=0; j<6; j++){
      scanf("%d", &matriz[i][j]);
    }
  }
   for(int i=0; i<6; i++){
    for(int j=0; j<6; j++){
      if(i<j){
        soma += matriz[i+1][j];
      }
    }
  }
 printf(" a soma dos elementos em baixo da diagonal principal e = %d", soma);


  return  0;
}