package ar.edu.unju.fi.ejercicio17.main;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
//import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio17.model.Jugador;
public class Main {
	public static void main(String[] args) {
		int option=0;
		Scanner sc=new Scanner(System.in);
		List<Jugador> jugadores=new ArrayList<Jugador>();
		boolean valido=false;
		while(option!=8){
			do {
				valido=false;
				System.out.println("\n*** MENU ***");
				System.out.println("1) Dar de alta un jugador");
				System.out.println("2) Mostrar datos de un jugador");
				System.out.println("3) Mostrar todos los jugadores ordenados por apellido");
				System.out.println("4) Modificar los datos de un jugador");
				System.out.println("5) Eliminar un jugador");
				System.out.println("6) Mostrar la cantidad total de jugadores");
				System.out.println("7) Mostrar la cantidad de jugadores de cierta nacionalidad");
				System.out.println("8) Salir");
				try {
					System.out.print("Opcion: ");
					option=Integer.parseInt(sc.next());
					if(option<1||option>8) {
						System.out.println("\nOpcion no valida");
					}else {
						valido=true;
					}
				}catch (NumberFormatException e) {
					System.out.println("\nERROR: Ingrese un numero valido");
				}
			}while(valido==false);
			switch(option) {
			case 1:
				agregarJugador(jugadores, sc, valido);
				break;
			case 2:
				mostrarJugador(jugadores, sc, valido);
				break;
			case 3:
				mostrarJugadoresPorApellido(jugadores, valido);
				break;
			case 4:
				modificarDatosDeUnJugador(jugadores, sc, valido);
				break;
			case 5:
				eliminarJugador(jugadores, sc);
				break;
			case 6:
				mostrarCantidadDeJugadores(jugadores);
				break;
			case 7:
				mostrarCantidadDeJugadoresDeUnaNacionalidad(jugadores, sc);
				break;
			}
		}
		sc.close();
	}
	
	public static void agregarJugador(List<Jugador> jugadores, Scanner sc, boolean valido) {
		String nombre, apellido, nacionalidad, posicion;
		float estatura=0, peso=0;
		Calendar calendar=Calendar.getInstance();
		int dia=0,mes=0,anio=0;
		System.out.print("Ingrese nombre del jugador: ");
		nombre=sc.next();
		System.out.print("Ingrese apellido del jugador: ");
		apellido=sc.next();
		valido=false;
		while(valido==false){
			System.out.print("Ingrese la fecha de nacimiento(Dia): ");
			try {
				dia=Integer.parseInt(sc.next());
				if(dia<1) {
					System.out.println("Dia no valido");
				}else {
					valido=true;
				}
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}
		valido=false;
		while(valido==false){
			System.out.print("Ingrese la fecha de nacimiento(Mes): ");
			try {
				mes=Integer.parseInt(sc.next());
				if(mes<1) {
					System.out.println("Mes no valido");
				}else {
					valido=true;
				}
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}
		System.out.print("Ingrese la fecha de nacimiento(Anio): ");
		valido=false;
		while(valido==false) {
			try {
				anio=Integer.parseInt(sc.next());
				valido=true;
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}
		calendar.set(anio, mes-1, dia);
		System.out.print("Ingrese el pais del jugador: ");
		nacionalidad=sc.next();
		valido=false;
		while(valido==false){
			System.out.print("Ingrese la estatura del jugador(Metros): ");
			try {
				estatura=Float.parseFloat(sc.next());
				valido=true;
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}
		valido=false;
		while(valido==false){
			System.out.print("Ingrese el peso del jugador(Kilos): ");
			try {
				peso=Float.parseFloat(sc.next());
				valido=true;
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}
		valido=false;
		do {
		System.out.print("Ingrese la posicion del jugador valida: ");
		posicion=sc.next();
		switch(posicion) {
		case "Delantero":
			valido=true;
			break;
		case "Medio":
			valido=true;
			break;
		case "Defensa":
			valido=true;
			break;
		case "Arquero":
			valido=true;
			break;
		default:
			System.out.println("Posicion no valida");
		}
		}while(valido==false);
		Jugador jugador=new Jugador(nombre, apellido, calendar, nacionalidad, estatura, peso, posicion);
		jugadores.add(jugador);
		System.out.print("\nJugador creado\n");
	}
	
	public static void mostrarJugador(List<Jugador> jugadores, Scanner sc, boolean valido) {
		String nombre, apellido;
		Jugador jugadorBuscado=new Jugador();
		System.out.print("Ingresar el nombre del jugador: ");
		nombre=sc.next();
		System.out.print("Ingresar el apellido del jugador: ");
		apellido=sc.next();
		jugadorBuscado=buscarJugador(jugadores, nombre, apellido);
		if(jugadorBuscado.getNombre()!=null){
            System.out.println("\n** Datos del jugador **\n");
            System.out.println("Nombre: " + jugadorBuscado.getNombre() + " " + jugadorBuscado.getApellido());
           jugadorBuscado.mostrarFechaNacimiento();
            System.out.println("Nacionalidad: " + jugadorBuscado.getNacionalidad());
            System.out.println("Estatura: " + jugadorBuscado.getEstatura() + "m");
            System.out.println("Peso: " + jugadorBuscado.getPeso() + "kg");
            System.out.println("Posición: " + jugadorBuscado.getPosicion());
            System.out.print("Edad: " + jugadorBuscado.calcularEdad() + " años\n");
        }else{
            System.out.print("\nJugador no encontrado\n");
        }
	}
	
	public static void mostrarJugadoresPorApellido(List<Jugador> jugadores, boolean valido) {
		Jugador jugadorAuxiliar=new Jugador();
		do {
			valido=false;
		for(int i=0;i<=jugadores.size()-2;i++) {
    		if(jugadores.get(i).getApellido().compareToIgnoreCase(jugadores.get(i+1).getApellido())>0) {
    			valido=true;
    			jugadorAuxiliar=jugadores.get(i);
    			jugadores.set(i, jugadores.get(i+1));
    			jugadores.set(i+1, jugadorAuxiliar);
    		}
    	}
		}while(valido==true);
		//Collections.sort(jugadores, (jugador1, jugador2)->jugador1.getApellido().compareToIgnoreCase(jugador2.getApellido()));
		//Alternativo
		System.out.println("\n**Jugadores Ordenados**\n");
		for (Jugador jugador : jugadores) {
            System.out.print(jugador.getNombre()+" "+jugador.getApellido()+"\n");
        }
	}
	
	public static void modificarDatosDeUnJugador(List<Jugador> jugadores, Scanner sc, boolean valido) {
		String nombre, apellido, nacionalidad, posicion;
		float estatura=0, peso=0;
		Calendar calendar=Calendar.getInstance();
		int dia=0, mes=0, anio=0, indice=0;
		Jugador jugadorBuscado=new Jugador();
		System.out.print("Ingresar el nombre del jugador: ");
		nombre=sc.next();
		System.out.print("Ingresar el apellido del jugador: ");
		apellido=sc.next();
		jugadorBuscado=buscarJugador(jugadores,nombre,apellido);
		if(jugadorBuscado.getNombre()!=null) {
			String nombreOriginal=nombre, apellidoOriginal=apellido;
			System.out.print("Jugador Encontrado. Ingrese los datos modificados\n");
			System.out.print("Ingrese nombre del jugador: ");
			nombre=sc.next();
			System.out.print("Ingrese apellido del jugador: ");
			apellido=sc.next();
			valido=false;
			while(valido==false){
				System.out.print("Ingrese la fecha de nacimiento(Dia): ");
				try {
					dia=Integer.parseInt(sc.next());
					if(dia<1) {
						System.out.println("Dia no valido");
					}else {
						valido=true;
					}
				}catch (NumberFormatException e) {
					System.out.println("Ingrese un numero valido");
				}
			}
			valido=false;
			while(valido==false){
				System.out.print("Ingrese la fecha de nacimiento(Mes): ");
				try {
					mes=Integer.parseInt(sc.next());
					if(mes<1) {
						System.out.println("Mes no valido");
					}else {
						valido=true;
					}
				}catch (NumberFormatException e) {
					System.out.println("Ingrese un numero valido");
				}
			}
			System.out.print("Ingrese la fecha de nacimiento(Anio): ");
			valido=false;
			while(valido==false) {
				try {
					anio=Integer.parseInt(sc.next());
					valido=true;
				}catch (NumberFormatException e) {
					System.out.println("Ingrese un numero valido");
				}
			}
			calendar.set(anio, mes-1, dia);
			System.out.print("Ingrese el pais del jugador: ");
			nacionalidad=sc.next();
			valido=false;
			while(valido==false){
				System.out.print("Ingrese la estatura del jugador(Metros): ");
				try {
					estatura=Float.parseFloat(sc.next());
					valido=true;
				}catch (NumberFormatException e) {
					System.out.println("Ingrese un numero valido");
				}
			}
			valido=false;
			while(valido==false){
				System.out.print("Ingrese el peso del jugador(Kilos): ");
				try {
					peso=Float.parseFloat(sc.next());
					valido=true;
				}catch (NumberFormatException e) {
					System.out.println("Ingrese un numero valido");
				}
			}
			valido=false;
			do {
			System.out.print("Ingrese la posicion del jugador valida: ");
			posicion=sc.next();
			switch(posicion) {
			case "Delantero":
				valido=true;
				break;
			case "Medio":
				valido=true;
				break;
			case "Defensa":
				valido=true;
				break;
			case "Arquero":
				valido=true;
				break;
			default:
				System.out.println("Posicion no valida");
			}
			}while(valido==false);
			indice=0;
			try{
				for (Jugador jugador : jugadores) {
	            	if (jugador.getApellido().equals(apellidoOriginal) && jugador.getNombre().equals(nombreOriginal)) {
	            		jugadores.get(indice).setNombre(nombre);
	            		jugadores.get(indice).setApellido(apellido);
	            		jugadores.get(indice).setFechaNacimiento(calendar);
	            		jugadores.get(indice).setNacionalidad(nacionalidad);
	            		jugadores.get(indice).setEstatura(estatura);
	            		jugadores.get(indice).setPeso(peso);
	            		jugadores.get(indice).setPosicion(posicion);
	            	}
	            	indice++;
	            }
				System.out.print("\nJugador Modificado\n");
			}catch(Exception e){
				System.out.println("ERROR: "+e.getMessage());
			}
		}else {
			System.out.print("\nJugador no Encontrado\n");
		}
		
	}
	
	public static void eliminarJugador(List<Jugador> jugadores, Scanner sc) {
		String nombre, apellido;
		Jugador jugadorBuscado=new Jugador();
		System.out.print("Ingresar el nombre del jugador: ");
		nombre=sc.next();
		System.out.print("Ingresar el apellido del jugador: ");
		apellido=sc.next();
		jugadorBuscado=buscarJugador(jugadores, nombre, apellido);
		if(jugadorBuscado.getNombre()!=null) {
			Iterator<Jugador> jugador=jugadores.iterator();
			while(jugador.hasNext()) {
				if (jugador.next().equals(jugadorBuscado)) {
	           		jugador.remove();
	           	}
	        }
			System.out.print("\nJugador Eliminado\n");
		}else {
			System.out.print("\nJugador no encontrado\n");
		}
	}

	public static void mostrarCantidadDeJugadores(List<Jugador> jugadores) {
		System.out.print("\nLa cantidad total de Jugadores es: "+jugadores.size()+"\n");
	}
	
	public static void mostrarCantidadDeJugadoresDeUnaNacionalidad(List<Jugador> jugadores, Scanner sc) {
		int contador=0;
		String nacionalidad;
		Iterator<Jugador> jugador=jugadores.iterator();
		System.out.print("Ingrese la Nacionalidad: ");
		nacionalidad=sc.next();
		while(jugador.hasNext()) {
			if(jugador.next().getNacionalidad().equals(nacionalidad)) {
				contador++;
			}
		}
		System.out.print("\nHay "+contador+" Jugadores de la Nacionalidad "+nacionalidad+"\n");
	}
	
	public static Jugador buscarJugador(List<Jugador> jugadores, String nombre, String apellido) {
		Jugador jugadorBuscado=new Jugador();
		try{
			for (Jugador jugador : jugadores) {
            	if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
            		jugadorBuscado = jugador;
            	}                
            }
		}catch(Exception e){
			System.out.println("ERROR: "+e.getMessage());
		}
		return jugadorBuscado;
	}
}
