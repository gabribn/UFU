//Gabriel da Silva Reis (12121BSI241)
//exercicio 5
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main(void) {
  int n;
    float soma =0, desvio = 0,media = 0;

    printf("Tamanho do vetor: ");
    scanf("%d", &n);
    int vetor[n];

    printf("Informe os valores do vetor; \n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &vetor[i]);
        media += vetor[i];
    }
    media = media / n;

    for (int i = 0; i < n; i++) {
        soma += pow(vetor[i] - media, 2);
    }

    desvio = sqrt(soma / n);
    printf("A media do vetor e: %f\n", media);
    printf("O desvio padrao e: %f\n", desvio);
  return 0;
}