//Gabriel da Silva Reis (12121BSI241)
//exercicio 3
#include <stdio.h>
#include <stdlib.h>
int main(){
 float vetor[20], aux;
 printf("entre com 20 nuumeros flutuantes=");
 for(int i=0; i<20; i++){
   scanf("%f", &vetor[i]);
   }
 for (int i = 0; i < 20; i++) {
    for (int j = i + 1; j < 20; j++) {
      if (vetor[j] < vetor[i]) {
        aux = vetor[j];
        vetor[j] = vetor[i];
        vetor[i] = aux;
        }
      }
  }
printf("Vetor: \n");
    for (int i = 0; i < 20; i++) {
        printf("%.4f \n", vetor[i]);
    }
  return 0;
}