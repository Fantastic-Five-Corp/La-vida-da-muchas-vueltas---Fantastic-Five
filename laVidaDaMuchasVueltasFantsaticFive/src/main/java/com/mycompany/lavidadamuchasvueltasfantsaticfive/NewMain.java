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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        //String generoYo = FuncionesPersona.generoAleatorio();
        boolean generoMama = false;
        boolean generoPapa = true;
        boolean vivoYo=true;
        boolean vivoMama=true;
        boolean vivoPapa=true;
        
       
        
        String nombrePapa = FuncionesPersona.nombreAleatorio(generoPapa);
        String nombreMama = FuncionesPersona.nombreAleatorio(generoMama);
        String apellidosMama = FuncionesPersona.apellidoAleatorio() + " " + FuncionesPersona.apellidoAleatorio();
        String apellidosPapa = FuncionesPersona.apellidoAleatorio() + " " + FuncionesPersona.apellidoAleatorio();
        byte sociabilidadPapa = FuncionesPersona.valorEstadisticaAleatorio((byte)50);
        byte empatiaPapa =FuncionesPersona.valorEstadisticaAleatorio((byte)50);
        byte inteligenciaPapa = FuncionesPersona.valorEstadisticaAleatorio((byte)50);
        byte velocidadPapa = FuncionesPersona.valorEstadisticaAleatorio((byte)50);
        byte fuerzaPapa = FuncionesPersona.valorEstadisticaAleatorio((byte)50);
        byte edadPapa = FuncionesPersona.valorEstadisticaAleatorio((byte)30, (byte)100);
        byte sociabilidadMama = FuncionesPersona.valorEstadisticaAleatorio((byte)50);
        byte empatiaMama = FuncionesPersona.valorEstadisticaAleatorio((byte)50);
        byte inteligenciaMama = FuncionesPersona.valorEstadisticaAleatorio((byte)50);
        byte velocidadMama = FuncionesPersona.valorEstadisticaAleatorio((byte)50);
        byte fuerzaMama = FuncionesPersona.valorEstadisticaAleatorio((byte)50);
        byte edadMama=FuncionesPersona.valorEstadisticaAleatorio((byte)30, (byte)100);
        
     
        byte fuerzaMaxYo = FuncionesPersona.valorEstadisticaAleatorio();
        byte empatiaMaxYo = FuncionesPersona.valorEstadisticaAleatorio();
        byte sociabilidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio();
        byte inteligenciaMaxYo = FuncionesPersona.valorEstadisticaAleatorio();
        byte velocidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio();
        byte edadYo=0;
        
        Random hermanos = new Random();
        byte numHermanos = (byte) ((byte) hermanos.nextInt (4)+0);
        
        if (numHermanos==1){
        if (numHermanos==2){
        if (numHermanos==3){
        byte fuerzaMaxHermano1 = FuncionesPersona.valorEstadisticaAleatorio();
        byte empatiaMaxHermano1 = FuncionesPersona.valorEstadisticaAleatorio();
        byte sociabilidadHermano1 = FuncionesPersona.valorEstadisticaAleatorio();
        byte inteligenciaHermano1 = FuncionesPersona.valorEstadisticaAleatorio();
        byte velocidadMaxHermano1 = FuncionesPersona.valorEstadisticaAleatorio();
        byte edadHermano1=0;
        System.out.println(inteligenciaHermano1+"polla1");
        }
    
        byte fuerzaMaxHermano2 = FuncionesPersona.valorEstadisticaAleatorio();
        byte empatiaMaxHermano2 = FuncionesPersona.valorEstadisticaAleatorio();
        byte sociabilidadHermano2 = FuncionesPersona.valorEstadisticaAleatorio();
        byte inteligenciaHermano2 = FuncionesPersona.valorEstadisticaAleatorio();
        byte velocidadMaxHermano2 = FuncionesPersona.valorEstadisticaAleatorio();
        byte edadHermano2=0;
        System.out.println(inteligenciaHermano2+"polla2");
        }
        
        byte fuerzaMaxHermano3 = FuncionesPersona.valorEstadisticaAleatorio();
        byte empatiaMaxHermano3 = FuncionesPersona.valorEstadisticaAleatorio();
        byte sociabilidadHermano3 = FuncionesPersona.valorEstadisticaAleatorio();
        byte inteligenciaHermano3 = FuncionesPersona.valorEstadisticaAleatorio();
        byte velocidadMaxHermano3 = FuncionesPersona.valorEstadisticaAleatorio();
        byte edadHermano3=0;
        System.out.println(inteligenciaHermano3 +"polla3");

        }
       
        
        Boolean generoYo = FuncionesPersona.generoAleatorio();
       
        String nombreYo = FuncionesPersona.nombreAleatorio(generoYo);
        String apellidosYo = apellidosPapa.substring(0, apellidosPapa.indexOf(" ")) + " " + apellidosMama.substring(0, apellidosMama.indexOf(" "));
        String persona = FuncionesPersona.ImprimePersona(nombreYo, apellidosYo, generoYo, sociabilidadMaxYo, empatiaMaxYo, inteligenciaMaxYo, velocidadMaxYo, fuerzaMaxYo);
           
        
        System.out.println(persona);
        
         System.out.println(apellidosMama); 
         System.out.println(apellidosPapa);
         System.out.println(apellidosYo);
         
           

    }

        }

   