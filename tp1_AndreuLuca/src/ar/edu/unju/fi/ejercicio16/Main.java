package ar.edu.unju.fi.ejercicio16;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Me advierte que no cerre el scanner aunque lo hice en la linea 34
		String[] nombres=new String[5];
		boolean ingresado=false;
		int i=0;
		byte indice=0;
		for(;i<nombres.length;i++) {
			System.out.print("Ingrese el nombre de una persona "+(i+1)+"/5: ");
			nombres[i]=sc.next();
		}
		i=0;
		System.out.println("Se muestran los nombres");
		while(i<nombres.length){
			System.out.println("Nombre de la persona "+(i+1)+"/5: "+nombres[i]);
			i++;
		}
		System.out.println("Tamanio del arreglo: "+nombres.length);
		do{
			System.out.print("Ingrese el indice a borrar del arreglo[0-4]: ");
			try {
				indice=Byte.parseByte(sc.nextLine());
				if(indice<0||indice>nombres.length-1) {
					System.out.println("Tamanio no valido");
				}else {
					ingresado=true;
				}
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}while(ingresado==false);
		sc.close();//Aca cierro el scanner pero igual me advierte no se porque
		if(indice==nombres.length-1) {//Si el indice a borrar es el ultimo no necesito desplazar nada
			nombres[nombres.length-1]=null;
		}else {
			for(int j=0;j<nombres.length-1;j++) {
				if(j==indice) {
					nombres[j]=nombres[j+1];
					indice++;
				}
			}
		}
		i=0;
		while(i<nombres.length-1){
			System.out.println("Nombre de la persona "+(i+1)+"/4: "+nombres[i]);
			i++;
		}
	}
}
