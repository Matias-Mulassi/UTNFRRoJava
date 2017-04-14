package practica.tarea.Ejercicio3;

public class Administrativo extends Empleado {

		private int hsExtras,hsMes;

		public int getHsExtras() {
			return hsExtras;
		}

		public void setHsExtras(int hsExtras) {
			this.hsExtras = hsExtras;
		}

		public int getHsMes() {
			return hsMes;
		}

		public void setHsMes(int hsMes) {
			this.hsMes = hsMes;
		}
		
		public double getSueldo(){
			 
			 
			 
			 return (getSueldoBase() * ((getHsExtras() * 1.5)+getHsMes()) / getHsMes());
			 
		 }
	
	
	
}
