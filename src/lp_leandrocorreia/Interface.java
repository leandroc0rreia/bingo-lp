
package lp_leandrocorreia;

import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author leandroc0rreia
 */
public class Interface extends javax.swing.JFrame {
    
    private JTextField[] cartao;
    private Sorteador s;
    private int[][] ccartao;
    
    public Interface() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        cartao = new JTextField[]{c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27};
        s = new Sorteador();
        s.sorteioCartao();
        
        Menu.setVisible(true);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        CriarCartao.setVisible(false);
        
        ImageIcon imagem = new ImageIcon("src/imagem.png");
        img.setIcon(imagem);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        CriarCartao = new javax.swing.JPanel();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();
        c8 = new javax.swing.JTextField();
        c9 = new javax.swing.JTextField();
        c10 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        c13 = new javax.swing.JTextField();
        c14 = new javax.swing.JTextField();
        c15 = new javax.swing.JTextField();
        c16 = new javax.swing.JTextField();
        c17 = new javax.swing.JTextField();
        c18 = new javax.swing.JTextField();
        c19 = new javax.swing.JTextField();
        c20 = new javax.swing.JTextField();
        c21 = new javax.swing.JTextField();
        c22 = new javax.swing.JTextField();
        c23 = new javax.swing.JTextField();
        c24 = new javax.swing.JTextField();
        c25 = new javax.swing.JTextField();
        c26 = new javax.swing.JTextField();
        c27 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Jogo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bingo v2.0 - Menu");
        setResizable(false);

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jButton1.setText("Jogar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        c1.setEditable(false);
        c1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c2.setEditable(false);
        c2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c3.setEditable(false);
        c3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c4.setEditable(false);
        c4.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c5.setEditable(false);
        c5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c6.setEditable(false);
        c6.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c7.setEditable(false);
        c7.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c8.setEditable(false);
        c8.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c9.setEditable(false);
        c9.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c10.setEditable(false);
        c10.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c11.setEditable(false);
        c11.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c12.setEditable(false);
        c12.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c13.setEditable(false);
        c13.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c14.setEditable(false);
        c14.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c15.setEditable(false);
        c15.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c16.setEditable(false);
        c16.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c17.setEditable(false);
        c17.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c18.setEditable(false);
        c18.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c19.setEditable(false);
        c19.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c20.setEditable(false);
        c20.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c21.setEditable(false);
        c21.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c22.setEditable(false);
        c22.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c23.setEditable(false);
        c23.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c24.setEditable(false);
        c24.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c25.setEditable(false);
        c25.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c26.setEditable(false);
        c26.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        c27.setEditable(false);
        c27.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c27.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton3.setText("Sortear Cartao");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton4.setText("Editar Cartão");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton5.setText("Começar Jogo");

        javax.swing.GroupLayout CriarCartaoLayout = new javax.swing.GroupLayout(CriarCartao);
        CriarCartao.setLayout(CriarCartaoLayout);
        CriarCartaoLayout.setHorizontalGroup(
            CriarCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriarCartaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CriarCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CriarCartaoLayout.createSequentialGroup()
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CriarCartaoLayout.createSequentialGroup()
                        .addGroup(CriarCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CriarCartaoLayout.createSequentialGroup()
                                .addGroup(CriarCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(CriarCartaoLayout.createSequentialGroup()
                                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CriarCartaoLayout.createSequentialGroup()
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(CriarCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CriarCartaoLayout.createSequentialGroup()
                                .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CriarCartaoLayout.createSequentialGroup()
                                .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(CriarCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CriarCartaoLayout.createSequentialGroup()
                                        .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(CriarCartaoLayout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CriarCartaoLayout.setVerticalGroup(
            CriarCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriarCartaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CriarCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CriarCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CriarCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(CriarCartaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JogoLayout = new javax.swing.GroupLayout(Jogo);
        Jogo.setLayout(JogoLayout);
        JogoLayout.setHorizontalGroup(
            JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        JogoLayout.setVerticalGroup(
            JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 461, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CriarCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Jogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CriarCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Jogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Menu.setVisible(false);
        setSize(1068, 550);
        CriarCartao.setVisible(true);
        this.setLocationRelativeTo(null);
        sort();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sort();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void sort(){
        s.sorteioCartao();
        
        int k = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                cartao[k].setText(String.valueOf(s.cartao[i][j]));
                if (cartao[k].getText().equals("0")) cartao[k].setText("");
                k++;
            }
        }
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        for (JTextField jTextField : cartao) {
            jTextField.setEditable(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CriarCartao;
    private javax.swing.JPanel Jogo;
    private javax.swing.JPanel Menu;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c10;
    private javax.swing.JTextField c11;
    private javax.swing.JTextField c12;
    private javax.swing.JTextField c13;
    private javax.swing.JTextField c14;
    private javax.swing.JTextField c15;
    private javax.swing.JTextField c16;
    private javax.swing.JTextField c17;
    private javax.swing.JTextField c18;
    private javax.swing.JTextField c19;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c20;
    private javax.swing.JTextField c21;
    private javax.swing.JTextField c22;
    private javax.swing.JTextField c23;
    private javax.swing.JTextField c24;
    private javax.swing.JTextField c25;
    private javax.swing.JTextField c26;
    private javax.swing.JTextField c27;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField c7;
    private javax.swing.JTextField c8;
    private javax.swing.JTextField c9;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
