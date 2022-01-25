package packageJava.Ejercicio6;

public class Sala extends Cine {
	/*
	 * private boolean asientos[][];// VERIFICA LUEGO DEL LLENADO CON BOOLEAN SI
	 * ESTA O NO OCUPADO private int asientoLetra;// ELECCION ASIENTOS private int
	 * asientoNum; private String [] nameSeat = {"A" , "B", "C", "D", "E", "F", "G",
	 * "H"}; // LETRAS ASIENTOS
	 * 
	 * 
	 * // atributos heredados
	 * 
	 * public Sala(String nombrePelicula, double precioEntrada, int asientoLetra,
	 * int asientoNum) { super(nombrePelicula, precioEntrada); this.asientoLetra =
	 * asientoLetra;//dimension del array this.asientoNum = asientoNum;
	 * 
	 * this.asientos = new boolean [this.asientoNum][this.asientoLetra];//
	 * INICIALIZO EL ARRAY CON LOS VALORES DESEADOS
	 * 
	 * // INICIALIZAMOS EL ARRAY COMO FALSE POR DEFECTO DESDE EL CONSTRUCTOR
	 * System.out.println("Las entradas disponibles del cine actualmente son : \n\n"
	 * ); for(int i = 0; i < asientos.length; i++) { for(int j = 0; j <
	 * asientos[i].length; j++) { if(asientos[i][j]) { System.out.print("H" + " ");
	 * //APUNTA EL LLENADO DE LA LETRA }else {
	 * System.out.print((this.asientos.length - i) + this.nameSeat[j] + " " + false
	 * + " "); // UBICA LAS LETRAS Y NÚMEROS ITERANDO DESDE EL ARRAY DE LETRAS }
	 * 
	 * this.asientos[i][j] = false;// LOS ASIENTOS ESTAN FALSE PUES ESTAN
	 * "NO OCUPADOS" }
	 * 
	 * System.out.println(""); }
	 * 
	 * System.out.println(""); }
	 * 
	 * // MÉTODO QUE VERIFICA QUE EL ASIENTO SELECCIONADO ESTÉ O NO VACIÓO
	 * 
	 * public boolean[][] getAsientos() { return asientos; }
	 * 
	 * 
	 * public void setAsientos(boolean[][] asientos) { this.asientos = asientos; }
	 * 
	 * 
	 * public int getAsientoLetra() { return asientoLetra; }
	 * 
	 * 
	 * public void setAsientoLetra(int asientoLetra) { this.asientoLetra =
	 * asientoLetra; }
	 * 
	 * 
	 * public int getAsientoNum() { return asientoNum; }
	 * 
	 * 
	 * public void setAsientoNum(int asientoNum) { this.asientoNum = asientoNum; }
	 * 
	 * 
	 * 
	 * /*
	 * 
	 * // MÉTODO QUE VA ADJUNTANDO LOS VALORES QUE RECIBE POR TECLADO PARA IR
	 * LLENANDO LOS ASIENTOS public void llenaArray(int fila, int columna, boolean
	 * response) {
	 * 
	 * for(int i = 0; i < asiento.length; i++) { for(int j = 0; j <
	 * asiento[i].length; j++) { if(verificaAsientoVacio(fila, columna) && response)
	 * { System.out.print(" H" + " "); asiento[fila][columna] = true; } else {
	 * System.out.print((this.asiento.length - i) + this.nameSeat[j] + " " +
	 * asientos[i][j] + " ");
	 * 
	 * } } System.out.println(""); } System.out.println(""); }
	 */

	// verifica si asiento est{a vacío o no
	// public boolean verificaAsientoVacio(int fila, int columna)
	/*
	 * public boolean verificaAsientoVacio(String asiento[][]) { boolean respuesta =
	 * false;
	 * 
	 * for(int i = 0; i < asiento.length; i++) { for(int j = 0; j <
	 * asiento[i].length; j++) { if(asiento[i][j].equals("@")) { respuesta = true; }
	 * } } return respuesta; }
	 */

	// public class Sala extends Cine{
	private String[][] asiento = { { "8A", "8B", "8C", "8D", "8E", "8F", "8G", "8H", "8I" },
			{ "7A", "7B", "7C", "7D", "7E", "7F", "7G", "7H", "7I" },
			{ "6A", "6B", "6C", "6D", "6E", "6F", "6G", "6H", "6I" },
			{ "5A", "5B", "5C", "5D", "5E", "5F", "5G", "5H", "5I" },
			{ "4A", "4B", "4C", "4D", "4E", "4F", "4G", "4H", "4I" },
			{ "3A", "3B", "3C", "3D", "3E", "3F", "3G", "3H", "3I" },
			{ "2A", "2B", "2C", "2D", "2E", "2F", "2G", "2H", "2I" },
			{ "1A", "1B", "1C", "1D", "1E", "1F", "1G", "1H", "1I" } };
	private String generado = "";
	private String asientoSala = "";
	boolean asientoVacio = false;

	public Sala(String nombrePelicula, double precioEntrada) {
		super(nombrePelicula, precioEntrada);
		this.asientoSala = recorridoAsientos(asiento, generado);
		this.asientoVacio = verificaAsientoVacio(asiento);
	}

	public String getAsiento() {
		return this.asientoSala;
	}

	public boolean asientoVacio() {
		return this.asientoVacio;
	}

	public static String recorridoAsientos(String asiento[][], String generado) {
		String cogido = "";
		generado = generarAsiento();
		for (int i = 0; i < asiento.length; i++) {
			for (int j = 0; j <= asiento.length; j++) {
				if (generado.equals(asiento[i][j])) {
					asiento[i][j] = "@";
				}
				if (!asiento[i][j].equals("@")) {
					cogido = asiento[i][j];
				}
				System.out.print(asiento[i][j] + " ");
			}
			System.out.println("\n");
		}

		System.out.println("Asiento: " + generado);
		return "Asiento: " + generado;
	}

	public static String generarAsiento() {
		String asString;
		int asientoNumGenerado = 0;
		int asientoStringGenerado = 0;
		// Generamos el numero del asiento
		asientoNumGenerado = (int) (Math.random() * 8) + 1;// Numero
		// Generamos la letra del asiento
		asientoStringGenerado = (int) (Math.random() * (73 - 64) + 64 + 1);// Letra
		char asientoStringGeneradoSi = (char) asientoStringGenerado;// Pasamos la letra a char
		String asientoStringGeneradoFinal = String.valueOf(asientoStringGeneradoSi);// Lo pasamos a String para meterlo
																					// al array
		// Pasamos el numero a string
		asString = String.valueOf(asientoNumGenerado);
		// Juntamos el numero y la letra
		asString += asientoStringGeneradoFinal;
		return asString;
	}

	@Override
	public String toString() {
		return "asientos [asientoSala=" + asientoSala + "]";
	}

	public boolean verificaAsientoVacio(String asiento[][]) {
		boolean respuesta = false;

		for (int i = 0; i < asiento.length; i++) {
			for (int j = 0; j < asiento[i].length; j++) {
				if (asiento[i][j].equals("@")) {
					respuesta = true;
				}
			}
		}
		return respuesta;
	}

}

//}
