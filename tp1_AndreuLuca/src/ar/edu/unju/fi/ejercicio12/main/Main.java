package ar.edu.unju.fi.ejercicio12.main;
import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calendar calendar=Calendar.getInstance();
		int dia,mes,anio;
		String nombre;
		System.out.print("Ingrese nombre de la persona: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese la fecha de nacimiento(Dia): ");
		dia=sc.nextInt();
		while(dia<1) {
			System.out.print("Dia invalido, ingrese de nuevo: ");
			dia=sc.nextInt();
		}
		System.out.print("Ingrese la fecha de nacimiento(Mes): ");
		mes=sc.nextInt()-1;
		while(mes<1) {
			System.out.print("Dia invalido, ingrese de nuevo: ");
			mes=sc.nextInt();
		}
		System.out.print("Ingrese la fecha de nacimiento(Anio): ");
		anio=sc.nextInt();
		calendar.set(anio, mes, dia);
		Persona persona=new Persona(nombre,calendar);
		System.out.println("Nombre: "+persona.getNombre());
		System.out.println("Fecha de Nacimiento: "+persona.getFechaNacimiento().get(Calendar.DAY_OF_MONTH)+"/"+(persona.getFechaNacimiento().get(Calendar.MONTH)+1)+"/"+persona.getFechaNacimiento().get(Calendar.YEAR));
		System.out.println("Edad: "+persona.calcularEdad());
		System.out.println("Signo de zodiaco: "+persona.calcularSignoZodiacal());
		System.out.println("Estacion: "+persona.calcularEstacion());
		sc.close();
	}
}