/**
 * Clase que representa un dispositivo electrónico genérico.
 * Contiene información básica como modelo, fabricante,
 * consumo de energía y estado (encendido/apagado).
 */
public class DispositivosElectronicos {

    /** Modelo del dispositivo */
    private String modelo;

    /** Fabricante del dispositivo */
    private String fabricante;

    /** Consumo de energía en Watts */
    private double consumoEnergia;

    /** Estado del dispositivo: true = encendido, false = apagado */
    private boolean encendido;

    /**
     * Constructor vacío.
     * Permite crear un objeto sin inicializar sus atributos.
     */
    public DispositivosElectronicos() {
    }

    /**
     * Constructor con parámetros para inicializar todos los atributos.
     *
     * @param modelo Modelo del dispositivo
     * @param fabricante Nombre del fabricante
     * @param consumoEnergia Consumo energético en Watts
     * @param encendido Estado inicial del dispositivo
     */
    public DispositivosElectronicos(String modelo, String fabricante, double consumoEnergia, boolean encendido) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = encendido;
    }

    /**
     * Obtiene el modelo del dispositivo.
     *
     * @return modelo del dispositivo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del dispositivo.
     *
     * @param modelo Modelo a asignar
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el fabricante del dispositivo.
     *
     * @return fabricante del dispositivo
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Establece el fabricante del dispositivo.
     *
     * @param fabricante Fabricante a asignar
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * Obtiene el consumo de energía del dispositivo.
     *
     * @return consumo en Watts
     */
    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    /**
     * Establece el consumo de energía del dispositivo.
     *
     * @param consumoEnergia Consumo en Watts a asignar
     */
    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    /**
     * Indica si el dispositivo está encendido.
     *
     * @return true si está encendido, false si está apagado
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * Cambia el estado del dispositivo.
     *
     * @param encendido true para encender, false para apagar
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    /**
     * Enciende el dispositivo.
     * Cambia el estado a encendido.
     */
    public void encender() {
        encendido = true;
        System.out.println("Dispositivo Encendido");
    }

    /**
     * Apaga el dispositivo.
     * Cambia el estado a apagado.
     */
    public void apagar() {
        encendido = false;
        System.out.println("Dispositivo Apagado");
    }

    /**
     * Obtiene una descripción completa del estado del dispositivo.
     *
     * @return Cadena con modelo, fabricante, consumo de energía y estado actual
     */
    public String obtenerEstado() {
        String estado = encendido ? "Encendido" : "Apagado";

        return "Modelo: " + modelo +
                ", Fabricante: " + fabricante +
                ", Consumo de energía: " + consumoEnergia + "W" +
                ", Estado: " + estado;
    }
}