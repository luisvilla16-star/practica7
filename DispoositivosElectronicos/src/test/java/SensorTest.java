import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para Sensor.
 * Se crea una subclase ficticia para poder probarla,
 * ya que Sensor es abstracta.
 */
public class SensorTest {

    /**
     * Clase interna de prueba (Mock)
     * Implementa el método abstracto leerValor()
     */
    static class SensorMock extends Sensor {

        public SensorMock(String modelo, String fabricante, double consumoEnergia,
                          boolean encendido, String unidadMedida, boolean estaCalibrado) {
            super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);
        }

        @Override
        public double leerValor() {
            return 100.0; // valor fijo para pruebas
        }
    }

    @Test
    public void testConstructorYHerencia() {
        Sensor s = new SensorMock("S1", "Intel", 10.0, true, "Celsius", false);

        assertEquals("S1", s.getModelo());
        assertEquals("Intel", s.getFabricante());
        assertEquals(10.0, s.getConsumoEnergia());
        assertTrue(s.isEncendido());

        assertEquals("Celsius", s.unidadMedida);
        assertFalse(s.estaCalibrado);
    }

    @Test
    public void testCalibrar() {
        Sensor s = new SensorMock("S1", "Intel", 10.0, true, "Celsius", false);

        s.calibrar();

        assertTrue(s.estaCalibrado);
    }

    @Test
    public void testLeerValor() {
        Sensor s = new SensorMock("S1", "Intel", 10.0, true, "Celsius", false);

        double valor = s.leerValor();

        assertEquals(100.0, valor);
    }

    @Test
    public void testEncenderHerencia() {
        Sensor s = new SensorMock("S1", "Intel", 10.0, false, "Celsius", false);

        s.encender();

        assertTrue(s.isEncendido());
    }

    @Test
    public void testApagarHerencia() {
        Sensor s = new SensorMock("S1", "Intel", 10.0, true, "Celsius", false);

        s.apagar();

        assertFalse(s.isEncendido());
    }
}