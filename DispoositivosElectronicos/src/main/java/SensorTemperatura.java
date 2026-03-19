import java.util.Random;

/**
 * Clase que representa un sensor de temperatura.
 * Hereda de la clase abstracta {@link Sensor} e implementa
 * el método {@link #leerValor()} para simular la lectura de temperatura.
 */
public class SensorTemperatura extends Sensor {

    /** Valor actual de la temperatura medida en grados Celsius */
    private double valorActual;

    /** Generador de valores aleatorios para simular la lectura */
    private Random rand = new Random();

    /**
     * Constructor de la clase SensorTemperatura.
     *
     * @param modelo Modelo del sensor
     * @param fabricante Fabricante del sensor
     * @param consumoEnergia Consumo energético en Watts
     * @param encendido Estado inicial del sensor (true = encendido, false = apagado)
     * @param unidadMedida Unidad de medida (ej: Celsius)
     * @param estaCalibrado Estado inicial de calibración (true = calibrado, false = no calibrado)
     */
    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado) {
        super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);
    }

    /**
     * Simula la lectura de temperatura.
     *
     * Genera un valor aleatorio entre 20.0 y 35.0 grados Celsius.
     * Este método sobrescribe {@link Sensor#leerValor()} y demuestra polimorfismo,
     * ya que cada tipo de sensor define su propia forma de obtener un valor.
     *
     * @return temperatura simulada en grados Celsius
     */
    @Override
    public double leerValor() {
        // Genera un número aleatorio entre 20.0 y 35.0
        valorActual = 20.0 + (rand.nextDouble() * (35.0 - 20.0));
        return valorActual;
    }
}