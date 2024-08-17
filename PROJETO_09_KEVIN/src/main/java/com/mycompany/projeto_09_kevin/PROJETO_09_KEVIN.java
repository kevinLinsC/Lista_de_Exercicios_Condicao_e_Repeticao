/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_09_kevin;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class PROJETO_09_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num;
        int divisiveis = 0;
        
        System.out.print("Digite um numero: ");
        num = ler.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisiveis++;
            }
        }
        
        if (divisiveis == 2) {
            System.out.println("Numero e primo.");
        }
        else {
            System.out.println("Numero nao e primo.");
        }
    }
}
