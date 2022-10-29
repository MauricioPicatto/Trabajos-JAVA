/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3;
import java.util.Scanner;
/**
 *
 * @author mauri
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int preciohora = 350;
        int horas;
        int sueldo;
        System.out.print("-Ingrese la cantidad de horas trabajadas; ");
        horas = entrada.nextInt();
        sueldo = preciohora*horas;
        System.out.println("El sueldo del trabajador por "+horas+" trabajadas es de: $"+sueldo);
    }
}
