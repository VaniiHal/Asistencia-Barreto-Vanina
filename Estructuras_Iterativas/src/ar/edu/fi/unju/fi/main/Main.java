package ar.edu.fi.unju.fi.main;

import java.util.Scanner;

import ar.edu.fi.unju.fi.model.Alumno;
import ar.edu.fi.unju.fi.model.Materia;
import ar.edu.fi.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// Notas finales de 4 materias
		Scanner teclado = new Scanner(System.in);
		
		Alumno alumno = new Alumno();
		
		cargarDatos(alumno, teclado);
		System.out.println(alumno.toString());
		
		
		System.out.println("Ingrese cantidad de materias: ");
		int numMaterias = teclado.nextInt();
		
		while(numMaterias >0) {
			//cargar materias
			Materia materia = new Materia();
			cargarMateria(materia,teclado);
			
			System.out.println("Ingrese el codigo del registro de nota: ");
			String codigoNota = teclado.next();
			System.out.println("Ingrese la nota final: ");
			Float notaFinal = teclado.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, notaFinal);
			System.out.println(registroNota.toString());
			numMaterias++;
			
		}
		
		
		teclado.close();
	}

	private static void cargarMateria(Materia materia, Scanner teclado) {
			
		System.out.println("Ingrese el codigo de la materia: ");
		String codMateria = teclado.next();
		teclado.nextLine();
		System.out.println("Ingrese el nombre de la materia: ");
		String nombreMateria = teclado.next();
		teclado.nextLine();
		
		materia.setCodigo(codMateria);
		materia.setNombre(nombreMateria);		
		
	}

	private static void cargarDatos(Alumno alumno, Scanner entrada) {

		System.out.println("Ingrese legajo: ");
		Integer legajo = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Ingrese apellido: ");
		String apellido = entrada.next();
		entrada.nextLine();
		
		System.out.println("Ingrese nombre: ");
		String nombre = entrada.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
	}
	

}
