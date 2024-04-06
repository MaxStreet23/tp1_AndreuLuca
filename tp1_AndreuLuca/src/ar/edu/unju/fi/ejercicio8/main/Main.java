package ar.edu.unju.fi.ejercicio8.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;
public class Main {
	public static void main(String[] args) {
		long n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el numero");
		n=sc.nextLong();
		CalculadoraEspecial calculadora=new CalculadoraEspecial();
		calculadora.setN(n);
		System.out.println("Resultado de la sumatoria especial: "+calculadora.calcularSumatoria());
		System.out.println("Resultado de la productoria especial: "+calculadora.calcularProductoria());
		sc.close();
	}
}
