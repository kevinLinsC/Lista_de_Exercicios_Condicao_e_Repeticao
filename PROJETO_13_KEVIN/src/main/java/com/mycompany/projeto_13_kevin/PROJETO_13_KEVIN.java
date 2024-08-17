/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_kevin;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class PROJETO_13_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int ano;
        
        System.out.print("Digite um ano para saber se e bissexto ou nao: ");
        ano = ler.nextInt();
        
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("Ano e bissexto.");
        }
        else {
            System.out.println("Ano nao e bissexto.");
        }
    }
}
