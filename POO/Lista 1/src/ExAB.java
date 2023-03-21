import java.util.Scanner;

public class ExAB {

	public static void main(String[] args) {
		 System.out.println("Este é o primeiro programa feito em java");
	        float a, b, c;
	        Scanner s = new Scanner( System.in );
	        System.out.println( "Primeiro numero: ");
	        a = s.nextFloat();
	        System.out.println( "Segundo numero: ");
	        b = s.nextFloat();
	        c = a + b;
	        System.out.println( "a soma é: " + c );	   
	        s.close();
	}

}
