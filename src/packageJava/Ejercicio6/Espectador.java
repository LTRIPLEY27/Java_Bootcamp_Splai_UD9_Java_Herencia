package packageJava.Ejercicio6;

public class Espectador {
	private String nombre;
	private double dinero;
	private int edad;
	
	public Espectador(String nombre, double dinero, int edad) {
		this.nombre = nombre;
		this.dinero = dinero;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getDinero() {
		return dinero;
	}


	public void setDinero(double dinero) {
		this.dinero = dinero;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

//MÉTODO QUE VERIFICA LAS CONDICIONES = EDAD MAYOR O IGUAL A LA REGLADA, DINERO <= A PRECIO ENTRADA Y QUE EL ASIENTO SE ENCUENTRE VACÍO
	/*public boolean verificaAsiento(double precio, int edadMinima, int fila, int columna, boolean asientoisEmpty) {
		boolean isEmpty = false;
		
		if(edad >= edadMinima && precio <= dinero  && asientoisEmpty) {
			isEmpty = true;
		} 
		
		return isEmpty;
	}*/
	
	
	//public boolean verificaAsiento(Sala sala, Pelicula pelicula, int fila, int columna) {/// ENVIAMOS OBJETOS COMO ARGUMENTOS
	public boolean verificaAsiento(Sala sala, Pelicula pelicula) {
	boolean isEmpty = false;
	
	if(edad >= pelicula.getEdad_minima() && sala.getPrecioEntrada() <= dinero  && sala.asientoVacio) {
		isEmpty = true;
	} 
	
	return isEmpty;
}
	
	// MÉTODO QUE RETORNA POR CADA CONDICIONAL UNA RESPUESTA DE VALOR NEGADO
	//public void asientoAsignado(Sala sala, Pelicula pelicula, int fila, int columna) {
	public void asientoAsignado(Sala sala, Pelicula pelicula) {
		if(edad <= pelicula.getEdad_minima()) {
			System.out.println("Lo siento, no tiene la edad mínima para ver la película");
		}if(sala.getPrecioEntrada() >= dinero) {
			System.out.println("Lo siento, el precio de la entrada es superior a su disposición");
		}if(!(sala.asientoVacio)) {
			System.out.println("Lo siento, el asiento está ocupado");
		}else {
			System.out.println("Gracias por su compra");
		}
	}
	
	@Override
	public String toString() {
		return "Espectador nombre= " + nombre + ", dinero= " + dinero + ", edad= " + edad;
	}
	
	
}
