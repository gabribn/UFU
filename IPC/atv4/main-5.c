//Gabriel da Silva Reis (12121BSI241)
//exercicio 5
#include <stdio.h>
#include <stdlib.h>
long long int FibonacciRecursivo( int i){
  
    if (i == 1) return 1;                   
    else                                    
    if (i == 2) return 1;                 
    else return FibonacciRecursivo(i - 1) + FibonacciRecursivo(i - 2);
}
long long int FibonacciIterativo(i){
  long long int a=0, b=1, c;
  int n=2;
  if(i==1){
    return a;
  }
  else{
    if(i==2){
      return b;
    }
    else{
      while(n<i){
        c= a+b;
        a=b;
        b=c;
        n++;
      }
      return c;
    }
  }
}


int main(void) {
  for (int i = 1; i <= 100; i++){
   printf("\n termo %d: %lld", i, FibonacciIterativo(i));
 }
 for (int i = 1; i <= 100; i++){
   printf("\n termo %d: %lld", i, FibonacciRecursivo (i));
 }
//FibonacciIterativo = o programa foi executado em 0.62 segundos.
  
//FibonacciRecursivo = Tempo=???. Executou até o termo 42 tranquilamente, apos isso a cpu foi para 100% assim deixando a progressão muito lenta.
  

 

  return 0;
}