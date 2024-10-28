package controller;
import view.Vista;
import java.util.Scanner;

public abstract class ControladorMain {

    //primer programa de la app
    public static void run(){
        Scanner sc = new Scanner(System.in);
        //Primera vista del programa, el usuario elige entre iniciar sesión o registrarse
        int controlador = 0;
        do
        {
            System.out.println(Vista.inicio());
            controlador = sc.nextInt();

            if(controlador ==1){
                int controlador2 = 0;
                do {
                    System.out.println("Seleccionar una opción:\n"
                            +"1 Estudiante Ingenieria\n" +
                            "2 Estudiante Diseño\n" +
                            "3 Salir");
                    controlador2 = sc.nextInt();
                    if(controlador2 == 1){
                        ControladorEstudiantesIngenieria controladorEstudiantesIngenieria = new ControladorEstudiantesIngenieria();
                        controladorEstudiantesIngenieria.registrar();
                    }
                }while(controlador2 != 3);
            }
        }while(controlador!=3);
    }



}
