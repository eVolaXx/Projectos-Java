
public class CajaRegistros {
	private final static int MAX_CALLS=1000;
	private static final Llamada[] Llamada = null;
	private int MAX_LLAMADAS;
	private Llamada[] llamadas = new Llamada[MAX_LLAMADAS];
	private int contador;
	
	public CajaRegistros() {
		contador = 0;
	}
	
	public void registerCall(Llamada c) {
		Llamada[contador]=c;
		@SuppressWarnings("unused")
		int contador = 0;
		contador++;
	}
	
		
	
	public void print(){
		int total=0;
		for (int i=0; i<CajaRegistros; i++) {
			[i].print();
			total = total + llamada[i].ObtenCoste();
			System.out.println("Total Coste: "+total);
		}
	}
		

	
}
	
	

	
	

