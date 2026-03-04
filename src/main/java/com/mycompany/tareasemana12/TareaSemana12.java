/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tareasemana12;

import java.util.Scanner;

/**
 *
 * @author Cristian Toaquiza
 */
public class TareaSemana12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Crear una matriz 3x4 llamada asientos [cite: 181, 186]
        int[][] asientos = new int[3][4];
        
        // 2. Pedir al usuario la fila y la columna del asiento a reservar [cite: 13, 14]
        System.out.println("--- Sistema de Reserva de Cine ---");
        System.out.print("Ingrese fila (0 a 2): ");
        int f = sc.nextInt();
        
        System.out.print("Ingrese columna (0 a 3): ");
        int c = sc.nextInt();
        
        // 3. Marcar el asiento como reservado [cite: 187]
        // Se valida que la posición exista para evitar errores en el programa
        if (f >= 0 && f < 3 && c >= 0 && c < 4) {
            asientos[f][c] = 1;
            System.out.println("¡Asiento reservado con éxito!\n");
        } else {
            System.out.println("Error: La fila o columna ingresada no existe.\n");
        }
        
        // 4. Mostrar la matriz completa en formato tabla usando bucles anidados [cite: 19, 20, 28]
        System.out.println("Estado actual de la sala (0=Libre, 1=Reservado):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                // Se usa \t para dar espacio de tabla como en tus ejemplos 
                System.out.print(asientos[i][j] + "\t");
            }
            System.out.println(); // Salto de línea después de cada fila [cite: 23, 39]
        }
    }
}