/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavidadamuchasvueltasfantsaticfive;

/**
 *
 * @author FantasticFive Corp
 * @version 0.0.1
 * 
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        //String generoYo = FuncionesPersona.generoAleatorio();
        Boolean generoYo = FuncionesPersona.generoAleatorio();
        System.out.println(generoYo);

       // System.out.println(generoYo);
        String nombreYo = FuncionesPersona.nombreAleatorio(generoYo);
        System.out.println(nombreYo);                               //por lo que no necesariamente congeniaria con el nombre
        String apellidosYo = FuncionesPersona.apellidoAleatorio();
        System.out.println(apellidosYo);
        
  
    }

    
}
