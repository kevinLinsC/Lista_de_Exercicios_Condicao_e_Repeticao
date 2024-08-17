/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15_kevin;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class PROJETO_15_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num;
        int fatorial = 1;
        
        System.out.print("Digite um numero para saber seu fatorial: ");
        num = ler.nextInt();
        
        for (int i = num; i >= 1; i--) {
            if (num != 0) {
                fatorial *= i;
            }
            else {
                fatorial = 1;
            }
        }
        
        System.out.println("O fatorial de " + num + " e: " + fatorial);
    }
}
