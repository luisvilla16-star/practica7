import java.util.Random;

/**
 * Clase que representa un sensor de presión.
 * Hereda de la clase abstracta {@link Sensor} e implementa
 * el método {@link #leerValor()} para simular lecturas de presión.
 */
public class SensorPresion extends Sensor {

    /** Valor actual de la presión medida en Pascales (Pa) */
    private double valorActual;

    /** Generador de números aleatorios para simular la lectura */
    private Random rand = new Random();

    /**
     * Constructor de la clase SensorPresion.
     *
     * @param modelo Modelo del sensor
     * @param fabricante Fabricante del sensor
     * @param consumoEnergia Consumo energético en Watts
     * @param encendido Estado inicial del sensor (true = encendido, false = apagado)
     * @param unidadMedida Unidad de medida (ej: Pascal, kPa)
     * @param estaCalibrado Estado inicial de calibración (true = calibrado, false = no calibrado)
     */
    public SensorPresion(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado ){
        super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);
    }

    /**
     * Simula la lectura de presión.
     *
     * Genera un valor aleatorio entre 900 y 1100 Pa.
     * Este método sobrescribe {@link Sensor#leerValor()} aplicando polimorfismo,
     * ya que cada tipo de sensor implementa su propia forma de medición.
     *
     * @return presión simulada en Pascales (Pa)
     */
    @Override
    public double leerValor() {
        // Genera un valor aleatorio entre 900 y 1100
        valorActual = 900.0 + (rand.nextDouble() * (1100.0 - 900.0));
        return valorActual;
    }
}