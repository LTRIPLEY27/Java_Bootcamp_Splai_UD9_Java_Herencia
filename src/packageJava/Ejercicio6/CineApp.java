package packageJava.Ejercicio6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CineApp {

	public static void main(String[] args) {
		
		startProgram();//DISPARAMOS PROGRAMA
	}
	
	
	
	
	public static void startProgram() {
		Scanner ask = new Scanner(System.in);
		System.out.println("Desea comprar entrada?");
		String response = ask.next().toLowerCase();
		
		if(response.equals("si")) {
			do {
				System.out.println("Indique  película");
				String peli = ask.next();
				System.out.println("Indique la opción precio de la entrada");
				double entrada = ask.nextDouble();
				System.out.println("La disposición de entradas actual en el cine es: \n\n");
				Sala sala = new Sala(peli, entrada); // RECIBE POR PARAMETROS LOS ATRIBUTOS
				sala.getAsiento();
				System.out.println("Indique nombre : ");
				String espec= ask.next();
				System.out.println("Indique dinero disponible : ");
				double dinero = ask.nextDouble();
				System.out.println("Indique edad : ");
				int edad = ask.nextInt();
				
				
				Espectador espectador = new Espectador(espec, dinero, edad);// creacion del espectador
				Pelicula pelicula = new Pelicula(sala, 10, 18, "Stanley Kubrick" );// creacion instancia pelicula
				espectador.verificaAsiento(sala, pelicula);
				espectador.asientoAsignado(sala, pelicula);
				System.out.println(espectador.toString());
				System.out.println(pelicula.toString());
				System.out.println("Desea comprar entrada?");
				response = ask.next().toLowerCase();
			}while(response.equals("si"));
		}else {
			System.out.println("Adiós");
		}
		
		ask.close();
	}

}
