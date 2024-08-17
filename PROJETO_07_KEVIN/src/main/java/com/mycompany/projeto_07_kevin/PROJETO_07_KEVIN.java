/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_07_kevin;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class PROJETO_07_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num;
        int pares = 0;
        int impares = 0;
        
        while (true) {
            System.out.print("Digite um numero: ");
            num = ler.nextInt();
            
            if (num >= 0) {
                break;
            }
        }
        
        
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                pares++;
            }
            else {
                impares++;
            }
        }
        
        System.out.println("A quantidade de numeros pares foi: " + pares);
        System.out.println("A quantidade de numeros impares foi: " + impares);
    }
}
