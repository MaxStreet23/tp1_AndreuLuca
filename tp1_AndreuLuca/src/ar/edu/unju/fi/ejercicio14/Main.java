package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		boolean ingresado=false;
		int tamanio=0,suma=0;
		Scanner sc=new Scanner(System.in);
		while(ingresado==false){
			System.out.print("Ingrese el tamanio del array [3-10]: ");
			try {
				tamanio=Integer.parseInt(sc.nextLine());
				if(tamanio<3||tamanio>10) {
					System.out.println("Tamanio no valido");
				}else {
					ingresado=true;
				}
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}
		int[] numeros=new int[tamanio];
		ingresado=false;
		for(int i=0;i<tamanio;i++) {
			while(ingresado==false){
				System.out.print("Ingrese un numero "+(i+1)+"/"+tamanio+": ");
				try {
					numeros[i]=Integer.parseInt(sc.nextLine());
					ingresado=true;
					suma+=numeros[i];
				}catch (NumberFormatException e) {
					System.out.println("Ingrese un numero valido");
				}
			}
			ingresado=false;
		}
		sc.close();
		for(int i=0;i<tamanio;i++) {
			System.out.println("Numero "+(i+1)+"/"+tamanio+": "+numeros[i]);
		}
		System.out.print("Suma de todos los numeros: "+suma);
	}
}
