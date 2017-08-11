package practica.tarea.Ejercicio05.logic;
import  practica.tarea.Ejercicio05.data.*;
import practica.tarea.Ejercicio05.Entities.*;
import java.util.ArrayList;
//
public class ControladorABMCPersonas {
	private DataCategoria dataCat;
	private DataPersona dataPer;
	//private ArrayList<Persona> pers;
	
	public ControladorABMCPersonas(){
		dataCat = new DataCategoria();
		dataPer= new DataPersona();
		
	//pers = new ArrayList<Persona>();
	//pers.addAll(dataPer.getAll());
		//pers.add(new Persona("Matías", "Mulassi", "39787058", true));
	}
	
	public void crearPersona(Persona p){
		//dataPer.insertRow(p);
		//pers.add(p);
		dataPer.add(p);
	}
	
	public boolean existePersona(Persona p){
		return dataPer.getAll().contains(p);
	
	}
	
	public Persona devuelvePersona(Persona p){
			
		return dataPer.getByDni(p);
		
		
		
		
		//		for (Persona persona : pers) {
//			if (persona.equals(p)){
//				return persona;			
//			}
//		}
//		return null;
	}
	
	public void actualizarPersona(Persona p){
//		if (existePersona(p)){
//			borrarPersona(p);
//		}
		dataPer.update(p);
	}

	public void borrarPersona(Persona p){
		dataPer.delete(p);
		
		
		//		int index = pers.indexOf(p);
//		pers.remove(index);	
	}
	
public Persona getByDni(Persona p) {
	return dataPer.getByDni(p);
	
}
	
	
		public ArrayList<Persona> getAll(){
	return dataPer.getAll();
	
}
	
		public ArrayList<Categoría> getCategorias() throws Exception{
			return dataCat.getAll();
		}
	
}
