package packageJava.Ejercici5_clases;

public abstract class AulaPersonas {
	
	// ATRIBUTOS COMPARTIDOS POR PROFESOR Y ALUMNO, DECLARADOS PROTECTED YA QUE HEREDAN
	protected String name;
	protected int age;
	protected char sex;
	protected int attendance;
	
	
	
	public AulaPersonas(String name, int age, char sex, int attendance) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.attendance = attendance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public int getAttendance() {
		return attendance;
	}
	public void setName(int attendance) {
		this.attendance = attendance;
	}
	
	public abstract String toString();
	public abstract boolean assistance();
	
}
