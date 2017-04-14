package Teoria.clase03;


public class Alien {

public Alien(String nombre, Especie queEspecie, Planeta origen) {
		this.idAlien = ++proxId;
		this.nombre = nombre;
		this.queEspecie = queEspecie;
		this.origen = origen;
	}

static int proxId = 0;
private int idAlien;
private String nombre;
private Especie queEspecie;
private Planeta origen;


public Alien(String nombre) {
//	this.nombre = nombre;
//	this.origen = new Planeta();
//	this.origen.setDenominacion("La tierra");
//	this.queEspecie = new Especie();
//	this.queEspecie.setNombreEspecie("Hombre");
	
	this(nombre,new Especie(),new Planeta());
	
	
}
public int getIdAlien() {
	return idAlien;
}
public void setIdAlien(int idAlien) {
	this.idAlien = idAlien;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Especie getQueEspecie() {
	return queEspecie;
}
public void setQueEspecie(Especie queEspecie) {
	this.queEspecie = queEspecie;
}
public Planeta getOrigen() {
	return origen;
}
public void setOrigen(Planeta origen) {
	this.origen = origen;
}


public void escupirBaba(int minutos){
	
	
}

public String toString(){
	return getIdAlien() + "\n" + 
			getNombre() + "\n" +
			getOrigen().getDenominacion()+"\n" +
			getQueEspecie().getNombreEspecie()+ "\n";
}

}
