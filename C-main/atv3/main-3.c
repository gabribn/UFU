//Gabriel da Silva Reis (12121BSI241)
//exercicio 3
#include <stdio.h>

int main(void) {
  printf("entre os valores da matriz = \n");
  int **matriz = (int**) malloc(2* sizeof(int*));
  for(int i=0;i<2;i++){
    matriz[i] = (int*) malloc(2* sizeof(int*));
    for(int j=0; j<2; j++){
      scanf("%d", &matriz[i][j]);
    }
  }
  int aux1, aux2;
  aux1=aux2=1;
  for(int i=0; i<2; i++){
    for(int j=0; j<2; j++){
     if(matriz[i]==matriz[j]){
       aux1 = aux1*(matriz[i][j]);
     }
     else{
       aux2 = aux2*(matriz[i][j]);
     }
    }
  }
  printf("o determinante e = %d",aux1-aux2);
  for(int i=0;i<2;i++){
    free(matriz[i]);
  }
  free(matriz);
  return 0;
}