package unqui.po2.rossi.tp4;

import java.time.LocalDate;

public class Ingreso {

	private LocalDate mes;
	private String concepto;
	private double monto;
	
	public Ingreso(LocalDate mes, String concepto, double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}

	public LocalDate getMes() {
		return mes;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getMonto() {
		return monto;
	}
	
	public double getMontoImponible() {
		return monto;
	}
	
}