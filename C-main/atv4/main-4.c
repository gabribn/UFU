//Gabriel da Silva Reis (12121BSI241)
//execicio 4

#include <stdio.h>
#include <stdlib.h>

float** aloca(int l, int c) 
{
    float **mat = (float **) malloc(l*sizeof(float));
    for (int i = 0; i < l; i++) {
        mat[i] = (int *) malloc(c*sizeof(int));
    }
    return mat;
}

void leitura(float** mat, int l, int c) 
{
    for (int i = 0; i < l; i++) {
        for (int j = 0; j < c; j++) {
            scanf("%f", &mat[i][j]);
        }
    }
}

float** multiplica(float **matA, int la, int ca, float **matB, int lb, int cb) 
{
    float **matResultado = aloca(la, cb);
    for (int i = 0; i < la; i++) {
        for (int j = 0; j < cb; j++) {
            matResultado[i][j] = 0;
        }
    }
    
    for (int i = 0; i < la; i++) {
        for (int j = 0; j < cb; j++) {
            for (int k = 0; k < ca; k++) {
                matResultado[i][j] += matA[i][k] * matB[k][j];
            }
        }
    }
    return matResultado;
}

void imprime(float **mat, int l, int c) 
{
    for(int i = 0; i < l; i++) {
        for (int j = 0; j < c; j++) {
            printf("%.2f ", mat[i][j]);
        }
        printf("\n");
    }
    printf("\n");
}

void desaloca(float **mat, int l) 
{
    for(int i = 0; i < l; i++) {
        free(mat[i]);
    }
    free(mat);
}

int main()
{
    float **m1 = aloca(2, 3);
    leitura(m1, 2, 3);

    float **m2 = aloca(3, 4);
    leitura(m2, 3, 4);

    float **m3 = multiplica(m1, 2, 3, m2, 3, 4);

    imprime(m1, 2, 3);
    imprime(m2, 3, 4);
    imprime(m3, 2, 4);

    desaloca(m1, 2);
    desaloca(m2, 3);
    desaloca(m3, 2);

    return 0;
}