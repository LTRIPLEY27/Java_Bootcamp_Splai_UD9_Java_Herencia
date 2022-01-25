package packageJava.Ejercici5_clases;

public class Profesor extends AulaPersonas{

	private String assignature;
	
	public Profesor(String name, int age, char sex, int attendance) {
		super(name, age, sex, attendance);
	}

	public String getAssignature() {
		return assignature;
	}

	public void setAssignature(String assignature) {
		this.assignature = assignature;
	}

	public void assignatureVerified(String assignature) {
		switch(assignature) {
			case "matematicas":
				this.assignature = "matematicas";
				break;
			case "filosofia":
				this.assignature = "filosofia";
				break;
			case "fisica":
				this.assignature = "fisica";
				break;	
			default:
				System.out.println("Las únicas asignaturas válidas son : matemáticas, filosofía y física");
				break;	
		}
	}
	
	@Override//SOBREESCRIBE AL MÉTODO DE LA CLASE ABSTRACTA
	public boolean assistance() {

		if(this.attendance == 1) {
			return true;
		}
		return false;
	}
	
	@Override//SOBREESCRIBE AL MÉTODO DE LA CLASE ABSTRACTA
	public String toString() {
		return "Nombre = " + super.getName() + "\nEdad = " + super.getAge() + "\nSexo = " + super.getSex() + "\nMateria = " + assignature;
	}

	

}
