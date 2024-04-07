package ar.edu.unju.fi.ejercicio10.main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.model.Pizza;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pizza pizza1=new Pizza();
		System.out.println("Ingrese el diametro de la pizza 1");
		pizza1.setDiametro(sc.nextInt());
		while(pizza1.getDiametro()!=20&&pizza1.getDiametro()!=30&&pizza1.getDiametro()!=40) {
			System.out.println("Diametro de pizza invalido, solo se admiten los valores [20-30-40] Intente denuevo");
			pizza1.setDiametro(sc.nextInt());
		}
		System.out.println("Ingrese si quiere ingredientes especiales a la pizza [true/false]");
		pizza1.setIngredientesEspeciales(sc.nextBoolean());
		pizza1.setArea(pizza1.calcularArea());
		pizza1.setPrecio(pizza1.calcularPrecio());
		Pizza pizza2=new Pizza();
		System.out.println("Ingrese el diametro de la pizza 2");
		pizza2.setDiametro(sc.nextInt());
		while(pizza2.getDiametro()!=20&&pizza2.getDiametro()!=30&&pizza2.getDiametro()!=40) {
			System.out.println("Diametro de pizza invalido, solo se admiten los valores [20-30-40] Intente denuevo");
			pizza2.setDiametro(sc.nextInt());
		}
		System.out.println("Ingrese si quiere ingredientes especiales a la pizza [true/false]");
		pizza2.setIngredientesEspeciales(sc.nextBoolean());
		pizza2.setArea(pizza2.calcularArea());
		pizza2.setPrecio(pizza2.calcularPrecio());
		Pizza pizza3=new Pizza();
		System.out.println("Ingrese el diametro de la pizza 3");
		pizza3.setDiametro(sc.nextInt());
		while(pizza3.getDiametro()!=20&&pizza3.getDiametro()!=30&&pizza3.getDiametro()!=40) {
			System.out.println("Diametro de pizza invalido, solo se admiten los valores [20-30-40] Intente denuevo");
			pizza3.setDiametro(sc.nextInt());
		}
		System.out.println("Ingrese si quiere ingredientes especiales a la pizza [true/false]");
		pizza3.setIngredientesEspeciales(sc.nextBoolean());
		pizza3.setArea(pizza3.calcularArea());
		pizza3.setPrecio(pizza3.calcularPrecio());
		System.out.println("** Pizza 1 **");
		pizza1.mostrarDatos();
		System.out.println("** Pizza 2 **");
		pizza2.mostrarDatos();
		System.out.println("** Pizza 3 **");
		pizza3.mostrarDatos();
		sc.close();
	}
}
