package practica.tarea.Ejercicio05.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import practica.tarea.Ejercicio05.Entities.Categoría;

public class DataCategoria {
public ArrayList<Categoría> getAll() throws Exception{
		
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Categoría> cats= new ArrayList<Categoría>();
		try{
			stmt = FactoryConexion.getInstancia()
					.getConn().createStatement();
			rs = stmt.executeQuery("select * from categoria");
			if(rs!=null){
				while(rs.next()){
					Categoría c=new Categoría();
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
