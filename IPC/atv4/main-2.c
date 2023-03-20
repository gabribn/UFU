//Gabriel da Silva Reis (12121BSI241)
//execicio 2
#include <stdio.h>
#include <math.h>

int somador(int n){
  int soma=0;
  for(int i=1; i<=n;i++){
    soma += pow(i, i);
  }
  return soma;
} 
int main(){
 int n, soma;
  printf("N de termos = \n");
  scanf("%d", &n);
  soma = somador(n);
  printf("%d", soma);
  return 0;
}