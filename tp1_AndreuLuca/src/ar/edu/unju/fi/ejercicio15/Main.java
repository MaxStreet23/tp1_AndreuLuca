package ar.edu.unju.fi.ejercicio15;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		boolean ingresado=false;
		int tamanio=0;
		Scanner sc=new Scanner(System.in);
		while(ingresado==false){
			System.out.print("Ingrese el tamanio del array [5-10]: ");
			try {
				tamanio=Integer.parseInt(sc.nextLine());
				if(tamanio<5||tamanio>10) {
					System.out.println("Tamanio no valido");
				}else {
					ingresado=true;
				}
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}
		String[] nombres=new String[tamanio];
		for(int i=0;i<tamanio;i++) {
			System.out.print("Ingrese el nombre de una persona "+(i+1)+"/"+tamanio+": ");
			nombres[i]=sc.next();
		}
		sc.close();
		for(int i=0;i<tamanio;i++) {
			System.out.println("Nombre de la persona "+(i+1)+"/"+tamanio+": "+nombres[i]);
		}
		System.out.println("** Ahora Inverso **");
		for(int i=tamanio-1;i>=0;i--) {
			System.out.println("Nombre de la persona "+(i+1)+"/"+tamanio+": "+nombres[i]);
		}
	}
}
