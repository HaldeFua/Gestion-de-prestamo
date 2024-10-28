package controller;
import model.EstudianteIngenieria;

import java.io.FileWriter;
import java.io.IOException;

public class ControladorPersistencia {

    public void importartxt(){

    }

    public void exportartxtEstudianteIngenieria(EstudianteIngenieria estudiante){
        String fileName = "estudiantes_ingenieria.txt";

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
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }

    }

}
