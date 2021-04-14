
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_leandrocorreia_ruisilva;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * A classe <b>LP_LeandroCorreia_RuiSilva</b> consiste na apresentação da interface ao utilizador do cartão e menu de opções sendo elas "Novo Jogo" ou "Sair".
 * @author Leandro_Correia e Rui_Silva
 * @version v1.0
 */
public class LP_LeandroCorreia_RuiSilva {

    /**
     * Método Main
     * @param args 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogo j = new Jogo();

        Limpar.limparConsola();
        System.out.println("Bem-vindo à plataforma do Bingo");
        System.out.println("Desenvolvido por: Leandro Correia e Rui Silva\n\n");
        System.out.println("O Bingo é um jogo de azar divertido no qual todos podem participar.\nNele, usa-se um cartão de quinze posições em que os números são sorteados\naleatoriamente, se conseguir preencher todos os quadrados do jogo, GANHA!\n");
        System.out.println("Regras:\n\t1. Visualize os números do seu cartão;\n\t2. Introduza o número sorteado exteriormente;\n\t3. Grite 'Bingo' se tiver o cartão completo;\n\t4. Boa sorte e divirta-se!\n");

        System.out.print("Pressiona ENTER para continuar...");
        sc.nextLine();

        int select;
        do {
            Limpar.limparConsola();

            System.out.println("\t\n1. Novo Jogo\t\n0. Sair\t\n");
            System.out.print("Escolhe uma opção: ");

            select = sc.nextInt();

            switch (select) {
                case 1:
                    j.cartao();
                    sc.nextLine();
                    break;
                case 0:
                    Limpar.limparConsola();
                    System.out.print("Fechando...");

                    try {
                        TimeUnit.SECONDS.sleep(3); // Espera de 3 segundos até fechar o programa
                    } catch (InterruptedException ex) {
                        // Nada acontece
                    }
                    break;
                default:
                    Limpar.limparConsola();
                    break;
            }

        } while (select != 0);
    }

}
