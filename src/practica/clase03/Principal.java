package practica.clase03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		
		Padre p= new Padre();
		
	System.out.println("Ingrese el nombre del Padre: ");
		String nomPadre= s.nextLine();
	
		p.setNombre(nomPadre);
		p.setNombreClase("Clase Padre");
		
		
		Hijo h=  new Hijo();
		System.out.println("Ingrese el nombre del Hijo: ");
		
		String nomHijo= s.nextLine();
		
		h.setNombre(nomHijo);
		h.setNombreClase("Clase Hija");
		
		System.out.println("El nombre del hijo es: "+h.getNombre()+" ");
		System.out.println("El nombre del padre es: "+p.getNombre()+" ");
		
		s.close();
		
	}

}
