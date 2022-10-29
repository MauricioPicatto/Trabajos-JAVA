/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2;
import java.util.Scanner;
/**
 *
 * @author mauri
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double n1; 
        double n2; 
        double n3;
        double prom;
        System.out.print("Ingrege el nombre del alumno: ");
        nombre = entrada.next();
        System.out.print("Ingrese la nota 1: ");
        n1 = entrada.nextDouble(); 
        System.out.print("Ingrese la nota 2: ");
        n2 = entrada.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        n3 = entrada.nextDouble();
        prom = (n1+n2+n3)/3;
        System.out.println("El promedio de "+nombre+" es: "+prom);
        
        
    }
}
