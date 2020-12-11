/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lavidadamuchasvueltasfantsaticfive;

import java.util.Scanner;

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
        boolean vivoYo = true;
        boolean vivoMama = true;
        boolean vivoPapa = true;

        byte opcion;

        String nombrePapa = FuncionesPersona.nombreAleatorio(generoPapa);
        String nombreMama = FuncionesPersona.nombreAleatorio(generoMama);
        String apellidosMama = FuncionesPersona.apellidoAleatorio() + " "
                + FuncionesPersona.apellidoAleatorio();
        String apellidosPapa = FuncionesPersona.apellidoAleatorio() + " "
                + FuncionesPersona.apellidoAleatorio();
        byte sociabilidadPapa
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte empatiaPapa = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte inteligenciaPapa
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte velocidadPapa
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte fuerzaPapa = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte edadPapa = FuncionesPersona.valorEstadisticaAleatorio((byte) 30,
                (byte) 100);
        byte sociabilidadMama
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte empatiaMama = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte inteligenciaMama
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte velocidadMama
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte fuerzaMama = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte edadMama = FuncionesPersona.valorEstadisticaAleatorio((byte) 30,
                (byte) 100);
        
        
        
        if(fuerzaMama > fuerzaPapa) {
        byte fuerzaMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte)fuerzaPapa, (byte) fuerzaMama);
        }else{
           byte fuerzaMaxYo = FuncionesPersona.valorEstadisticaAleatorio ((byte) fuerzaMama, (byte) fuerzaPapa);
        }
        
        if (empatiaMama>empatiaPapa) {
        byte empatiaMaxYo = FuncionesPersona.valorEstadisticaAleatorio ((byte) empatiaPapa, (byte) empatiaMama);
        }else{ 
        byte empatiaMaxYo = FuncionesPersona.valorEstadisticaAleatorio ((byte) empatiaMama, (byte) empatiaPapa);
        }
        
        if (sociabilidadMama>sociabilidadPapa) {
        byte sociabilidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio ((byte) sociabilidadPapa, (byte) sociabilidadMama);
        }else{ 
        byte sociabilidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio ((byte) sociabilidadMama, (byte) sociabilidadPapa);
        }
        
        
          if (inteligenciaMama>inteligenciaPapa) {
        byte inteligenciaMaxYo = FuncionesPersona.valorEstadisticaAleatorio ((byte) inteligenciaPapa, (byte) inteligenciaMama);
        }else{ 
        byte inteligenciaMaxYo = FuncionesPersona.valorEstadisticaAleatorio ((byte) inteligenciaMama, (byte) inteligenciaPapa);
        }
        
          if (velocidadMama>velocidadPapa) {
        byte velocidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio ((byte) velocidadPapa, (byte) velocidadMama);
        }else{ 
        byte velocidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio ((byte) velocidadMama, (byte) velocidadPapa);
        }
        
        
        
        
   
        
        
        
        byte sociabilidadYo = FuncionesPersona.valorEstadisticaAleatorio((byte) 0,
                (byte) 5);
        byte empatiaYo = FuncionesPersona.valorEstadisticaAleatorio((byte) 0,
                (byte) 5);
        byte inteligenciaYo = FuncionesPersona.valorEstadisticaAleatorio((byte) 0,
                (byte) 5);
        byte velocidadYo = FuncionesPersona.valorEstadisticaAleatorio((byte) 0,
                (byte) 5);
        byte fuerzaYo = FuncionesPersona.valorEstadisticaAleatorio((byte) 0,
                (byte) 5);
        byte edadYo = 0;

        java.util.Random aleatorio = new java.util.Random();
        byte numHermanos = (byte) ((byte) aleatorio.nextInt(4) + 0);

        for (byte i = 0; i < (numHermanos + 1); i++) {

            if (i == 1) {
                byte fuerzaHermano1 = FuncionesPersona.valorEstadisticaAleatorio();
                byte empatiaHermano1 = FuncionesPersona.valorEstadisticaAleatorio();
                byte sociabilidadHermano1
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte inteligenciaHermano1
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte velocidadHermano1
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte edadHermano1 = FuncionesPersona.valorEstadisticaAleatorio((byte) 0,
                        (byte) 30);
                String apellidosHermano1 = apellidosPapa.substring(0,
                        apellidosPapa.indexOf(" ")) + " " + apellidosMama.substring(0,
                        apellidosMama.indexOf(" "));
                String nombreHermano1
                        = FuncionesPersona.nombreAleatorio(FuncionesPersona.generoAleatorio());

            }

            if (i == 2) {
                byte fuerzaHermano2 = FuncionesPersona.valorEstadisticaAleatorio();
                byte empatiaHermano2 = FuncionesPersona.valorEstadisticaAleatorio();
                byte sociabilidadHermano2
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte inteligenciaHermano2
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte velocidadHermano2
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte edadHermano2 = FuncionesPersona.valorEstadisticaAleatorio((byte) 0,
                        (byte) 30);
                String apellidos2 = apellidosPapa.substring(0, apellidosPapa.indexOf("")) + " " + apellidosMama.substring(0, apellidosMama.indexOf(" "));
                String nombreHermano2
                        = FuncionesPersona.nombreAleatorio(FuncionesPersona.generoAleatorio());

            }

            if (i == 3) {
                byte fuerzaHermano3 = FuncionesPersona.valorEstadisticaAleatorio();
                byte empatiaHermano3 = FuncionesPersona.valorEstadisticaAleatorio();
                byte sociabilidadHermano3
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte inteligenciaHermano3
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte velocidadHermano3
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte edadHermano3 = FuncionesPersona.valorEstadisticaAleatorio((byte) 0,
                        (byte) 30);
                String apellidosHermano3 = apellidosPapa.substring(0,
                        apellidosPapa.indexOf(" ")) + " " + apellidosMama.substring(0,
                        apellidosMama.indexOf(" "));
                String nombreHermano3
                        = FuncionesPersona.nombreAleatorio(FuncionesPersona.generoAleatorio());

            }
        }

        Boolean generoYo = FuncionesPersona.generoAleatorio();
        String nombreYo = FuncionesPersona.nombreAleatorio(generoYo);
        String apellidosYo = apellidosPapa.substring(0, apellidosPapa.indexOf("")) + " " + apellidosMama.substring(0, apellidosMama.indexOf(" "));
        String persona = FuncionesPersona.ImprimePersona(nombreYo, apellidosYo,
                generoYo, sociabilidadYo, empatiaYo, inteligenciaYo, velocidadYo,
                fuerzaYo, edadYo);
        
       

        Scanner sc = new Scanner(System.in);

        System.out.println("\nElige una opción:\n\t" + ""
                + "1 - Imprimir mi información\n\t"
                + "2 - Imprimir información de mi familia\n\t"
                + "3 - Hacer cosas\n\t"
                + "4 - Crecer\n\t"
                + "5 - Terminar(morir)\n\t"
        );
        do {
            opcion = Byte.parseByte(sc.nextLine());
            if (opcion < 1 || opcion > 6) {
                System.out.println("No es un número válido: Pon uno entre 1 y 5");
            }
        } while (opcion < 1 || opcion > 5);

        System.out.println(persona);
        System.out.println(hermano);

    }
}
