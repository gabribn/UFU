#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#define MAX 5 

struct pilha {
    char elem[MAX];
    int topo;  
};

typedef struct pilha Pilha;

void criar(Pilha *p)
{ 
    p->topo = -1;
}

void destruir(Pilha *p)
{
    p->topo = -1;
}

bool vazia(Pilha p)
{
    if (p.topo == -1){
      return true;
    } 
    else{
      return false;} 
}

bool cheia(Pilha p)
{
    if (p.topo == (MAX - 1)){
      return true;
    } 
    else{
      return false;} 
}

bool empilhar(Pilha *p, char x){
    bool deuCerto;
    if (cheia(*p) == true){
      deuCerto = false;
      return deuCerto;
    }
    else{
      p->topo++;
      p->elem[p->topo]= x;
      deuCerto= true;
      return deuCerto;
    }
  }
bool desempilhar(Pilha *p, char *x){
  bool deuCerto;
  if(vazia(*p)==true){
    deuCerto=false;
    return deuCerto;
  }
  else{
    *x= p->elem[p->topo];
    p->topo--;
    deuCerto=true;
    return deuCerto;
  }
}


 main(void) {
  bool teste;
  char x;
  Pilha pi;

  criar(&pi);

  
  while(cheia(pi)==false){
    scanf(" %c", &x);
    empilhar(&pi, x);
  }
  while(desempilhar(&pi,&x)==true){
    printf("%c ",x);
  }
   
  printf("\n");
  
   
  if(vazia(pi)==true){
    printf("pilha vazia");
  }
  destruir(&pi);
  return 0;
}