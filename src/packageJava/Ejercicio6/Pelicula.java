package packageJava.Ejercicio6;

public class Pelicula {
	private String titulo;
	private double duracion;
	private int edad_minima;
	private String director;
	
	public Pelicula(Sala sala, double duracion, int edad_minima, String director) {
		this.titulo = sala.getNombrePelicula();// el atríbuto es el mismo de la sala
		this.duracion = duracion;
		this.edad_minima = edad_minima;
		this.director = director;
	}



	@Override
	public String toString() {
		return "Pelicula titulo=" + titulo + ", duracion=" + duracion + ", edad_minima=" + edad_minima + ", director="
				+ director ;
	}


	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getEdad_minima() {
		return edad_minima;
	}

	public void setEdad_minima(int edad_minima) {
		this.edad_minima = edad_minima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}
