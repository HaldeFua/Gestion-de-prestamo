package model;
public class ComputadorPortatil extends Equipo{

    private String sistemaOperativo;
    private String procesaro;

    //Constructor


    public ComputadorPortatil(String serial, String marca, String tamanio, int precio, String sistemaOperativo, String procesaro) {
        super(serial, marca, tamanio, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.procesaro = procesaro;
    }

    //get and set
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    public String getProcesaro() {
        return procesaro;
    }
    public void setProcesaro(String procesaro) {
        this.procesaro = procesaro;
    }

    @Override
    public String toString() {
        return "ComputadorPortatil{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", procesaro='" + procesaro + '\'' +
                ", serial='" + serial + '\'' +
                ", marca='" + marca + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", precio=" + precio +
                '}';
    }
}
