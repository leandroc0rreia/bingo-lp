/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_leandrocorreia_ruisilva;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * A classe <b>Jogo</b> consiste no sorteio de números pela matriz(9x3) em que
 * existe a condição de sortear números por coluna, na primeira coluna de 1 até
 * 9, na segunda coluna 10 até 20 e assim sucessivamente até atingir o número
 * máximo (90). Criamos um método para remover aleatóriamente 4 elementos de
 * cada linha, sendo esses elementos atribuido o valor 0. Há uma matriz paralela
 * chamada cartãozero que consiste numa matriz com valores entre 0 e 1. Em que o
 * valor 1 é atribuido aos valores maiores que 0 na coluna cartao e zero aos
 * valores igual a zero. O jogo só acaba quando a soma dos valores do cartaozero
 * for igual a 0.
 *
 * @author Leandro_Correia e Rui_Silva
 * @version v1.0
 */
public class Jogo {

    /**
     * O campo <b>RESET</b> é um editor de texto para voltar à cor default.
     */
    public static final String RESET = "\033[0m";
    /**
     * O campo <b>CYAN_BRIGHT</b> é um editor de texto, da cor default para
     * Ciano.
     */
    public static final String CYAN_BRIGHT = "\u001B[36m";

    private int cartao[][] = new int[9][3];
    private int cartaozero[][] = new int[9][3];
    private int colunaalea;
    private int num;
    private int confirm;
    private boolean ganhou;
    private boolean novojogo;
    List<Integer> listaNumsAnteriores = new ArrayList<>();
    
    /**
     * Construtor <b>Jogo</b>.
     */
    public Jogo() {    
        this.colunaalea = 0;
        this.num = 0;
        this.confirm = 0;
        this.ganhou = false;
        this.novojogo = false;
    }
    
    /**
     * O método "sorteador" realiza o sorteio de números pela matriz 9x3 (forma
     * do cartão do bingo). Condicionando o sorteamento dos números pelas
     * colunas, pois se o valor da coluna for 0 irá sortear a Biblioteca
     * "Random" de 1 até 9 e assim sucessivamente até 90.
     */
    public void sorteador() {
        Random r = new Random();
        // Soteio de número pela matriz cartão 3x9
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    cartao[i][j] = r.nextInt(10 - 1) + 1;
                }
                if (i == 1) {
                    cartao[i][j] = r.nextInt(20 - 10) + 10;
                }
                if (i == 2) {
                    cartao[i][j] = r.nextInt(30 - 20) + 20;
                }
                if (i == 3) {
                    cartao[i][j] = r.nextInt(40 - 30) + 30;
                }
                if (i == 4) {
                    cartao[i][j] = r.nextInt(50 - 40) + 40;
                }
                if (i == 5) {
                    cartao[i][j] = r.nextInt(60 - 50) + 50;
                }
                if (i == 6) {
                    cartao[i][j] = r.nextInt(70 - 60) + 60;
                }
                if (i == 7) {
                    cartao[i][j] = r.nextInt(80 - 70) + 70;
                }
                if (i == 8) {
                    cartao[i][j] = r.nextInt(91 - 80) + 80;
                }
                cartaozero[i][j] = 1;
            }
        }
        // Sorteio de posições a serem apagadas por linha
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                colunaalea = r.nextInt(9);
                do {
                    colunaalea = r.nextInt(9);
                } while (cartao[colunaalea][i] == 0);
                cartao[colunaalea][i] = 0;
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                if (cartao[i][j] != 0) {
                    cartaozero[i][j] = 1;
                }
                if (cartao[i][j] == 0) {
                    cartaozero[i][j] = 0;
                }
            }
        }
    }

    /**
     * O método "cartao" realiza a estrutura do cartão do bingo distribuindo os
     * valores pelas respetivas posições da matriz.
     */
    public void cartao() {
        Scanner sc = new Scanner(System.in);

        sorteador();

        do {
            do {
                Limpar.limparConsola();

                numAnt(num);
                System.out.println("\n╔═════════╦═════════╦═════════╦═════════╦═════════╦═════════╦═════════╦═════════╦═════════╗");
                System.out.println("║         ║         ║         ║         ║         ║         ║         ║         ║         ║");
                System.out.print("║");
                for (int j = 0; j < 9; j++) {
                    if (j == 0 || cartao[j][0] == 0) {
                        System.out.print(" ");
                    }
                    if (cartao[j][0] == 0) {
                        System.out.print("        ║");
                    } else {
                        if (cartaozero[j][0] == 0) {
                            System.out.print("   " + CYAN_BRIGHT + cartao[j][0] + RESET + "    ║");
                        } else {
                            System.out.print("   " + cartao[j][0] + "    ║");
                        }
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
                        if (cartaozero[j][1] == 0) {
                            System.out.print("   " + CYAN_BRIGHT + cartao[j][1] + RESET + "    ║");
                        } else {
                            System.out.print("   " + cartao[j][1] + "    ║");
                        }
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
                        if (cartaozero[j][2] == 0) {
                            System.out.print("   " + CYAN_BRIGHT + cartao[j][2] + RESET + "    ║");
                        } else {
                            System.out.print("   " + cartao[j][2] + "    ║");
                        }
                    }

                }
                System.out.println("\n║         ║         ║         ║         ║         ║         ║         ║         ║         ║");
                System.out.println("╚═════════╩═════════╩═════════╩═════════╩═════════╩═════════╩═════════╩═════════╩═════════╝");
                for (int i = 0; i < 3; i++) {
                    if (somaLinha(i) == 0) {
                        System.out.println((i + 1) + "ª Linha completa!");
                    }
                }
                System.out.print("Número sorteado: ");
                num = sc.nextInt();

                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (cartao[i][j] == num) {
                            cartaozero[i][j] = 0;
                        } else {

                        }
                    }
                }

                if (soma(cartaozero) == 0) {
                    ganhou = true;
                    JOptionPane.showMessageDialog(null, "Parabéns! Ganhas-te o jogo", "Bingo!", JOptionPane.INFORMATION_MESSAGE);

                    Limpar.limparConsola();
                    System.out.println("Quer continuar com o mesmo cartão?\n\t1. Sim\n\t2. Não");

                    System.out.print("Escolhe uma opção: ");
                    confirm = sc.nextInt();

                    switch (confirm) {
                        case 1:
                            novojogo = false;
                            for (int i = 0; i < 9; i++) {
                                for (int j = 0; j < 3; j++) {
                                    if (cartao[i][j] != 0) {
                                        cartaozero[i][j] = 1;
                                    }
                                    if (cartao[i][j] == 0) {
                                        cartaozero[i][j] = 0;
                                    }
                                }
                            }
                            numAnt(num = 0);
                            break;
                        case 2:
                            novojogo = true;
                            numAnt(num = 0);
                            break;
                        default:
                            novojogo = true;
                            numAnt(num = 0);
                            break;
                    }
                }
            } while (!novojogo);
        } while (!ganhou);

    }

    /**
     * Este método numAnt é usado para armazenar os números sorteados
     * exteriormente e quando o utilizador ganhar a lista dos números é limpa.
     *
     * @param numeroQueCalhou é o número sorteado exteriormente.
     */
    public void numAnt(int numeroQueCalhou) {
        listaNumsAnteriores.add(numeroQueCalhou);

        System.out.print("Os números anteriormente sorteados foram: ");
        for (int c = 0; c < listaNumsAnteriores.size(); c++) {
            System.out.print(listaNumsAnteriores.get(c) + " ");
        }
        if (numeroQueCalhou == 0) {
            listaNumsAnteriores.clear();
        }
    }

    /**
     * O método soma é direcionado para a soma de todos os elementos do
     * cartãozero.
     *
     * @param cartaozero É constituido internamente por 0 e 1.
     * @return soma
     */
    public int soma(int cartaozero[][]) {

        int s = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                s = s + cartaozero[i][j];
            }
        }
        return s;
    }

    /**
     * O método <b>somaLinha</b> vai somar todos os elementos de cada linha do
     * cartão zero, para mostrar a notificação de como a linha do cartão do
     * utilizador está completa, sendo o parâmetro j definido pelo método
     * <b>cartao</b>.
     *
     * @param j
     * @return soma
     */
    public int somaLinha(int j) {
        int s = 0;
        for (int i = 0; i < 9; i++) {
            s = s + cartaozero[i][j];
        }
        return s;
    }
}
