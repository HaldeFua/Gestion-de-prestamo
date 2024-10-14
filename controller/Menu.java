package controller;
import java.util.Scanner;

public class Menu {
    
    Scanner sc = new Scanner(System.in);
        // Submenú Ingeniería
    public void menuIngenieria() {
        while (true) {
            System.out.println("\n---- ESTUDIANTES DE INGENIERÍA ----");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo (por serial o cédula)");
            System.out.println("3. Devolución de equipo (por serial o cédula)");
            System.out.println("4. Buscar equipo (por serial o cédula)");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
           
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> registrarPrestamoIngenieria();
                case "2" -> modificarPrestamoIngenieria();
                case "3" -> devolverEquipoIngenieria();
                case "4" -> buscarEquipoIngenieria();
                case "5" -> {
                    return; // Volver al menú principal
                }
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }

    // Submenú Diseño
    public void menuDiseno() {
        while (true) {
            System.out.println("\n---- ESTUDIANTES DE DISEÑO ----");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo (por serial o cédula)");
            System.out.println("3. Devolución de equipo (por serial o cédula)");
            System.out.println("4. Buscar equipo (por serial o cédula)");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");


            String opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> registrarPrestamoDiseno();
                case "2" -> modificarPrestamoDiseno();
                case "3" -> devolverEquipoDiseno();
                case "4" -> buscarEquipoDiseno();
                case "5" -> {
                    return;
                }
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }

    //provisionales para Ingeniería
    public static void registrarPrestamoIngenieria() {
        System.out.println("Función: Registrar préstamo de equipo - Ingeniería");
    }

    public static void modificarPrestamoIngenieria() {
        System.out.println("Función: Modificar préstamo de equipo - Ingeniería");
    }

    public static void devolverEquipoIngenieria() {
        System.out.println("Función: Devolución de equipo - Ingeniería");
    }

    public static void buscarEquipoIngenieria() {
        System.out.println("Función: Buscar equipo - Ingeniería");
    }

    //provisionales para Diseño
    public static void registrarPrestamoDiseno() {
        System.out.println("Función: Registrar préstamo de equipo - Diseño");
    }

    public static void modificarPrestamoDiseno() {
        System.out.println("Función: Modificar préstamo de equipo - Diseño");
    }

    public static void devolverEquipoDiseno() {
        System.out.println("Función: Devolución de equipo - Diseño");
    }

    public static void buscarEquipoDiseno() {
        System.out.println("Función: Buscar equipo - Diseño");
    }

}
