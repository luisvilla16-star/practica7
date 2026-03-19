import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SensorAceleracionTest {

    @Test
    public void testConstructorYHerencia() {
        SensorAceleracion sensor = new SensorAceleracion(
                "A1", "Bosch", 25.0, true, "m/s^2", false
        );

        assertEquals("A1", sensor.getModelo());
        assertEquals("Bosch", sensor.getFabricante());
        assertEquals(25.0, sensor.getConsumoEnergia());
        assertTrue(sensor.isEncendido());
    }

    @Test
    public void testLeerValorRango() {
        SensorAceleracion sensor = new SensorAceleracion(
                "A1", "Bosch", 25.0, true, "m/s^2", false
        );

        double magnitud = sensor.leerValor();

        // La magnitud máxima sería √(100^2 + 100^2 + 100^2) ≈ 173.2
        assertTrue(magnitud >= 0 && magnitud <= 173.3,
                "La magnitud debe estar entre 0 y 173.2");
    }

    @Test
    public void testCalculoMagnitudCorrecto() {
        SensorAceleracion sensor = new SensorAceleracion(
                "A1", "Bosch", 25.0, true, "m/s^2", false
        );

        double magnitud = sensor.leerValor();

        // Validar que la fórmula se cumple
        double esperado = Math.sqrt(
                Math.pow(sensor.valorEjeX, 2) +
                        Math.pow(sensor.valorEjeY, 2) +
                        Math.pow(sensor.valorEjeZ, 2)
        );

        assertEquals(esperado, magnitud, 0.0001);
    }

    @Test
    public void testValoresEjesEnRango() {
        SensorAceleracion sensor = new SensorAceleracion(
                "A1", "Bosch", 25.0, true, "m/s^2", false
        );

        sensor.leerValor();

        assertTrue(sensor.valorEjeX >= 0 && sensor.valorEjeX <= 100);
        assertTrue(sensor.valorEjeY >= 0 && sensor.valorEjeY <= 100);
        assertTrue(sensor.valorEjeZ >= 0 && sensor.valorEjeZ <= 100);
    }

    @Test
    public void testCalibrar() {
        SensorAceleracion sensor = new SensorAceleracion(
                "A1", "Bosch", 25.0, true, "m/s^2", false
        );

        sensor.calibrar();

        assertTrue(sensor.estaCalibrado);
    }

    @Test
    public void testEncenderApagar() {
        SensorAceleracion sensor = new SensorAceleracion(
                "A1", "Bosch", 25.0, false, "m/s^2", false
        );

        sensor.encender();
        assertTrue(sensor.isEncendido());

        sensor.apagar();
        assertFalse(sensor.isEncendido());
    }
}