/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_leandrocorreia_ruisilva;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Leandro Correia
 */
public class Jogo {
    
    /**
     * O método "sorteador" realiza o sorteio de números pela matriz 3x9 (forma do cartão pedida)
     * Devolve o @param cart como o cartão já preenchido, ou seja, sorteado.
     */
    private static void sorteador(int cart[][]) {

        Random r = new Random();
        // Soteio de número pela matriz cartão 3x9
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    if (i == 0) {
                        cart[i][j] = r.nextInt(9 - 1) + 1;
                    }
                    if (i == 1) {
                        cart[i][j] = r.nextInt(19 - 10) + 10;
                    }
                    if (i == 2) {
                        cart[i][j] = r.nextInt(29 - 20) + 20;
                    }
                    if (i == 3) {
                        cart[i][j] = r.nextInt(39 - 30) + 30;
                    }
                    if (i == 4) {
                        cart[i][j] = r.nextInt(49 - 40) + 40;
                    }
                    if (i == 5) {
                        cart[i][j] = r.nextInt(59 - 50) + 50;
                    }
                    if (i == 6) {
                        cart[i][j] = r.nextInt(69 - 60) + 60;
                    }
                    if (i == 7) {
                        cart[i][j] = r.nextInt(79 - 70) + 70;
                    }
                    if (i == 8) {
                        cart[i][j] = r.nextInt(90 - 80) + 80;
                    }
                } while (cart != cart);
            }
        }

        // Sorteio de posições a serem apagadas por linha
        int colunaalea = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                colunaalea = r.nextInt(9);
                do {
                    colunaalea = r.nextInt(9);
                } while (cart[colunaalea][i] == 0);
                cart[colunaalea][i] = 0;

            }
        }
    }

    /**
     * O método "cartao" realiza a estrutura do cartão do bingo distribuindo os valores pelas respetivas posições da matriz
     */
    public static void cartao() {
        
        boolean ganhou = false;
        int cartao[][] = new int[9][3];
        sorteador(cartao);
        
        int bingo = 1;

        do{
            
            numAnt();
            System.out.println("╔═════════╦═════════╦═════════╦═════════╦═════════╦═════════╦═════════╦═════════╦═════════╗");
            System.out.println("║         ║         ║         ║         ║         ║         ║         ║         ║         ║");
            System.out.print("║");
            for (int j = 0; j < 9; j++) {
                if (j == 0 || cartao[j][0] == 0) {
                    System.out.print(" ");
                }
                if (cartao[j][0] == 0) {
                    System.out.print("        ║");
                } else {
                    System.out.print("   " + cartao[j][0] + "    ║");
                }
            }
            System.out.println("\n║         ║         ║         ║         ║         ║         ║         ║         ║         ║");
            System.out.println("╠═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╣");
            System.out.println("║         ║         ║         ║         ║         ║         ║         ║         ║         ║");
            System.out.print("║");
            for (int j = 0; j < 9; j++) {
                if (j == 0 || cartao[j][1] == 0) {
                    System.out.print(" ");
                }
                if (cartao[j][1] == 0) {
                    System.out.print("        ║");
                } else {
                    System.out.print("   " + cartao[j][1] + "    ║");
                }
            }

            System.out.println("\n║         ║         ║         ║         ║         ║         ║         ║         ║         ║");
            System.out.println("╠═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╬═════════╣");
            System.out.println("║         ║         ║         ║         ║         ║         ║         ║         ║         ║");
            System.out.print("║");
            for (int j = 0; j < 9; j++) {
                if (j == 0 || cartao[j][2] == 0) {
                    System.out.print(" ");
                }
                if (cartao[j][2] == 0) {
                    System.out.print("        ║");
                } else {
                    System.out.print("   " + cartao[j][2] + "    ║");
                }
            }
            System.out.println("\n║         ║         ║         ║         ║         ║         ║         ║         ║         ║");
            System.out.println("╚═════════╩═════════╩═════════╩═════════╩═════════╩═════════╩═════════╩═════════╩═════════╝");
            numExt();
            
        }while(!ganhou);

    }
    
    /**
     * O método numAnt mostra todos os números sorteados anteriormente no método numExt
     */
    public static void numAnt() {
        
        System.out.print("\nNúmeros anteriores:");
        for (int i = 0; i < 9; i++) {
            System.out.print(" "+ i);
        }
        System.out.println("");
    }
    
    /**
     * O método "numExt" faz a inserção dos números sorteados exteriormente 
     */
    public static void numExt() {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Número sorteado: ");
        num = sc.nextInt();
        
    }
}
