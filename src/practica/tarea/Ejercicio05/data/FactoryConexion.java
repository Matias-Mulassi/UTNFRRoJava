package practica.tarea.Ejercicio05.data;
import java.sql.*;




public class FactoryConexion {

	private static FactoryConexion instancia;
	
	private Connection conn;
	
	private FactoryConexion(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
	}
	
	public static FactoryConexion getInstancia(){
		
		if (FactoryConexion.instancia==null){
			FactoryConexion.instancia=new FactoryConexion();
			
			}
		
		return FactoryConexion.instancia;
		
	}
	
	public Connection getConn(){
		try {
			conn=  DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10181254?user=sql10181254&password=eZkGdZyJe8");
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return conn;		
	}
	
	
	
}
