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
public class Cartao {

    private int checkcartao;
    private Sorteador s;
    public String[] ccartao;

    /**
     * Construtor da classe Cartão
     */
    public Cartao() {

        ccartao = new String[27];
        s = new Sorteador();
        s.sorteioCartao();
        this.checkcartao = 0;

    }

    /**
     * Define os números sorteados pelas respetivas linhas e colunas do cartão
     */
    public void sortear() {
        s.sorteioCartao();

        int k = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                this.ccartao[k] = String.valueOf(s.cartao[i][j]);
                if (ccartao[k].equals("0")) {
                    this.ccartao[k] = "";
                }
                k++;
            }
        }
    }

    /**
     * Verifica o intervalo de 1 a 90 por cada posicao
     *
     * @param c
     * @return boolean
     */
    public boolean verificarNumCartao(String[] c) {
        int check = 0;

        for (int i = 0; i < 27; i++) {

            if (!(c[i].equals(""))) {
                if (Integer.parseInt(c[i]) > 1 || Integer.parseInt(c[i]) < 90) {
                    check = check + 1;
                }
            }

        }

        if (check == 15) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Insira números entre 1 e 90", "Erro", 2);
            return false;
        }

    }

    /**
     * Verifica os espacos em branco por linha
     *
     * @param c
     * @return boolean
     */
    public boolean verificarEspacosBranco(String[] c) {
        int linha1 = 0;
        int linha2 = 0;
        int linha3 = 0;

        //Verificar espaços em branco na primeira linha
        for (int i = 0; i < 27; i = i + 3) {
            if (c[i].equals("")) {
                linha1 = linha1 + 1;
            }
        }
        if (linha1 != 4) {
            JOptionPane.showMessageDialog(null, "A primeira linha não cumpre com 4 espaços em branco", "Erro", 2);
        }

        //Verificar espaços em branco na segunda linha
        for (int i = 1; i < 27; i = i + 3) {
            if (c[i].equals("")) {
                linha2 = linha2 + 1;
            }
        }
        if (linha2 != 4) {
            JOptionPane.showMessageDialog(null, "A segunda linha não cumpre com 4 espaços em branco", "Erro", 2);
        }

        //Verificar espaços em branco na terceira linha
        for (int i = 2; i < 27; i = i + 3) {
            if (c[i].equals("")) {
                linha3 = linha3 + 1;
            }
        }
        if (linha3 != 4) {
            JOptionPane.showMessageDialog(null, "A terceira linha não cumpre com 4 espaços em branco", "Erro", 2);
        }

        //Verificação final das 3 linhas
        if (linha1 == 4 && linha2 == 4 && linha3 == 4) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Verifica-se a regra do número da dezena correspondente à sua posição por
     * coluna.
     *
     * @param c
     * @return boolean
     */
    public boolean verificarNumColuna(String[] c) {

        int check = 0;

        for (int i = 0; i < 27; i++) {
            if (i == 0 || i == 1 || i == 2) {
                if (c[i].equals("") || (Integer.parseInt(c[i]) >= 1 && Integer.parseInt(c[i]) <= 9)) {
                    check = check + 1;
                }
            }
            if (i == 3 || i == 4 || i == 5) {
                if (c[i].equals("") || (Integer.parseInt(c[i]) >= 10 && Integer.parseInt(c[i]) <= 19)) {
                    check = check + 1;
                }
            }
            if (i == 6 || i == 7 || i == 8) {
                if (c[i].equals("") || (Integer.parseInt(c[i]) >= 20 && Integer.parseInt(c[i]) <= 29)) {
                    check = check + 1;
                }
            }
            if (i == 9 || i == 10 || i == 11) {
                if (c[i].equals("") || (Integer.parseInt(c[i]) >= 30 && Integer.parseInt(c[i]) <= 39)) {
                    check = check + 1;
                }
            }
            if (i == 12 || i == 13 || i == 14) {
                if (c[i].equals("") || (Integer.parseInt(c[i]) >= 40 && Integer.parseInt(c[i]) <= 49)) {
                    check = check + 1;
                }
            }
            if (i == 15 || i == 16 || i == 17) {
                if (c[i].equals("") || (Integer.parseInt(c[i]) >= 50 && Integer.parseInt(c[i]) <= 59)) {
                    check = check + 1;
                }
            }
            if (i == 18 || i == 19 || i == 20) {
                if (c[i].equals("") || (Integer.parseInt(c[i]) >= 60 && Integer.parseInt(c[i]) <= 69)) {
                    check = check + 1;
                }
            }
            if (i == 21 || i == 22 || i == 23) {
                if (c[i].equals("") || (Integer.parseInt(c[i]) >= 70 && Integer.parseInt(c[i]) <= 79)) {
                    check = check + 1;
                }
            }
            if (i == 24 || i == 25 || i == 26) {
                if (c[i].equals("") || (Integer.parseInt(c[i]) >= 80 && Integer.parseInt(c[i]) <= 90)) {
                    check = check + 1;
                }
            }
        }

        if (check != 27) {
            JOptionPane.showMessageDialog(null, "Cada coluna apenas pode ter números da dezena correspondente à sua posição", "Erro", 2);
            return false;
        } else {
            return true;
        }

    }

    /**
     * Verifica a regra da existência de números repetidos.
     *
     * @param c
     * @return boolean
     */
    public boolean verificarRepetido(String[] c) {

        int check = 0;

        for (int i = 0; i < c.length; i = i + 3) {

            if (c[i].equals("")) {

            } else {
                if (c[i].equals(c[i + 1]) || c[i].equals(c[i + 2])) {
                    JOptionPane.showMessageDialog(null, "Números repetidos!", "Erro", 2);
                    break;
                } else {
                    check = 1;
                }
            }

            if (c[i + 1].equals("")) {
            } else {
                if (c[i + 1].equals(c[i + 2])) {
                    JOptionPane.showMessageDialog(null, "Números repetidos!", "Erro", 2);
                    break;
                } else {
                    check = 1;
                }
            }

        }

        if (check == 1) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Verifica se todos os metodos sao verdadeiros para se iniciar o jogo
     *
     * @param c
     * @return boolean
     */
    public boolean prontoAJogar(String[] c) {

        if ((verificarNumCartao(c) == true) && (verificarEspacosBranco(c) == true) && (verificarNumColuna(c) == true) && (verificarRepetido(c) == true)) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Recebe uma String[] vinda do exterior. Neste caso é indicado que seja um
     * cartao.
     *
     * @param cartaoFora
     */
    public void receberCcartao(String[] cartaoFora) {

        for (int i = 0; i < 27; i++) {
            ccartao[i].equals(cartaoFora[i]);
        }
    }
}
