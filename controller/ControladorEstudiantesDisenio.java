package controller;
import model.EstudianteDiseno;
import java.util.LinkedList;

public class ControladorEstudiantesDisenio implements Controlador{

    ControladorPersistencia persistencia = new ControladorPersistencia();
    Validaciones val = new Validaciones();

    public void registrar() {
        String cedula;
        String nombre;
        String apellido;
        String telefono;
        int serial;
        String modalidadEstudio;
        int cantidadAsignaturas;

        cedula = val.capturarString("Registrar una cedula:");
        nombre = val.capturarString("Registrar un nombre:");
        apellido = val.capturarString("Registrar un apellido:");
        telefono = val.capturarString("Registrar un telefono:");
        serial = val.capturarInt("Registrar un serial:");
        modalidadEstudio = val.capturarString("Registrar la modalidad de estudio:");
        cantidadAsignaturas = val.capturarInt("Registrar la cantidad de asignaturas:");

        EstudianteDiseno estudiante = new EstudianteDiseno(cedula,nombre,apellido,telefono,serial,modalidadEstudio,cantidadAsignaturas);
        persistencia.exportartxtEstudianteDisenio(estudiante);
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

    public EstudianteDiseno buscar(String cedula) {

        LinkedList<EstudianteDiseno> estudiantes = persistencia.importartxtEstudianteDisenio("estudiantes_disenio");

        for (EstudianteDiseno est: estudiantes){
            if(est.getCedula().equals(cedula)){
                return est;
            }
        }

        return null;
    }

    @Override
    public boolean existeEstudiante(String cedula){
        return buscar(cedula) != null;
    }

}
