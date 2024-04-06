package ar.edu.unju.fi.ejercicio7.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio7.model.Empleado;
public class Main {
	public static void main(String[] args) {
		String nombre;
		String legajo;
		float salario;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado");
		nombre=sc.next();
		System.out.println("Ingrese el legajo del empleado");
		legajo=sc.next();
		System.out.println("Ingrese el salario del empleado");
		salario=sc.nextFloat();
		Empleado empleado=new Empleado(nombre, legajo, salario);
		empleado.mostrarDatos();
		System.out.println("SE AUMENTA EL SALARIO");
		empleado.aumentarSalario();
		empleado.mostrarDatos();
		sc.close();
	}
}
