/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_19_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_19_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num_base;
        int num_expoente;
        int resultado = 1;
        
        System.out.print("Digite o numero base: ");
        num_base = ler.nextInt();
        
        System.out.print("Digite o expoente: ");
        num_expoente = ler.nextInt();
        
        for (int i = num_expoente; i >= 1; i--) {
            resultado *= num_base; 
        }
        
        System.out.println(resultado);
    }
}
