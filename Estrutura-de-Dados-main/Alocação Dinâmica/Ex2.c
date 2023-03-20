#include <stdio.h>
#include <stdlib.h>
int main(void) {
  int n,impar,par;
  impar=par=0;
  int *v;
  
  printf("quantos numeros ...\n");
  scanf("%d", &n);
  v=(int*) malloc(n*sizeof(int));
  
  for(int i=0;i<n;i++){
    scanf("%d", &v[i]);
  }
  for(int i=0; i<n;i++){
    if(v[i]%2==0){
      par++;
    }
    else{
      impar++;
    }
  }
  printf("%d dos %d sao pares\n%d dos %d sao impares", par,n,impar,n);
  return 0;
}