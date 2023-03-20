//Gabriel da Silva Reis (12121BSI241)
//exercicio 2
#include <stdio.h>
#include <stdlib.h>
int main(){
int vetor[10];
  printf("entre com 10 números não repetidos=\n");
  for(int i=0; i<10; i++){
    scanf("%d",&vetor[i]);
    for(int j=0; j<i; j++){
      if(vetor[i]==vetor[j]){
        printf("numero repetido, entre outro valor=\n");
        i--;
      }
    }
  }
printf("o vetor e=");
for(int i=0; i<10; i++){
   printf("\n%d", vetor[i]);
  }


  return 0;
}