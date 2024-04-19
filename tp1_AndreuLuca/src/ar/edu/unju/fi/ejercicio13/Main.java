package ar.edu.unju.fi.ejercicio13;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int[] numeros=new int[8];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<8;i++) {
			System.out.print("Ingrese un numero "+(i+1)+"/"+"8"+": ");
			numeros[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<8;i++) {
			System.out.println("Numero "+(i+1)+"/"+"8"+": "+numeros[i]);
		}
	}
}
