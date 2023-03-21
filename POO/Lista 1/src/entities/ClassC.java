package entities;

public class ClassC {
    
    public int l1;
    public int l2;
    public int l3;

   
    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public int getL3() {
        return l3;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }

    public int retornaPerimetro() {
        return getL1()+getL2()+getL3();
    }
    
    public String retornaTipo() {
        if ((getL1() == getL2())&&(getL2() == getL3())) return "equilatero";
        else if ((getL1() == getL2())||(getL2() == getL3())||(getL1() == getL3())) return "isosceles";
        else return "escaleno";
    }

    public String mostraDados() {
        return "Triangulo: Lado1 = "+getL1()+", Lado2 = "+getL2()+", Lado3 = "+getL3()+".";
    }
}