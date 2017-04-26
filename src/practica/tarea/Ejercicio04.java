package practica.tarea;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio04 {

private static Scanner s;
	public static void main (String[] args) {
		
		
		s= new Scanner(System.in);
		int n,i;
		ArrayList<Integer> num= new ArrayList<Integer>();
		
		
		System.out.println("Ingrese el primer entero : ");
		n= s.nextInt();
		
		for (int k=0;k<=3;k++) {
			
			System.out.println("Ingrese "+k+ " numero a comparar");
			
			i= s.nextInt();
			
			if (i>n) {num.add(i);}
			
		}
		
	
		System.out.println(" \n ");
		
		System.out.println("Los numeros mayores a "+n+" son : ");
		
		for(Integer element : num) {
			
			System.out.println(element);
			System.out.println("\n");
			
	
			
		}
	

	
	}
		
	
		
		
		
	
	
	
	

	
	
	
	
}
