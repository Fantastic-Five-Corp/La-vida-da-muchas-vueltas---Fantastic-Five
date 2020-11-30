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
<<<<<<< HEAD
        String generoYo = NewMain.generoAleatorio();
        System.out.println(generoYo);
        String nombreYo = NewMain.nombreAleatorio(generoYo);
        System.out.println(nombreYo);                               //por lo que no necesariamente congeniaria con el nombre
        String apellidosyo = NewMain.apellidoAleatorio();
        System.out.println(apellidosyo);
=======
        String nombreYo = NewMain.nombreAleatorio();
        System.out.println(nombreYo);
        String apellidosYo = NewMain.apellidoAleatorio();
        System.out.println(apellidosYo);
>>>>>>> 67b3c9abf8f7bc1c74f67cc2b1bcf6051dd0a9c4
    }

    public static String generoAleatorio() {
        java.util.Random aleatorio = new java.util.Random();
        String genero = aleatorio.nextBoolean() ? "Mujer" : "Hombre"; //mujer es un 1
        return genero;
    }

    public static String nombreAleatorio(String genero) {

        java.util.Random aleatorio = new java.util.Random();
        String nombreSeleccionado = "";
        if (genero.equals("Hombre")) {
            String nombresHombre[] = {"Juan", "Pepe", "Luís"};
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
