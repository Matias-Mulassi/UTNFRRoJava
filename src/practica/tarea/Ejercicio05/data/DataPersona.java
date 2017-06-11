package practica.tarea.Ejercicio05.data;
import java.sql.*;
import java.util.ArrayList;
import practica.tarea.Ejercicio05.Entities.*;


public class DataPersona {

	public ArrayList<Persona> getAll(){
		
		ArrayList<Persona> pers= new ArrayList<Persona>();
		try{
			Statement stmt = FactoryConexion.getInstancia().getConn().createStatement();
			ResultSet rs=stmt.executeQuery("Select * from Persona");
			if(rs!=null && rs.next()){
				while(rs.next()){
					Persona p=new Persona();
					p.setNombre(rs.getString("Nombre"));
					p.setApellido(rs.getString("Apellido"));
					p.setDni(rs.getString("dni"));
					p.setHabilitado(rs.getBoolean("Habilitado"));
					pers.add(p);
				}			
			}
		} catch(SQLException e) {
			e.printStackTrace();			
		}
		return pers;
	}
	
	
}
