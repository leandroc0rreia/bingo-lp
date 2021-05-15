
package lp_leandrocorreia_ruisilva;

/**
 *
 * @author leandroc0rreia
 */
public class CartaoJogo extends javax.swing.JFrame {
    
    Sorteador s = new Sorteador();
    
    public CartaoJogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    /**
//     * O método soma é direcionado para a soma de todos os elementos do
//     * cartãozero.
//     *
//     * @param cartaozero É constituido internamente por 0 e 1.
//     * @return soma
//     */
//    public int soma(int cartaozero[][]) {
//
//        int s = 0;
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 3; j++) {
//                s = s + cartaozero[i][j];
//            }
//        }
//        return s;
//    }
//
//    /**
//     * O método <b>somaLinha</b> vai somar todos os elementos de cada linha do
//     * cartão zero, para mostrar a notificação de como a linha do cartão do
//     * utilizador está completa, sendo o parâmetro j definido pelo método
//     * <b>cartao</b>.
//     *
//     * @param j
//     * @return soma
//     */
//    public int somaLinha(int j) {
//        int s = 0;
//        for (int i = 0; i < 9; i++) {
//            s = s + this.cartaozero[i][j];
//        }
//        return s;
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
