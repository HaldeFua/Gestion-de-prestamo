package controller;
import model.EstudianteDiseno;
import model.EstudianteIngenieria;
import view.Vista;

public abstract class ControladorMain {

    static Validaciones val = new Validaciones();
    static ControladorEstudiantesIngenieria controladorEstudiantesIngenieria = new ControladorEstudiantesIngenieria();
    static ControladorEstudiantesDisenio controladorEstudiantesDisenio = new ControladorEstudiantesDisenio();
    static int controlador = 0;

    public static void run() {
        do {
            controlador = val.capturarInt(Vista.inicio());

            if (controlador == 1) {
                registrar();
            } else if (controlador == 2) {
                iniSesion();
            }
        } while (controlador != 3);
    }

    private static void registrar(){
        do {
            controlador = val.capturarInt(Vista.tipoEstudiante());

            switch (controlador){
                case 1 -> controladorEstudiantesIngenieria.registrar();
                case 2 -> controladorEstudiantesDisenio.registrar();
                case 3 -> controlador = 3;
                default -> System.out.println("Opción no válida, intente de nuevo.");}
        } while (controlador != 3);
    }

    private static void iniSesion(){
        controlador = val.capturarInt(Vista.tipoEstudiante());
        do{
            String cedula = val.capturarString("Ingrese cédula: ");
            switch (controlador){
                case 1 -> {
                    if (controladorEstudiantesIngenieria.existeEstudiante((cedula))){
                        menuIngenieria(controladorEstudiantesIngenieria.buscar(cedula));
                    }else{
                        System.out.println("Estudiante no existe");
                    }
                }
                case 2 -> {
                    if (controladorEstudiantesDisenio.existeEstudiante((cedula))){
                        menuDisenio(controladorEstudiantesDisenio.buscar(cedula));
                    }else{
                        System.out.println("Estudiante no existe");
                    }
                }
                case 3 -> controlador = 3;
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }
        }while(controlador != 3);
    }

    private static void menuIngenieria(EstudianteIngenieria usuario) {

        controlador = val.capturarInt(Vista.menuIngenieria(usuario.getNombre()));

        switch (controlador) {
            case 1 -> System.out.println("registrarPrestamoIngenieria()");
            case 2 -> System.out.println("modificarPrestamoIngenieria()");
            case 3 -> System.out.println("devolverEquipoIngenieria()");
            case 4 -> System.out.println("buscarEquipoIngenieria()");
            case 5 -> run();
            default -> System.out.println("Opción no válida, intente de nuevo.");
        }
    }

    private static void menuDisenio(EstudianteDiseno usuario){

        controlador = val.capturarInt(Vista.menuDisenio(usuario.getNombre()));

        switch (controlador) {
            case 1 -> System.out.println("registrarPrestamoDiseno()");
            case 2 -> System.out.println("modificarPrestamoDiseno()");
            case 3 -> System.out.println("devolverEquipoDiseno()");
            case 4 -> System.out.println("buscarEquipoDiseno()");
            case 5 -> run();
            default -> System.out.println("Opción no válida, intente de nuevo.");
        }
    }

}
