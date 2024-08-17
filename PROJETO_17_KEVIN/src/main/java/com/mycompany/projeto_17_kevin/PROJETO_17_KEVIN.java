/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_17_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_17_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String frase;
        char letra;
        String vogais = "aeiouAEIOU";
        int num_vogais = 0;
        
        System.out.print("Escreva uma frase: ");
        frase = ler.nextLine();
        
        for (int i = 0; i <= frase.length() - 1; i++) {
            letra = frase.charAt(i);
            if (vogais.indexOf(letra) != -1) {
                num_vogais++;
            }
        }
        
        System.out.println("A quantidade de vogais na sua frase e: " + num_vogais);
    }
}
