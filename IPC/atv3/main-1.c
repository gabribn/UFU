//Gabriel da Silva Reis (12121BSI241)
//exercicio 1
#include <stdio.h>
#include <stdlib.h>
int main(void) {
  int lA, lB, cA, cB;
  while(1){    
  printf("entre o numero de linhas para matriz A= ");
  scanf("%d", &lA);
  printf("entre o numero de colunas para matriz A= ");
  scanf("%d", &cA);
   printf("entre o numero de linhas para matriz B= ");
  scanf("%d", &lB);
  printf("entre o numero de colunas para matriz B= ");
  scanf("%d", &cB);
    if(cB == lA){
      break;
    } 
    else{
      printf("Dimensoes invalidas, digite novamente!\n");
    }
  }
  
  int **matrizA = (int**) malloc(lA * sizeof(int*));
  for(int i=0; i<lA; i++){
    matrizA[i] = (int**) malloc(cA * sizeof(int*));
    for(int j=0; j<cA; j++){
      printf("entre um valor para matriz A= ");
      scanf("%d", &matrizA[i][j]);
    }
  }
    printf("\n");
  
  int **matrizB = (int**) malloc(lB * sizeof(int*));
  for(int i=0; i<lB; i++){
    matrizB[i] = (int**) malloc(cB * sizeof(int*));
    for(int j=0; j<cB; j++){
      printf("entre um valor para matriz B= ");
      scanf("%d", &matrizB[i][j]);
    }
  }
  int **matrizAB = (int**) malloc(lA * sizeof(int*));
  for(int i=0; i<lA; i++){
    matrizAB[i] = (int**) malloc(cB * sizeof(int*));
     for(int j=0; j<cB; j++){
      for(int k=0; k<lB; k++){
        matrizAB[i][j] = matrizAB[i][j] + matrizA[i][k] * matrizB[k][j];
      }
    }
  }
  printf("\nMatriz A:\n");
  for(int i = 0; i < lA; i++){
    for(int j = 0; j < cA; j++){
      printf("%d ", matrizA[i][j]);
    }
    printf("\n");
  } 
 printf("\nMatriz B:\n");
  for(int i = 0; i < lB; i++){
    for(int j = 0; j < cB; j++){
      printf("%d ", matrizB[i][j]);
    }
    printf("\n");
  }
  printf("\nMatriz C:\n");
  for(int i = 0; i < lA; i++){
    for(int j = 0; j < cB; j++){
      printf("%d ", matrizAB[i][j]);
    }
    printf("\n");
  }
  for(int i =0; i < lA; i++)
    free(matrizA[i]);
  free(matrizA);
  for(int i =0; i < lB; i++)
    free(matrizB[i]);
  free(matrizB);
  for(int i =0; i < lA; i++)
    free(matrizAB[i]);
  free(matrizAB);

  
  return 0;
}