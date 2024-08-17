/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_11_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_11_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float temperatura;
        float temperatura_convertida;
        String unidade;
        
        System.out.print("Digite a temperatura: ");
        temperatura = ler.nextInt();
        
        while (true) {
            System.out.print("Digite a unidade de medida de temperatura (C - celsius; F - Fahrenheit): ");
            unidade = ler.next(); 
            
            if (unidade.equals("C") || unidade.equals("F")) {
                break;
            }
        }
        
        if (unidade.equals("C")) {
            temperatura_convertida = (temperatura * 9 / 5) + 32;
            System.out.println(temperatura + "C convertido para celsius e: " + temperatura_convertida + "F");
        }
        else {
            temperatura_convertida = (temperatura - 32) * 5 / 9;
            System.out.println(temperatura + "F convertido para celsius e: " + temperatura_convertida + "C");
        }
    }
}