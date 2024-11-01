package controller;
import model.EstudianteIngenieria;

import java.util.LinkedList;

public class ControladorEstudiantesIngenieria implements Controlador{

    ControladorPersistencia persistencia = new ControladorPersistencia();
    Validaciones val = new Validaciones();

    public void registrar() {
        String cedula;
        String nombre;
        String apellido;
        String telefono;
        int serial;
        int numeroSemestre;
        double promedioAcumulado;

        cedula = val.capturarString("Registrar una cedula:");
        nombre = val.capturarString("Registrar un nombre:");
        apellido = val.capturarString("Registrar un apellido:");
        telefono = val.capturarString("Registrar un telefono:");
        serial = val.capturarInt("Registrar un serial:");
        numeroSemestre = val.capturarInt("Registrar un numero de semestre:");
        promedioAcumulado = val.capturarDouble("Registrar un promedio acumulado:");

        EstudianteIngenieria estudianteIngenieria = new EstudianteIngenieria(cedula,nombre,apellido,telefono,serial,numeroSemestre,promedioAcumulado);
        persistencia.exportartxtEstudianteIngenieria(estudianteIngenieria);
    }

    @Override
    public boolean existeEstudiante(String cedula){
        return buscar(cedula) != null;
    }

    @Override
    public void modificar() {

    }

    @Override
    public void eliminar() {

    }

    @Override
    public void buscar() {

    }

    public EstudianteIngenieria buscar(String cedula) {

        LinkedList<EstudianteIngenieria> estudiantesIngieria = persistencia.importartxtEstudianteIngenieria("estudiantes_ingieria");

            for (EstudianteIngenieria est: estudiantesIngieria){
                if(est.getCedula().equals(cedula)){
                    return est;
                }
            }

        return null;
    }

}
