package practica.tarea;
import java.util.Scanner;
public class Ejercicio2 {

	

		public static void main(String[] arg){
			
			int nro=0,c=0;
			int[] nros= new int[20];
			int[] nrosor= new int[20];
			
	Scanner s = new Scanner(System.in);
			
			System.out.println("Ingrese 1er numero");
			String dato = s.nextLine();
			nro= Integer.parseInt(dato);
			System.out.println("");
			
			
			for (int k=0;k<20;k++){
				
				System.out.println("Ingrese numero "+k);
				String num = s.nextLine();
				nros[k]= Integer.parseInt(num);
				System.out.println("");	
			}
			s.close();
			
			for (int l=0;l<20;l++){
				if (nros[l]>nro) 
					{ nrosor[c]=nros[l];
						c++;
									};
			
							}


				
			for (int g=0;g<=c;g++){
				
						System.out.println(""+nrosor[g]);
				
				
			}						}	


	
	
													}