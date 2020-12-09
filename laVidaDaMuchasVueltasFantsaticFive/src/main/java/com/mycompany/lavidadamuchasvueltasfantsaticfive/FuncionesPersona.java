/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavidadamuchasvueltasfantsaticfive;

import java.util.Random;

/**
 *
 * @author FantasticFive Corp
 * 
 * @author Sergio Martínez Félix 
 * @author Germán Pascual 
 * @author Cándido Vidal 
 * @author Fernando Claudio Moreno 
 * 
 * @version 0.0.2
 * 
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
    
    
    public static int valorEstadisticaAleatorio(){
    
    Random aleatorio = new Random();
    int numeroAleatorio=aleatorio.nextInt((101-0));
    
    return numeroAleatorio; 
    }
    
     public static int valorEstadisticaAleatorio(int min){
   
    Random aleatorio = new Random();
    int numeroAleatorio=aleatorio.nextInt((101-min)+min);
    
    return numeroAleatorio; 
    
    
    }
     
     public static int valorEstadisticaAleatorio(int min, int max){
   
    Random aleatorio = new Random();
    int numeroAleatorio=aleatorio.nextInt(max-min)+min;
    
    return numeroAleatorio; 
    } 
     
     public static String ImprimePersona (String nombre, String apellidos, boolean genero, int sociabilidad, int empatia, int inteligencia, int velocidad,int fuerza){
     
         String persona = "";
         
         persona += (nombre + " " + apellidos + ((genero ? "(Hombre)":"(Mujer)")) + "\n");
         persona += "----------------\n";
         persona += ("Sociabilidad:" + sociabilidad +"\n");
         persona += ("empatia: " + empatia+"\n");
         persona += ("inteligencia: " + inteligencia+"\n");
         persona += ("velocidad: " + velocidad+"\n");
         persona += ("fuerza: " + fuerza+"\n");
         
         
       
        
         return persona;
         
         
     }
}
    
