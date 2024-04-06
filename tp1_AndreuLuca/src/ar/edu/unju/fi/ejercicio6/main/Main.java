package ar.edu.unju.fi.ejercicio6.main;
import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6.model.Persona;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Persona persona1=new Persona();
		persona1.mostrarDatos();
		System.out.println("Ingrese el dni");
		String dni1=sc.next();
		System.out.println("Ingrese el nombre");
		String nombre1=sc.next();
		System.out.println("Ingrese la fecha (Anio, Mes, Dia)");
		LocalDate fecha1=LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("Ingrese la provincia");
		String provincia1=sc.next();
		Persona persona2=new Persona(dni1, nombre1, fecha1, provincia1);
		persona2.mostrarDatos();
		System.out.println("Ingrese el dni");
		String dni2=sc.next();
		System.out.println("Ingrese el nombre");
		String nombre2=sc.next();
		System.out.println("Ingrese la fecha (Anio, Mes, Dia)");
		LocalDate fecha2=LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
		Persona persona3=new Persona(dni2, nombre2, fecha2);
		persona3.mostrarDatos();
		sc.close();
	}
}
