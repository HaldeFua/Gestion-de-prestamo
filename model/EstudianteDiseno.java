package model;
public class EstudianteDiseno extends Estudiante {
    private String modalidadEstudio;
    private int cantidadAsignaturas;

    // Constructor
    public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, int serial, String modalidadEstudio, int cantidadAsignaturas) {
        super(cedula, nombre, apellido, telefono, serial);
        this.modalidadEstudio = modalidadEstudio;
        this.cantidadAsignaturas = cantidadAsignaturas;
    }

    public String getModalidadEstudio() {
        return modalidadEstudio;
    }

    public void setModalidadEstudio(String modalidadEstudio) {
        this.modalidadEstudio = modalidadEstudio;
    }

    public int getCantidadAsignaturas() {
        return cantidadAsignaturas;
    }

    public void setCantidadAsignaturas(int cantidadAsignaturas) {
        this.cantidadAsignaturas = cantidadAsignaturas;
    }

    // Sobrescribir método para mostrar la información

    @Override
    public String toString() {
        return "EstudianteDiseno{" +
                "modalidadEstudio='" + modalidadEstudio + '\'' +
                ", cantidadAsignaturas=" + cantidadAsignaturas +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", serial=" + serial +
                '}';
    }
}