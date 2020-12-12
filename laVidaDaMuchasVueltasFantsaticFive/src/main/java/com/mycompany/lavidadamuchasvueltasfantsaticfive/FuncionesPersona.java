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
        if (genero == true) {
            String nombresHombre[] = {"Eustaquio", "Fernando", "Sepher", "Ali", "Mariano", "Pato", "Xerxes", "Antón", "Claudio", "Koldo", "Patricio",
                "Alexios", "Manuel", "Rafael", "Mauricio", "Gregorio", "Íker", "Carlos", "Javier", "Francisco", "Nemesio", "Anselmo", "Miguel",
                "Ignacio", "Oscar", "Alex", "Juan", "Lander", "Agustin", "Cesar", "Natxo", "Nacho", "Javier", "Jorge", "Pablo", "Guillermo",
                "Pepe", "Gabriel", "Juan", "Francisco", "Franco", "Miguel", "Gonzalo", "Abrahán", "Luís", "Juan", "Rafael", "Alberto", "Raúl",
                "Abel", "Antonio", "Enrique", "Jose", "Adrian", "Dario", "Mateo", "Luis", "Alejandro", "Leandro", "Enzo", "Paco", "Amador",
                "Felix","Juan", "Carlos", "Luís", "Fernando",
                "Sergio", "Cándido", "Germán", "Jesús", "Miguel", "Diego Armando"};
            nombreSeleccionado
                    = nombresHombre[aleatorio.nextInt(nombresHombre.length)];
        } else {
            String nombresMujer[] = {"Cristobalina", "Paca", "Presentación", "Sarai", "Antonia", "Loli", "Juani", "Olga", "Susana", "Ruth", "Eustaquia",
                "Godofreda", "Josefina", "Ermerigilda", "Úrsula", "Angie", "Carla", "Isabel", "Marta", "Dolores", "Sonia", "Raquel", "Esther",
                "Erika", "Patrocinio", "Luisa", "Natalia", "Almudena", "Laura", "Kassandra", "Violeta", "María", "Mery", "Susana", "Daniela",
                "Juana", "Rebeca", "Eustaquia", "Herminia", "Sandra", "Lorena", "Maria", "Paula", "Ainhoa", "Mar", "Manoli", "Julia", "Rocio",
                "Marina", "Arelis", "Blanca", "Celeste", "Lola", "Dolores", "Yolanda", "Noemí", "Nuria", "Carmen", "Sheila", "Lucia", "Alia",
                "Alma", "Cristina", "Lucy", "Tamara", "Victoria","Ana", "María", "Manoli", "Rosalía",
                "Isabel", "Marie", "Jennifer", "Teresa", "Martirio", "Amelie"};
            nombreSeleccionado
                    = nombresMujer[aleatorio.nextInt(nombresMujer.length)];
        }
        return nombreSeleccionado;
    }

    public static String apellidoAleatorio() {
        java.util.Random aleatorio = new java.util.Random();
        String apellidos[] = {"Fernández", "Heredia", "Aguirre", "Del Piero", "Trump", "Obama", "Rajoy", "Pérez", "Reverte",
            "Rojas", "Muñoz", "de-la-Rosa", "de-la-O", "Guiérrez", "Molina", "López", "Romero", "Franco", "Martínez", "Fernández", "Bas",
            "Buttera", "Pajero", "Vega", "Guzmán", "Varo", "Páramos", "Pérez", "Vivo", "Piernas", "Moco", "Verde", "Pitágoras", "Pintor",
            "Delgado", "Vietes", "Portero", "Pestaña", "Guerrero", "Sardà", "Reyes", "Callado", "Santisteban", "Rubio", "Flores",
            "Enfriasopas", "Gallego", "Ventura", "Garcia", "Melero", "Morales", "Soldado", "Silva", "Hernández", "Ruiz", "Machís",
            "Duarte", "Díaz", "Vico", "Montoro", "Sacacuernos", "Cermuzo", "Cancamusa","Gómez", "Martínez", "Rodríguez", "Felix",
            "Houellebecq", "Cervantes", "Turing", "Curie", "Zambrano", "Maradona", "Curie",
            "Pantoja", "Foster-Wallace", "Steinbeck", "Boni-Niklison"};
        String apellidoSeleccionado
                = apellidos[aleatorio.nextInt(apellidos.length)];
        return apellidoSeleccionado;
    }

    public static byte valorEstadisticaAleatorio() {

        return (byte) (new Random().nextInt(101));

    }

    public static byte valorEstadisticaAleatorio(byte min) {
        return (byte) (new Random().nextInt((101 - min) + min));
    }

    public static byte valorEstadisticaAleatorio(byte min, byte max) {
        return (byte) (new Random().nextInt(max - min) + min);
    }

    public static String ImprimePersona(String nombre, String apellidosYo,
            boolean genero, byte sociabilidad, byte empatia, byte inteligencia, byte velocidad, byte fuerza, byte edad) {

        String persona = "";

        persona += (nombre + " " + apellidosYo + " " + ((genero
                ? "(Hombre)" : "(Mujer)")) + "\n");
        persona += ("Edad: " + edad) + "\n";
        persona += "----------------\n";
        persona += ("Sociabilidad:" + sociabilidad + "\n");
        persona += ("Empatia: " + empatia + "\n");
        persona += ("Inteligencia: " + inteligencia + "\n");
        persona += ("Velocidad: " + velocidad + "\n");
        persona += ("Fuerza: " + fuerza + "\n");

        return persona;
    }

 

}
