package controller;
import model.EstudianteIngenieria;

import java.util.Scanner;

public class ControladorEstudiantesIngenieria implements Controlador{

    Scanner sc = new Scanner(System.in);
    ControladorPersistencia persistencia = new ControladorPersistencia();

    @Override
    public void registrar() {
        String cedula;
        String nombre;
        String apellido;
        String telefono;
        int serial;
        int numeroSemestre;
        float promedioAcumulado;

        System.out.println("Registrar una cedula:");
        cedula = sc.nextLine();

        System.out.println("Registrar un nombre:");
        nombre = sc.nextLine();

        System.out.println("Registrar una apellido:");
        apellido = sc.nextLine();

        System.out.println("Registrar una telefono:");
        telefono = sc.nextLine();

        System.out.println("Registrar una serial:");
        serial = sc.nextInt();

        System.out.println("Registrar una numeroSemestre:");
        numeroSemestre = sc.nextInt();

        System.out.println("Registrar una promedioAcumulado:");
        promedioAcumulado = sc.nextInt();

        EstudianteIngenieria estudianteIngenieria = new EstudianteIngenieria(cedula,nombre,apellido,telefono,serial,numeroSemestre,promedioAcumulado);
        persistencia.exportartxtEstudianteIngenieria(estudianteIngenieria);
    }

    @Override
    public void modificar() {

    }

    @Override
    public void eliminar() {

    }

    @Override
    public void buscar() {

    }
}
