/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14_kevin;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author kevin
 */
public class PROJETO_14_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int num_usuario;
        String usuario_escolha;
        int num_maquina;
        int soma;
        
        num_maquina = aleatorio.nextInt(1, 1000);
        
        System.out.print("Digite um numero: ");
        num_usuario = ler.nextInt();
        
        soma = num_maquina + num_usuario;
        
        
        while (true) {
            System.out.print("Escolha impar ou par: ");
            usuario_escolha = ler.next();
            
            if (usuario_escolha.equals("impar") || usuario_escolha.equals("par")) {
                break;
            }
        }
        
        System.out.println("-------------------------------");
        System.out.println("Robo escolheu " + num_maquina + ".");
        System.out.println("-------------------------------");
        
        System.out.println("A soma dos numeros foi: " + soma);
        
        if (soma % 2 == 0) {
            if (usuario_escolha.equals("par")) {
                System.out.println("Voce ganhou escolhendo par.");
            }
            else {
                System.out.println("Robo ganhou escolhendo PAR.");
            }
        }
        else if (soma % 2 != 0) {
            if (usuario_escolha.equals("impar")) {
                System.out.println("Voce ganhou escolhendo impar.");
            }
            else {
                System.out.println("Robo ganhou escolhendo IMPAR.");
            }
        }
    }
}
