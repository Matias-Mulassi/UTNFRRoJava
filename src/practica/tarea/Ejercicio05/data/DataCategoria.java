package practica.tarea.Ejercicio05.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import practica.tarea.Ejercicio05.Entities.Categor�a;

public class DataCategoria {
public ArrayList<Categor�a> getAll() throws Exception{
		
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Categor�a> cats= new ArrayList<Categor�a>();
		try{
			stmt = FactoryConexion.getInstancia()
					.getConn().createStatement();
			rs = stmt.executeQuery("select * from categoria");
			if(rs!=null){
				while(rs.next()){
					Categor�a c=new Categor�a();
					c.setId(rs.getInt("idCategoria"));
					c.setDescripcion(rs.getString("descripcion"));
					cats.add(c);
				}
			}
		} catch (Exception e){
			throw e;
		}
		
			finally {
					try {
						if(rs!=null) rs.close();
						if(stmt!=null) stmt.close();
						FactoryConexion.getInstancia().releaseConn();
					} 	catch (SQLException e) {
			e.printStackTrace();
				}
		}	
		return cats;
	}
}
