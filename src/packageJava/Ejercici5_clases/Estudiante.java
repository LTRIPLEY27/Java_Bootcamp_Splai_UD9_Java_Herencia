package packageJava.Ejercici5_clases;

public class Estudiante extends AulaPersonas {
	
	private double qualification;
	//CONSTRUCTOR QUE IMPLEMENTA EL CONSTRUCTOR DE LA SUPERCLASE ABSTRACTA MÁAS ATRIBUTOS PROPIOS
	public Estudiante(String name, int age, char sex, int attendance) {
		super(name, age, sex, attendance);
	}
	
	public double getCalificacion() {
		return qualification;
	}

	public void qualificationVerified(double calificacion) {
		if(calificacion > 10 || calificacion < 0) {
			System.out.println("Ingrese una nota válida");
		} else {
			this.qualification = calificacion;
		}
	}
	
	public boolean isAproved() {
		boolean aproved = false;
		
		if(this.qualification >= 5) {
			aproved = true;
		}
		return aproved;
	}

	@Override
	public String toString() {
		return "Nombre = " + super.getName() + "\nEdad = " + super.getAge() + "\nSexo = " + super.getSex() + "\nCalificacion = " + qualification;
	}

	@Override
	public boolean assistance() {
		boolean response = false;
			if(this.attendance == 1) {
				response = true;
			}
		return response;
	}

}
