/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajog;

import javax.swing.JOptionPane;

/**
 *
 * @author leandroc0rreia
 */
public class ExecutarAJOG {

    public static void main(String[] args) {
        
        Interface i = new Interface();
        
        JOptionPane.showMessageDialog(null, "\n"
            + "Bem-vindo à plataforma do Bingo\n"
            + "Desenvolvido por: Leandro Correia\n\n"
            + "Bingo é um jogo de azar divertido no qual todos podem participar.\n"
            + "Nele, usa-se um cartão de quinze posições em que os números são sorteados\n"
            + "aleatoriamente, se conseguir preencher todos os quadrados do jogo, GANHA!\n\n"
            + "Regras:\n\n"
            + "         1. Visualize os números do seu cartão;\n"
            + "         2. Introduza o número sorteado exteriormente;\n"
            + "         3. Grite 'Bingo' se tiver o cartão completo;\n"
            + "         4. Boa sorte e divirta-se!\n\n", "Bingo v2.0", JOptionPane.PLAIN_MESSAGE);
        
        Jogador jogador = new Jogador("127.0.0.1", 5000);
        i.setVisible(true);
    }
    
}
