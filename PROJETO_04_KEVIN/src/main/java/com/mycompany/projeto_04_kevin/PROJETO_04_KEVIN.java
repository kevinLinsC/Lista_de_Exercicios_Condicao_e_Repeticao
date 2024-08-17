/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_04_kevin;

import java.util.Scanner;

/**
 *
 * @author k.andrade
 */
public class PROJETO_04_KEVIN {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        String usuario_correto = "aluno";
        String senha_correta = "aluno";
        
        String usuario;
        String senha;
        int tentativas = 3;
        
        while (tentativas > 0) {
            System.out.print("Digite seu usuario: ");
            usuario = ler.nextLine();
        
            System.out.print("Digite sua senha: ");
            senha = ler.nextLine();
            
            if (usuario.equals(usuario_correto) && senha.equals(senha_correta)) {
                break;
            }
            else {
                if (!usuario.equals(usuario_correto)) {
                    System.out.println("Usuario diferente.");
                }
                else if (!senha.equals(senha_correta)) {
                    System.out.println("Senha diferente.");
                }
                tentativas--;
            }
            
            System.out.println("-------------------------");
        }
        
        if (tentativas == 0) {
            System.out.println("SISTEMA BLOQUEADO DEVIDO AO NUMERO DE TENTATIVAS ERRADAS");
        }
        else {
            System.out.println("ENTROU NO SISTEMA!");
        }
        
    }
}