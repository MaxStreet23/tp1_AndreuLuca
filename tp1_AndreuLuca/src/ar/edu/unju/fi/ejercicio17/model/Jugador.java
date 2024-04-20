package ar.edu.unju.fi.ejercicio17.model;
import java.util.Calendar;
public class Jugador {
	private String nombre;
	private String apellido;
	private Calendar fechaNacimiento;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private String posicion;
	public int calcularEdad() {
		Calendar hoy=Calendar.getInstance();
		int edad=0;
		fechaNacimiento.add(Calendar.YEAR, 1);
		while(fechaNacimiento.compareTo(hoy)<0){
			edad++;
			fechaNacimiento.add(Calendar.YEAR, 1);
		}
		int i=edad;
		do {
			fechaNacimiento.add(Calendar.YEAR, -1);
			i--;
		} while(i>=0);
		return edad;
	}
	public Jugador(String nombre, String apellido, Calendar fechaNacimiento, String nacionalidad, float estatura,
			float peso, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}
	public Jugador() {
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public void mostrarFechaNacimiento() {
		System.out.println("Fecha de Nacimiento: "+fechaNacimiento.get(Calendar.DAY_OF_MONTH)+"/"+(fechaNacimiento.get(Calendar.MONTH)+1)+"/"+fechaNacimiento.get(Calendar.YEAR));
	}
}
