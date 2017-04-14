
public class Sss {

		private int laEdad;
		private String elNombre;
	
	public Sss(String nombre) {
		this(18,nombre);
		
	}
	public Sss(){
		this(20,"Fulano");
		
	}
	public Sss(int edad) {
		this(edad,"nn");
		
	}
	public Sss(int edad , String nombre) {
		laEdad= edad;
		elNombre = nombre;
	}
}
