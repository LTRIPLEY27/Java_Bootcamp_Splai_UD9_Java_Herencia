package packageJava.Ejercici5_clases;
import packageJava.Ejercici5_clases.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	public static void startProgram() {
		String start = JOptionPane.showInputDialog("Desea verificar disponibilidad del áula?").toLowerCase();
		if(start.equals("si")) {
			do {
				profesor();
			}while(start.equals("si"));
		}else {
			JOptionPane.showConfirmDialog(null, "Hasta luego");
		}
	}
	
	public static void profesor() {
		Scanner ask = new Scanner(System.in);
		System.out.println("Indique nombre Profesor");
		String name = ask.next();
		System.out.println("Indique edad profesor");
		int age = ask.nextInt();
		System.out.println("Indique sexo con una incial: \nFemenino = 'F'\nMasculino = 'M'");
		char sex = ask.next().charAt(0);
		System.out.println("Indique asistencia al áula con un número: \nAsistiré = '1'\nNo asistiré = '0'");
		int asistencia = ask.nextInt();
		Profesor profesor = new Profesor(name, age, sex, asistencia);
		System.out.println("Indique asignatura");
		String name1 = ask.next();
		profesor.assignatureVerified(name1);
		aula(profesor);
	}
	
	public static void aula(Profesor profesor) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Indique máximo de estudiantes");// CONDICIONARÁ LA ASISTENCIA
		int max = ask.nextInt();
		System.out.println("Indique Número de aula");
		int id = ask.nextInt();
		System.out.println("Indique materia del áula");
		String destino = ask.next();
		Aula aula = new Aula(max, id);
		aula.destinyVerified(destino);
		
		getClassroom(profesor, aula);
	}
	
	public static void getClassroom(Profesor profesor, Aula aula) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Desea anexar estudiante? \nMarque 1 para continuar \nMarque 2 para salir");
		int response = ask.nextInt();
		do {
			System.out.println("Indique nombre");
			String name1 = ask.next();
			System.out.println("Indique edad");
			int age1 = ask.nextInt();
			System.out.println("Indique sexo con una incial: \nFemenino = 'F'\nMasculino = 'M'");
			char sex1 = ask.next().charAt(0);
			System.out.println("Indique asistencia al áula con un número: \nAsistiré = '1'\nNo asistiré = '0'");
			int asistencia1 = ask.nextInt();
			Estudiante estudiante = new Estudiante(name1, age1, sex1, asistencia1);
			System.out.println("Indique calificación");
			double calificacion = ask.nextDouble();
			estudiante.qualificationVerified(calificacion);
			aula.llenaAula(estudiante);
			System.out.println(estudiante.toString());
			System.out.println("Desea anexar estudiante? \nMarque 1 para continuar \nMarque 2 para salir");
			response = ask.nextInt();
		}while(response == 1);
			
		printClassroom(profesor, aula);
	}
	
	
	public static void printClassroom(Profesor profesor, Aula aula) {
		System.out.println("Datos profesor = ");
		System.out.println(profesor.toString());
		
		System.out.println("\nDatos Áula = ");

		aula.compruebaAsistencia();
		aula.isAvailable(profesor);
		aula.classOk(profesor);
		aula.sexCounter(profesor);
		aula.responseClass(profesor);
		System.out.println(aula.toString());
		
		System.out.println("Datos Alumnos = ");
		
	}

}
