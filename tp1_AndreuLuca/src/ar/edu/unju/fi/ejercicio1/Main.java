package ar.edu.unju.fi.ejercicio1;
public class Main {
	public static void main(String[] args) {
		int val1 = 8;
		int val2 = 5;
		int val3 = 1;
		int val4 = 9;
		int val5 = 20;
		Calculadora calcular =new Calculadora();
		float promedio = calcular.sumarYpromediar(val1, val2, val3, val4, val5);
		System.out.println("Promedio: "+promedio);
	}
}
