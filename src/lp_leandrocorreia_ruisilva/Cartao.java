
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_leandrocorreia_ruisilva;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author leandroc0rreia
 */
public class Cartao extends javax.swing.JFrame {
    
    private int cartao[][] = new int[9][3];
    private int cartaozero[][] = new int[9][3];
    private int colunaalea;
    
    public Cartao(){
        initComponents();
        this.setLocationRelativeTo(null);
        
        SortCor();
        Sorteador();
        
        if (cartao[0][0]==0) c1.setText("");
        else c1.setText(String.valueOf(cartao[0][0]));
        if (cartao[1][0]==0) c2.setText("");
        else c2.setText(String.valueOf(cartao[1][0]));
        if (cartao[2][0]==0) c3.setText("");
        else c3.setText(String.valueOf(cartao[2][0]));
        if (cartao[3][0]==0) c4.setText("");
        else c4.setText(String.valueOf(cartao[3][0]));
        if (cartao[4][0]==0) c5.setText("");
        else c5.setText(String.valueOf(cartao[4][0]));
        if (cartao[5][0]==0) c6.setText("");
        else c6.setText(String.valueOf(cartao[5][0]));
        if (cartao[6][0]==0) c7.setText("");
        else c7.setText(String.valueOf(cartao[6][0]));
        if (cartao[7][0]==0) c8.setText("");
        else c8.setText(String.valueOf(cartao[7][0]));
        if (cartao[8][0]==0) c9.setText("");
        else c9.setText(String.valueOf(cartao[8][0]));
        if (cartao[0][1]==0) c10.setText("");
        else c10.setText(String.valueOf(cartao[0][1]));
        if (cartao[1][1]==0) c11.setText("");
        else c11.setText(String.valueOf(cartao[1][1]));
        if (cartao[2][1]==0) c12.setText("");
        else c12.setText(String.valueOf(cartao[2][1]));
        if (cartao[3][1]==0) c13.setText("");
        else c13.setText(String.valueOf(cartao[3][1]));
        if (cartao[4][1]==0) c14.setText("");
        else c14.setText(String.valueOf(cartao[4][1]));
        if (cartao[5][1]==0) c15.setText("");
        else c15.setText(String.valueOf(cartao[5][1]));
        if (cartao[6][1]==0) c16.setText("");
        else c16.setText(String.valueOf(cartao[6][1]));
        if (cartao[7][1]==0) c17.setText("");
        else c17.setText(String.valueOf(cartao[7][1]));
        if (cartao[8][1]==0) c18.setText("");
        else c18.setText(String.valueOf(cartao[8][1]));
        if (cartao[0][2]==0) c19.setText("");
        else c19.setText(String.valueOf(cartao[0][2]));
        if (cartao[1][2]==0) c20.setText("");
        else c20.setText(String.valueOf(cartao[1][2]));
        if (cartao[2][2]==0) c21.setText("");
        else c21.setText(String.valueOf(cartao[2][2]));
        if (cartao[3][2]==0) c22.setText("");
        else c22.setText(String.valueOf(cartao[3][2]));
        if (cartao[4][2]==0) c23.setText("");
        else c23.setText(String.valueOf(cartao[4][2]));
        if (cartao[5][2]==0) c24.setText("");
        else c24.setText(String.valueOf(cartao[5][2]));
        if (cartao[6][2]==0) c25.setText("");
        else c25.setText(String.valueOf(cartao[6][2]));
        if (cartao[7][2]==0) c26.setText("");
        else c26.setText(String.valueOf(cartao[7][2]));
        if (cartao[8][2]==0) c27.setText("");
        else c27.setText(String.valueOf(cartao[8][2]));
        
    }
    
    /**
     * O método "sorteador" realiza o sorteio de números pela matriz 9x3 (forma
     * do cartão do bingo). Condicionando o sorteamento dos números pelas
     * colunas, pois se o valor da coluna for 0 irá sortear a Biblioteca
     * "Random" de 1 até 9 e assim sucessivamente até 90.
     */
    private void Sorteador() {
        Random r = new Random();
        // Soteio de número pela matriz cartão 9x3
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
                if (j>0) {
                    for (int k = 0; k < 3; k++) {
                        if (k<=j && cartao[i][j-k]==cartao[i][j]){
                            do {                                
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
                                k=1;
                            } while (cartao[i][j]==cartao[i][j-k]);
                        }
                    }
                }
                
                
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
    private void SortCor(){
        Random ra = new Random();
        int a;
        int b;
        int c;
        
        a = ra.nextInt(256);
        b = ra.nextInt(256);
        c = ra.nextInt(256);
        
        setBackground(new Color(a, b, c));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c3 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        c12 = new javax.swing.JLabel();
        c10 = new javax.swing.JLabel();
        c11 = new javax.swing.JLabel();
        c15 = new javax.swing.JLabel();
        c13 = new javax.swing.JLabel();
        c14 = new javax.swing.JLabel();
        c18 = new javax.swing.JLabel();
        c16 = new javax.swing.JLabel();
        c17 = new javax.swing.JLabel();
        c21 = new javax.swing.JLabel();
        c19 = new javax.swing.JLabel();
        c20 = new javax.swing.JLabel();
        c24 = new javax.swing.JLabel();
        c22 = new javax.swing.JLabel();
        c23 = new javax.swing.JLabel();
        c27 = new javax.swing.JLabel();
        c25 = new javax.swing.JLabel();
        c26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bingo v2.0 - Cartão");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(500, 500));
        setResizable(false);

        c3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c3.setForeground(new java.awt.Color(0, 0, 0));
        c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c3.setText("3");
        c3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c1.setForeground(new java.awt.Color(0, 0, 0));
        c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1.setText("1");
        c1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c2.setForeground(new java.awt.Color(0, 0, 0));
        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.setText("2");
        c2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c6.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c6.setForeground(new java.awt.Color(0, 0, 0));
        c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c6.setText("6");
        c6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c4.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c4.setForeground(new java.awt.Color(0, 0, 0));
        c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c4.setText("4");
        c4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c5.setForeground(new java.awt.Color(0, 0, 0));
        c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c5.setText("5");
        c5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c9.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c9.setForeground(new java.awt.Color(0, 0, 0));
        c9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c9.setText("9");
        c9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c7.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c7.setForeground(new java.awt.Color(0, 0, 0));
        c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c7.setText("7");
        c7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c8.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c8.setForeground(new java.awt.Color(0, 0, 0));
        c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c8.setText("8");
        c8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c12.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c12.setForeground(new java.awt.Color(0, 0, 0));
        c12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c12.setText("12");
        c12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c10.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c10.setForeground(new java.awt.Color(0, 0, 0));
        c10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c10.setText("10");
        c10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c11.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c11.setForeground(new java.awt.Color(0, 0, 0));
        c11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c11.setText("11");
        c11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c15.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c15.setForeground(new java.awt.Color(0, 0, 0));
        c15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c15.setText("15");
        c15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c13.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c13.setForeground(new java.awt.Color(0, 0, 0));
        c13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c13.setText("13");
        c13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c14.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c14.setForeground(new java.awt.Color(0, 0, 0));
        c14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c14.setText("14");
        c14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c18.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c18.setForeground(new java.awt.Color(0, 0, 0));
        c18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c18.setText("18");
        c18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c16.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c16.setForeground(new java.awt.Color(0, 0, 0));
        c16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c16.setText("16");
        c16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c17.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c17.setForeground(new java.awt.Color(0, 0, 0));
        c17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c17.setText("17");
        c17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c21.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c21.setForeground(new java.awt.Color(0, 0, 0));
        c21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c21.setText("21");
        c21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c19.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c19.setForeground(new java.awt.Color(0, 0, 0));
        c19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c19.setText("19");
        c19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c20.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c20.setForeground(new java.awt.Color(0, 0, 0));
        c20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c20.setText("20");
        c20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c24.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c24.setForeground(new java.awt.Color(0, 0, 0));
        c24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c24.setText("24");
        c24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c22.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c22.setForeground(new java.awt.Color(0, 0, 0));
        c22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c22.setText("22");
        c22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c23.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c23.setForeground(new java.awt.Color(0, 0, 0));
        c23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c23.setText("23");
        c23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c27.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c27.setForeground(new java.awt.Color(0, 0, 0));
        c27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c27.setText("27");
        c27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c25.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c25.setForeground(new java.awt.Color(0, 0, 0));
        c25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c25.setText("25");
        c25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        c26.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c26.setForeground(new java.awt.Color(0, 0, 0));
        c26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c26.setText("26");
        c26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c10;
    private javax.swing.JLabel c11;
    private javax.swing.JLabel c12;
    private javax.swing.JLabel c13;
    private javax.swing.JLabel c14;
    private javax.swing.JLabel c15;
    private javax.swing.JLabel c16;
    private javax.swing.JLabel c17;
    private javax.swing.JLabel c18;
    private javax.swing.JLabel c19;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c20;
    private javax.swing.JLabel c21;
    private javax.swing.JLabel c22;
    private javax.swing.JLabel c23;
    private javax.swing.JLabel c24;
    private javax.swing.JLabel c25;
    private javax.swing.JLabel c26;
    private javax.swing.JLabel c27;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel c9;
    // End of variables declaration//GEN-END:variables
}
