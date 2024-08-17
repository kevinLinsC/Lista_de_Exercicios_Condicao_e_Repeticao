/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_08_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_08_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String senha;
        
        while (true) {
            System.out.print("Digite uma senha: ");
            senha = ler.nextLine();
            
            if (senha.length() >= 8) {
                System.out.println("Senha valida.");
                break;
            }
            else {
                System.out.println("Senha invalida. Digite uma senha com 8 ou mais caracteres.");
            }
            
            System.out.println("------------------------------");
        }
    }
}