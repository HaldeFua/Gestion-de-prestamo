package controller;
import model.EstudianteDiseno;
import model.EstudianteIngenieria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ControladorPersistencia {

    public LinkedList<EstudianteIngenieria> importartxtEstudianteIngenieria(String nombreArchivo) {

        LinkedList<EstudianteIngenieria> listaEstudiantes = new LinkedList<>();
        String rutaArchivo = "persistencia/" + nombreArchivo + ".txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;

            while ((line = br.readLine()) != null) {

                String[] campos = line.split(",");

                if (campos.length == 7) {
                    String cedula = campos[0].trim();
                    String nombre = campos[1].trim();
                    String apellido = campos[2].trim();
                    String telefono = campos[3].trim();
                    int serial = Integer.parseInt(campos[4].trim());
                    int numeroSemestre = Integer.parseInt(campos[5].trim());
                    double promedioAcumulado = Double.parseDouble(campos[6].trim());

                    EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, serial, numeroSemestre, promedioAcumulado);
                    listaEstudiantes.add(estudiante);
                } else {
                    System.out.println("Formato de línea incorrecto: " + line);
                }
            }

            System.out.println("¡Archivo de estudiantes importado exitosamente!");

        } catch (IOException e) {
            System.out.println("No hay estudiantes, registrarse para continuar");
        } catch (NumberFormatException e) {
            System.out.println("Error de formato numérico: " + e.getMessage());
        }

        return listaEstudiantes;
    }

    public LinkedList<EstudianteDiseno> importartxtEstudianteDisenio(String nombreArchivo) {

        LinkedList<EstudianteDiseno> listaEstudiantes = new LinkedList<>();
        String rutaArchivo = "persistencia/" + nombreArchivo + ".txt";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;

            while ((line = br.readLine()) != null) {

                String[] campos = line.split(",");

                if (campos.length == 7) {
                    String cedula = campos[0].trim();
                    String nombre = campos[1].trim();
                    String apellido = campos[2].trim();
                    String telefono = campos[3].trim();
                    int serial = Integer.parseInt(campos[4].trim());
                    String modalidadEstudio = campos[5].trim();
                    int cantidadAsignaturas = Integer.parseInt(campos[6].trim());

                    EstudianteDiseno estudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, serial, modalidadEstudio, cantidadAsignaturas);
                    listaEstudiantes.add(estudiante);
                } else {
                    System.out.println("Formato de línea incorrecto: " + line);
                }
            }

            System.out.println("¡Archivo de estudiantes importado exitosamente!");

        } catch (IOException e) {
            System.out.println("No hay estudiantes, registrarse para continuar");
        } catch (NumberFormatException e) {
            System.out.println("Error de formato numérico: " + e.getMessage());
        }

        return listaEstudiantes;
    }

    public void exportartxtEstudianteIngenieria(EstudianteIngenieria estudiante){
        String fileName = "persistencia/estudiantes_ingenieria.txt";

        // Creación y escritura en el archivo
        try (FileWriter writer = new FileWriter(fileName, true)) {
            String data = estudiante.getCedula() + "," + estudiante.getNombre() + "," +
                    estudiante.getApellido() + "," + estudiante.getTelefono() + "," +
                    estudiante.getSerial() + "," + estudiante.getNumeroSemestre() + "," +
                    estudiante.getPromedioAcumulado() + "\n";

            // Escribe los datos en el archivo
            writer.write(data);
            System.out.println("Datos guardados en " + fileName);

        } catch (IOException e) {
            System.out.println("El sistema está vacío, cree usuario para continuar");
        }

    }

    public void exportartxtEstudianteDisenio(EstudianteDiseno estudiante){
        String fileName = "persistencia/estudiantes_disenio.txt";

        // Creación y escritura en el archivo
        try (FileWriter writer = new FileWriter(fileName, true)) {
            String data = estudiante.getCedula() + "," + estudiante.getNombre() + "," +
                    estudiante.getApellido() + "," + estudiante.getTelefono() + "," +
                    estudiante.getSerial() + "," + estudiante.getModalidadEstudio() + "," +
                    estudiante.getCantidadAsignaturas() + "\n";

            // Escribe los datos en el archivo
            writer.write(data);
            System.out.println("Datos guardados en " + fileName);

        } catch (IOException e) {
            System.out.println("El sistema está vacío, cree usuario para continuar");
        }

    }

}
