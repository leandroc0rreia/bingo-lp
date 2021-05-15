
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
public class CriarCartao extends javax.swing.JFrame {
    
    Sorteador s;
    
    public CriarCartao() {
        
        s = new Sorteador();
        initComponents();
        this.setLocationRelativeTo(null);
        
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
        jButton2.setText("Sortear cartão");
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

        cu2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu4.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu6.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu7.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu8.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu9.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu10.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu11.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu12.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu13.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu14.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu15.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu16.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu17.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu18.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cu18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cu18ActionPerformed(evt);
            }
        });

        cu19.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu20.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu21.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu22.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu23.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu24.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu25.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu26.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cu27.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        cu27.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
    
    public void SortCor() {
        Random ra = new Random();
        int a;
        int b;
        int c;

        a = ra.nextInt(256);
        b = ra.nextInt(256);
        c = ra.nextInt(256);

        setBackground(new Color(a, b, c));
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        s.sorteioCartao();
        
        cu1.setText(String.valueOf(s.cartao[0][0]));
        cu2.setText(String.valueOf(s.cartao[1][0]));
        cu3.setText(String.valueOf(s.cartao[2][0]));
        cu4.setText(String.valueOf(s.cartao[3][0]));
        cu5.setText(String.valueOf(s.cartao[4][0]));
        cu6.setText(String.valueOf(s.cartao[5][0]));
        cu7.setText(String.valueOf(s.cartao[6][0]));
        cu8.setText(String.valueOf(s.cartao[7][0]));
        cu9.setText(String.valueOf(s.cartao[8][0]));
        cu10.setText(String.valueOf(s.cartao[0][1]));
        cu11.setText(String.valueOf(s.cartao[1][1]));
        cu12.setText(String.valueOf(s.cartao[2][1]));
        cu13.setText(String.valueOf(s.cartao[3][1]));
        cu14.setText(String.valueOf(s.cartao[4][1]));
        cu15.setText(String.valueOf(s.cartao[5][1]));
        cu16.setText(String.valueOf(s.cartao[6][1]));
        cu17.setText(String.valueOf(s.cartao[7][1]));
        cu18.setText(String.valueOf(s.cartao[8][1]));
        cu19.setText(String.valueOf(s.cartao[0][2]));
        cu20.setText(String.valueOf(s.cartao[1][2]));
        cu21.setText(String.valueOf(s.cartao[2][2]));
        cu22.setText(String.valueOf(s.cartao[3][2]));
        cu23.setText(String.valueOf(s.cartao[4][2]));
        cu24.setText(String.valueOf(s.cartao[5][2]));
        cu25.setText(String.valueOf(s.cartao[6][2]));
        cu26.setText(String.valueOf(s.cartao[7][2]));
        cu27.setText(String.valueOf(s.cartao[8][2]));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);

        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cu18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cu18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cu18ActionPerformed


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
