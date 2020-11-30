/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavidadamuchasvueltasfantsaticfive;

/**
 *
 * @author sergi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreYo = NewMain.nombreAleatorio();
        System.out.println(nombreYo);
        String apellidosYo = NewMain.apellidoAleatorio();
        System.out.println(apellidosYo);
    }

    public static String nombreAleatorio() {
        java.util.Random aleatorio = new java.util.Random();
        String nombres[] = {"Carlos", "Francisco", "Jose"};
        String nombreSeleccionado = nombres[aleatorio.nextInt(nombres.length)];
        return nombreSeleccionado;
    }

    public static String apellidoAleatorio() {
        java.util.Random aleatorio = new java.util.Random();
        String apellidos[] = {"Gómez", "Martínez", "Rodríguez"};
        String apellidoSeleccionado = apellidos[aleatorio.nextInt(apellidos.length)];

        return apellidoSeleccionado;
    }
}
