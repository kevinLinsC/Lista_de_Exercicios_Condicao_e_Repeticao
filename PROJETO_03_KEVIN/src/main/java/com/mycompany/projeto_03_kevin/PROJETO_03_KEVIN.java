/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_03_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_03_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int primeiro_num;
        int segundo_num;
        int escolha_sinal;
        int resultado = 0;
        
        System.out.print("Digite o primeiro numero: ");
        primeiro_num = ler.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        segundo_num = ler.nextInt();
        
        while (true) {
            System.out.print("Escolha um sinal: (1 - adicao; 2 - subtracao; 3 - multiplicacao; 4 - divisao): ");
            escolha_sinal = ler.nextInt();
            if (escolha_sinal >= 1 && escolha_sinal <= 4) {
                break;
            }
        }
        
        if (escolha_sinal == 1) {
            resultado = primeiro_num + segundo_num;
        }
        else if (escolha_sinal == 2) {
            resultado = primeiro_num - segundo_num;
        }
        else if (escolha_sinal == 3) {
            resultado = primeiro_num * segundo_num;
        }
        else { 
            resultado = primeiro_num / segundo_num;
        }
        
        System.out.println("O resultado foi: " + resultado);
    }
}