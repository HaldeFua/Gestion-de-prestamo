package model;
public class EstudianteIngenieria extends Estudiante {
    private int numeroSemestre;
    private float promedioAcumulado;

    // Constructor
    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int numeroSemestre, float promedioAcumulado) {
        super(cedula, nombre, apellido, telefono);
        this.numeroSemestre = numeroSemestre;
        this.promedioAcumulado = promedioAcumulado;
    }

    // Mostrar la información

    @Override
    public String toString() {
        return "EstudianteIngenieria{" +
                "numeroSemestre=" + numeroSemestre +
                ", promedioAcumulado=" + promedioAcumulado +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", serial=" + serial +
                '}';
    }
}