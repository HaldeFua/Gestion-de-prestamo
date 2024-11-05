package controller;
import model.ComputadorPortatil;
import model.DetallePrestamoIng;
import model.EstudianteIngenieria;

import java.util.Iterator;
import java.util.LinkedList;

public class ControladorComputador {


    static ControladorPersistencia persistencia = new ControladorPersistencia();
    /*
    "1. Registrar préstamo de equipo\n" +
    "2. Modificar préstamo de equipo (por serial o cédula)\n" +
    "3. Devolución de equipo (por serial o cédula)\n" +
    "4. Buscar equipo (por serial o cédula)\n" +
    */

    public LinkedList<ComputadorPortatil> traerLista(){
        return persistencia.importartxtComputador("computador");
    }

    public void mostrar (LinkedList<ComputadorPortatil> computadores){
        for (ComputadorPortatil computador: computadores){
            System.out.println(computadores.indexOf(computador) + ". " + computador);
        }
    }

    public void remover(ComputadorPortatil computadorPortatil){

        LinkedList<ComputadorPortatil> computadores = persistencia.importartxtComputador("computador");

        Iterator<ComputadorPortatil> iterator = computadores.iterator();
        while (iterator.hasNext()) {
            ComputadorPortatil unComputador = iterator.next();
            if (unComputador.equals(computadores)) {
                iterator.remove();
            }
        }

        persistencia.exportartxtComputador(computadores);

    }

}
