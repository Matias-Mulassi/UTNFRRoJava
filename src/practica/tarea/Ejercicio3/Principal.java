package practica.tarea.Ejercicio3;

import java.util.Scanner;
import java.util.ArrayList;
public class Principal {
	private static Scanner scan;
	
	
	public static void main(String[] args) {
		String op;
		int x=1,i=0;
		scan= new Scanner(System.in);
		
	
		ArrayList<Empleado> emps= new ArrayList<Empleado>(); 
		
		
		
		while (x!=0) {
			
			System.out.println("A / V para agregar empleado administrativo o vendedor:");
			scan.nextLine();
			op= scan.nextLine();
			

			switch (op) {
			
			case "A" : {Administrativo adm= new Administrativo();
			cargaDatosAdministrativo(adm);
			emps.add(adm); i++; break;}
			
			case "V": {	Vendedor ven= new Vendedor();
				cargaDatosVendedor(ven);
				emps.add(i,ven); i++; break;}
			
			default : {System.out.println("Ingresó una opcion incorrecta");
			break;}
			}
			
			if (i!=20) {
			System.out.println("Desea agregar un nuevo empleado? 1- S/ 0- N ");
			
			x= scan.nextInt();
			}
		
			else {x=0;}
		}
		
		scan.close();
		muestraEmpleados(emps);
		
		
	
		
		
	}

public static void muestraEmpleados(ArrayList<Empleado> emp) {
	
	for (Empleado em : emp) {

		System.out.println("Empleado: " + em.getNombre()+" "+ em.getApellido());
		System.out.println("DNI: "+ em.getDni());
		System.out.println("Sueldo: "+ em.getSueldo());
		
		
		
		
	}
		
		
		
		
	}
	
	

	
	
	public static void cargaDatosVendedor (Vendedor ven) {
		cargaDatosEmpleado(ven);
		
		System.out.println("Ingrese porcentaje comision del vendedor :");
		ven.setPorcentajeComision(scan.nextFloat());
		System.out.println("Ingrese el total de ventas del vendedor: ");
		ven.setTotalVentas(scan.nextInt());
		
		
		
		
		
		
	}
	
	public static void cargaDatosAdministrativo(Administrativo adm) {
		
		cargaDatosEmpleado(adm);
		
		System.out.println("Ingrese las hsExtras del empleado: ");
		adm.setHsExtras(scan.nextInt());
		System.out.println("Ingrese las hsMes del empleado: ");
		adm.setHsMes(scan.nextInt());
		
		
		
		}

	public static void cargaDatosEmpleado (Empleado emp) {
		
	
		System.out.println("Ingrese el nombre del empleado: ");
		emp.setNombre(scan.nextLine());
		System.out.println("Ingrese el apellido del empleado: ");
		emp.setApellido(scan.nextLine());
		System.out.println("Ingrese el DNI del empleado: ");
		emp.setDni(scan.nextLine());
		System.out.println("Ingrese el Email del empleado: ");
		emp.setEmail(scan.nextLine());
		System.out.println("Ingrese el sueldoBase del empleado: ");
		emp.setSueldoBase(scan.nextDouble());
	
		
		
		
		
}
	
}
	
