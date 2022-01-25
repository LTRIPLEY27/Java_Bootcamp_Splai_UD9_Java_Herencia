package packageJava.Ejercici5_clases;
import java.util.ArrayList;
import java.util.List;

import packageJava.Ejercici5_clases.Profesor;

public class Aula {
	private int maxStudents;
	private int id;
	private String destiny;
	private int femaleAproved;
	private int manAproved;
	private List <Estudiante> estudiantes = new ArrayList <Estudiante> ();
	
	public Aula(int maxStudents, int id) {
		this.maxStudents = maxStudents;
		this.id = id;
	}

	public int getmanAproved() {
		return this.manAproved;
	}
	
	public int getfemaleAproved() {
		return this.femaleAproved;
	}
	
	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestiny() {
		return destiny;
	}

	//MÉTODO QUE VERIFICA QUE EL AULA ESTÉ EN LOS PARÁMETROS DEFINIDOS
	public void destinyVerified(String destiny) {
		switch(destiny) {
			case "matematicas":
				this.destiny = "matematicas";
				break;
			case "filosofia":
				this.destiny = "filosofia";
				break;
			case "fisica":
				this.destiny = "fisica";
				break;	
			default:
				System.out.println("Las únicas asignaturas válidas son : matemáticas, filosofía y física");
				break;	
		}
	}
	
	// MÉTODO QUE VERIFICA QUE EL PROFESOR CORRESPONDA AL AULA
	public boolean isAvailable(Profesor profesor) {
		
		boolean available = false;
		
		if(getDestiny().equals(profesor.getAssignature())) {
			available = true;
		}
		
		return available;
	}
	
	public List <Estudiante> getEstudiante(){
		return estudiantes;
	}
	
	public void setEstudiantes(List <Estudiante> estudiantes) {//ACTUALIZA EL ARRAYLIST DE ESTUDIANTES
		this.estudiantes = estudiantes;
	}
	
	//MÉTODO QUE VERIFICA QUE NO SE EXCEDA LA CAPACIDAD DEL AULA
	public void llenaAula(Estudiante estudiante) {
		if(this.maxStudents >= this.estudiantes.size()) {
			estudiantes.add(estudiante);
		}
	}
	
	//VERIFICA LA MITAD DE ASISTENCIA DE ESTUDIANTES
	public boolean compruebaAsistencia() {
		boolean asistance = false;
		int cont = 0;
		for(Estudiante estu : estudiantes) {
			if(estu.assistance()) {
				cont++;
			}
		}
		if(cont > this.maxStudents / 2) {
			asistance = true;
		}
		return asistance;
	}
	
	//MÉTODO QUE RECORRE EL ARRAY DE ESTUDIANTES Y VERIFICA EL ATRIBUTO SEXO PARA ESTABLECER CUANTOS HAY APROBADOS Y REPROBADOS
	public void sexCounter(Profesor profesor) {
	
		if(classOk(profesor)) {
			for(Estudiante estu : estudiantes) {
				if(estu.getSex() == 'F' && estu.isAproved()) {
					this.femaleAproved++;
				}if(estu.getSex() == 'M' && estu.isAproved()) {
					this.manAproved++;
				}else {
					System.out.println("No hay alumnos femenidos o másculinos aprobados");
				}
			}
			System.out.println("Estudiantes aprobadas femeninas = " + this.femaleAproved);
			System.out.println("Estudiantes aprobados masculinos = " + this.manAproved);
		}
	}
	
	public boolean classOk(Profesor profesor) {
		if(compruebaAsistencia() && isAvailable(profesor) && profesor.assistance()) {
			return true;
		}
		return false;
	}
	
	public void responseClass(Profesor profesor) {
		if(classOk(profesor)) {
			System.out.println("El aula puede dar clase");
		}else {
			System.out.println("No se puede dar clases en el aula");
		}
	}

	@Override
	public String toString() {
		return "Aula \nMáximo estudiantes = " + maxStudents + "\nNúmero áula = " + id + "\nMateria = " + destiny;
	}
}
