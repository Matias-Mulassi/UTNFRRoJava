package practica.tarea;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] arg){
		
		int[] nros= new int[10];
		
Scanner s = new Scanner(System.in);
		
		for(int j=0;j<10;j++){
		System.out.println("Ingrese dato");
		String dato = s.nextLine();
		nros[j] = Integer.parseInt(dato);
		}
		
		for (int k=9;k>=0;k--){
			
			System.out.println(""+nros[k]);
			
			}
		s.close();


}


}