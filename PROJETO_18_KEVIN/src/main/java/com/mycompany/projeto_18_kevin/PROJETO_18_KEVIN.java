/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_18_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_18_KEVIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String tipo_veiculo;
        float carro_pedagio = 30;
        float moto_pedagio = 25;
        float caminhao_pedagio = 40;
        float cobranca = 0;
        
        while (true) {
            System.out.print("Digite o tipo do veiculo (carro - moto - caminhao): ");
            tipo_veiculo = ler.next();
            
            if (tipo_veiculo.equals("carro") || tipo_veiculo.equals("moto") || tipo_veiculo.equals("caminhao")) {
                break;
            }
        }
        
        if (tipo_veiculo.equals("carro")) {
            cobranca = carro_pedagio;
        }
        else if (tipo_veiculo.equals("moto")) {
            cobranca = moto_pedagio;
        }
        else {
            cobranca = caminhao_pedagio;
        }
        
        System.out.println("O preco a ser pago no pedagio e: R$" + cobranca);
    }
}
