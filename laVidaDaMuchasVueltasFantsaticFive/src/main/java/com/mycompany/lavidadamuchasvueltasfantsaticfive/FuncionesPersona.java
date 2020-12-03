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
    
public static Boolean generoAleatorio() {
        java.util.Random aleatorio = new java.util.Random();
        boolean genero = aleatorio.nextBoolean();
        
        return genero;
    }

    public static String nombreAleatorio(Boolean genero) {

        java.util.Random aleatorio = new java.util.Random();
        String nombreSeleccionado = "";
        if (genero==true) {
            String nombresHombre[] = {"Juan", "Carlos", "Luís", "Fernando", "Sergio", "Cándido","Germán", "Jesús", "Miguel", "Diego Armando"};
            nombreSeleccionado = nombresHombre[aleatorio.nextInt(nombresHombre.length)];
        } else {
            String nombresMujer[] = {"Ana", "María", "Manoli", "Rosalía", "Isabel", "Marie", "Jennifer","Teresa","Martirio", "Amelie" };
            nombreSeleccionado = nombresMujer[aleatorio.nextInt(nombresMujer.length)];
        }
        return nombreSeleccionado;
    }

    public static String apellidoAleatorio() {
        java.util.Random aleatorio = new java.util.Random();
        String apellidos[] = {"Gómez", "Martínez", "Rodríguez", "Felix", "Houellebecq", "Cervantes", "Turing", "Curie", "Zambrano", "Maradona", "Curie", "Pantoja", "Foster-Wallace", "Steinbeck" };
        String apellidoSeleccionado = apellidos[aleatorio.nextInt(apellidos.length)];

        return apellidoSeleccionado;
    }
}
    
    
    
    
