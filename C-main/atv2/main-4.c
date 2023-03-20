//Gabriel da Silva Reis (12121BSI241)
//exercicio 4
#include <stdio.h>

int main(void) {
  int a[2][2], b[2][2],c[2][2];
  
  for(int i=0; i<2; i++){
    for(int j=0; j<2; j++){
      a[i][j]= 3*(i+1) + 4*(j+1);
    }
  }
  for(int i=0; i<2; i++){
    for(int j=0; j<2; j++){
      b[i][j]= -4*(i+1) - 3*(j+1);
    }
  }
  for(int i=0; i<2; i++){
    for(int j=0; j<2; j++){
      c[i][j]= a[i][j] + b[i][j];
    }
  }
  printf("a matriz a= ");
  for(int i=0; i<2; i++){
    for(int j=0; j<2; j++){
      printf("%d  ", a[i][j]);
    }
  }
  printf("\n");
  printf("a matriz b= ");
  for(int i=0; i<2; i++){
    for(int j=0; j<2; j++){
      printf("%d  ", b[i][j]);
    }
  }
   printf("\n");
  printf("a matriz c= ");
  for(int i=0; i<2; i++){
    for(int j=0; j<2; j++){
      printf("%d  ", c[i][j]);
    }
  }
  return 0;
}