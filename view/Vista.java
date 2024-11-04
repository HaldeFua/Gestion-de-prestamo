package view;
import model.EstudianteDiseno;
import model.EstudianteIngenieria;

import java.util.Scanner;

public abstract class Vista {

    static Scanner sc = new Scanner(System.in);

    //Primera vista del programa, el usuario elige entre iniciar sesión o registrarse
    public static String inicio(){
        return "Seleccionar una opción:\n"
                +"1 Registrarse\n" +
                "2 Iniciar sesión\n" +
                "3 Salir";
    }

    public static String tipoEstudiante(){
        return "Seleccionar una opción:\n" +
                "1 Estudiante Ingeniería\n" +
                "2 Estudiante Diseño\n" +
                "3 Volver";
    }

    public static void menuIngenieria(EstudianteIngenieria usuario) {
        while (true) {

            System.out.println("\n---- BIENVENIDO " + usuario.getNombre() + " ----");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo (por serial o cédula)");
            System.out.println("3. Devolución de equipo (por serial o cédula)");
            System.out.println("4. Buscar equipo (por serial o cédula)");
            System.out.println("5. Cerrrar sesión");
            System.out.print("Seleccione una opción: ");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> System.out.println("registrarPrestamoIngenieria()");
                case "2" -> System.out.println("modificarPrestamoIngenieria()");
                case "3" -> System.out.println("devolverEquipoIngenieria()");
                case "4" -> System.out.println("buscarEquipoIngenieria()");
                case "5" -> {
                    return; // Volver al menú principal
                }
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }

    // Submenú Diseño
    public static void menuDiseno(EstudianteDiseno usuario) {
        while (true) {
            System.out.println("\n---- ESTUDIANTES DE DISEÑO " + usuario.getNombre() + " ----");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo (por serial o cédula)");
            System.out.println("3. Devolución de equipo (por serial o cédula)");
            System.out.println("4. Buscar equipo (por serial o cédula)");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");


            String opcion = sc.nextLine();

            /*switch (opcion) {
                case "1" -> System.out.println("registrarPrestamoDiseno()");
                case "2" -> System.out.println("modificarPrestamoDiseno()");
                case "3" -> System.out.println("devolverEquipoDiseno()");
                case "4" -> System.out.println("buscarEquipoDiseno()");
                case "5" -> {
                    return;
                }
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }*/
        }
    }

}
