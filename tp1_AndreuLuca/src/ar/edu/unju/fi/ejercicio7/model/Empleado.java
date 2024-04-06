package ar.edu.unju.fi.ejercicio7.model;
public class Empleado {
	private String nombre;
	private String legajo;
	private float salario;
	final float SALARIO_MINIMO=210000.00f;
	final float AUMENTO_X_MERITOS=20000.00f;
	public Empleado(String nombre, String legajo, float salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario>=SALARIO_MINIMO){
			this.salario=salario;
		}else{
			this.salario=SALARIO_MINIMO;
		}
	}
	public void mostrarDatos(){
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario: "+salario);
	}
	public void aumentarSalario(){
		salario+=AUMENTO_X_MERITOS;
	}
}
