//Gabriel da Silva Reis (12121BSI241)
//exercicio 2
#include <stdio.h>
#include <stdlib.h>
#define SIZE 5
int main() {
 printf("entre os valores da matriz\n");
 float **matriz = (float**) malloc(SIZE*sizeof(float*));
  for(int i = 0; i < SIZE; i++){
    matriz[i] = (float*) malloc(SIZE*sizeof(float));
    for(int j = 0; j < SIZE; j++){
      scanf("%f", &matriz[i][j]);
    }
  }  
  float p;
  
  while(1){
    
    printf("busque um valor= \n");
    scanf("%f", &p);
  if(p==0){
      printf("Isto é tudo, pessoal!");
      for(int i=0; i<SIZE; i++){
        free(matriz[i]);
      }
      free(matriz);
     break;
    }
         
  int aux=1;
   for(int i = 0; i < SIZE; i++){
      for(int j = 0; j < SIZE; j++){
        if(p == matriz[i][j]){
          printf(" encontrado em: %d %d\n", i, j);
          aux++;
       }
      }
     }
    if(aux==1){
      printf("valor nao encontrado\n");
    }
 }
    
 
  return 0;
}
