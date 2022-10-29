/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parte2ejer3;

import java.util.Scanner;

/**
 INGRESA UNA HORA EN 34 HORAS Y CAMBIA A FORMATO DE 12 HORAS
 */
public class Parte2Ejer3 {

   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora, min;
                
         System.out.print("Ingrege la Hora en formato 24 horas: ");
        hora = entrada.nextInt();
         System.out.print("Ingrege los Minutos: ");
        min = entrada.nextInt();
         if (hora>12){
             hora=hora-12;
             System.out.println("Ingreso la hora: "+hora+":"+min+" PM");
         }
         else {
            System.out.println("Ingreso la hora: "+hora+":"+min+" AM");
         }        
}
}