package unqui.po2.rossi.tp4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class TrabajadorTest {
	
    private Trabajador trabajador;
    private Ingreso ingresoEnero;
    private Ingreso ingresoFebrero;
    private IngresoHorasExtra horasExtrasFebrero;

    @BeforeEach
    public void setUp() {
        // 1. Instanciamos al trabajador
        trabajador = new Trabajador("Emanuel", "Desarrollador");
        
        // 2. Creamos dos ingresos normales de $100.000 cada uno
        ingresoEnero = new Ingreso(LocalDate.of(2024, 1, 31), "Sueldo Enero", 100000);
        ingresoFebrero = new Ingreso(LocalDate.of(2024, 2, 29), "Sueldo Febrero", 100000);
        
        // 3. Creamos un ingreso por horas extras de $20.000
        horasExtrasFebrero = new IngresoHorasExtra(LocalDate.of(2024, 2, 29), "Horas Extras", 20000, 10);
        
        // 4. Le agregamos todos los ingresos al trabajador
        trabajador.agregarIngreso(ingresoEnero);
        trabajador.agregarIngreso(ingresoFebrero);
        trabajador.agregarIngreso(horasExtrasFebrero);
    }

    @Test
    public void testTotalPercibido() {
        // El total percibido debe sumar absolutamente todo: 100k + 100k + 20k = 220.000
        assertEquals(220000, trabajador.getTotalPercibido());
    }

    @Test
    public void testMontoImponible() {
        // El monto imponible ignora las horas extras: 100k + 100k + 0 = 200.000
        assertEquals(200000, trabajador.getMontoImponible());
    }

    @Test
    public void testImpuestoAPagar() {
        // El impuesto debe ser el 2% del monto imponible (200.000 * 0.02 = 4000)
        assertEquals(4000, trabajador.getImpuestoAPagar());
    }
}