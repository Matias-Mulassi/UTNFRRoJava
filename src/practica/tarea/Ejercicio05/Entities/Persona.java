package practica.tarea.Ejercicio05.Entities;

public class Persona {
	
	private String nombre;
	private String apellido;
	private boolean habilitado;
	private long dni;
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
	
	
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public Persona(String nombre, String apellido,long dni, boolean habilitado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.habilitado = habilitado;
		this.dni=dni;
	}
	
	
	
	
	
	
}
