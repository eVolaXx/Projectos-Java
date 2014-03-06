
public class Llamada {
    public int origen; 
    public int destino; 
    public int duracion; 
    public String tipoLlamada;

	public Llamada(int origen2, int destino2, int duracion2, String tipoLlamada2) {
		 	this.origen   = origen2; 
	        this.destino  = destino2; 
	        this.duracion = duracion2;
	        this.tipoLlamada = "franja1";
	}

	public void llamada (int origen, int destino, int duracion, String franja1){
        this.origen   = origen; 

        this.destino  = destino; 

        this.duracion = duracion; 
        
        this.tipoLlamada = franja1;

	}
	
	public int getOrigen(){
		return origen;
	}
	
	public int getDestino(){
		return destino;
	}
	
	public int getDuracion(){
		return duracion;
	}
	
    public String toString() { 
    	return origen + ", " + destino+ ", " + duracion+ ", " + tipoLlamada; 
    } 
	
}
