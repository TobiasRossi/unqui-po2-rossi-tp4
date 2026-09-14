package unqui.po2.rossi.tp4;

import java.time.LocalDate;

public class IngresoHorasExtra extends Ingreso {

	private int horasExtra;
	
	public IngresoHorasExtra(LocalDate mes, String concepto, double monto, int horasExtra) {
		super(mes, concepto, monto);
		this.horasExtra = horasExtra;
	}

	@Override
	public double getMontoImponible() {
		return 0;
	}
	
}