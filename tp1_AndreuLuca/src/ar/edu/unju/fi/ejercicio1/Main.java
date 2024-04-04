package ar.edu.unju.fi.ejercicio1;
public class Main {
	public static void main(String[] args) {
		int val1 = 8;
		int val2 = 5;
		int val3 = 1;
		int val4 = 9;
		int val5 = 20;
		calculadora calcular =new calculadora();
		float promedio = calcular.SumarYpromediar(val1, val2, val3, val4, val5);
		System.out.println("Promedio: "+promedio);
	}
}
