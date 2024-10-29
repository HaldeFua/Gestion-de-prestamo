package controller;
import view.Vista;

public abstract class ControladorMain {

    static Validaciones val = new Validaciones();

    //primer programa de la app
    public static void run(){
        //Primera vista del programa, el usuario elige entre iniciar sesión o registrarse
        int vandera = 0;
        ControladorEstudiantesIngenieria controladorEstudiantesIngenieria = new ControladorEstudiantesIngenieria();
        do {
            vandera = val.capturarInt(Vista.inicio());

            if (vandera == 1) {
                int controlador = 0;
                do {

                    controlador = val.capturarInt("Seleccionar una opción:\n"
                            + "1 Estudiante Ingenieria\n" +
                            "2 Estudiante Diseño\n" +
                            "3 Salir");

                    System.out.println(controlador);

                    if (controlador == 1) {
                        controladorEstudiantesIngenieria.registrar();
                    } else if (controlador == 2) {
                        System.out.println("Valor de controlador: " + controlador);
                        /*String cedula = val.capturarString("Ingrese cedula: ");
                        if (controladorEstudiantesIngenieria.iniciarSesion(cedula)) {
                            Vista.menuPrincipal();
                        } else {
                            System.out.println("Error: No se pudo iniciar sesión.");
                        }*/
                    }
                } while (controlador != 3);
            }
        } while (vandera != 3);
    }

}
