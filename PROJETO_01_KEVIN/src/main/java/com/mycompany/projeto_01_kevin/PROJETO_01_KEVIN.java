/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_01_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_01_KEVIN {

    public static void main(String[] args) {
        float primeira_nota;
        float segunda_nota;
        float terceira_nota;
        float media;
        
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite a primeira nota: ");
        primeira_nota = ler.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        segunda_nota = ler.nextFloat();
        
        System.out.print("Digite a terceira nota: ");
        terceira_nota = ler.nextFloat();
        
        media = (primeira_nota + segunda_nota + terceira_nota) / 3;
        System.out.println("A media do aluno foi: " + media);
        
        if (media >= 7) {
            System.out.println("Aluno esta aprovado!");
        }
        else if (media >= 5 && media < 7) {
            System.out.println("Aluno esta de recuperacao!");
        }
        else {
            System.out.println("Aluno esta reprovado!");
        }
    }
}
