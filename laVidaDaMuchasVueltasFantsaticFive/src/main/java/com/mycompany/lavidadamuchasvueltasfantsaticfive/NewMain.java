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
        byte empatiaMaxYo = 0;
        byte sociabilidadMaxYo = 0;
        byte inteligenciaMaxYo = 0;
        byte fuerzaMaxYo = 0;
        byte velocidadMaxYo = 0;

        String nombrePapa = FuncionesPersona.nombreAleatorio(generoPapa);
        String nombreMama = FuncionesPersona.nombreAleatorio(generoMama);
        String apellidosMama = FuncionesPersona.apellidoAleatorio() + " "
                + FuncionesPersona.apellidoAleatorio();
        String apellidosPapa = FuncionesPersona.apellidoAleatorio() + " "
                + FuncionesPersona.apellidoAleatorio();

        byte inteligenciaPapa
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte velocidadPapa
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte fuerzaPapa = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte sociabilidadMama
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte sociabilidadPapa
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);

        byte empatiaMama = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte empatiaPapa = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);

        byte inteligenciaMama
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte velocidadMama
                = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte fuerzaMama = FuncionesPersona.valorEstadisticaAleatorio((byte) 50);
        byte edadMama = FuncionesPersona.valorEstadisticaAleatorio((byte) 30,
                (byte) 100);
        byte edadPapa = FuncionesPersona.valorEstadisticaAleatorio((byte) 30,
                (byte) 100);

        if (fuerzaMama > fuerzaPapa) {
            fuerzaMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) fuerzaPapa, (byte) fuerzaMama);
        } else {
            fuerzaMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) fuerzaMama, (byte) fuerzaPapa);
        }

        if (empatiaMama > empatiaPapa) {
            empatiaMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) empatiaPapa, (byte) empatiaMama);
        } else {
            empatiaMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) empatiaMama, (byte) empatiaPapa);
        }

        if (sociabilidadMama > sociabilidadPapa) {
            sociabilidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) sociabilidadPapa, (byte) sociabilidadMama);
        } else {
            sociabilidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) sociabilidadMama, (byte) sociabilidadPapa);
        }

        if (inteligenciaMama > inteligenciaPapa) {
            inteligenciaMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) inteligenciaPapa, (byte) inteligenciaMama);
        } else {
            inteligenciaMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) inteligenciaMama, (byte) inteligenciaPapa);
        }

        if (velocidadMama > velocidadPapa) {
            velocidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) velocidadPapa, (byte) velocidadMama);
        } else {
            velocidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) velocidadMama, (byte) velocidadPapa);
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
        byte iniciativaYo = 2;
        byte edadYo = 0;

        java.util.Random aleatorio = new java.util.Random();
        byte numHermanos = (byte) ((byte) aleatorio.nextInt(4) + 0);
        String hermano1 = "";
        String hermano2 = "";
        String hermano3 = "";
        byte edadHermano1 = 0;
        byte edadHermano2 = 0;
        byte edadHermano3 = 0;
        String nombreHermano1 = "";
        String nombreHermano2 = "";
        String nombreHermano3 = "";

        for (byte i = 0; i < (numHermanos + 1); i++) {

            if (i == 1) {

                Boolean generoHermano1 = FuncionesPersona.generoAleatorio();
                byte fuerzaHermano1 = FuncionesPersona.valorEstadisticaAleatorio();
                byte empatiaHermano1 = FuncionesPersona.valorEstadisticaAleatorio();
                byte sociabilidadHermano1
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte inteligenciaHermano1
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte velocidadHermano1
                        = FuncionesPersona.valorEstadisticaAleatorio();
                edadHermano1 = FuncionesPersona.valorEstadisticaAleatorio((byte) 0,
                        (byte) 30);
                String apellidosHermano1 = apellidosPapa.substring(0,
                        apellidosPapa.indexOf(" ")) + " " + apellidosMama.substring(0,
                        apellidosMama.indexOf(" "));
                nombreHermano1
                        = FuncionesPersona.nombreAleatorio((generoHermano1));

                hermano1 = FuncionesPersona.ImprimePersona(nombreHermano1, apellidosHermano1,
                        generoHermano1, sociabilidadHermano1, empatiaHermano1, inteligenciaHermano1, velocidadHermano1,
                        fuerzaHermano1, edadHermano1);

            }

            if (i == 2) {

                Boolean generoHermano2 = FuncionesPersona.generoAleatorio();
                byte fuerzaHermano2 = FuncionesPersona.valorEstadisticaAleatorio();
                byte empatiaHermano2 = FuncionesPersona.valorEstadisticaAleatorio();
                byte sociabilidadHermano2
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte inteligenciaHermano2
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte velocidadHermano2
                        = FuncionesPersona.valorEstadisticaAleatorio();
                edadHermano2 = FuncionesPersona.valorEstadisticaAleatorio((byte) 0,
                        (byte) 30);
                String apellidosHermano2 = apellidosPapa.substring(0,
                        apellidosPapa.indexOf(" ")) + " " + apellidosMama.substring(0,
                        apellidosMama.indexOf(" "));
                nombreHermano2
                        = FuncionesPersona.nombreAleatorio((generoHermano2));

                hermano2 = FuncionesPersona.ImprimePersona(nombreHermano2, apellidosHermano2,
                        generoHermano2, sociabilidadHermano2, empatiaHermano2, inteligenciaHermano2, velocidadHermano2,
                        fuerzaHermano2, edadHermano2);

            }

            if (i == 3) {

                Boolean generoHermano3 = FuncionesPersona.generoAleatorio();
                byte fuerzaHermano3 = FuncionesPersona.valorEstadisticaAleatorio();
                byte empatiaHermano3 = FuncionesPersona.valorEstadisticaAleatorio();
                byte sociabilidadHermano3
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte inteligenciaHermano3
                        = FuncionesPersona.valorEstadisticaAleatorio();
                byte velocidadHermano3
                        = FuncionesPersona.valorEstadisticaAleatorio();
                edadHermano3 = FuncionesPersona.valorEstadisticaAleatorio((byte) 0,
                        (byte) 30);
                String apellidosHermano3 = apellidosPapa.substring(0,
                        apellidosPapa.indexOf(" ")) + " " + apellidosMama.substring(0,
                        apellidosMama.indexOf(" "));
                nombreHermano3
                        = FuncionesPersona.nombreAleatorio((generoHermano3));

                hermano3 = FuncionesPersona.ImprimePersona(nombreHermano3, apellidosHermano3,
                        generoHermano3, sociabilidadHermano3, empatiaHermano3, inteligenciaHermano3, velocidadHermano3,
                        fuerzaHermano3, edadHermano3);

            }
        }

        Boolean generoYo = FuncionesPersona.generoAleatorio();
        String nombreYo = FuncionesPersona.nombreAleatorio(generoYo);
        String apellidosYo = apellidosPapa.substring(0, apellidosPapa.indexOf("")) + " " + apellidosMama.substring(0, apellidosMama.indexOf(" "));
        String persona = FuncionesPersona.ImprimePersona(nombreYo, apellidosYo,
                generoYo, sociabilidadYo, empatiaYo, inteligenciaYo, velocidadYo,
                fuerzaYo, edadYo);

        String papa = FuncionesPersona.ImprimePersona(nombrePapa, apellidosPapa,
                generoPapa, sociabilidadPapa, empatiaPapa, inteligenciaPapa, velocidadPapa,
                fuerzaPapa, edadPapa);

        String mama = FuncionesPersona.ImprimePersona(nombreMama, apellidosMama,
                generoMama, sociabilidadMama, empatiaMama, inteligenciaMama, velocidadMama,
                fuerzaMama, edadMama);

        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("\nElige una opción:\n\t" + ""
                + "1 - Imprimir mi información\n\t"
                + "2 - Imprimir información de mi familia\n\t"
                + "3 - Hacer cosas\n\t"
                + "4 - Crecer\n\t"
                + "5 - Terminar(morir)\n\t"
        );

        
            opcion = Byte.parseByte(sc.nextLine());
            if (opcion < 1 || opcion > 5) {
                System.out.println("No es un número válido: Pon uno entre 1 y 5");
            } else {

                switch (opcion) {

                    case 1:
                        System.out.println(persona);
                        break;

                    case 2:
                        System.out.println(mama);
                        System.out.println(papa);

                        if (numHermanos == 1) {
                            System.out.println(hermano1);
                        }
                        if (numHermanos == 2) {
                            System.out.println(hermano2);
                        }
                        if (numHermanos == 3) {
                            System.out.println(hermano3);
                        }
                        break;

                    case 4:

                        edadYo = (byte) (edadYo + 1);
                        edadMama = (byte) (edadMama + 1);
                        edadPapa = (byte) (edadPapa + 1);
                        edadHermano1 = (byte) (edadHermano1 + 1);
                        edadHermano2 = (byte) (edadHermano2 + 1);
                        edadHermano3 = (byte) (edadHermano3 + 1);
                        System.out.println(" ↑↑ Todos los personajes aumentan su edad en 1 AÑO ↑↑ ");
                        System.out.println("Tú ahora tienes: " + " " + edadYo + " " + "años");
                        System.out.println("Mama ahora tiene: " + " " + edadMama + " " + "años");
                        System.out.println("Papa ahora tiene: " + " " + edadPapa + " " + "años");
                        
                        
                        if (numHermanos == 1) {
                           System.out.println(nombreHermano1 + " " + "ahora tiene: " + " " + edadHermano1 + " " +"años");
                        }
                        if (numHermanos == 2) {
                             System.out.println(nombreHermano2 + " " + "ahora tiene: " + " " + edadHermano2 + " " + "años");
                        }
                        if (numHermanos == 3) {
                            System.out.println(nombreHermano3 + " " + "ahora tiene: " + " " + edadHermano3 + " " + "años");
                        }
                        break;

                    case 5:
                        System.out.println("☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠");
                        System.out.println("☠☠☠☠☠☠GAME OVER☠☠☠☠☠☠");
                        System.out.println("☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠☠");
                        break;

                }

            }
        }while (opcion!=5);
        
    }
}
