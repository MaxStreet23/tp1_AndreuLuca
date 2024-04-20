package ar.edu.unju.fi.ejercicio18.main;
import ar.edu.unju.fi.ejercicio18.model.Pais;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//import java.util.Collections;
public class Main {
	public static void main(String[] args) {
		List<Pais> paises=new ArrayList<Pais>();
		List<DestinoTuristico> destinosTuristicos=new ArrayList<DestinoTuristico>();
		precargarPaises(paises);
		Scanner sc=new Scanner(System.in);
		int option=0;
		boolean valido=false;
		while(option!=9){
			do {
				valido=false;
				System.out.println("\n*** MENU ***");
				System.out.println("1) Dar de alta un destino turistico");
				System.out.println("2) Mostrar todos los destinos turisticos");
				System.out.println("3) Modicar el pais de un destino turistico");
				System.out.println("4) Limpiar la lista de destinos turisticos");
				System.out.println("5) Eliminar un destino turistico");
				System.out.println("6) Mostrar los destinos turisticos ordenados por nombre");
				System.out.println("7) Mostrar todos los paises");
				System.out.println("8) Mostrar los destinos turisticos de un pais");
				System.out.println("9) Salir");
				try {
					System.out.print("Opcion: ");
					option=Integer.parseInt(sc.next());
					if(option<1||option>9) {
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
				agregarDestinoTuristico(destinosTuristicos, paises, sc, valido);
				break;
			case 2:
				mostrarDestinosTuristicos(destinosTuristicos);
				break;
			case 3:
				modificarPaisDeDestinoTuristico(destinosTuristicos,sc,valido,paises);
				break;
			case 4:
				limpiarListaDeDestinosTuristicos(destinosTuristicos);
				break;
			case 5:
				eliminarDestinoTuristico(destinosTuristicos, sc, valido);
				break;
			case 6:
				mostrarDestinosTuristicosOrdenados(destinosTuristicos, valido);
				break;
			case 7:
				mostrarPaises(paises);
				break;
			case 8:
				mostrarDestinosDeUnPais(destinosTuristicos, paises, valido, sc);
				break;
			}
		}
		sc.close();
	}
	public static void precargarPaises(List<Pais> paises) {
		Pais pais=new Pais();
		pais.setCodigo(1);
		pais.setNombre("Argentina");
		paises.add(pais);
		Pais pais2=new Pais();
		pais2.setCodigo(2);
		pais2.setNombre("Chile");
		paises.add(pais2);
		Pais pais3=new Pais();
		pais3.setCodigo(3);
		pais3.setNombre("Paraguay");
		paises.add(pais3);
		Pais pais4=new Pais();
		pais4.setCodigo(4);
		pais4.setNombre("Uruguay");
		paises.add(pais4);
		Pais pais5=new Pais();
		pais5.setCodigo(5);
		pais5.setNombre("Brasil");
		paises.add(pais5);
		Pais pais6=new Pais();
		pais6.setCodigo(6);
		pais6.setNombre("Bolivia");
		paises.add(pais6);
	}
	
	public static void agregarDestinoTuristico(List<DestinoTuristico> destinosTuristicos, List<Pais> paises, Scanner sc, boolean valido) {
		DestinoTuristico destinoTuristico=new DestinoTuristico();
		String codigo, nombre;
		float precio=0;
		int codigoPais=0, cantidadDias=0;
		System.out.print("Ingrese el codigo del Destino Turistico: ");
		codigo=sc.next();
		System.out.print("Ingrese el nombre del Destino Turistico: ");
		nombre=sc.next();
		valido=false;
		while(valido==false){
			System.out.print("Ingrese el precio del Destino Turistico: ");
			try {
				precio=Float.parseFloat(sc.next());
				if(precio<0) {
					System.out.println("Precio no valido");
				}else {
					valido=true;
				}
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}
		valido=false;
		while(valido==false){
			System.out.print("Ingrese el codigo del pais del Destino Turistico: ");
			try {
				codigoPais=Integer.parseInt(sc.next());
				if(codigoPais<1||codigoPais>6) {
					System.out.println("Pais no valido");
				}else {
					valido=true;
				}
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}
		valido=false;
		while(valido==false){
			System.out.print("Ingrese la cantidad de dias del Destino Turistico: ");
			try {
				cantidadDias=Integer.parseInt(sc.next());
				if(cantidadDias<1) {
					System.out.println("Cantidad no valida");
				}else {
					valido=true;
				}
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}
		destinoTuristico.setCodigo(codigo);
		destinoTuristico.setNombre(nombre);
		destinoTuristico.setPrecio(precio);
		destinoTuristico.setPais(paises.get(codigoPais-1));
		destinoTuristico.setCantidadDias(cantidadDias);
		destinosTuristicos.add(destinoTuristico);
		System.out.println("\nDestino Turistico Creado");
	}
	
	public static void mostrarDestinosTuristicos(List<DestinoTuristico> destinosTuristicos) {
		System.out.println("\n**Destinos Turisticos**\n");
		for (DestinoTuristico destinoTuristico : destinosTuristicos) {
            System.out.println("Codigo: "+destinoTuristico.getCodigo());
            System.out.println("Nombre: "+destinoTuristico.getNombre());
            System.out.println("Precio: "+destinoTuristico.getPrecio());
            System.out.println("Pais: "+destinoTuristico.getPais().getNombre());
            System.out.println("Cantidad de dias: "+destinoTuristico.getCantidadDias()+"\n");
        }
	}
	
	public static void modificarPaisDeDestinoTuristico(List<DestinoTuristico> destinosTuristicos, Scanner sc, boolean valido, List<Pais> paises) {
		String codigoDestino;
		int codigoPais;
		System.out.print("Ingrese el codigo del destino turistico: ");
		codigoDestino=sc.next();
		valido=false;
		try{
			for (DestinoTuristico destinoTuristico : destinosTuristicos) {
            	if (destinoTuristico.getCodigo().equals(codigoDestino)) {
            		System.out.print("Destino Encontrado. ");
            		while(valido==false){
            			System.out.print("Ingrese el codigo del pais del Destino Turistico: ");
            			try {
            				codigoPais=Integer.parseInt(sc.next());
            				if(codigoPais<1||codigoPais>6) {
            					System.out.println("Pais no valido");
            				}else {
            					valido=true;
            					destinoTuristico.setPais(paises.get(codigoPais-1));
            				}
            			}catch (NumberFormatException e) {
            				System.out.println("Ingrese un numero valido");
            			}
            		}
            	}                
            }
			if(valido==false) {
				System.out.println("\nDestino no Encontrado");
			}else {
				System.out.println("\nPais de Destino Modificado");
			}
		}catch(Exception e){
			System.out.println("ERROR: "+e.getMessage());
		}
	}
	
	public static void limpiarListaDeDestinosTuristicos(List<DestinoTuristico> destinosTuristicos) {
		destinosTuristicos.clear();
		System.out.println("\nLista Limpiada");
	}
	
	public static void eliminarDestinoTuristico(List<DestinoTuristico> destinosTuristicos, Scanner sc, boolean valido) {
		String codigo;
		valido=false;
		System.out.print("Ingresar el codigo del Destino a borrar: ");
		codigo=sc.next();
		Iterator<DestinoTuristico> destino=destinosTuristicos.iterator();
		while(destino.hasNext()) {
			if (destino.next().getCodigo().equals(codigo)) {
	           	destino.remove();
	           	valido=true;
	        }
	    }
		if(valido==true) {
			System.out.println("\nDestino Turistico Eliminado");
		}else {
			System.out.println("\nDestino Turistico no encontrado");
		}
	}
	
	public static void mostrarDestinosTuristicosOrdenados(List<DestinoTuristico> destinosTuristicos, boolean valido) {
		DestinoTuristico destinoAuxiliar=new DestinoTuristico();
		do {
			valido=false;
		for(int i=0;i<=destinosTuristicos.size()-2;i++) {
    		if(destinosTuristicos.get(i).getNombre().compareToIgnoreCase(destinosTuristicos.get(i+1).getNombre())>0) {
    			valido=true;
    			destinoAuxiliar=destinosTuristicos.get(i);
    			destinosTuristicos.set(i, destinosTuristicos.get(i+1));
    			destinosTuristicos.set(i+1, destinoAuxiliar);
    		}
    	}
		}while(valido==true);
		//Collections.sort(destinosTuristicos, (destino1, destino2)->destino1.getNombre().compareToIgnoreCase(destino2.getNombre()));
		//Alternativo
		System.out.println("\n**Destinos Turisticos Ordenados**\n");
		for (DestinoTuristico destino : destinosTuristicos) {
			System.out.println("Codigo: "+destino.getCodigo());
            System.out.println("Nombre: "+destino.getNombre());
            System.out.println("Precio: "+destino.getPrecio());
            System.out.println("Pais: "+destino.getPais().getNombre());
            System.out.println("Cantidad de dias: "+destino.getCantidadDias()+"\n");
        }
	}
	
	public static void mostrarPaises(List<Pais> paises) {
		System.out.println("\n**Paises**\n");
		for (Pais pais : paises) {
			System.out.print(pais.getCodigo()+") "+pais.getNombre()+"\n");
        }
	}
	
	public static void mostrarDestinosDeUnPais(List<DestinoTuristico> destinosTuristicos, List<Pais>paises, boolean valido, Scanner sc) {
		int codigoPais=0;
		valido=false;
		while(valido==false){
			System.out.print("Ingrese el codigo del pais: ");
			try {
				codigoPais=Integer.parseInt(sc.next());
				if(codigoPais<1||codigoPais>6) {
					System.out.println("Pais no valido");
				}else {
					valido=true;
				}
			}catch (NumberFormatException e) {
				System.out.println("Ingrese un numero valido");
			}
		}
		System.out.println("\n**Destinos Turisticos del Pais "+paises.get(codigoPais-1).getNombre()+"**\n");
		for (DestinoTuristico destino : destinosTuristicos) {
            if(destino.getPais().getCodigo()==codigoPais) {
            	System.out.println("Codigo: "+destino.getCodigo());
                System.out.println("Nombre: "+destino.getNombre());
                System.out.println("Precio: "+destino.getPrecio());
                System.out.println("Cantidad de dias: "+destino.getCantidadDias()+"\n");
            }
        }
	}
}
