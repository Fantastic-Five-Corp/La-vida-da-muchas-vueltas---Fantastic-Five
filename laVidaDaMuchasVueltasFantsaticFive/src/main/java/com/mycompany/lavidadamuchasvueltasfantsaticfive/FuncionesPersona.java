/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavidadamuchasvueltasfantsaticfive;

/**
 *
 * @author CandidoV
 */
public class FuncionesPersona {
    
    public static String generoAleatorio() {
        java.util.Random aleatorio = new java.util.Random();
        String genero = aleatorio.nextBoolean() ? "Mujer" : "Hombre"; //mujer es un 1
        return genero;
    }

    public static String nombreAleatorio(String genero) {

        java.util.Random aleatorio = new java.util.Random();
        String nombreSeleccionado = "";
        if (genero.equals("Hombre")) {
            String nombresHombre[] = {"Juan", "Carlos", "Luís"};
            nombreSeleccionado = nombresHombre[aleatorio.nextInt(nombresHombre.length)];
        } else {
            String nombresMujer[] = {"Ana", "María", "Manoli"};
            nombreSeleccionado = nombresMujer[aleatorio.nextInt(nombresMujer.length)];
        }
        return nombreSeleccionado;
    }

    public static String apellidoAleatorio() {
        java.util.Random aleatorio = new java.util.Random();
        String apellidos[] = {"Gómez", "Martínez", "Rodríguez"};
        String apellidoSeleccionado = apellidos[aleatorio.nextInt(apellidos.length)];

        return apellidoSeleccionado;
    }
}
    
    
    
    