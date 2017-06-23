package practica.tarea.Ejercicio05.data;

import java.sql.*;
import java.util.ArrayList;
import practica.tarea.Ejercicio05.Entities.*;


public class DataPersona {

	public ArrayList<Persona> getAll(){
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Persona> pers= new ArrayList<Persona>();
		try{
			stmt = FactoryConexion.getInstancia().getConn().createStatement();
			rs=stmt.executeQuery("Select * from persona");
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
		
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			FactoryConexion.getInstancia().releaseConn();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return pers;
		
	}
		

	
	
public Persona getByDni(Persona per){
	Persona p=null;
	
	PreparedStatement stmt=null;
	ResultSet rs=null;
	try {
		stmt= FactoryConexion.getInstancia().getConn().prepareStatement(		
				"select nombre, apellido, dni, habilitado from persona where dni=?");
		stmt.setString(1, per.getDni());
		rs = stmt.executeQuery();
		if(rs!=null && rs.next()){
			p=new Persona();
			p.setNombre(rs.getString("nombre"));
			p.setApellido(rs.getString("apellido"));
			p.setDni(rs.getString("dni"));
			p.setHabilitado(rs.getBoolean("habilitado"));
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	try {
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		FactoryConexion.getInstancia().releaseConn();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return p;
}
	


}
