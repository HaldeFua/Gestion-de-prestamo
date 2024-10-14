package model;
public class EstudianteIngenieria extends Estudiante {
    private int numeroSemestre;
    private float promedioAcumulado;
    private String serial;

    // Constructor
    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int numeroSemestre, float promedioAcumulado, String serial) {
        super(cedula, nombre, apellido, telefono);
        this.numeroSemestre = numeroSemestre;
        this.promedioAcumulado = promedioAcumulado;
        this.serial = serial;
    }

    // Sobrescribir método para mostrar la información
    @Override
    public String toString() {
        return "EstudianteIngenieria{" +
                "numeroSemestre=" + numeroSemestre +
                ", promedioAcumulado=" + promedioAcumulado +
                ", serial='" + serial + '\'' +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}