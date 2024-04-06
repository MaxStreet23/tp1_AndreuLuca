package ar.edu.unju.fi.ejercicio9.main;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Producto producto1=new Producto();
		System.out.println("Ingrese el nombre del producto 1");
		producto1.setNombre(sc.next());
		System.out.println("Ingrese el codigo del producto 1");
		producto1.setCodigo(sc.nextInt());
		System.out.println("Ingrese el precio del producto 1");
		producto1.setPrecio(sc.nextFloat());
		System.out.println("Ingrese el descuento del producto 1");
		producto1.setDescuento(sc.nextShort());
		while(producto1.getDescuento()<0||producto1.getDescuento()>50) {
			System.out.println("Descuento fuera de rango [0-50], intente denuevo");
			producto1.setDescuento(sc.nextShort());
		}
		Producto producto2=new Producto();
		System.out.println("Ingrese el nombre del producto 2");
		producto2.setNombre(sc.next());
		System.out.println("Ingrese el codigo del producto 2");
		producto2.setCodigo(sc.nextInt());
		System.out.println("Ingrese el precio del producto 2");
		producto2.setPrecio(sc.nextFloat());
		System.out.println("Ingrese el descuento del producto 2");
		producto2.setDescuento(sc.nextShort());
		while(producto2.getDescuento()<0||producto2.getDescuento()>50) {
			System.out.println("Descuento fuera de rango [0-50], intente denuevo");
			producto2.setDescuento(sc.nextShort());
		}
		Producto producto3=new Producto();
		System.out.println("Ingrese el nombre del producto 3");
		producto3.setNombre(sc.next());
		System.out.println("Ingrese el codigo del producto 3");
		producto3.setCodigo(sc.nextInt());
		System.out.println("Ingrese el precio del producto 3");
		producto3.setPrecio(sc.nextFloat());
		System.out.println("Ingrese el descuento del producto 3");
		producto3.setDescuento(sc.nextShort());
		while(producto3.getDescuento()<0||producto3.getDescuento()>50) {
			System.out.println("Descuento fuera de rango [0-50], intente denuevo");
			producto3.setDescuento(sc.nextShort());
		}
		sc.close();
		producto1.mostrarDatos();
		producto2.mostrarDatos();
		producto3.mostrarDatos();
	}
}
