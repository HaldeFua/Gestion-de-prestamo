import controller.Menu;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        menuPrincipal();
    }

    public static void menuPrincipal() {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n---- MENÚ PRINCIPAL ----");
            System.out.println("1. Estudiantes de Ingeniería");
            System.out.println("2. Estudiantes de Diseño");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
           
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> menu.menuIngenieria();
                case "2" -> menu.menuDiseno();
                case "3" -> {
                    System.out.println("Saliendo del sistema...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }


}
