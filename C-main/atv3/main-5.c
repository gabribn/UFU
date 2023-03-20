//Gabriel da Silva Reis (12121BSI241)
//exercicio 5
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
  int iSecret, iGuess;
  srand (time(NULL));
  
  int ***matriz= (int***) malloc(6*sizeof(int**));
  for(int i=0; i<6; i++){
    matriz[i]= (int**) malloc(7*sizeof(int*));
    for(int j=0; j<7; j++){
      matriz[i][j]= (int*) malloc(5* sizeof(int));
      for(int k=0; k<5; k++){
      matriz[i][j][k]= rand()%10+1;
      }
    }
  }
  for(int k=0; k<5; k++){
    printf("matriz %d = \n\n", k+1);
   for(int i=0; i<6; i++){
    for(int j=0; j<7; j++){   
      
      printf("%d\t", matriz[i][j][k]);
     }
      printf("\n");
    }
    printf("\n");
   }
  
    for(int j=0; j<6; j++){
      for(int k=0; k<7; k++){
        free(matriz[j][k]);  
      }
    }
    free(matriz);
  return 0;
}