/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_16_kevin;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class PROJETO_16_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String frase;
        String frase_contrario = "";
        
        System.out.print("Digite uma frase: ");
        frase = ler.nextLine();
        
        for (int i = frase.length() - 1; i >= 0; i--) {
            frase_contrario += frase.charAt(i);
        }
        
        if (frase_contrario.equals(frase)) {
            System.out.println("A frase e um palindromo.");
        }
        else {
            System.out.println("A frase nao e um palindromo");
        }
        
        System.out.println("Frase ao contrario: " + frase_contrario);
    }
}
