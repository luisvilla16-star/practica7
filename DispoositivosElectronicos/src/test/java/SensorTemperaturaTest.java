import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SensorTemperaturaTest {

    @Test
    public void testConstructorYHerencia() {
        SensorTemperatura sensor = new SensorTemperatura(
                "T1", "Bosch", 15.0, true, "Celsius", false
        );

        assertEquals("T1", sensor.getModelo());
        assertEquals("Bosch", sensor.getFabricante());
        assertEquals(15.0, sensor.getConsumoEnergia());
        assertTrue(sensor.isEncendido());
    }

    @Test
    public void testLeerValorRango() {
        SensorTemperatura sensor = new SensorTemperatura(
                "T1", "Bosch", 15.0, true, "Celsius", false
        );

        double valor = sensor.leerValor();

        // Verifica que esté dentro del rango esperado
        assertTrue(valor >= 20.0 && valor <= 35.0,
                "El valor debe estar entre 20.0 y 35.0");
    }

    @Test
    public void testLeerValorDiferenteCadaVez() {
        SensorTemperatura sensor = new SensorTemperatura(
                "T1", "Bosch", 15.0, true, "Celsius", false
        );

        double valor1 = sensor.leerValor();
        double valor2 = sensor.leerValor();

        // No siempre será distinto, pero es muy probable
        assertNotEquals(valor1, valor2);
    }

    @Test
    public void testCalibrar() {
        SensorTemperatura sensor = new SensorTemperatura(
                "T1", "Bosch", 15.0, true, "Celsius", false
        );

        sensor.calibrar();

        assertTrue(sensor.estaCalibrado);
    }

    @Test
    public void testEncenderApagar() {
        SensorTemperatura sensor = new SensorTemperatura(
                "T1", "Bosch", 15.0, false, "Celsius", false
        );

        sensor.encender();
        assertTrue(sensor.isEncendido());

        sensor.apagar();
        assertFalse(sensor.isEncendido());
    }
}