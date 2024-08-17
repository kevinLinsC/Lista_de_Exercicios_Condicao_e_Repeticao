/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_20_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_20_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float valor;
        float desconto;
        float valor_com_desconto;
        
        System.out.print("Digite o valor do produto: ");
        valor = ler.nextFloat();
        
        System.out.print("Digite a quantidade de desconto: ");
        desconto = ler.nextFloat();
        desconto = desconto / 100;
        
        if (desconto == 0) {
            System.out.println("Nao havera desconto.");
        } else if (desconto > 0 && desconto <= 100) {
            valor_com_desconto = valor - (valor * desconto);
            System.out.println("Desconto de " + desconto * 100 + " aplicado com sucesso.");
            System.out.println("O novo valor sera de: R$" + valor_com_desconto);
        }
        else {
            System.out.println("Nao e possivel aplicar esse desconto.");
        }
    }
}
