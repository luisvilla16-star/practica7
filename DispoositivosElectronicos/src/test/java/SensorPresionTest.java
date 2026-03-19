import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SensorPresionTest {

    @Test
    public void testConstructorYHerencia() {
        SensorPresion sensor = new SensorPresion(
                "P1", "Siemens", 20.0, true, "Pascal", false
        );

        assertEquals("P1", sensor.getModelo());
        assertEquals("Siemens", sensor.getFabricante());
        assertEquals(20.0, sensor.getConsumoEnergia());
        assertTrue(sensor.isEncendido());
    }

    @Test
    public void testLeerValorRango() {
        SensorPresion sensor = new SensorPresion(
                "P1", "Siemens", 20.0, true, "Pascal", false
        );

        double valor = sensor.leerValor();

        // Validar que esté dentro del rango 900 - 1100
        assertTrue(valor >= 900.0 && valor <= 1100.0,
                "La presión debe estar entre 900 y 1100");
    }

    @Test
    public void testLeerValorMultiple() {
        SensorPresion sensor = new SensorPresion(
                "P1", "Siemens", 20.0, true, "Pascal", false
        );

        double v1 = sensor.leerValor();
        double v2 = sensor.leerValor();

        // Puede coincidir, pero normalmente no
        assertNotEquals(v1, v2);
    }

    @Test
    public void testCalibrar() {
        SensorPresion sensor = new SensorPresion(
                "P1", "Siemens", 20.0, true, "Pascal", false
        );

        sensor.calibrar();

        assertTrue(sensor.estaCalibrado);
    }

    @Test
    public void testEncenderApagar() {
        SensorPresion sensor = new SensorPresion(
                "P1", "Siemens", 20.0, false, "Pascal", false
        );

        sensor.encender();
        assertTrue(sensor.isEncendido());

        sensor.apagar();
        assertFalse(sensor.isEncendido());
    }
}