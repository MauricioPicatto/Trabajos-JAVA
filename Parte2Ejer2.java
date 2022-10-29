/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parte2ejer2;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Parte2Ejer2 {

   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dinero;
        int cant1 = 0,cant2 = 0,cant3 = 0,cant4 = 0;
        
        System.out.print("Ingrege el dinero a extraer: ");
        dinero = entrada.nextInt();
        System.out.println("Usted extrajo $"+dinero);
        if(dinero >= 1000){
        cant1=dinero/1000;
        dinero=dinero-(1000*cant1);
        }
        if (dinero >= 500){
        cant2=dinero/500;
        dinero=dinero-(500*cant2);
        }
        if (dinero >= 200){
        cant3=dinero/200;
        dinero=dinero-(200*cant3);
        }
        if (dinero >= 100){
        cant4=dinero/100;
        dinero=dinero-(100*cant4);
        }
        System.out.println("Se le entrego:");
        System.out.println(cant1+" billetes de $1000");
        System.out.println(cant2+" billetes de $500");
        System.out.println(cant3+" billetes de $200");
        System.out.println(cant4+" billetes de $100");
   }       
}
