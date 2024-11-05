package controller;

import model.ComputadorPortatil;
import model.DetallePrestamoIng;
import model.EstudianteIngenieria;

public class ControladorPrestamoIng {

    static Validaciones val = new Validaciones();
    ControladorComputador controladorComputador = new ControladorComputador();
    static ControladorEstudiantesIngenieria controladorEstudiantesIngenieria = new ControladorEstudiantesIngenieria();

    public DetallePrestamoIng registrarPrestamo(EstudianteIngenieria estudiante){

        controladorComputador.mostrar(controladorComputador.traerLista());
        int eleccion = val.capturarInt("Seleccionar un equipo: ");

        ComputadorPortatil computador = controladorComputador.traerLista().get(eleccion);
        DetallePrestamoIng detallePrestamo = new DetallePrestamoIng(estudiante, computador);

        controladorEstudiantesIngenieria.remover(estudiante);

        return detallePrestamo;
    }

}
