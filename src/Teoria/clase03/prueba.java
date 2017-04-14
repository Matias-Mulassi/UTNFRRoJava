

package Teoria.clase03;
import Teoria.clase04.*;
public class prueba {

public static void main(String[] args){
	
/* crear un nuevo alien */	
Alien et;
et = new Alien("Miguelete");

et.setNombre("Luzbelito");

Teoria.clase04.Data.guardar();

//armo el Planeta//

Planeta astro;

astro= new Planeta();

astro.setDenominacion("SABU");

et.setOrigen(astro);



//armo la especie//

Especie bichoTipo;

bichoTipo= new Especie();
bichoTipo.setNombreEspecie("marciano");
et.setQueEspecie(bichoTipo);	
	
	
System.out.println(et.getNombre());

System.out.println(et.getOrigen().getDenominacion());

System.out.println(et.getQueEspecie().getNombreEspecie());
}



}
