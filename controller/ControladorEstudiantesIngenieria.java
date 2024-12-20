package controller;
import model.EstudianteIngenieria;

import java.util.Iterator;
import java.util.LinkedList;

public class ControladorEstudiantesIngenieria implements ControladorEstudiante{

    ControladorPersistencia persistencia = new ControladorPersistencia();
    Validaciones val = new Validaciones();

    @Override
    public void registrar() {

        String cedula = val.capturarString("Registrar una cedula:");
        String nombre = val.capturarString("Registrar un nombre:");
        String apellido = val.capturarString("Registrar un apellido:");
        String telefono = val.capturarString("Registrar un telefono:");
        int serial = val.capturarInt("Registrar un serial:");
        int numeroSemestre = val.capturarInt("Registrar un numero de semestre:");
        double promedioAcumulado = val.capturarDouble("Registrar un promedio acumulado:");

        EstudianteIngenieria estudianteIngenieria = new EstudianteIngenieria(cedula,nombre,apellido,telefono,serial,numeroSemestre,promedioAcumulado);
        persistencia.exportartxtEstudianteIngenieria(estudianteIngenieria);
    }

    @Override
    public boolean existeEstudiante(String cedula){
        return buscar(cedula) != null;
    }


    public EstudianteIngenieria buscar(String cedula) {

        LinkedList<EstudianteIngenieria> estudiantesIngieria = persistencia.importartxtEstudianteIngenieria("estudiantes_ingenieria");

            for (EstudianteIngenieria est: estudiantesIngieria){
                if(est.getCedula().equals(cedula)){
                    return est;
                }
            }

        return null;
    }

    public void remover(EstudianteIngenieria estudiante){

        LinkedList<EstudianteIngenieria> estudiantes = persistencia.importartxtEstudianteIngenieria("estudiantes_ingenieria");

        Iterator<EstudianteIngenieria> iterator = estudiantes.iterator();
        while (iterator.hasNext()) {
            EstudianteIngenieria unEstudiante = iterator.next();
            if (unEstudiante.equals(estudiante)) {
                iterator.remove();
            }
        }

        persistencia.exportartxtEstudianteIngenieria(estudiantes);

    }

}
