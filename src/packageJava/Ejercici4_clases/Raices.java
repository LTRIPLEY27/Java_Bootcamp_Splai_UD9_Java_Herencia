package packageJava.Ejercici4_clases;
/*4.
Vamos a realizar una clase llamada Raices , donde representaremos los valores de
una ecuación de 2º grado.
Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto.
Las operaciones que se podrán hacer son las siguientes:
•
obtenerRaices (): imprime las 2 posibles soluciones
•
obtenerRaiz (): imprime única raíz, que será cuando solo tenga una solución
posible.
•
getDiscriminante (): devuelve el valor del discriminante double ), el discriminante
tiene la siguiente formula, (b^2) 4*a*c
•
tieneRaices (): devuelve un booleano indicando si tiene dos soluciones, para que
esto ocurra, el discriminante debe ser mayor o igual que 0.
•
tieneRaiz (): devuelve un booleano indicando si tiene una única solución, para que
esto ocurra, el discriminante debe ser igual que 0.
•
calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación,
en caso de no existir solución, mostrarlo también.
Formula ecuación 2º grado: (
b ±±√((b^ 2)--(4*a*c)))/(2*
Solo varia el signo delante de b*/

public class Raices {
	private double coeficienteA;//
	private double coeficienteB;
	private double coeficienteC;
	
	public Raices(double coeficienteA, double coeficienteB, double coeficienteC) {
		this.coeficienteA = coeficienteA;
		this.coeficienteB = coeficienteB;
		this.coeficienteC = coeficienteC;
	}

	public double getCoeficienteA() {
		return coeficienteA;
	}

	public void setCoeficienteA(int coeficienteA) {
		this.coeficienteA = coeficienteA;
	}

	public double getCoeficienteB() {
		return coeficienteB;
	}

	public void setCoeficienteB(int coeficienteB) {
		this.coeficienteB = coeficienteB;
	}

	public double getCoeficienteC() {
		return coeficienteC;
	}

	public void setCoeficienteC(int coeficienteC) {
		this.coeficienteC = coeficienteC;
	}
	
	//MÉTODO PARA OBTENER EL DISCRIMINANTE
	public double getDiscriminante() {
								//CLASE MATHPOW PARA ELEVEVAR COEFICIENTEB AL CUADRADO
		double discriminante = (Math.pow(this.coeficienteB, 2) - (4 * this.coeficienteA * this.coeficienteC));
		
		return discriminante;
	}
	
	// MÉTODO QUE EVALUA SI ES MAYOR O IGUAL A "0", TIENE RAICES
	public boolean tieneRaices() {
		boolean haveRoots = false;
		if(getDiscriminante() >= 0) {
			haveRoots = true;
		}
		
		return haveRoots;
	}
	
	/*tieneRaiz (): devuelve un booleano indicando si tiene una única solución, para que
esto ocurra, el discriminante debe ser igual que 0.*/
	
	public boolean tieneRaiz() {
		boolean haveRoot = false;
		
		if(getDiscriminante() == 0) {
			haveRoot = true;
		}
		
		return haveRoot;
	}
	
	// MÉTODO obtenerRaices (): imprime las 2 posibles soluciones
	public String obtenerRaices() {
		 
			double solucionA = ((- this.coeficienteB) + Math.sqrt(Math.pow(this.coeficienteB, 2) - (4 * this.coeficienteA * this.coeficienteC))) / (2 * this.coeficienteA);

	        double solucionB = ((- this.coeficienteB) - Math.sqrt(Math.pow(this.coeficienteB, 2) - (4 * this.coeficienteA * this.coeficienteC))) / (2 * this.coeficienteA);
	        
	       return "Las posibles soluciones son : \nSolucion 1 = " + solucionA + "\nSolucion 2 = " + solucionB;

	}
	
	/*obtenerRaiz (): imprime única raíz, que será cuando solo tenga una solución
	posible.*/
	
	public String obtenerRaiz() {
			double solucion = ((- this.coeficienteB) - (4 * this.coeficienteA * this.coeficienteC)) / (2 * this.coeficienteA);
			return "La  solucion  es : \nSolucion = " + solucion;
	
	}
	
	/*calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación,
en caso de no existir solución, mostrarlo también.*/
	
	public void calcular() {

		if(tieneRaiz()) {
			System.out.println("Tiene una solución y es = \n" + obtenerRaiz());
		}else if(tieneRaices()) {
			System.out.println("Tiene más de una solución = \n" + obtenerRaices());
		}else {
			System.out.println("no tiene solució");
		}
	}
}

