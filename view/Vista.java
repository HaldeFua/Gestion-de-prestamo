package view;
import controller.Menu;
import java.util.Scanner;

public abstract class Vista {

    static Scanner sc = new Scanner(System.in);

    public static void menuPrincipal() {
        while (true) {
            System.out.println("\n---- MENÚ PRINCIPAL ----");
            System.out.println("1. Estudiantes de Ingeniería");
            System.out.println("2. Estudiantes de Diseño");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> menuIngenieria();
                case "2" -> menuDiseno();
                case "3" -> {
                    System.out.println("Saliendo del sistema...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }

    public static void menuIngenieria() {
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
    public static void menuDiseno() {
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
                case "1" -> System.out.println("registrarPrestamoDiseno()");
                case "2" -> System.out.println("modificarPrestamoDiseno()");
                case "3" -> System.out.println("devolverEquipoDiseno()");
                case "4" -> System.out.println("buscarEquipoDiseno()");
                case "5" -> {
                    return;
                }
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }

}
