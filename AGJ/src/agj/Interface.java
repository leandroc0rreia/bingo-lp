package agj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author leandroc0rreia
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Na falta informação de como obter os elementos da lista e adicionar os
     * elementos à lista, tirei como referência o código indicado a baixo do
     * canal de Youtube Tutus Funny
     * Link:https://www.youtube.com/watch?v=5a4NK65kELk
     */
    private DefaultListModel listaAposta;
    private DefaultListModel listaNum;
    private HashMap<String, String> apostador;
    private Numeros n;
    private Servidor servidor;
    private Timer actu;
    private int numVencedores;
    private boolean thread;
    private Thread thr;
//    private Hashtable<String, String> apostaHash;

    public static void main(String[] args) throws IOException {

        Interface i = new Interface();

        i.setVisible(true);
        i.setSize(700, 550);

    }

    /**
     * Construtor da classe Interface do Projeto GestaoBingo
     */
    public Interface() throws IOException {

        thread = true;
        servidor = new Servidor();
        actu = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                mostraJogadores();

            }

        });

        apostador = new HashMap<String, String>();
        listaAposta = new DefaultListModel();
        listaNum = new DefaultListModel();
        n = new Numeros();
        numVencedores = 0;

        initComponents();

        Vencedor.setVisible(false);

        Jogo.setVisible(false);
        Apostas.setVisible(false);
        Menu.setVisible(true);
        setSize(700, 550);
        this.setLocationRelativeTo(null);

    }

    /**
     * Adiciona o número do cartão e o valor que apostaram
     */
    public void mostraJogadores() {
        Iterator<String> it = servidor.getJogApostas().keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();

            String txt = "Cartão " + next + " - " + servidor.getJogApostas().get(next) + "€";
            if (!listaAposta.contains(txt)) {
                listaAposta.addElement(txt);
            }
        }
    }

    /**
     * Código automático gerado pelo JFrame Form
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        Apostas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        Jogo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        Vencedor = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bingo v2.0 - Gestor");
        setResizable(false);

        jLabel2.setText("Desenvolvido por: Leandro Correia");

        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jButton1.setText("Começar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu Condensed", 1, 80)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestor do Bingo");

        jButton8.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jButton8.setText("Sair");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(168, 168, 168))))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(100, 100, 100)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        Apostas.setPreferredSize(new java.awt.Dimension(700, 550));

        jList1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setToolTipText("");
        jList1.setEnabled(false);
        jScrollPane1.setViewportView(jList1);

        jButton3.setBackground(java.awt.Color.white);
        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton3.setForeground(java.awt.Color.black);
        jButton3.setText("Começar  Jogo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ApostasLayout = new javax.swing.GroupLayout(Apostas);
        Apostas.setLayout(ApostasLayout);
        ApostasLayout.setHorizontalGroup(
            ApostasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApostasLayout.createSequentialGroup()
                .addGroup(ApostasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ApostasLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ApostasLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        ApostasLayout.setVerticalGroup(
            ApostasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApostasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        Jogo.setPreferredSize(new java.awt.Dimension(700, 550));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 80)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 2, 2));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jList2.setEnabled(false);
        jScrollPane2.setViewportView(jList2);

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton4.setText("Sortear número");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JogoLayout = new javax.swing.GroupLayout(Jogo);
        Jogo.setLayout(JogoLayout);
        JogoLayout.setHorizontalGroup(
            JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JogoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(JogoLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        JogoLayout.setVerticalGroup(
            JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JogoLayout.createSequentialGroup()
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JogoLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JogoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel7.setText("vamos começar outro!");

        jButton7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton7.setText("Voltar ao Inicio");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel11.setText("Acabou o jogo,");

        javax.swing.GroupLayout VencedorLayout = new javax.swing.GroupLayout(Vencedor);
        Vencedor.setLayout(VencedorLayout);
        VencedorLayout.setHorizontalGroup(
            VencedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VencedorLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VencedorLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(VencedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VencedorLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel11)
                        .addGap(72, 72, 72)))
                .addGap(86, 86, 86))
        );
        VencedorLayout.setVerticalGroup(
            VencedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VencedorLayout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(99, 99, 99)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Apostas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 353, Short.MAX_VALUE)
                    .addComponent(Jogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 353, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Vencedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apostas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Jogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Vencedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Ao pressionar o botão desativa a interface do Menu e vai para a interface
     * Apostas
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        thr = new Thread() {
            @Override
            public void run() {

                try {
                    servidor.start(33333);
                } catch (IOException ex) {
                    System.out.println(ex);
                }

            }
        };
        thr.start();

        actu.start();
        jList1.setModel(listaAposta);

        Menu.setVisible(false);
        setSize(390, 500);
        this.setLocationRelativeTo(null);
        Apostas.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Ao pressionar o botão desativa a interface Apostas e ativa a interface
     * Jogo Na ausência de informação de como saber o tamanho da lista, tirei
     * como referência o código do website indicado abaixo Link:
     * https://forums.codeguru.com/showthread.php?35883-How-to-test-if-JList-is-empty
     *
     * @param evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //Condição para verificar se houve alguma aposta
        if (jList1.getModel().getSize() == 0) {
            JOptionPane.showMessageDialog(null, "Impossível iniciar sem primeiro apostar", "Erro", 2);
        } else {
            try {
                servidor.enviar("comecou");
            } catch (IOException ex) {

            }
            //Caso haja alguma aposta desativa a interface Apostas e ativa a interface Jogo
            Apostas.setVisible(false);
            setSize(700, 550);
            this.setLocationRelativeTo(null);
            setSize(700, 550);
            this.setLocationRelativeTo(null);
            Jogo.setVisible(true);
            setSize(700, 550);
            this.setLocationRelativeTo(null);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Ao pressionar o botão sorteia um número e adiciona-o à lista
     *
     * @param evt
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            n.sortNumero();
            jLabel5.setText(String.valueOf(n.getNum()));
            listaNum.addElement(String.valueOf(n.getNum()));
            jList2.setModel(listaNum);
            servidor.enviar(String.valueOf(n.getNum()));

            Vector<String> respostas = servidor.receber();

            for (int i = 0; i < respostas.size(); i++) {
                if (respostas.get(i).equals("fizbingo")) {

                    try {
                        numVencedores++;
                        Thread.sleep((long) 0.5);
                        //                    servidor.receber();
                        servidor.enviar("bingo");
                        Jogo.setVisible(false);
                        Vencedor.setVisible(true);

                        servidor.somaVencedor(numVencedores);
                        servidor.enviar(String.valueOf(servidor.totalApostas()));
                    } catch (IOException ex) {

                    } catch (InterruptedException ex) {

                    }
                }
            }

        } catch (IOException ex) {

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Ao pressionar o Botão coloca os campos no seu estado inicial. Desativa a
     * interface Vencedor e ativa a interface Menu
     *
     * @param evt
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Thread.interrupted();
//        for (Thread t : Thread.getAllStackTraces().keySet()){  
//            if (t.getState()==Thread.State.RUNNABLE) t.interrupt(); 
//        }
        thr.interrupt();
        thread = false;

        Vencedor.setVisible(false);

        numVencedores = 0;
        apostador.clear();
        servidor.removeJogadores();
        try {
            servidor.resetVariaveis();
        } catch (IOException ex) {

        }
        listaAposta.clear();
        listaNum.clear();
        n.apagarLista();
        jLabel5.setText("");

        setSize(700, 550);
        this.setLocationRelativeTo(null);
        Menu.setVisible(true);
        setSize(700, 550);
        this.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * Ao pressionar o Botão sai do Gestor do Bingo
     *
     * @param evt
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Apostas;
    private javax.swing.JPanel Jogo;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Vencedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
