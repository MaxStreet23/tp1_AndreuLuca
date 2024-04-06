package ar.edu.unju.fi.ejercicio9.model;
public class Producto {
	private String nombre;
	private int codigo;
	private float precio;
	private short descuento;
	public Producto() {
	}
	public float calcularDescuento() {
		float res;
		res=precio-(precio*((float)descuento/100));
		return res;
	}
	public void mostrarDatos() {
		System.out.println("Nombre del producto: "+nombre);
		System.out.println("Codigo del producto: "+codigo);
		System.out.println("Precio del producto: "+precio +"$");
		System.out.println("Descuento del producto: "+descuento +"%");
		System.out.println("Precion con descuento del producto: "+calcularDescuento() +"$");
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public short getDescuento() {
		return descuento;
	}
	public void setDescuento(short descuento) {
		this.descuento = descuento;
	}
}
