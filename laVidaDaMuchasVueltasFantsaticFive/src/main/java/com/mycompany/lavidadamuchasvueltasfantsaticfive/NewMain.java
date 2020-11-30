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
        String []nombreyo=NewMain.nombreAleatorio();
        System.out.println(nombreyo);
        String apellidosyo=NewMain.apellidoAleatorio();
        System.out.println(apellidosyo);
=======
        String []nombreYo=NewMain.nombreAleatorio();
        System.out.println(nombreYo);
        String[] apellidosYo=NewMain.apellidoAleatorio();
        System.out.println(apellidosYo);
        String[] generoYo=NewMain.generoAleatorio();
        System.out.println(generoYo);

>>>>>>> 7d267f30846a2f720a68b61ef2e0e2957d9fde76
        
        String[] apellidoYo=NewMain.apellidoAleatorio();
        System.out.println(apellidoYo);
  
}
    public static String [] nombreAleatorio(){
       java.util.Random aleatorio= new java.util.Random();
       String nombre[]={"Carlos","Francisco","Jose"};
        System.out.println(nombre[aleatorio.nextInt(nombre.length)]);
        return nombre;
    }
<<<<<<< HEAD
public static String apellidoAleatorio(){       
            java.util.Random aleatorio = new java.util.Random();
            String apellidos[]={"Gómez","Martínez","Rodríguez"};              
            String apellidoSeleccionado = apellidos[aleatorio.nextInt(apellidos.length)];

            
            
            
            return apellidoSeleccionado; 
=======
    
    
    public static String[] apellidoAleatorio(){       
            java.util.Random aleatorio = new java.util.Random();
            String apellido[]={"Gómez","Martínez","Rodríguez"};              
            System.out.println(apellido[aleatorio.nextInt(apellido.length)]);

            return apellido; 
>>>>>>> 7d267f30846a2f720a68b61ef2e0e2957d9fde76
}
    
    
    public static String[] generoAleatorio(){
    java.util.Random aleatorio = new java.util.Random();
    String genero[]={"Hombre","Mujer"};
        System.out.println(genero[aleatorio.nextInt(genero.length)]);
    return genero; 
    }


}


