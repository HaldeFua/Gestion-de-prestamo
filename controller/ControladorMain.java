package controller;
import model.EstudianteIngenieria;
import view.Vista;

public abstract class ControladorMain {

    static Validaciones val = new Validaciones();

    //primer programa de la app
        public static void run() {
        int bandera = 0;
        ControladorEstudiantesIngenieria controladorEstudiantesIngenieria = new ControladorEstudiantesIngenieria();
        ControladorEstudiantesDisenio controladorEstudiantesDisenio = new ControladorEstudiantesDisenio();
        String tipoEstudiante = "Seleccionar una opción:\n"
                + "1 Estudiante Ingeniería\n" +
                "2 Estudiante Diseño\n" +
                "3 Salir";

        do {
            bandera = val.capturarInt(Vista.inicio());

            if (bandera == 1) {
                int controlador = 0;
                do {
                    controlador = val.capturarInt(tipoEstudiante);

                    switch (controlador){
                        case 1 -> controladorEstudiantesIngenieria.registrar();
                        case 2 -> controladorEstudiantesDisenio.registrar();
                        default -> System.out.println("Opción no válida, intente de nuevo.");                    }
                } while (controlador != 3);

            } else if (bandera == 2) {
                String cedula = val.capturarString("Ingrese cédula: ");
                if (controladorEstudiantesIngenieria.existeEstudiante(cedula)) {
                    EstudianteIngenieria usuario = controladorEstudiantesIngenieria.buscar(cedula);
                    Vista.menuIngenieria(usuario);
                } else {
                    System.out.println("Error: No se pudo iniciar sesión.");
                }
            }
        } while (bandera != 3);
    }

}
