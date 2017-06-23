package practica.tarea.Ejercicio05.Entities;

public class Persona {
	
	//
	private String nombre;
	private String apellido;
	private boolean habilitado;
	private String dni;
	private int id;
	//
	
	public boolean equals(Object obj){
	    if(obj instanceof Persona){
	    	return (((Persona)obj).getDni().equals(this.getDni())); //JAVA busco unicamente por direccion de memoria, por eso la redefinicion//
	    }
	    return false;
	}
	
		

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}




	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Persona(){}
	
	
	public Persona(String nombre, String apellido,String dni, boolean habilitado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.habilitado = habilitado;
		this.dni=dni;
	}
	
	
	/* public boolean equals (Object p) {
	 * 	return (p instanceof Persona) && (((Persona)p).getDni().equals(this.getDni()));
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
}
