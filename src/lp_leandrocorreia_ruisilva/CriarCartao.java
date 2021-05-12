
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp_leandrocorreia_ruisilva;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author leandroc0rreia
 */
public class CriarCartao extends javax.swing.JFrame {

    private int cartao[][] = new int[9][3];
    private int cartaozero[][] = new int[9][3];
    private int colunaalea;
    private int cartpronto;
    private int check = 0;
    private int lista[] = new int[90];

    public CriarCartao() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cartpronto = 0;

        SortCor();
        Sorteador();

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
                if (j > 0) {
                    for (int k = 0; k < 3; k++) {
                        if (k <= j && cartao[i][j - k] == cartao[i][j]) {
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
                                k = 1;
                            } while (cartao[i][j] == cartao[i][j - k]);
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

        if (cartao[0][0] == 0) {
            cu1.setText("");
        } else {
            cu1.setText(String.valueOf(cartao[0][0]));
        }
        if (cartao[1][0] == 0) {
            cu2.setText("");
        } else {
            cu2.setText(String.valueOf(cartao[1][0]));
        }
        if (cartao[2][0] == 0) {
            cu3.setText("");
        } else {
            cu3.setText(String.valueOf(cartao[2][0]));
        }
        if (cartao[3][0] == 0) {
            cu4.setText("");
        } else {
            cu4.setText(String.valueOf(cartao[3][0]));
        }
        if (cartao[4][0] == 0) {
            cu5.setText("");
        } else {
            cu5.setText(String.valueOf(cartao[4][0]));
        }
        if (cartao[5][0] == 0) {
            cu6.setText("");
        } else {
            cu6.setText(String.valueOf(cartao[5][0]));
        }
        if (cartao[6][0] == 0) {
            cu7.setText("");
        } else {
            cu7.setText(String.valueOf(cartao[6][0]));
        }
        if (cartao[7][0] == 0) {
            cu8.setText("");
        } else {
            cu8.setText(String.valueOf(cartao[7][0]));
        }
        if (cartao[8][0] == 0) {
            cu9.setText("");
        } else {
            cu9.setText(String.valueOf(cartao[8][0]));
        }
        if (cartao[0][1] == 0) {
            cu10.setText("");
        } else {
            cu10.setText(String.valueOf(cartao[0][1]));
        }
        if (cartao[1][1] == 0) {
            cu11.setText("");
        } else {
            cu11.setText(String.valueOf(cartao[1][1]));
        }
        if (cartao[2][1] == 0) {
            cu12.setText("");
        } else {
            cu12.setText(String.valueOf(cartao[2][1]));
        }
        if (cartao[3][1] == 0) {
            cu13.setText("");
        } else {
            cu13.setText(String.valueOf(cartao[3][1]));
        }
        if (cartao[4][1] == 0) {
            cu14.setText("");
        } else {
            cu14.setText(String.valueOf(cartao[4][1]));
        }
        if (cartao[5][1] == 0) {
            cu15.setText("");
        } else {
            cu15.setText(String.valueOf(cartao[5][1]));
        }
        if (cartao[6][1] == 0) {
            cu16.setText("");
        } else {
            cu16.setText(String.valueOf(cartao[6][1]));
        }
        if (cartao[7][1] == 0) {
            cu17.setText("");
        } else {
            cu17.setText(String.valueOf(cartao[7][1]));
        }
        if (cartao[8][1] == 0) {
            cu18.setText("");
        } else {
            cu18.setText(String.valueOf(cartao[8][1]));
        }
        if (cartao[0][2] == 0) {
            cu19.setText("");
        } else {
            cu19.setText(String.valueOf(cartao[0][2]));
        }
        if (cartao[1][2] == 0) {
            cu20.setText("");
        } else {
            cu20.setText(String.valueOf(cartao[1][2]));
        }
        if (cartao[2][2] == 0) {
            cu21.setText("");
        } else {
            cu21.setText(String.valueOf(cartao[2][2]));
        }
        if (cartao[3][2] == 0) {
            cu22.setText("");
        } else {
            cu22.setText(String.valueOf(cartao[3][2]));
        }
        if (cartao[4][2] == 0) {
            cu23.setText("");
        } else {
            cu23.setText(String.valueOf(cartao[4][2]));
        }
        if (cartao[5][2] == 0) {
            cu24.setText("");
        } else {
            cu24.setText(String.valueOf(cartao[5][2]));
        }
        if (cartao[6][2] == 0) {
            cu25.setText("");
        } else {
            cu25.setText(String.valueOf(cartao[6][2]));
        }
        if (cartao[7][2] == 0) {
            cu26.setText("");
        } else {
            cu26.setText(String.valueOf(cartao[7][2]));
        }
        if (cartao[8][2] == 0) {
            cu27.setText("");
        } else {
            cu27.setText(String.valueOf(cartao[8][2]));
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

    private void SortCor() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cu1 = new javax.swing.JTextField();
        cu2 = new javax.swing.JTextField();
        cu3 = new javax.swing.JTextField();
        cu4 = new javax.swing.JTextField();
        cu5 = new javax.swing.JTextField();
        cu6 = new javax.swing.JTextField();
        cu7 = new javax.swing.JTextField();
        cu8 = new javax.swing.JTextField();
        cu9 = new javax.swing.JTextField();
        cu10 = new javax.swing.JTextField();
        cu11 = new javax.swing.JTextField();
        cu12 = new javax.swing.JTextField();
        cu13 = new javax.swing.JTextField();
        cu14 = new javax.swing.JTextField();
        cu15 = new javax.swing.JTextField();
        cu16 = new javax.swing.JTextField();
        cu17 = new javax.swing.JTextField();
        cu18 = new javax.swing.JTextField();
        cu19 = new javax.swing.JTextField();
        cu20 = new javax.swing.JTextField();
        cu21 = new javax.swing.JTextField();
        cu22 = new javax.swing.JTextField();
        cu23 = new javax.swing.JTextField();
        cu24 = new javax.swing.JTextField();
        cu25 = new javax.swing.JTextField();
        cu26 = new javax.swing.JTextField();
        cu27 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bingo v2.0 - Criar Cartão");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(500, 500));
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setText("Sortear novamente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cu1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu1.setText("1");

        cu2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu2.setText("2");

        cu3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu3.setText("3");

        cu4.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu4.setText("4");

        cu5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu5.setText("5");

        cu6.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu6.setText("6");

        cu7.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu7.setText("7");

        cu8.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu8.setText("8");

        cu9.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu9.setText("9");

        cu10.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu10.setText("10");

        cu11.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu11.setText("11");

        cu12.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu12.setText("12");

        cu13.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu13.setText("13");

        cu14.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu14.setText("14");

        cu15.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu15.setText("15");

        cu16.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu16.setText("16");

        cu17.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu17.setText("17");

        cu18.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu18.setText("18");

        cu19.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu19.setText("19");

        cu20.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu20.setText("20");

        cu21.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu21.setText("21");

        cu22.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu22.setText("22");

        cu23.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu23.setText("23");

        cu24.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu24.setText("24");

        cu25.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu25.setText("25");

        cu26.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu26.setText("26");

        cu27.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu27.setText("27");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cu1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cu2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cu3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cu4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cu5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cu6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cu7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cu8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cu9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cu10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cu19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cu22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cu27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cu1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cu10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cu19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cu20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cu21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cu22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cu23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cu24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cu25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cu26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cu27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (cartpronto != 10) {
            this.cartpronto = 0;
            if (cu1.getText().equals(cu10.getText()) || cu1.getText().equals(cu19.getText()) || cu10.getText().equals(cu19.getText())) {
                if( (cu1.getText().equals("") && cu10.getText().equals("")) || (cu1.getText().equals("") && cu19.getText().equals("")) || (cu10.getText().equals("") && cu19.getText().equals("")) || (cu1.getText().equals("") && cu10.getText().equals("") && cu19.getText().equals("")) ) this.cartpronto = cartpronto + 1;
                else JOptionPane.showMessageDialog(null, "Inseriu números iguais na Coluna: 1", "Erro", 2);
            }
            if (cu2.getText().equals(cu11.getText()) || cu2.getText().equals(cu20.getText()) || cu11.getText().equals(cu20.getText())) {
                if( (cu2.getText().equals("") && cu11.getText().equals("")) || (cu2.getText().equals("") && cu20.getText().equals("")) || (cu11.getText().equals("") && cu20.getText().equals("")) || (cu2.getText().equals("") && cu11.getText().equals("") && cu20.getText().equals("")) ) this.cartpronto = cartpronto + 1;
                else JOptionPane.showMessageDialog(null, "Inseriu números iguais na Coluna: 2", "Erro", 2);
            }
            if (cu3.getText().equals(cu12.getText()) || cu3.getText().equals(cu21.getText()) || cu12.getText().equals(cu21.getText())) {
                if( (cu3.getText().equals("") && cu12.getText().equals("")) || (cu3.getText().equals("") && cu21.getText().equals("")) || (cu12.getText().equals("") && cu21.getText().equals("")) || (cu3.getText().equals("") && cu12.getText().equals("") && cu21.getText().equals("")) ) this.cartpronto = cartpronto + 1;
                else JOptionPane.showMessageDialog(null, "Inseriu números iguais na Coluna: 3", "Erro", 2);
            }
            if (cu4.getText().equals(cu13.getText()) || cu4.getText().equals(cu22.getText()) || cu13.getText().equals(cu22.getText())) {
                if( (cu4.getText().equals("") && cu13.getText().equals("")) || (cu4.getText().equals("") && cu22.getText().equals("")) || (cu13.getText().equals("") && cu22.getText().equals("")) || (cu4.getText().equals("") && cu13.getText().equals("") && cu22.getText().equals("")) ) this.cartpronto = cartpronto + 1;
                else JOptionPane.showMessageDialog(null, "Inseriu números iguais na Coluna: 4", "Erro", 2);
            }
            if (cu5.getText().equals(cu14.getText()) || cu5.getText().equals(cu23.getText()) || cu14.getText().equals(cu23.getText())) {
                if( (cu5.getText().equals("") && cu14.getText().equals("")) || (cu5.getText().equals("") && cu23.getText().equals("")) || (cu14.getText().equals("") && cu23.getText().equals("")) || (cu5.getText().equals("") && cu14.getText().equals("") && cu23.getText().equals("")) ) this.cartpronto = cartpronto + 1;
                else JOptionPane.showMessageDialog(null, "Inseriu números iguais na Coluna: 5", "Erro", 2);
            }
            if (cu6.getText().equals(cu15.getText()) || cu6.getText().equals(cu24.getText()) || cu15.getText().equals(cu24.getText())) {
                if( (cu6.getText().equals("") && cu15.getText().equals("")) || (cu6.getText().equals("") && cu24.getText().equals("")) || (cu15.getText().equals("") && cu24.getText().equals("")) || (cu6.getText().equals("") && cu15.getText().equals("") && cu24.getText().equals("")) ) this.cartpronto = cartpronto + 1;
                else JOptionPane.showMessageDialog(null, "Inseriu números iguais na Coluna: 6", "Erro", 2);
            }
            if (cu7.getText().equals(cu16.getText()) || cu7.getText().equals(cu25.getText()) || cu16.getText().equals(cu25.getText())) {
                if( (cu7.getText().equals("") && cu16.getText().equals("")) || (cu7.getText().equals("") && cu25.getText().equals("")) || (cu16.getText().equals("") && cu25.getText().equals("")) || (cu7.getText().equals("") && cu16.getText().equals("") && cu25.getText().equals("")) ) this.cartpronto = cartpronto + 1;
                else JOptionPane.showMessageDialog(null, "Inseriu números iguais na Coluna: 7", "Erro", 2);
            }
            if (cu8.getText().equals(cu17.getText()) || cu8.getText().equals(cu26.getText()) || cu17.getText().equals(cu26.getText())) {
                if( (cu8.getText().equals("") && cu17.getText().equals("")) || (cu8.getText().equals("") && cu26.getText().equals("")) || (cu17.getText().equals("") && cu26.getText().equals("")) || (cu8.getText().equals("") && cu17.getText().equals("") && cu26.getText().equals("")) ) this.cartpronto = cartpronto + 1;
                else JOptionPane.showMessageDialog(null, "Inseriu números iguais na Coluna: 8", "Erro", 2);
            }
            if (cu9.getText().equals(cu18.getText()) || cu9.getText().equals(cu27.getText()) || cu18.getText().equals(cu27.getText())) {
                if( (cu9.getText().equals("") && cu18.getText().equals("")) || (cu9.getText().equals("") && cu27.getText().equals("")) || (cu18.getText().equals("") && cu27.getText().equals("")) || (cu9.getText().equals("") && cu18.getText().equals("") && cu27.getText().equals("")) ) this.cartpronto = cartpronto + 1;
                else JOptionPane.showMessageDialog(null, "Inseriu números iguais na Coluna: 9", "Erro", 2);
            }
            
           
            
        } else {
            this.cartpronto = 10;
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void atribuirLista(){
        for (int i = 1; i <=90; i++) {
            lista[i] = i;
        }
    }
    
    public void compararLista(){
        
        for (int i = 1; i <= 90; i++) {
            if(cu1.getText().equals(i)) this.check = this.check + 1;
        }
        
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Sorteador();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);

        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cu1;
    private javax.swing.JTextField cu10;
    private javax.swing.JTextField cu11;
    private javax.swing.JTextField cu12;
    private javax.swing.JTextField cu13;
    private javax.swing.JTextField cu14;
    private javax.swing.JTextField cu15;
    private javax.swing.JTextField cu16;
    private javax.swing.JTextField cu17;
    private javax.swing.JTextField cu18;
    private javax.swing.JTextField cu19;
    private javax.swing.JTextField cu2;
    private javax.swing.JTextField cu20;
    private javax.swing.JTextField cu21;
    private javax.swing.JTextField cu22;
    private javax.swing.JTextField cu23;
    private javax.swing.JTextField cu24;
    private javax.swing.JTextField cu25;
    private javax.swing.JTextField cu26;
    private javax.swing.JTextField cu27;
    private javax.swing.JTextField cu3;
    private javax.swing.JTextField cu4;
    private javax.swing.JTextField cu5;
    private javax.swing.JTextField cu6;
    private javax.swing.JTextField cu7;
    private javax.swing.JTextField cu8;
    private javax.swing.JTextField cu9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
