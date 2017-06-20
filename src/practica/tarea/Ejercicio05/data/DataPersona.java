package practica.tarea.Ejercicio05.data;

import java.sql.*;
import java.util.ArrayList;
import practica.tarea.Ejercicio05.Entities.*;


public class DataPersona {

	private void mostrarDatosPersona(Persona persona){
		System.out.println("DNI:" + persona.getDni() + "\n");
		System.out.println("Apellido:" + persona.getApellido() + "\n");
		System.out.println("Nombre:" + persona.getNombre() + "\n");
	}
	
	public void getAll(){
		
		ArrayList<Persona> pers= new ArrayList<Persona>();
		try{
			Statement stmt = FactoryConexion.getInstancia().getConn().createStatement();
			ResultSet rs=stmt.executeQuery("Select * from persona");
			if(rs!=null){
				while(rs.next()){
					Persona p=new Persona();
					p.setNombre(rs.getString("nombre_persona"));
					p.setApellido(rs.getString("apellido_persona"));
					p.setDni(rs.getString("dni"));
					p.setHabilitado(rs.getBoolean("habilitado_persona"));
					pers.add(p);
				}			
			}
		} catch(SQLException e) {
			e.printStackTrace();			
		}
		for(Persona p:pers) {
			mostrarDatosPersona(p);
			
			
		}
	}
	
	
}
