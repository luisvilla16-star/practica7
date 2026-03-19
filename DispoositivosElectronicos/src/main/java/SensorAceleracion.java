import java.util.Random;

/**
 * Clase que representa un sensor de aceleración.
 * Hereda de la clase abstracta {@link Sensor} e implementa
 * el método {@link #leerValor()} para simular lecturas en los tres ejes (X, Y, Z).
 */
public class SensorAceleracion extends Sensor {

    /** Valor del eje X en la unidad del sensor */
    public double valorEjeX;

    /** Valor del eje Y en la unidad del sensor */
    public double valorEjeY;

    /** Valor del eje Z en la unidad del sensor */
    public double valorEjeZ;

    /** Generador de números aleatorios para simular lecturas */
    private Random rand = new Random();

    /**
     * Constructor de la clase SensorAceleracion.
     *
     * @param modelo Modelo del sensor
     * @param fabricante Fabricante del sensor
     * @param consumoEnergia Consumo energético en Watts
     * @param encendido Estado inicial del sensor (true = encendido, false = apagado)
     * @param unidadMedida Unidad de medida (ej: m/s²)
     * @param estaCalibrado Estado inicial de calibración (true = calibrado, false = no calibrado)
     */
    public SensorAceleracion(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado) {
        super(modelo, fabricante, consumoEnergia, encendido, unidadMedida, estaCalibrado);
    }

    /**
     * Simula la lectura de aceleración en tres ejes.
     *
     * Genera valores aleatorios para los ejes X, Y y Z y calcula
     * la magnitud del vector de aceleración usando la fórmula:
     * <pre>
     * √(X² + Y² + Z²)
     * </pre>
     *
     * Este método sobrescribe {@link Sensor#leerValor()} aplicando polimorfismo,
     * ya que cada tipo de sensor implementa su propia forma de obtener un valor.
     *
     * @return magnitud de la aceleración simulada en la unidad del sensor
     */
    @Override
    public double leerValor() {
        // Generar valores aleatorios entre 0 y 100 para cada eje
        valorEjeX = rand.nextDouble() * 100.0;
        valorEjeY = rand.nextDouble() * 100.0;
        valorEjeZ = rand.nextDouble() * 100.0;

        // Calcular la magnitud del vector
        double magnitud = Math.sqrt(
                Math.pow(valorEjeX, 2) +
                        Math.pow(valorEjeY, 2) +
                        Math.pow(valorEjeZ, 2)
        );

        return magnitud;
    }
}