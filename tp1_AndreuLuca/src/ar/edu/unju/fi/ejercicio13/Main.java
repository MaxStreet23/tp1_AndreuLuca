package ar.edu.unju.fi.ejercicio13;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[] numeros=new int[8];
		Scanner sc=new Scanner(System.in);
		boolean ingresado=false;
		for(int i=0;i<8;i++) {
			while(ingresado==false){
				System.out.print("Ingrese un numero "+(i+1)+"/"+"8"+": ");
				try {
					numeros[i]=Integer.parseInt(sc.nextLine());
					ingresado=true;
				}catch (NumberFormatException e) {
					System.out.println("Ingrese un numero valido");
				}
			}
			ingresado=false;
		}
		sc.close();
		for(int i=0;i<8;i++) {
			System.out.println("Numero "+(i+1)+"/"+"8"+": "+numeros[i]);
		}
	}
}
