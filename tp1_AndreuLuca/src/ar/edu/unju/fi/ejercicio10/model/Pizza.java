package ar.edu.unju.fi.ejercicio10.model;
public class Pizza {
	private int diametro;
	private float precio;
	private double area;
	private boolean ingredientesEspeciales;
	final short INGREDIENTES_ESPECIALES_20=500;
	final short INGREDIENTES_ESPECIALES_30=750;
	final short INGREDIENTES_ESPECIALES_40=1000;
	public int calcularPrecio() {
		switch(diametro) {
		case 20:
			if(ingredientesEspeciales==true) {
				return 4500+INGREDIENTES_ESPECIALES_20;
			}else {
				return 4500;
			}
		case 30:
			if(ingredientesEspeciales==true) {
				return 4800+INGREDIENTES_ESPECIALES_30;
			}else {
				return 4800;
			}
		case 40:
			if(ingredientesEspeciales==true) {
				return 5500+INGREDIENTES_ESPECIALES_40;
			}else {
				return 5500;
			}
		}
		return 0;
	}
	public double calcularArea() {
		area=Math.PI*(Math.pow((diametro/2),2));
		return area;
	}
	public void mostrarDatos() {
		System.out.println("Diametro = "+diametro);
		System.out.println("Ingredientes especiales = "+ingredientesEspeciales);
		System.out.println("Precio Pizza = "+precio +"$");
		System.out.println("Area de la pizza = "+area);
	}
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}
}
