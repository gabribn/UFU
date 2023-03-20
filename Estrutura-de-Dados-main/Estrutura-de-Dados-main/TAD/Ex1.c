#include <math.h>
#include <stdio.h>
#include <stdlib.h>

struct ponto {
  int xx;
  int yy;
};
typedef struct ponto Ponto;
// criar
Ponto criaPonto(int x, int y) {
  Ponto r;
  r.xx = x;
  r.yy = y;
  return r;
}
// retorna cordenada x ou y
int getx(Ponto r) { return r.xx; }
int gety(Ponto r) { return r.yy; }
// calc distancia
int distancia(Ponto r) {
  int s;
  s = sqrt(pow(r.xx, 2) + pow(r.yy, 2));
  return s;
}

int main(void) {
  int x, y;
  Ponto r1;

  printf("Digite o ponto x e y \n");
  scanf("%d %d", &x, &y);
  r1 = criaPonto(x, y);

  printf("a distancia entre x e y e = %d\n", distancia(r1));
  printf("cordenada de x e = (%d, %d)\n", getx(r1), 0);
  printf("cordenada de y e = (%d, %d)\n", 0, gety(r1));
  return 0;
}