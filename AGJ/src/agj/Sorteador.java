
package agj;

import java.util.Random;

/**
 *
 * @author leandroc0rreia
 */
public class Sorteador {
    
    public int cartao[][];
    public int cartaozero[][];
    private int colunaalea;

    /**
     * Inicia/Constroi a classe Sorteador
     */
    public Sorteador() {
        
        this.cartao = new int[9][3];
        this.cartaozero = new int[9][3];
        
    }
    
    /**
     * Sorteia aleatóriamente os espaços em branco no cartão.
     */
    private void posicoesBranco(){
        Random r = new Random();
        
        //Define todas as posições do cartão como 0
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                this.cartao[i][j] = 0;
            }
        }
        
        //Define aleatóriamente 5 posições por linha com o valor 1
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 5; j++) {
                colunaalea = r.nextInt(9);
                do {
                    colunaalea = r.nextInt(9);
                } while (cartao[colunaalea][i]==1);
                this.cartao[colunaalea][i] = 1;
            }
        }
        
    }
    
    /**
     * Sorteia números por cada posição, com a regra de cada coluna ser da mesma dezena
     * @return cartao
     */
    public int[][] sorteioCartao(){
        Random r = new Random();
        posicoesBranco();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                if (cartao[i][j] == 1) {
                    if (i == 0) this.cartao[i][j] = r.nextInt(10 - 1) + 1;
                    if (i == 1) this.cartao[i][j] = r.nextInt(20 - 10) + 10;
                    if (i == 2) this.cartao[i][j] = r.nextInt(30 - 20) + 20;
                    if (i == 3) this.cartao[i][j] = r.nextInt(40 - 30) + 30;
                    if (i == 4) this.cartao[i][j] = r.nextInt(50 - 40) + 40;
                    if (i == 5) this.cartao[i][j] = r.nextInt(60 - 50) + 50;
                    if (i == 6) this.cartao[i][j] = r.nextInt(70 - 60) + 60;
                    if (i == 7) this.cartao[i][j] = r.nextInt(80 - 70) + 70;
                    if (i == 8) this.cartao[i][j] = r.nextInt(91 - 80) + 80;  
                    if (j > 0) {
                        for (int k = 0; k < 3; k++) {
                            if (k <= j && cartao[i][j - k] == cartao[i][j]) {
                                do {
                                    if (i == 0) this.cartao[i][j] = r.nextInt(10 - 1) + 1;
                                    if (i == 1) this.cartao[i][j] = r.nextInt(20 - 10) + 10;
                                    if (i == 2) this.cartao[i][j] = r.nextInt(30 - 20) + 20;
                                    if (i == 3) this.cartao[i][j] = r.nextInt(40 - 30) + 30;
                                    if (i == 4) this.cartao[i][j] = r.nextInt(50 - 40) + 40;
                                    if (i == 5) this.cartao[i][j] = r.nextInt(60 - 50) + 50;
                                    if (i == 6) this.cartao[i][j] = r.nextInt(70 - 60) + 60;
                                    if (i == 7) this.cartao[i][j] = r.nextInt(80 - 70) + 70;
                                    if (i == 8) this.cartao[i][j] = r.nextInt(91 - 80) + 80;
                                    k = 1;
                                } while (cartao[i][j] == cartao[i][j - k]);
                            }
                        }
                    }
                }
            }
        }
        
        return this.cartao;
    }
    
    
    
}
