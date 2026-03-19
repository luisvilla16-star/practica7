import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DispositivosElectronicosTest {

    @Test
    public void testConstructorYGetters() {
        DispositivosElectronicos d = new DispositivosElectronicos("DTH11", "Samsung", 50.0, true);

        assertEquals("DTH11", d.getModelo());
        assertEquals("Samsung", d.getFabricante());
        assertEquals(50.0, d.getConsumoEnergia());
        assertTrue(d.isEncendido());
    }

    @Test
    public void testSetters() {
        DispositivosElectronicos d = new DispositivosElectronicos();

        d.setModelo("ABC123");
        d.setFabricante("LG");
        d.setConsumoEnergia(75.5);
        d.setEncendido(true);

        assertEquals("ABC123", d.getModelo());
        assertEquals("LG", d.getFabricante());
        assertEquals(75.5, d.getConsumoEnergia());
        assertTrue(d.isEncendido());
    }

    @Test
    public void testEncender() {
        DispositivosElectronicos d = new DispositivosElectronicos("X1", "Sony", 30.0, false);

        d.encender();

        assertTrue(d.isEncendido());
    }

    @Test
    public void testApagar() {
        DispositivosElectronicos d = new DispositivosElectronicos("X1", "Sony", 30.0, true);

        d.apagar();

        assertFalse(d.isEncendido());
    }

    @Test
    public void testObtenerEstadoEncendido() {
        DispositivosElectronicos d = new DispositivosElectronicos("X1", "Sony", 30.0, true);

        String estado = d.obtenerEstado();

        assertTrue(estado.contains("Encendido"));
        assertTrue(estado.contains("X1"));
        assertTrue(estado.contains("Sony"));
    }

    @Test
    public void testObtenerEstadoApagado() {
        DispositivosElectronicos d = new DispositivosElectronicos("X1", "Sony", 30.0, false);

        String estado = d.obtenerEstado();

        assertTrue(estado.contains("Apagado"));
    }
}