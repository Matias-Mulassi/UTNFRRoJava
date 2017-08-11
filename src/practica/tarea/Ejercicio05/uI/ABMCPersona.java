package practica.tarea.Ejercicio05.uI;

import practica.tarea.Ejercicio05.Entities.Persona;
import practica.tarea.Ejercicio05.logic.*;

import java.util.Scanner;
//

public class ABMCPersona {
	
	private ControladorABMCPersonas controller = new ControladorABMCPersonas();
	private Scanner s;

	public void start() {
		s = new Scanner(System.in);
		
		String option = "-1";
			
		while (!option.equals("0")){
			System.out.println("Bienvenido al ABMC de Personas");
			System.out.println("¿Qué desea hacer?");
			System.out.println("1. Dar de alta una nueva persona");
			System.out.println("2. Ver los datos de una persona");
			System.out.println("3. Modificar los datos de una persona");
			System.out.println("4. Eliminar los datos de una persona");
			System.out.println("0. Salir");
			option = s.nextLine();
			clearScreen();
			handler(option);
		}
		s.close();
	}
	
	private void handler(String option){
		switch (option) {
		case "1":
			altaPersona();
			break;
		case "2":
			verPersona();
			break;
		case "3":
			modificarPersona();
			break;
		case "4":
			bajaPersona();
			break;
		default:
			break;
		}
	}
	
	private void altaPersona(){
		System.out.println("Dar de alta una persona");
		Persona newPersona = new Persona();
		
		System.out.println("Ingrese DNI:");
		newPersona.setDni(s.nextLine());
		System.out.println("Ingrese Nombre");
		newPersona.setNombre(s.nextLine());
		System.out.println("Ingrese Apellido");
		newPersona.setApellido(s.nextLine());
		System.out.println("¿Está habilitado? (S/N)");
		String h=s.nextLine();
		if(h.equalsIgnoreCase("S")){
			newPersona.setHabilitado(true);
		}else if (h.equalsIgnoreCase("N")) {
			newPersona.setHabilitado(false);
		}
		
		try {
			 			controller.crearPersona(newPersona);
			 		} catch (Exception e) {
			 			e.printStackTrace();
			 		}
		
			
			
			
			System.out.println("Alta exitosa  - Presione Enter para continuar");
			s.nextLine();
			clearScreen();
		}
	
	
	private void verPersona(){
		System.out.println("Ver la informacion de una persona");
		
		Persona newPersona= new Persona();
		System.out.println("Ingrese DNI:");
		newPersona.setDni(s.nextLine());
		
		try {
			mostrarDatosPersona(controller.getByDni(newPersona));
			System.out.println("Presione Enter para continuar");
			s.nextLine();
			clearScreen();
		} catch (Exception e) {
			e.printStackTrace(); //Agregar mensaje de que hubo un error al buscar a la persona
		}
	
	
	}
		
	
	private void mostrarDatosPersona(Persona persona){
		System.out.println("DNI:" + persona.getDni() + "\n");
		System.out.println("Apellido:" + persona.getApellido() + "\n");
		System.out.println("Nombre:" + persona.getNombre() + "\n");
		mostrarHabilitado(persona);
	}
	
	private void modificarPersona(){
		System.out.println("Modificar datos de una persona");
		Persona newPersona = new Persona();
		
		System.out.println("Ingrese DNI:");
		newPersona.setDni(s.nextLine());
		try {
			this.mostrarDatosPersona(controller.getByDni(newPersona));
		} catch (Exception e) {
			e.printStackTrace();
		}
			System.out.println("\n");
			System.out.println("¿Que dato desea modificar?");
			System.out.println("1. Nombre");
			System.out.println("2. Apellido");
			System.out.println("3. Habilitación");
			
			switch (s.nextLine()) {
			case "1":
				System.out.println("Ingrese nuevo nombre");
				newPersona.setNombre(s.nextLine());
				break;
			case "2":
				System.out.println("Ingrese nuevo apellido");
				newPersona.setApellido(s.nextLine());
			
			case "3": {
				System.out.println("¿Está habilitado? (S/N)");
				String h=s.nextLine();
				if(h.equalsIgnoreCase("S")){
					newPersona.setHabilitado(true);
				}else if (h.equalsIgnoreCase("N")) {
					newPersona.setHabilitado(false);
				}
			}
			default:
				break;
			}
			
			//controller.actualizarPersona(newPersona);
			try {
				controller.actualizarPersona(newPersona);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			System.out.println("Modificacion exitosa - Presione Enter para continuar");
			s.nextLine();
			clearScreen();
		}
	

	private void bajaPersona(){
		System.out.println("Dar de baja una persona");
		Persona newPersona = new Persona();
	
		System.out.println("Ingrese DNI:");
		newPersona.setDni(s.nextLine());
			System.out.println("¿Esta seguro que quiere dar de baja la persona con los siguientes datos? [1=Si, 0=No]");
			try {
				mostrarDatosPersona(controller.getByDni(newPersona));
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if (s.nextLine().equals("1")){
				try {
					 			controller.borrarPersona(newPersona);
					 		} catch (Exception e) {
					 			e.printStackTrace();
					 		}
				
				System.out.println("Baja exitosa - Presione Enter para continuar");
			}
			else{
				System.out.println("Baja cancelada, se ha arrepentido a tiempo - Presione Enter para continuar");
			}
			s.nextLine();
			clearScreen();
		}
	
	
	
	private void clearScreen(){
		for (int i = 0; i < 50; ++i) System.out.println();
	}
	public void mostrarHabilitado(Persona p){
		String h="";
		if(p.isHabilitado()){
			h="Habilitado";
		}else{
			h="Deshabilitado";
		}
		System.out.println(p.getDni()+" - "+p.getApellido()+", "+
						 p.getNombre()+": "+h);
	}
}

