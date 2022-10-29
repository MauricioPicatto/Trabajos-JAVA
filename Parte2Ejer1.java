/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parte2ejer1;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Parte2Ejer1 {

	public static void main(String args[]) {
		 Scanner entrada = new Scanner(System.in);
		int nums;
		int h,m,s;
		System.out.println("Ingrese la cantidad de segundos:");
		nums = entrada.nextInt(); 
                h = nums/3600;
		m = nums/60-h*60;
		s = nums-m*60-h*3600;
		System.out.println(nums+" segundos son: "+h+" hora/s, "+m+" minuto/s, "+s+" segundo/s");
        }
		
}
