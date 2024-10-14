package model;
public class EstudianteDiseno extends Estudiante {
    private String modalidadEstudio;
    private int cantidadAsignaturas;
    private int serial;

    // Constructor
    public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, String modalidadEstudio, int cantidadAsignaturas, int serial) {
        super(cedula, nombre, apellido, telefono);
        this.modalidadEstudio = modalidadEstudio;
        this.cantidadAsignaturas = cantidadAsignaturas;
        this.serial = serial;
    }

    // Sobrescribir método para mostrar la información

    @Override
    public String toString() {
        return "EstudianteDiseno{" +
                "modalidadEstudio='" + modalidadEstudio + '\'' +
                ", cantidadAsignaturas=" + cantidadAsignaturas +
                ", serial=" + serial +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}