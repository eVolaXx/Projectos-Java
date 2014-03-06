
public class Llamada {

	public static final byte LOCAL = 0;
	public static final byte PROVINCIAL = 1;
	
	public static final int LOCAL_COSTE = 15;
	public static final int TYPE1_COSTE = 20;
	public static final int TYPE2_COSTE = 25;
	public static final int TYPE3_COSTE= 30;
	
	private String sourceCall;
	private String destinacionLlamada;
	private int duracion;
	private int localizacion;
	private byte CoutaType; // 1, 2 or 3
	private int coste;
	
	Llamada(String sc, String dc, int dur, int loc, byte gratis) {
		sourceCall=sc;
		SacarDestinacionLlamada(dc);
		duracion=dur;
		localizacion=loc;
		int CuotaType = gratis;
		if (localizacion==LOCAL) {
			coste = duracion * LOCAL_COSTE;
		} else { //Provincial
			int duration = 0;
			switch (CuotaType) {
			case 1: coste = duration * TYPE1_COSTE;
				break;
			case 2: coste = duration * TYPE2_COSTE;
				break;
			case 3: coste = duration * TYPE3_COSTE;
				break;
			default:
				coste = duration * LOCAL_COSTE;
				break;
			}
		}
	}
	
	public void print() {
		System.out.println(sourceCall+" - "+destinacionLlamada+" | "+
							duracion+" segundos");
	}
	
	public int ObtenerCoste() {
		return coste;
	}

	public String ObtenerDestinacionLlamada() {
		return destinacionLlamada;
	}

	public void SacarDestinacionLlamada(String destinacionLlamada) {
		this.destinacionLlamada = destinacionLlamada;
	}

	public byte getCoutaType() {
		return CoutaType;
	}

	public void setCoutaType(byte coutaType) {
		CoutaType = coutaType;
	}

}

