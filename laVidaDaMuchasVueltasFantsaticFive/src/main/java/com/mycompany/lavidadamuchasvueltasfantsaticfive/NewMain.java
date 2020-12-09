/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavidadamuchasvueltasfantsaticfive;

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
        
        String nombrePapa = FuncionesPersona.nombreAleatorio(generoPapa);
        String nombreMama = FuncionesPersona.nombreAleatorio(generoMama);
        String apellidosMama = FuncionesPersona.apellidoAleatorio() + " " + FuncionesPersona.apellidoAleatorio();
        String apellidosPapa = FuncionesPersona.apellidoAleatorio() + " " + FuncionesPersona.apellidoAleatorio();
        int sociabilidadPapa = FuncionesPersona.valorEstadisticaAleatorio(50);
        int empatiaPapa =FuncionesPersona.valorEstadisticaAleatorio(50);
        int inteligenciaPapa = FuncionesPersona.valorEstadisticaAleatorio(50);
        int velocidadPapa = FuncionesPersona.valorEstadisticaAleatorio(50);
        int fuerzaPapa = FuncionesPersona.valorEstadisticaAleatorio(50);
        int sociabilidadMama = FuncionesPersona.valorEstadisticaAleatorio(50);
        int empatiaMama = FuncionesPersona.valorEstadisticaAleatorio(50);
        int inteligenciaMama = FuncionesPersona.valorEstadisticaAleatorio(50);
        int velocidadMama = FuncionesPersona.valorEstadisticaAleatorio(50);
        int fuerzaMama = FuncionesPersona.valorEstadisticaAleatorio(50);
        
        
        int fuerzaMaxYo = FuncionesPersona.valorEstadisticaAleatorio();
        int empatiaMaxYo = FuncionesPersona.valorEstadisticaAleatorio();
        int sociabilidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio();
        int inteligenciaMaxYo = FuncionesPersona.valorEstadisticaAleatorio();
        int velocidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio();
        

        
        Boolean generoYo = FuncionesPersona.generoAleatorio();
        System.out.println(generoYo?"mi genero es masculino":"mi genero es femenino");
            String nombreYo = FuncionesPersona.nombreAleatorio(generoYo);
            System.out.println(nombreYo);                               //por lo que no necesariamente congeniaria con el nombre
            String apellidosYo = FuncionesPersona.apellidoAleatorio();
            System.out.println(apellidosYo);
        
           String persona = FuncionesPersona.ImprimePersona(nombreYo, apellidosYo, generoYo, sociabilidadMaxYo, empatiaMaxYo, inteligenciaMaxYo, velocidadMaxYo, fuerzaMaxYo);
           System.out.println(persona);


    }