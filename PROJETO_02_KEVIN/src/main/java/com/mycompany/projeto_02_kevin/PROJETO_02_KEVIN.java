/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_02_kevin;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author k.andrade
 */
public class PROJETO_02_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();

        int num_aleatorio;
        int num_adivinhado;
        int tentativas = 0;
        
        num_aleatorio = aleatorio.nextInt(1, 100);
        
        System.out.println("ADIVINHE O NUMERO ENTRE 1 E 100");
        System.out.println("-------------------------");
        
        while (true)
        {
            System.out.print("Digite um numero: ");
            num_adivinhado = ler.nextInt();
            if (num_aleatorio > num_adivinhado) {
                System.out.println("O numero a ser adivinhado e maior.");
            }
            else {
                System.out.println("O numero a ser adivinhado e menor");
            }
            
            System.out.println("-------------------------");
            
            tentativas++;
            
            if (num_aleatorio == num_adivinhado) {
                break;
            }
        }
        
        System.out.println("O numero " + num_aleatorio + " esta correto");
        System.out.println("Tentativas: " + tentativas);
    }
}
