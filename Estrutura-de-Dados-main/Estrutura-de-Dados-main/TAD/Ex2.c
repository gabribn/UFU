#include <math.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
struct ponto {
  int xx;
  int yy;
};
typedef struct ponto Pontos;
// cria
Pontos criaPonto(int x, int y) {
  Pontos r;
  r.xx = x;
  r.yy = y;
  return r;
}
// retorna cordenada  x e y
int getx(Pontos r) { return r.xx; }
int gety(Pontos r) { return r.yy; }
// calc área do circulo
float area(Pontos r) {
  float raio, area;
  raio = (sqrt(pow(r.xx, 2) + pow(r.yy, 2))) / 2;
  area = pow(raio, 2) * 3.14;
  return area;
}
// calc corda
float raio(Pontos r) {
  float raio;
  raio = (sqrt(pow(r.xx, 2) + pow(r.yy, 2)))/2;
  return raio;
}
// Ponto p esta dentro do circulo
bool dentro(float p, Pontos r) {
  if (p <= raio(r) && p >= (raio(r)*-1)) {
    return true;
  } else {
    return false;
  }
}

int main() {
  int x, y;
  float a, p;
  Pontos r1;

  printf("Digite o ponto x e y \n");
  scanf("%d %d", &x, &y);
  r1 = criaPonto(x, y);

  printf("cordenada de x e = (%d, %d)\n", getx(r1), 0);
  printf("cordenada de y e = (%d, %d)\n", 0, gety(r1));
  printf("a area do circulo e = %f\n", area(r1));

  printf("entre ponto para ver se esta dentro do circulo..\n");
  scanf("%f", &p);
  a = dentro(p, r1);

  printf("1=true  0= false\n%f", a);

  return 0;
}