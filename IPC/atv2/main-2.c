//Gabriel da Silva Reis (12121BSI241)
//exercicio 2
#include <stdio.h>

int main(void) {
  int matriz[10][3];
  printf("entre as 3 notas de cada aluno=\n ");
  for(int i=0; i<10; i++){
  printf("aluno %d=\n", i+1);
    for( int j=0; j<3; j++){
      scanf("%d", &matriz[i][j]);
      

    }
  }
  
 int um, dois, tres, maior, quant;
 quant=maior=um=dois=tres=0;
  
 for(int i=0; i<10; i++){
  for(int j=0; j<3; j++){
    if(i && j == 0){
      maior = matriz[0][0];
    }
    else if(matriz[i][j]>maior){
      maior = matriz[i][j];
    }
  }
}
 for(int i=0;i<10;i++){
      if (matriz[i][0]>matriz[i][1] && matriz[i][0]>matriz[i][2]){
        um++;
      }
      else if (matriz[i][1]>matriz[i][0] && matriz[i][1]>matriz[i][2]){
        dois++;
      }
               
      else if (matriz[i][2]>matriz[i][0] && matriz[i][2]>matriz[i][1]){
        tres++;
        }
  }
  for(int i=0; i<10; i++){
  for(int j=0; j<3; j++){
     if(matriz[i][j]==maior){
       quant +=1;
     }
    }
  }
 printf("a maior not e = %d e %d alunos tiraram ela\n", maior, quant);
 printf("o nunmero de alunos com maior nota na prova 1 e = %d\n", um);
 printf("o nunmero de alunos com maior nota na prova 2 e = %d\n", dois);
 printf("o nunmero de alunos com maior nota na prova 3 e = %d\n", tres);
  
  
  return 0;
}