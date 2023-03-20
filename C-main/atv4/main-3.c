//Gabriel da Silva Reis (12121BSI241)
//exercicio 3
#include <stdio.h>

int crescente(int n, int y){
  printf("%d\n", y);
  if(n>y){
        return crescente(n, y+1);
    }
  else{
        return 0;
    }
}

int decrescente(int n){
  printf("%d\n", n);
  if(n > 0){
        return decrescente(n-1);
    }
  else{
        return 0;
    }
}

int main(){
  int n;
  int y = 0;
  printf("ate qual numero= \n");
  scanf("%d", &n);
  
  crescente(n,y) ;
  printf("\n");
  decrescente(n);
  
  return 0;
}