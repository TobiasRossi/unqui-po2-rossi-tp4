package unqui.po2.rossi.tp4;

import java.util.ArrayList;

public class Trabajador {

	private String nombre;
	private String puesto;
	private ArrayList<Ingreso> ingresos;
	
	public Trabajador(String nombre, String puesto) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.ingresos = new ArrayList<Ingreso>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getPuesto() {
		return puesto;
	}
	
	public double getTotalPercibido() {
		double totalPercibido = 0;

		for (Ingreso i : this.ingresos) {
			totalPercibido += i.getMonto();
		}
		return totalPercibido;
	}
	
	public void agregarIngreso(Ingreso nuevoIngreso) {
		ingresos.add(nuevoIngreso);
	}
	
	public double getMontoImponible() {
		double totalImponible = 0;
		
		for (Ingreso i : this.ingresos) {
			totalImponible += i.getMontoImponible();
		}
		return totalImponible;
	}
	
	public double getImpuestoAPagar() {
		return getMontoImponible() * 0.02;
	}
	
}