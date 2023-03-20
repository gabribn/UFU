//Gabriel da Silva Reis (12121BSI241)
//exercicio 5
#include <stdio.h>

int main ()
{
    int P, Q;
    int somaL, somaC;

    printf("Informe quantas linhas tera a matriz: \n");
    scanf("%d", &P);
    printf("Informe quantas colunas tera a matriz: \n");
    scanf("%d", &Q);
    int M[P][Q];
    int L[P];
    int C[Q];
    printf("Informe %d numeros para sua matriz: \n", P * Q);
    for (int i = 0; i < P; i++) {
        for (int j = 0; j < Q; j++) {
            scanf("%d", &M[i][j]);
        }
    }
    for (int i = 0; i < P; i++) {
        somaL = 0;
        for (int j = 0; j < Q; j++) {
            somaL += M[i][j];
        }
        L[i] = somaL;
    }
    for (int i = 0; i < Q; i++) {
        somaC = 0;
        for (int j = 0; j < P; j++) {
            somaC += M[j][i];
        }
        C[i] = somaC;
    }
    printf("A Matriz eh: \n");
    for (int i = 0; i < P; i++) {
        for (int j = 0; j < Q; j++) {
            printf("%d ", M[i][j]);
        }
    }
    printf("\n");
    printf("O vetor L eh: \n");
    for (int i = 0; i < P; i++) {
        printf("%d ", L[i]);
    }
    printf("\n");
    printf("O vetor C eh: \n");
    for (int i = 0; i < Q; i ++) {
        printf("%d ", C[i]);
    }
    return 0;
}