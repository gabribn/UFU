//Gabriel da Silva Reis (12121BSI241)
//execicio 1
#include <stdio.h>
#include <math.h>
float imc(float kg, float altura){
  float resultado= kg/pow(altura, 2);
  return resultado;
}
int main() {
  float kg, altura, resultado;
  printf("altura= \n");
  scanf("%f", &altura);
  printf("peso= \n");
  scanf("%f", &kg);
  resultado= imc(kg,altura);
  printf("imc = %f", resultado);
  return 0;
}