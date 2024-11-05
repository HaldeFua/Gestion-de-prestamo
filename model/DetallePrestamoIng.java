package model;

public class DetallePrestamoIng {

    private Estudiante estudiante;
    private ComputadorPortatil computador;

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public ComputadorPortatil getComputador() {
        return computador;
    }

    public void setComputador(ComputadorPortatil computador) {
        this.computador = computador;
    }

    public DetallePrestamoIng(Estudiante estudiante, ComputadorPortatil computador) {
        this.estudiante = estudiante;
        this.computador = computador;
    }

    @Override
    public String toString() {
        return "Detalle Prestamo: " +
                "El estudiante = " + estudiante.getNombre() +
                " tiene el computador = " + computador.getMarca();
    }
}
