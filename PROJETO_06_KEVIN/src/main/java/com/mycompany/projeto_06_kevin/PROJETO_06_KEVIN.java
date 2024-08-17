/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_06_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_06_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float peso;
        float altura;
        float imc;
        
        System.out.print("Digite sua altura: ");
        altura = ler.nextFloat();
        
        System.out.print("Digite seu peso: ");
        peso = ler.nextFloat();
        
        imc = peso / (altura * altura);
        
        System.out.println("Seu IMC e: " + imc);
        
        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        }
        else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal.");
        }
        else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso.");
        }
        else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau 1.");
        }
        else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau 2.");
        }
        else {
            System.out.println("Obesidade grau 3.");
        }
    }
}
