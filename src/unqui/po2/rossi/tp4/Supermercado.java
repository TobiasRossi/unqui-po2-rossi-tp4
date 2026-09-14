package unqui.po2.rossi.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto nuevoProducto) {
		productos.add(nuevoProducto);
	}
	
	public double getPrecioTotal() {
		double total = 0;

		for (Producto p : this.productos) {
			total += p.getPrecio();
		}
		return total;
	}
}