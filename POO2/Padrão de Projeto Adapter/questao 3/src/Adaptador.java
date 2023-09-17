
public class Adaptador implements v220{
	 private Tomada110 tomada110;

	    public Adaptador(Tomada110 tomada110V) {
	        this.tomada110 = tomada110V;
	    }

	    @Override
	    public void conectar220V() {
	        System.out.println("Adaptado de 110V para 220V");
	        tomada110.conectar110V();;
	    }
}
