package Teoria.clase06;

import Teoria.clase06.Sorts.*;


public class Prueba {

public static void main(String[] args) { 



	Alien losInvasores[]=new Alien[4];
	Alien et;
	
	et= new Alien("Miguelete");
	Alien et2;
	et2 = new Alien("Lorencete");

	Planeta astro;

	astro= new Planeta();

	astro.setDenominacion("SABU");

	et.setOrigen(astro);
	
	Planeta astro2;

	astro2= new Planeta();

	astro2.setDenominacion("MAJU");

	et2.setOrigen(astro2);



	//et.setNombre("Luzbelito");




	//armo el Planeta//

	

	//Comentario//

	//armo la especie//
	Especie bichoTipo;


	bichoTipo= new Especie();
	bichoTipo.setNombreEspecie("marciano");
	et.setQueEspecie(bichoTipo);	



	
	losInvasores[0]= et;
	
	//Armo el alien//
	
	et2.setQueEspecie(bichoTipo);
	losInvasores[1]=et2;
		
	
	
	
	// Armo el planeta//
	

	
	Alien et3= new Alien("San Martin");
	et3.setOrigen(astro2);
	losInvasores[2]=et3;
	
	Alien et4 = new Alien ("Albert Einstein");
	et4.setOrigen(astro2);
	losInvasores[3]=et4;
	
	

	for(int i=0; i<losInvasores.length; i++)
	{System.out.println(losInvasores[i]);
		
	
	

	}
	Sort.sortObject(losInvasores);
	
	for(int i=0; i<losInvasores.length; i++)
	{System.out.println(losInvasores[i]);
		
	
	

	} 

}
		
}
	



