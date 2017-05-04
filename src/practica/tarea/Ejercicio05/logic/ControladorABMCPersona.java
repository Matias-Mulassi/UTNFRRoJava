package practica.tarea.Ejercicio05.logic;

import java.util.Scanner;

import practica.tarea.Ejercicio05.Entities.*;
import java.util.ArrayList;

public class ControladorABMCPersona {
	private static ArrayList<Persona> pers;
	private static Scanner s;
	
	
	public static void main(String[] args) {
		String nom,ape;
		boolean hab;
		long dni;
		
		
		int i=1;
		
	s= new Scanner(System.in);
	pers= new ArrayList<Persona>();
		
		
	while (i!=0) {
		
		System.out.println("Bienvenido a ABMCPersonas "+ "\n");
		System.out.println("1- Alta Persona");
		System.out.println("2- Baja Persona");
		System.out.println("3- Modificar Persona");
		System.out.println("0- Salir");
		
		i=Integer.parseInt(s.nextLine());
		
		switch (i) {
		
		case 1: { System.out.println("Ingrese nombre de la persona : ");
		
		nom= s.nextLine();
		
		System.out.println("Ingrese apellido de la persona : ");
		
		ape= s.nextLine();
		
		System.out.println("Ingrese dni de la persona : ");
		dni= Long.parseLong(s.nextLine());
		
		System.out.println("Ingrese estado habilitacion de la persona : 1- Habilitada 2- No habilitada ");
		i= Integer.parseInt(s.nextLine());
		
		if (i==1) {hab=true;}
		else {hab = false;}
	
	altaPersona	(nom,ape,dni,hab); break; }
		
		
		case 2: {
		long dniBorrado;
		
		System.out.println("Inserte el numero de dni de la persona a borrar");
		
		dniBorrado= Long.parseLong(s.nextLine());
		
		bajaPersona(dniBorrado); 	break;}
	
		
		case 3: {			
		
		long dniModificar;
		
		System.out.println("Inserte el numero de dni de la persona a modificar");
		
		dniModificar=Long.parseLong(s.nextLine());
		
		modificarPersona(dniModificar);
		
		break;
						}
		
		}
		
	}


}
	public static void altaPersona(String nom, String ape , long dni , boolean hab) {
		
		Persona per= new Persona(nom,ape,dni,hab);
		pers.add(per);
		System.out.println("Se agregó a una nueva persona");
		
	}

	

	public static void bajaPersona(long dniB) {
		
	for(Persona p : pers) {
		if (p.getDni()==dni) {
			
			pers.remove(p);
			System.out.println("Se removio a una persona");
			break;
			
							}
		else {System.out.println("No existe una persona con ese DNI");}		
									}
		
												}

																
	public static void modificarPersona(long dniM) {
		int i;
		boolean hab;
		for(Persona p : pers) {
			
			if (p.getDni()==dniM) {
				
				System.out.println("Ingrese nuevo nombre de persona: ");
				p.setNombre(s.nextLine());
				
				System.out.println("Ingrese nuevo apellido de persona: ");
				
				p.setApellido(s.nextLine());
				
				System.out.println("Ingrese nuevo dni de persona: ");
				p.setDni(Long.parseLong(s.nextLine()));
				
				System.out.println("Ingrese el nuevo estado de habilitacion de la persona : 1- Habilitada 2- No habilitada ");
				i= Integer.parseInt(s.nextLine());
				
				if (i==1) {hab=true;}
				else {hab = false;}
				p.setHabilitado(hab);
				
				System.out.println("Se modificó una persona");
					break;
			} 
			
			else {System.out.println("No existe una persona Con ese DNI");}
			
			
			
		}
	
	}
	
	}


