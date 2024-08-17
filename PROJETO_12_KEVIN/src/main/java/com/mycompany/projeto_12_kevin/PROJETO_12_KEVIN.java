/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_kevin;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class PROJETO_12_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int quantidade_eleitores;
        int candidatoUm = 0;
        int candidatoDois = 0;
        int candidatoTres = 0;
        int voto_eleitor;
        
        System.out.print("Digite a quantidade de eleitores que irao votar: ");
        quantidade_eleitores = ler.nextInt();
        
        for (int i = 1; i <= quantidade_eleitores; i++) {
            while (true) {
                System.out.print("Escolha um dos tres candidatos (1 - Eu; 2 - Me; 3 - Myself): ");
                voto_eleitor = ler.nextInt();
                if (voto_eleitor >= 1 && voto_eleitor <= 3) {
                    break;
                }
            }
            
            switch (voto_eleitor) {
                case 1 -> candidatoUm++;
                case 2 -> candidatoDois++;
                case 3 -> candidatoTres++;
            }
        }
        
        if (candidatoUm > candidatoDois && candidatoUm > candidatoTres) {
            System.out.println("O candidato ganhador foi o 'Eu' com " + candidatoUm + " votos.");
        }
        else if (candidatoDois > candidatoUm && candidatoDois > candidatoTres) {
            System.out.println("O candidato ganhador foi o 'Me' com " + candidatoDois + " votos.");
        }
        else if (candidatoTres > candidatoUm && candidatoTres > candidatoDois) {
            System.out.println("O candidato ganhador foi o 'Myself' com " + candidatoTres + " votos.");
        }
        else {
            System.out.println("Empate entre dois ou mais candidatos.");
        }
    }
}
