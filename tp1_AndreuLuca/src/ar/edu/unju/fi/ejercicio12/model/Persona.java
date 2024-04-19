package ar.edu.unju.fi.ejercicio12.model;
import java.util.Calendar;
public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
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
	public String calcularSignoZodiacal() {
		String signo="";
		int mes=fechaNacimiento.get(Calendar.MONTH)+1;
		int dia=fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		switch(mes) {
		case 1:
			if(dia<20) {
				signo="Capricornio";
			}else {
				signo="Acuario";
			}
			break;
		case 2:
			if(dia<19) {
				signo="Acuario";
			}else {
				signo="Piscis";
			}
			break;
		case 3:
			if(dia<21) {
				signo="Piscis";
			}else {
				signo="Aries";
			}
			break;
		case 4:
			if(dia<20) {
				signo="Aries";
			}else {
				signo="Tauro";
			}
			break;
		case 5:
			if(dia<21) {
				signo="Tauro";
			}else {
				signo="Geminis";
			}
			break;
		case 6:
			if(dia<21) {
				signo="Geminis";
			}else {
				signo="Cancer";
			}
			break;
		case 7:
			if(dia<23) {
				signo="Cancer";
			}else {
				signo="Leo";
			}
			break;
		case 8:
			if(dia<23) {
				signo="Leo";
			}else {
				signo="Virgo";
			}
			break;
		case 9:
			if(dia<23) {
				signo="Virgo";
			}else {
				signo="Libra";
			}
			break;
		case 10:
			if(dia<23) {
				signo="Libra";
			}else {
				signo="Escorpio";
			}
			break;
		case 11:
			if(dia<22) {
				signo="Escorpio";
			}else {
				signo="Sagitario";
			}
			break;
		case 12:
			if(dia<22) {
				signo="Sagitario";
			}else {
				signo="Capricornio";
			}
			break;
		}
		return signo;
	}
	public String calcularEstacion() {
		String estacion="";
		int mes=fechaNacimiento.get(Calendar.MONTH)+1;
		int dia=fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		if((mes==12&&dia>20)||(mes<3)||(mes==3&&dia<21)) {
			estacion="Verano";
		}else {
			if((mes==3&&dia>20)||(mes<6)||(mes==6&&dia<21)) {
				estacion="Otonio";
			}else {
				if((mes==6&&dia>20)||(mes<9)||(mes==9&&dia<21)) {
					estacion="Invierno";
				}else {
					estacion="Primavera";
				}
			}
		}
		return estacion;
	}
	public Persona(String nombre, Calendar fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
