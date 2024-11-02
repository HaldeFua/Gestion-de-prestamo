package model;
public class ComputadorPortatil extends Equipo{

    private String sistemaOperativo;
    private String procesador;

    //Constructor


    public ComputadorPortatil(String serial, String marca, String tamanio, int precio, String sistemaOperativo, String procesaro) {
        super(serial, marca, tamanio, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesaro;
    }

    //get and set
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    public String getProcesaro() {
        return procesador;
    }
    public void setProcesaro(String procesaro) {
        this.procesador = procesaro;
    }

    @Override
    public String toString() {
        return "ComputadorPortatil{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", procesaro='" + procesador + '\'' +
                ", serial='" + serial + '\'' +
                ", marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", precio=" + precio +
                '}';
    }
}
