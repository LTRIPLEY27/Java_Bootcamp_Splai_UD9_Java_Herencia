package packageJava.Ejercici4_clases;

import java.util.Scanner;

public class MainMethod {
	public static void startProgram() {
		Scanner ask = new Scanner(System.in);
		
		System.out.println("Marque 1 para calcular raiz :");
		int opcion = ask.nextInt();
		
		if(opcion == 1) {
			do {
				System.out.println("Indique coeficiente A :");
				double coeficienteA =ask.nextDouble();
				System.out.println("Indique coeficiente B :");
				double coeficienteB=ask.nextDouble();
				System.out.println("Indique coeficiente C :");
				double coeficienteC =ask.nextDouble();
				Raices raices = new Raices(coeficienteA, coeficienteB, coeficienteC);
				despliegaOpcion(raices);
				System.out.println("Marque 1 para calcular raiz :");
				opcion = ask.nextInt();
			}while(opcion == 1);
		}else {
			System.out.println("Hasta luego");
		}
		
		ask.close();
	}
	
	public static void despliegaOpcion(Raices raices) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Indique opción : \n1.- Marque 1 para obtener el Discriminante : \n2.- Saber si dispone de 1 o mas soluciones : \n3.- Calcular las soluciones : ");
		int respuesta = ask.nextInt();
		switch(respuesta) {
			case 1:
				System.out.println("El discriminate es = " + raices.getDiscriminante());
				break;
			case 2:
				if(raices.getDiscriminante() == 0) {
					System.out.println("Tiene más de una solución");
				} else {
					System.out.println("Tiene una solución");
				}
				break;
			case 3:
				raices.calcular();
				break;
			default:
				System.out.println("Ingrese una opción válida");
				break;
		}
}
}
