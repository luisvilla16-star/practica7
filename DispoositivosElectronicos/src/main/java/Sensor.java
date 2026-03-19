/**
 * Clase abstracta que representa un sensor.
 * Extiende de {@link DispositivosElectronicos}, heredando atributos como
 * modelo, fabricante, consumo de energía y estado.
 *
 * Esta clase sirve como base para diferentes tipos de sensores,
 * como temperatura, presión o aceleración.
 */
public abstract class Sensor extends DispositivosElectronicos {

    /** Unidad de medida del sensor (ej: Celsius, Pascal, m/s²) */
    protected String unidadMedida;

    /** Indica si el sensor está calibrado */
    protected boolean estaCalibrado;

    /**
     * Constructor de la clase Sensor.
     *
     * Inicializa tanto los atributos heredados como los propios.
     *
     * @param modelo Modelo del sensor
     * @param fabricante Fabricante del sensor
     * @param consumoEnergia Consumo de energía en Watts
     * @param encendido Estado inicial del sensor (true = encendido, false = apagado)
     * @param unidadMedida Unidad en la que mide el sensor
     * @param estaCalibrado Estado inicial de calibración (true = calibrado, false = no calibrado)
     */
    public Sensor(String modelo, String fabricante, double consumoEnergia, boolean encendido, String unidadMedida, boolean estaCalibrado) {
        super(modelo, fabricante, consumoEnergia, encendido);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = estaCalibrado;
    }

    /**
     * Calibra el sensor.
     * Cambia el estado interno a calibrado.
     */
    public void calibrar() {
        this.estaCalibrado = true;
        System.out.println("Calibrando sensor");
    }

    /**
     * Método abstracto que debe ser implementado por las subclases.
     *
     * Cada tipo de sensor define su propia forma de obtener un valor,
     * aplicando polimorfismo.
     *
     * @return valor leído por el sensor
     */
    public abstract double leerValor();
}