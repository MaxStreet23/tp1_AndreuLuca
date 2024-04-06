package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int numero=0;
		Scanner sc=new Scanner(System.in);
		boolean rango=false;
		while(rango==false){
			System.out.println("Ingrese un numero de 1 a 9");
			numero=sc.nextInt();
			if(numero>0&&numero<10){
				rango=true;
			}else{
				System.out.println("Numero fuera de rango, vuelva a introducir");
			}
		}
		sc.close();
		for(int i=0;i<11;i++){
			System.out.println(numero +" x " +i +" = " +numero*i);
		}
	}
}
