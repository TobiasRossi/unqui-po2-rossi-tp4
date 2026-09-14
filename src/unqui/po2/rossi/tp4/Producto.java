package unqui.po2.rossi.tp4;

public class Producto {
	private String nombre;
	private double precio;
	private boolean precioCuidado;
	
	public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCuidado = false; 
    }
	
	public Producto(String nombre, double precio, boolean precioCuidado) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioCuidado = precioCuidado;
    }
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		precio += aumento;
	}
	
}
