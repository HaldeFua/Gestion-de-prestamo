package controller;
import model.EstudianteDiseno;
import model.EstudianteIngenieria;
import view.Vista;

public abstract class ControladorMain {

    static Validaciones val = new Validaciones();
    static ControladorEstudiantesIngenieria controladorEstudiantesIngenieria = new ControladorEstudiantesIngenieria();
    static ControladorEstudiantesDisenio controladorEstudiantesDisenio = new ControladorEstudiantesDisenio();
    static int controlador = 0;

    public static void run(){

        boolean estaCorreindo = true;

        while(estaCorreindo){
            controlador = val.capturarInt(Vista.principal());

            switch (controlador){
                case 1 -> {
                    int tipo = val.capturarInt(Vista.inicio());
                    switch (tipo){
                        case 1 -> registrar(1);
                        case 2 -> iniSesion(1);
                        case 3 -> run();
                        default -> System.out.println("Opción no válida, intente de nuevo.");}
                }
                case 2 -> {
                    int tipo = val.capturarInt(Vista.inicio());
                    switch (tipo){
                        case 1 -> registrar(2);
                        case 2 -> iniSesion(2);
                        case 3 -> run();
                        default -> System.out.println("Opción no válida, intente de nuevo.");}
                }
                //PENDIENTE
                case 3 -> System.out.println("Imprimir inventario total");
                case 4 -> estaCorreindo = false;
                default -> System.out.println("Seleccione una opción valida");
            }
        }

    }

    private static void registrar(int tipo){
        switch (tipo){
            case 1 -> controladorEstudiantesIngenieria.registrar();
            case 2 -> controladorEstudiantesDisenio.registrar();
            case 3 -> run();
            default -> System.out.println("Opción no válida, intente de nuevo.");}
    }

    private static void iniSesion(int tipo){
        String cedula = val.capturarString("Ingrese cédula: ");
        switch (tipo){
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
            case 3 -> run();
            default -> System.out.println("Opción no válida, intente de nuevo.");
        }
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
