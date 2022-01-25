package packageJava.Ejercicio6;

public class Cine { // CLASE PADRE

	protected String nombrePelicula;
	protected double precioEntrada;
	
	public Cine(String nombrePelicula, double precioEntrada) {
		this.nombrePelicula = nombrePelicula;// atributo compartido con película
		this.precioEntrada = precioEntrada;
	}
	

	public String getNombrePelicula() {
		return nombrePelicula;
	}
	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}
	public double getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	
	//MÉTODO TOSTRING
	@Override
	public String toString() {
		return "Cine [nombrePelicula=" + nombrePelicula + ", precioEntrada=" + precioEntrada + "]";
	}
	
	
	
	
	
	
	
}
