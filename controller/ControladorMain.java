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

        do {
            bandera = val.capturarInt(Vista.inicio());
            int controlador = 0;

            //Registrarse
            if (bandera == 1) {
                do {
                    controlador = val.capturarInt(Vista.tipoEstudiante());

                    switch (controlador){
                        case 1 -> controladorEstudiantesIngenieria.registrar();
                        case 2 -> controladorEstudiantesDisenio.registrar();
                        case 3 -> controlador = 3;
                        default -> System.out.println("Opción no válida, intente de nuevo.");                    }
                } while (controlador != 3);

            //inisiar sesiom
            } else if (bandera == 2) {
                controlador = val.capturarInt(Vista.tipoEstudiante());
                do{
                    String cedula = val.capturarString("Ingrese cédula: ");
                    switch (controlador){
                        case 1 -> {
                            if (controladorEstudiantesIngenieria.existeEstudiante((cedula))){
                            Vista.menuIngenieria(controladorEstudiantesIngenieria.buscar(cedula));
                            }else{
                                System.out.println("Estudiante no existe");
                            }
                        }
                        case 2 -> {
                            if (controladorEstudiantesDisenio.existeEstudiante((cedula))){
                                Vista.menuDiseno(controladorEstudiantesDisenio.buscar(cedula));
                            }else{
                                System.out.println("Estudiante no existe");
                            }
                        }
                        case 3 -> controlador = 3;
                        default -> System.out.println("Opción no válida, intente de nuevo.");
                    }
                }while(controlador != 3);
            }
        } while (bandera != 3);
    }

}
