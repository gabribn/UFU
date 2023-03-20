//Gabriel da Silva Reis (12121BSI241)
//exercicio 4
#include <stdlib.h>
#include <stdio.h>

int main ()
{
    int n;
    float soma = 0;

    printf("tamanho do vetor: \n");
    scanf("%d", &n);
    int vetor[n];

    printf("Informe os valorers do vetor: \n");
    for (int i = 0; i < n; i++) { 
        scanf("%d", &vetor[i]);
        soma += (i + 1) / (float)vetor[i]; 
    }

    printf("S = %f", soma);
    return 0;
}