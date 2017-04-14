

package Teoria.clase03;
public class prueba {

public static void main(String[] args){
	
/* crear un nuevo alien */	
Alien et;
et = new Alien("Miguelete");

et.setNombre("Luzbelito");




//et.setNombre("Luzbelito");




//armo el Planeta//

Planeta astro;

astro= new Planeta();

astro.setDenominacion("SABU");

et.setOrigen(astro);


//Comentario//

//armo la especie//
Especie bichoTipo;


bichoTipo= new Especie();
bichoTipo.setNombreEspecie("marciano");
et.setQueEspecie(bichoTipo);	
	
et.getQueEspecie().setNombreEspecie("Planta");
//Armo el alien//
Alien et2;
et2 = new Alien("Lorencete");

// Armo el planeta//
Planeta astro2;

astro2= new Planeta();

astro2.setDenominacion("MAJU");

et2.setOrigen(astro2);



System.out.println(et);
System.out.println(et2);
	

//System.out.println(et.getIdAlien());
	//System.out.println(et.getNombre());

//System.out.println(et.getOrigen().getDenominacion());

//System.out.println(et.getQueEspecie().getNombreEspecie());


//System.out.println(et2.getIdAlien());
//System.out.println(et2.getNombre());
//
//System.out.println(et2.getOrigen().getDenominacion());
//
//System.out.println(et2.getQueEspecie().getNombreEspecie());
}





}
