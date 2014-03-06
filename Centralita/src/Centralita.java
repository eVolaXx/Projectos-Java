	
public class Centralita {
	
	public static final String franja1 = "0,20";
	public static final String franja2 = "0,25";
	public static final String franja3 = "0.30";
	 static int contador = 0;
	public void añadirLlamada(int origen, int destino, int duracion, String tipoLlamada ){ 
		Llamada llamada = new Llamada(origen, destino, duracion, tipoLlamada); 
        contador = contador + 1;
    }
	
	public static void main(String[] args) {
	Centralita centralita = new Centralita();
	Llamada llamada = new Llamada(964567485, 647885994, 22, franja1);
	centralita.añadirLlamada(llamada);
	//Llamada llamada = new Llamada(964567455, 647889994, 22, franja1);
	//centralita.añadirLlamada(llamada);
	System.out.println(centralita.toString());
	System.out.println("Nº Llamadas: " +contador);
	}

	public void añadirLlamada(Llamada llamada) {
		llamada.toString();
	}

}
