package model;
public class EstudianteIngenieria extends Estudiante {
    private int numeroSemestre;
    private float promedioAcumulado;

    // Constructor

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int serial, int numeroSemestre, float promedioAcumulado) {
        super(cedula, nombre, apellido, telefono, serial);
        this.numeroSemestre = numeroSemestre;
        this.promedioAcumulado = promedioAcumulado;
    }

    //get and set
    public int getNumeroSemestre() {
        return numeroSemestre;
    }

    public void setNumeroSemestre(int numeroSemestre) {
        this.numeroSemestre = numeroSemestre;
    }

    public float getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(float promedioAcumulado) {
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