/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavidadamuchasvueltasfantsaticfive;

import java.util.Random;

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
        String []nombreYo=NewMain.nombreAleatorio();
        System.out.println(nombreYo);
        String[] apellidosYo=NewMain.apellidoAleatorio();
        System.out.println(apellidosYo);
        String[] generoYo=NewMain.generoAleatorio();
        System.out.println(generoYo);

        
        String[] apellidoYo=NewMain.apellidoAleatorio();
        System.out.println(apellidoYo);
  
}
    public static String [] nombreAleatorio(){
       java.util.Random aleatorio= new java.util.Random();
       String nombre[]={"Carlos","Francisco","Jose"};
        System.out.println(nombre[aleatorio.nextInt(nombre.length)]);
        return nombre;
    }
    
    
    public static String[] apellidoAleatorio(){       
            java.util.Random aleatorio = new java.util.Random();
            String apellido[]={"Gómez","Martínez","Rodríguez"};              
            System.out.println(apellido[aleatorio.nextInt(apellido.length)]);

            return apellido; 
}
    
    
    public static String[] generoAleatorio(){
    java.util.Random aleatorio = new java.util.Random();
    String genero[]={"Hombre","Mujer"};
        System.out.println(genero[aleatorio.nextInt(genero.length)]);
    return genero; 
    }


}


