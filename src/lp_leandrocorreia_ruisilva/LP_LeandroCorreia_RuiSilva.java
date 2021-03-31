/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_leandrocorreia_ruisilva;
import java.util.Scanner;
/**
 *
 * @author Leandro Correia
 */
public class LP_LeandroCorreia_RuiSilva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        Limpar l = new Limpar();
        l.limparConsola();
        System.out.println("Bem-vindo à plataforma do Bingo\n");
        
        System.out.println("O Bingo é um jogo de azar divertido no qual todos podem participar.\nNele, usa-se um cartão de quinze posições em que os números são sorteados\naleatoriamente, se conseguir preencher todos os quadrados do jogo, GANHA!\n");
        System.out.println("Regras:\n\t1. Visualize os números do seu cartão;\n\t2. Introduza o número sorteado exteriormente;\n\t3. Grite 'Bingo' se tiver o cartão completo;\n\t4. Boa sorte e divirta-se!\n");
        
        System.out.print("Pressiona ENTER para continuar...");
        sc.nextLine();
        
        int select = 0;
        do {
            l.limparConsola();
            
            System.out.println("\t\n1. Novo Jogo\t\n2. Recorde\t\n0. Sair\t\n");
            System.out.print("Escolhe uma opção: ");
            select = sc.nextInt();
            
            switch(select){
                case 1:
                    l.limparConsola();
                break;
                case 2:
                    l.limparConsola();
                break;
                case 0:
                    l.limparConsola();
                    System.out.print("Fechando...");
                    sc.nextLine();
                break;
                default:
                    l.limparConsola();
                break;
            }
            
        } while (select!=0);
        sc.nextLine();
    }
    
}
