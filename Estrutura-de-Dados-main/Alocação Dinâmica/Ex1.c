#include <stdio.h>
#include <stdlib.h>
int main(void) {
  int *i;
  printf("entre 5 numeros\n");
  i=(int *) malloc(5*sizeof(int));
  for(int a=0; a<5;a++){
    scanf("%d", &i[a]);
  }
  for(int a=0; a<5;a++){
    printf("%d", i[a]);
  }
  
  free(i);
  return 0;
}