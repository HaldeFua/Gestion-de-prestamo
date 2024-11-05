package model;
public class ComputadorPortatil extends Equipo{

    private String sistemaOperativo;
    private String procesador;

    //Constructor

    public ComputadorPortatil(String serial, String marca, String tamanio, int precio, String sistemaOperativo, String procesador) {
        super(serial, marca, tamanio, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }

    //get and set
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesaro) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "SistemaOperativo = '" + sistemaOperativo + '\'' +
                " , Procesador = '" + procesador + '\'' +
                " , serial = '" + serial + '\'' +
                " , marca = '" + marca + '\'' +
                " , tamanio = '" + tamanio + '\'' +
                " , precio = " + precio;
    }
}
