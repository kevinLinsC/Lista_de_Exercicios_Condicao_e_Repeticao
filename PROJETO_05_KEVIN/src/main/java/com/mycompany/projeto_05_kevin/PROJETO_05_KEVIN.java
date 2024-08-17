/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_05_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_05_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        int numero;
        int resultado;
        
        System.out.print("Digite um numero para ver sua tabuada: ");
        numero = ler.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
