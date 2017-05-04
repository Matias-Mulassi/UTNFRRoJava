package practica.tarea.Ejercicio05.controlers;

import practica.tarea.Ejercicio05.Entities.*;
import java.util.ArrayList;

public class ControladorABMCPersonas {
	private ArrayList<Persona> pers;
	
	
	public ControladorABMCPersonas(){
		pers = new ArrayList<>();
		pers.add(new Persona("Matías", "Mulassi", "39787058", true));
	}
	
	public void crearPersona(Persona p){
		pers.add(p);
	}
	
	public boolean existePersona(Persona p){
		return pers.contains(p);
	}
	
	public Persona devuelvePersona(Persona p){
		for (Persona persona : pers) {
			if (pers.equals(p)){
				return persona;			
			}
		}
		return null;
	}
	
	public void updatePersona(Persona p){
		if (existePersona(p)){
			borrarPersona(p);
		}
		crearPersona(p);
	}

	public void borrarPersona(Persona p){
		int index = pers.indexOf(p);
		pers.remove(index);	
	}
	
	
	
	
	
}
