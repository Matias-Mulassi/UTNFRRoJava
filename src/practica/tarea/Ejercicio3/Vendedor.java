package practica.tarea.Ejercicio3;

public class Vendedor extends Empleado{

		private float porcentajeComision;
		private int totalVentas;
		
		public float getPorcentajeComision() {
			return porcentajeComision;
		}
		public void setPorcentajeComision(float porcentajeComision) {
			this.porcentajeComision = porcentajeComision;
		}
		
 public int getTotalVentas() {
			return totalVentas;
		}
		public void setTotalVentas(int totalVentas) {
			this.totalVentas = totalVentas;
		}
		public double getSueldo(){
	 
	 
	 
	 return (getSueldoBase()+(getPorcentajeComision()*getTotalVentas()/100));
	 
 }


}
