package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int numero=0;
		Scanner sc=new Scanner(System.in);
		boolean rango=false;
		while(rango==false){
			System.out.println("Ingrese un numero de 0 a 10");
			numero=sc.nextInt();
			if(numero>=0&&numero<11){
				rango=true;
			}else{
				System.out.println("Numero fuera de rango, vuelva a introducir");
			}
		}
		sc.close();
		int i=1,res=1;
		while(i<=numero) {
			res*=i;
			i++;
		}
		System.out.println(res);
	}
}
