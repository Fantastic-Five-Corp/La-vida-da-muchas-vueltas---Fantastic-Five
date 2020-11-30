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
<<<<<<< Updated upstream
        String []nombreyo=NewMain.nombreAleatorio();
        System.out.println(nombreyo);
        String[] apellidosyo=NewMain.apellidoAleatorio();
        System.out.println(apellidosyo);
        String[] generoyo=NewMain.generoAleatorio();
        System.out.println(generoyo);
=======
        
        String[] apellidoYo=NewMain.apellidoAleatorio();
        System.out.println(apellidoYo);
        
>>>>>>> Stashed changes
        //probando si los comentarios también hacen push hola que tal todo bien DEP Maradona
        // a mí me va bien se actualizan los cambios de netbeans y tal 
     
      
}
    public static String [] nombreAleatorio(){
       java.util.Random aleatorio= new java.util.Random();
       String nombre[]={"Carlos","Francisco","Jose"};
        System.out.println(" "+nombre[aleatorio.nextInt(nombre.length)]);
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
        System.out.println(" "+genero[aleatorio.nextInt(genero.length)]);
    return genero; 
    }


}


