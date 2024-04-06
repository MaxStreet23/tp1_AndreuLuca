package ar.edu.unju.fi.ejercicio8.model;
public class CalculadoraEspecial {
	private long n;
	public CalculadoraEspecial(){
	}
	public long getN() {
		return n;
	}
	public void setN(long n) {
		this.n = n;
	}
	public long calcularSumatoria() {
		long res=0;
		for(long k=1;k<=n;k++) {
			res+=Math.pow((k*(k+1))/2,2);
		}
		return res;
	}
	public long calcularProductoria() {
		long res=1;
		for(long k=1;k<=n;k++) {
			res*=k*(k+4);
		}
		return res;
	}
}
