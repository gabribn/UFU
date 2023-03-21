import java.util.Scanner;
import entities.ClassD;

public class ExD {

	public static void main(String[] args) {
		
		int a,b,c,d;
		double r;
		Scanner s = new Scanner( System.in );
		System.out.println("Entre o valor de x1 e y1 :");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("Entre o valor de x2 e y2 :");
		c = s.nextInt();
		d = s.nextInt();
		
		ClassD pontos = new ClassD(a,b);
		
		r = pontos.distancia(c, d);
		
		System.out.println("A disância entre os pontos é = " + r);
		
		
		s.close();
	}

}
