//Gabriel da Silva Reis (12121BSI241)
//exercicio 1
#include <stdio.h>
#include <stdlib.h>
int main(void) {
  int la, ca, lb, cb;
   printf("Informe quantas linhas tera a matriz A: \n");
   scanf("%d", &la);
   printf("Informe quantas colunas tera a matriz A: \n");
   scanf("%d", &ca);
   printf("Informe quantas linhas tera a matriz B: \n");
   scanf("%d", &lb);
   printf("Informe quantas colunas tera a matriz A: \n");
   scanf("%d", &cb);

  int a[la][ca];
  int b[lb][cb];

  if (la != cb) {
        printf("Para multiplicar duas matrizes, o numero de linhas de\n uma deve ser o mesmo que o numero de colunas da outra. Tente novamente!\n");
    }
  else{
    printf("Informe os numeros da matriz A: \n");
        for (int i = 0; i < la; i++) {
            for (int j = 0; j < ca; j++) {
                scanf("%d", &a[i][j]);
            }
        }
  }
  printf("Informe os numeros da matriz B: \n");
        for (int i = 0; i < lb; i++) {
            for (int j = 0; j < cb; j++) {
                scanf("%d", &b[i][j]);
            }
        }
  int ab[la][cb];
        for (int i = 0; i < la; i++) {
            for (int j = 0; j < cb; j++) {
                ab[i][j] = 0;
            }
        }
  for (int i = 0; i < la; i++) {
            for (int j = 0; j < cb; j++) {
                for (int k = 0; k < ca; k++) {
                    ab[i][j] = ab[i][j] + a[i][k] * b[k][j];
                }
            }
        }
  printf("O resultado multiplicacao entra A e B e: \n");
        for (int i = 0; i < la; i++) {
            for (int j = 0; j < cb; j++) {
                printf("%d ", ab[i][j]);
            }
        }
  
  return 0;
}