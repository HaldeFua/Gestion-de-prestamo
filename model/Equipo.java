package model;

public abstract class Equipo {

    //serial, marca, tamaño, precio
    protected String serial;
    protected String marca;
    protected String tamanio;
    protected int precio;

    //constructores
    public Equipo(String serial, String marca, String tamanio, int precio) {
        this.serial = serial;
        this.marca = marca;
        this.tamanio = tamanio;
        this.precio = precio;
    }

    // get and set
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // toString
    @Override
    public String toString() {
        return "Equipo{" +
                "serial='" + serial + '\'' +
                ", marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", precio=" + precio +
                '}';
    }
}
