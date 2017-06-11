package Teoria.clase08;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;


public class Planeta {

int idPlaneta;
String denominacion;
float distancia;

//



public Planeta() {
}
public Planeta(String denominacion, float distancia) {
	this.denominacion = denominacion;
	this.distancia = distancia;
}
public int getIdPlaneta() {
	return idPlaneta;
}
public void setIdPlaneta(int idPlaneta) {
	this.idPlaneta = idPlaneta;
}
public String getDenominacion() {
	return denominacion;
}
public void setDenominacion(String denominacion) {
	this.denominacion = denominacion;
}
public float getDistancia() {
	return distancia;
}
public void setDistancia(float distancia) {
	this.distancia = distancia;
}

public String toString(){
	return denominacion + " -  " + distancia;
	
	
	
	
}


}
