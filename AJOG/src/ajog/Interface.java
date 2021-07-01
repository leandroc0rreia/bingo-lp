package ajog;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author leandroc0rreia
 */
public class Interface extends javax.swing.JFrame {

    private int checkcartao;
    private JTextField[] cartao;
    private JToggleButton[] cartaoToggle;
    private Sorteador s;
    private Cartao cartaoClass;
    private String[] cartaoDeFora;
    private String numSort;
    private boolean l1;
    private boolean l2;
    private boolean l3;
    private Jogador jogador;

    public static void main(String[] args) throws IOException {
        
        Interface i = new Interface();
        
//        JOptionPane.showMessageDialog(null, "\n"
//            + "Bem-vindo à plataforma do Bingo\n"
//            + "Desenvolvido por: Leandro Correia\n\n"
//            + "Bingo é um jogo de azar divertido no qual todos podem participar.\n"
//            + "Nele, usa-se um cartão de quinze posições em que os números são sorteados\n"
//            + "aleatoriamente, se conseguir preencher todos os quadrados do jogo, GANHA!\n\n"
//            + "Regras:\n\n"
//            + "         1. Visualize os números do seu cartão;\n"
//            + "         2. Introduza o número sorteado exteriormente;\n"
//            + "         3. Grite 'Bingo' se tiver o cartão completo;\n"
//            + "         4. Boa sorte e divirta-se!\n\n", "Bingo v2.0", JOptionPane.PLAIN_MESSAGE);
        
        i.setVisible(true);
        
    }
    
    /**
     * Construtor da Interface
     */
    public Interface() throws IOException {

        initComponents();
        this.setLocationRelativeTo(null);
        
        jogador = new Jogador("localhost", 33333);
        
        new Thread(
                new Runnable(){
                @Override
                    public void run() {
                        jogador.start();
                    }
                }
        ).start();
        
        cartaoToggle = new JToggleButton[]{ct1, ct2, ct3, ct4, ct5, ct6, ct7, ct8, ct9, ct10, ct11, ct12, ct13, ct14,
                                        ct15, ct16, ct17, ct18, ct19, ct20, ct21, ct22, ct23, ct24, ct25, ct26, ct27};
        
        cartao = new JTextField[]{c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27};
        
        cartaoDeFora = new String[]{c1.getText(),c2.getText(),c3.getText(),c4.getText(),c5.getText(),c6.getText(),c7.getText(),c8.getText(),c9.getText(),
                                    c10.getText(),c11.getText(),c12.getText(),c13.getText(),c14.getText(),c15.getText(),c16.getText(),c17.getText(),c18.getText(),
                                    c19.getText(),c20.getText(),c21.getText(),c22.getText(),c23.getText(),c24.getText(),c25.getText(),c26.getText(),c27.getText()};
        
        s = new Sorteador();
        cartaoClass = new Cartao();
        cartaoClass.sortear();
        this.checkcartao = 0;
        this.l1 = false;
        this.l2 = false;
        this.l3 = false;
        this.numSort = "";

        Menu.setVisible(true);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        CriarCartao.setVisible(false);
        Aposta.setVisible(false);
        Jogo.setVisible(false);
        Bingo.setVisible(false);

        ImageIcon imagem = new ImageIcon("src/ajog/imagem.png");
        img.setIcon(imagem);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
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
        Aposta = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Jogo = new javax.swing.JPanel();
        ct3 = new javax.swing.JToggleButton();
        ct1 = new javax.swing.JToggleButton();
        ct2 = new javax.swing.JToggleButton();
        ct6 = new javax.swing.JToggleButton();
        ct4 = new javax.swing.JToggleButton();
        ct5 = new javax.swing.JToggleButton();
        ct10 = new javax.swing.JToggleButton();
        ct11 = new javax.swing.JToggleButton();
        ct9 = new javax.swing.JToggleButton();
        ct7 = new javax.swing.JToggleButton();
        ct8 = new javax.swing.JToggleButton();
        ct12 = new javax.swing.JToggleButton();
        ct16 = new javax.swing.JToggleButton();
        ct17 = new javax.swing.JToggleButton();
        ct22 = new javax.swing.JToggleButton();
        ct23 = new javax.swing.JToggleButton();
        ct21 = new javax.swing.JToggleButton();
        ct19 = new javax.swing.JToggleButton();
        ct20 = new javax.swing.JToggleButton();
        ct15 = new javax.swing.JToggleButton();
        ct24 = new javax.swing.JToggleButton();
        ct13 = new javax.swing.JToggleButton();
        ct14 = new javax.swing.JToggleButton();
        ct18 = new javax.swing.JToggleButton();
        ct25 = new javax.swing.JToggleButton();
        ct26 = new javax.swing.JToggleButton();
        ct27 = new javax.swing.JToggleButton();
        Bingo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bingo v2.0");
        setResizable(false);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        CriarCartao.setBackground(new java.awt.Color(0, 170, 255));

        c1.setEditable(false);
        c1.setBackground(new java.awt.Color(0, 170, 255));
        c1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1KeyTyped(evt);
            }
        });

        c2.setEditable(false);
        c2.setBackground(new java.awt.Color(0, 170, 255));
        c2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2KeyTyped(evt);
            }
        });

        c3.setEditable(false);
        c3.setBackground(new java.awt.Color(0, 170, 255));
        c3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3KeyTyped(evt);
            }
        });

        c4.setEditable(false);
        c4.setBackground(new java.awt.Color(0, 170, 255));
        c4.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4KeyTyped(evt);
            }
        });

        c5.setEditable(false);
        c5.setBackground(new java.awt.Color(0, 170, 255));
        c5.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5KeyTyped(evt);
            }
        });

        c6.setEditable(false);
        c6.setBackground(new java.awt.Color(0, 170, 255));
        c6.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6KeyTyped(evt);
            }
        });

        c7.setEditable(false);
        c7.setBackground(new java.awt.Color(0, 170, 255));
        c7.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7KeyTyped(evt);
            }
        });

        c8.setEditable(false);
        c8.setBackground(new java.awt.Color(0, 170, 255));
        c8.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8KeyTyped(evt);
            }
        });

        c9.setEditable(false);
        c9.setBackground(new java.awt.Color(0, 170, 255));
        c9.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c9KeyTyped(evt);
            }
        });

        c10.setEditable(false);
        c10.setBackground(new java.awt.Color(0, 170, 255));
        c10.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c10KeyTyped(evt);
            }
        });

        c11.setEditable(false);
        c11.setBackground(new java.awt.Color(0, 170, 255));
        c11.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c11KeyTyped(evt);
            }
        });

        c12.setEditable(false);
        c12.setBackground(new java.awt.Color(0, 170, 255));
        c12.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c12KeyTyped(evt);
            }
        });

        c13.setEditable(false);
        c13.setBackground(new java.awt.Color(0, 170, 255));
        c13.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c13.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c13KeyTyped(evt);
            }
        });

        c14.setEditable(false);
        c14.setBackground(new java.awt.Color(0, 170, 255));
        c14.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c14.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c14KeyTyped(evt);
            }
        });

        c15.setEditable(false);
        c15.setBackground(new java.awt.Color(0, 170, 255));
        c15.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c15.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c15KeyTyped(evt);
            }
        });

        c16.setEditable(false);
        c16.setBackground(new java.awt.Color(0, 170, 255));
        c16.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c16.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c16KeyTyped(evt);
            }
        });

        c17.setEditable(false);
        c17.setBackground(new java.awt.Color(0, 170, 255));
        c17.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c17.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c17KeyTyped(evt);
            }
        });

        c18.setEditable(false);
        c18.setBackground(new java.awt.Color(0, 170, 255));
        c18.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c18.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c18KeyTyped(evt);
            }
        });

        c19.setEditable(false);
        c19.setBackground(new java.awt.Color(0, 170, 255));
        c19.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c19.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c19KeyTyped(evt);
            }
        });

        c20.setEditable(false);
        c20.setBackground(new java.awt.Color(0, 170, 255));
        c20.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c20.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c20KeyTyped(evt);
            }
        });

        c21.setEditable(false);
        c21.setBackground(new java.awt.Color(0, 170, 255));
        c21.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c21.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c21KeyTyped(evt);
            }
        });

        c22.setEditable(false);
        c22.setBackground(new java.awt.Color(0, 170, 255));
        c22.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c22.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c22KeyTyped(evt);
            }
        });

        c23.setEditable(false);
        c23.setBackground(new java.awt.Color(0, 170, 255));
        c23.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c23.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c23KeyTyped(evt);
            }
        });

        c24.setEditable(false);
        c24.setBackground(new java.awt.Color(0, 170, 255));
        c24.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c24.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c24KeyTyped(evt);
            }
        });

        c25.setEditable(false);
        c25.setBackground(new java.awt.Color(0, 170, 255));
        c25.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c25.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c25KeyTyped(evt);
            }
        });

        c26.setEditable(false);
        c26.setBackground(new java.awt.Color(0, 170, 255));
        c26.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c26.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c26KeyTyped(evt);
            }
        });

        c27.setEditable(false);
        c27.setBackground(new java.awt.Color(0, 170, 255));
        c27.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        c27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c27.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        c27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c27KeyTyped(evt);
            }
        });

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
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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

        Aposta.setPreferredSize(new java.awt.Dimension(607, 485));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quanto vai apostar?");

        jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel4.setText("Máximo: 1500 €");

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton2.setText("Apostar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ApostaLayout = new javax.swing.GroupLayout(Aposta);
        Aposta.setLayout(ApostaLayout);
        ApostaLayout.setHorizontalGroup(
            ApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApostaLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ApostaLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(ApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(ApostaLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ApostaLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel4)))
                .addGap(74, 74, 74))
        );
        ApostaLayout.setVerticalGroup(
            ApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApostaLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(58, 58, 58)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        Jogo.setBackground(new java.awt.Color(0, 170, 255));

        ct3.setBackground(new java.awt.Color(140, 224, 254));
        ct3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct3.setForeground(new java.awt.Color(19, 74, 189));
        ct3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct3ActionPerformed(evt);
            }
        });

        ct1.setBackground(new java.awt.Color(140, 224, 254));
        ct1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct1.setForeground(new java.awt.Color(19, 74, 189));
        ct1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct1ActionPerformed(evt);
            }
        });

        ct2.setBackground(new java.awt.Color(140, 224, 254));
        ct2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct2.setForeground(new java.awt.Color(19, 74, 189));
        ct2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct2ActionPerformed(evt);
            }
        });

        ct6.setBackground(new java.awt.Color(140, 224, 254));
        ct6.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct6.setForeground(new java.awt.Color(19, 74, 189));
        ct6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct6ActionPerformed(evt);
            }
        });

        ct4.setBackground(new java.awt.Color(140, 224, 254));
        ct4.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct4.setForeground(new java.awt.Color(19, 74, 189));
        ct4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct4ActionPerformed(evt);
            }
        });

        ct5.setBackground(new java.awt.Color(140, 224, 254));
        ct5.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct5.setForeground(new java.awt.Color(19, 74, 189));
        ct5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct5ActionPerformed(evt);
            }
        });

        ct10.setBackground(new java.awt.Color(140, 224, 254));
        ct10.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct10.setForeground(new java.awt.Color(19, 74, 189));
        ct10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct10ActionPerformed(evt);
            }
        });

        ct11.setBackground(new java.awt.Color(140, 224, 254));
        ct11.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct11.setForeground(new java.awt.Color(19, 74, 189));
        ct11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct11ActionPerformed(evt);
            }
        });

        ct9.setBackground(new java.awt.Color(140, 224, 254));
        ct9.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct9.setForeground(new java.awt.Color(19, 74, 189));
        ct9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct9ActionPerformed(evt);
            }
        });

        ct7.setBackground(new java.awt.Color(140, 224, 254));
        ct7.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct7.setForeground(new java.awt.Color(19, 74, 189));
        ct7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct7ActionPerformed(evt);
            }
        });

        ct8.setBackground(new java.awt.Color(140, 224, 254));
        ct8.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct8.setForeground(new java.awt.Color(19, 74, 189));
        ct8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct8ActionPerformed(evt);
            }
        });

        ct12.setBackground(new java.awt.Color(140, 224, 254));
        ct12.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct12.setForeground(new java.awt.Color(19, 74, 189));
        ct12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct12ActionPerformed(evt);
            }
        });

        ct16.setBackground(new java.awt.Color(140, 224, 254));
        ct16.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct16.setForeground(new java.awt.Color(19, 74, 189));
        ct16.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct16ActionPerformed(evt);
            }
        });

        ct17.setBackground(new java.awt.Color(140, 224, 254));
        ct17.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct17.setForeground(new java.awt.Color(19, 74, 189));
        ct17.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct17ActionPerformed(evt);
            }
        });

        ct22.setBackground(new java.awt.Color(140, 224, 254));
        ct22.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct22.setForeground(new java.awt.Color(19, 74, 189));
        ct22.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct22ActionPerformed(evt);
            }
        });

        ct23.setBackground(new java.awt.Color(140, 224, 254));
        ct23.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct23.setForeground(new java.awt.Color(19, 74, 189));
        ct23.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct23ActionPerformed(evt);
            }
        });

        ct21.setBackground(new java.awt.Color(140, 224, 254));
        ct21.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct21.setForeground(new java.awt.Color(19, 74, 189));
        ct21.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct21ActionPerformed(evt);
            }
        });

        ct19.setBackground(new java.awt.Color(140, 224, 254));
        ct19.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct19.setForeground(new java.awt.Color(19, 74, 189));
        ct19.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct19ActionPerformed(evt);
            }
        });

        ct20.setBackground(new java.awt.Color(140, 224, 254));
        ct20.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct20.setForeground(new java.awt.Color(19, 74, 189));
        ct20.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct20ActionPerformed(evt);
            }
        });

        ct15.setBackground(new java.awt.Color(140, 224, 254));
        ct15.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct15.setForeground(new java.awt.Color(19, 74, 189));
        ct15.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct15ActionPerformed(evt);
            }
        });

        ct24.setBackground(new java.awt.Color(140, 224, 254));
        ct24.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct24.setForeground(new java.awt.Color(19, 74, 189));
        ct24.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct24ActionPerformed(evt);
            }
        });

        ct13.setBackground(new java.awt.Color(140, 224, 254));
        ct13.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct13.setForeground(new java.awt.Color(19, 74, 189));
        ct13.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct13ActionPerformed(evt);
            }
        });

        ct14.setBackground(new java.awt.Color(140, 224, 254));
        ct14.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct14.setForeground(new java.awt.Color(19, 74, 189));
        ct14.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct14ActionPerformed(evt);
            }
        });

        ct18.setBackground(new java.awt.Color(140, 224, 254));
        ct18.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct18.setForeground(new java.awt.Color(19, 74, 189));
        ct18.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct18ActionPerformed(evt);
            }
        });

        ct25.setBackground(new java.awt.Color(140, 224, 254));
        ct25.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct25.setForeground(new java.awt.Color(19, 74, 189));
        ct25.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct25ActionPerformed(evt);
            }
        });

        ct26.setBackground(new java.awt.Color(140, 224, 254));
        ct26.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct26.setForeground(new java.awt.Color(19, 74, 189));
        ct26.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct26ActionPerformed(evt);
            }
        });

        ct27.setBackground(new java.awt.Color(140, 224, 254));
        ct27.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct27.setForeground(new java.awt.Color(19, 74, 189));
        ct27.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));
        ct27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JogoLayout = new javax.swing.GroupLayout(Jogo);
        Jogo.setLayout(JogoLayout);
        JogoLayout.setHorizontalGroup(
            JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ct1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ct4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ct7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ct10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ct13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ct16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ct19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ct22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ct25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        JogoLayout.setVerticalGroup(
            JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JogoLayout.createSequentialGroup()
                        .addComponent(ct25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ct26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ct27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(JogoLayout.createSequentialGroup()
                            .addComponent(ct22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JogoLayout.createSequentialGroup()
                            .addComponent(ct19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JogoLayout.createSequentialGroup()
                            .addComponent(ct16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JogoLayout.createSequentialGroup()
                            .addComponent(ct13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(JogoLayout.createSequentialGroup()
                            .addComponent(ct10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JogoLayout.createSequentialGroup()
                            .addComponent(ct7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JogoLayout.createSequentialGroup()
                            .addComponent(ct4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JogoLayout.createSequentialGroup()
                            .addComponent(ct1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ct3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Bingo.setPreferredSize(new java.awt.Dimension(607, 500));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 80)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Parabéns");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setText("Assegure o seu prémio e grite \"BINGO\"");

        jButton6.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jButton6.setText("BINGO!");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BingoLayout = new javax.swing.GroupLayout(Bingo);
        Bingo.setLayout(BingoLayout);
        BingoLayout.setHorizontalGroup(
            BingoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BingoLayout.createSequentialGroup()
                .addGroup(BingoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BingoLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(BingoLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2))
                    .addGroup(BingoLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButton6)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        BingoLayout.setVerticalGroup(
            BingoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BingoLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(80, 80, 80)
                .addComponent(jButton6)
                .addContainerGap(111, Short.MAX_VALUE))
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Bingo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Aposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 65, Short.MAX_VALUE))
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Bingo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Aposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Inicia a interface CriarCartao e desativa a interface Menu.
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Menu.setVisible(false);
        setSize(1068, 550);
        CriarCartao.setVisible(true);
        setSize(1068, 550);
        setLocationRelativeTo(null);
        setSize(1068, 550);
        setLocationRelativeTo(null);
        setSize(1068, 550);
        cartaoClass.sortear();
        for (int i = 0; i < cartao.length; i++) {
            cartao[i].setText(cartaoClass.ccartao[i]);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Sorteia aleatoriamente o cartão.
     *
     * @param evt
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cartaoClass.sortear();
        for (int i = 0; i < cartao.length; i++) {
            cartao[i].setText(cartaoClass.ccartao[i]);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * Permite ao utilizador editar cada casa do cartão.
     *
     * @param evt
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        for (JTextField jTextField : cartao) {
            jTextField.setBackground(Color.white);
            jTextField.setEditable(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Verifica os métodos verificarEspacosBranco, verificarNumColuna e
     * verificarRepetido sendo eles necessários e importantes para poder começar
     * o jogo.
     *
     * @param evt
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    
        cartaoDeFora = new String[]{c1.getText(),c2.getText(),c3.getText(),c4.getText(),c5.getText(),c6.getText(),c7.getText(),c8.getText(),c9.getText(),
                                    c10.getText(),c11.getText(),c12.getText(),c13.getText(),c14.getText(),c15.getText(),c16.getText(),c17.getText(),c18.getText(),
                                    c19.getText(),c20.getText(),c21.getText(),c22.getText(),c23.getText(),c24.getText(),c25.getText(),c26.getText(),c27.getText()};
        
        cartaoClass.receberCcartao(cartaoDeFora);
        
        if (cartaoClass.prontoAJogar(cartaoDeFora) == true) {
            setSize(607, 485);
            CriarCartao.setVisible(false);

            //Define o texto do cartao para o cartaoToggle (cartao de jogo).
            for (int i = 0; i < cartao.length; i++) {
                cartaoToggle[i].setText(cartao[i].getText());
            }

            //Condição para colorir todos os espaços em branco e desabilitando-os.
            for (JToggleButton jtb : cartaoToggle) {
                if (jtb.getText().equals("")) {
                    jtb.setBackground(new Color(0, 170, 255));
                    jtb.setEnabled(false);
                } else {
                    
                }
            }

            Aposta.setVisible(true);
            setLocationRelativeTo(null);
            //Condição para colorir todos os números do cartao 
            for (JToggleButton jToggleButton : cartaoToggle) {
                if (!(jToggleButton.getText().equals(""))) {
                    jToggleButton.setBackground(new Color(222, 222, 222));
                }
            }
            
            
        } else {
            
        }

    }//GEN-LAST:event_jButton5ActionPerformed
    
    public void compararNumComCartao() throws IOException{
        for (int i = 0; i < cartaoToggle.length; i++) {
            if (cartaoToggle[i].getText().equals(numSort)) {
                cartaoToggle[i].setEnabled(false);
                checkcartao++;
            }
        }
        if (checkcartao==15) {
            //a fazer BINGO - enviar para o servidor
        }else{
            jogador.enviar("Recebido");
        }
        
    }
    
    /**
     * Confirmar linha completada
     */
    public void linhaCompleta(){
        int linha1 = 0;
        int linha2 = 0;
        int linha3 = 0;
        
        //Conta as posicoes selecionadas por linha
        for (int i = 0; i < cartaoToggle.length; i=i+3) {
            if (cartaoToggle[i].isSelected()) {
                linha1++;
            }
        }
        for (int i = 1; i < cartaoToggle.length; i=i+3) {
            if (cartaoToggle[i].isSelected()) {
                linha2++;
            }
        }
        for (int i = 2; i < cartaoToggle.length; i=i+3) {
            if (cartaoToggle[i].isSelected()) {
                linha3++;
            }
        }
        
        if (l1==false) {
            if (linha1==5) {
                JOptionPane.showMessageDialog(null, "1ª Linha Completada", "Aviso!", 1);
                l1 = true;
            }
        }
        if (l2==false) {
            if (linha2==5) {
                JOptionPane.showMessageDialog(null, "2ª Linha Completada", "Aviso!", 1);
                l2 = true;
            }
        }
        if (l3==false) {
            if (linha3==5) {
                JOptionPane.showMessageDialog(null, "3ª Linha Completada", "Aviso!", 1);
                l3 = true;
            }
        }
        
    }
    
    /**
     * Verifica se todos os números do cartão foram selecionados, para fazer
     * Bingo.
     */
    public void fazerBingo() {
        
        linhaCompleta();
        if (checkcartao == 15) {

            CriarCartao.setVisible(false);
            Jogo.setVisible(false);

            Bingo.setVisible(true);
            setSize(607, 500);
            this.setLocationRelativeTo(null);
            setSize(607, 500);
            this.setLocationRelativeTo(null);
            setSize(607, 500);
            this.setLocationRelativeTo(null);
        }
    }

    /**
     * Restringe os dados de entrada para haver só valores númericos. Na
     * ausência de informação, usei como referência o vídeo do Youtube do canal
     * ProgrammingKnowledge, indicado abaixo. Link:
     * https://www.youtube.com/watch?v=9B5ZgItFxNA
     *
     * @param evt
     */
    private void c1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1KeyTyped
        char c = evt.getKeyChar();
        if (c1.getText().length() > 0 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_c1KeyTyped

    private void c2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2KeyTyped
        char c = evt.getKeyChar();
        if (c2.getText().length() > 0 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_c2KeyTyped

    private void c3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3KeyTyped
        char c = evt.getKeyChar();
        if (c3.getText().length() > 0 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_c3KeyTyped

    private void c4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4KeyTyped
        char c = evt.getKeyChar();
        if (c4.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_c4KeyTyped

    private void c5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5KeyTyped
        char c = evt.getKeyChar();
        if (c5.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_c5KeyTyped

    private void c6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6KeyTyped
        char c = evt.getKeyChar();
        if (c6.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c6KeyTyped

    private void c7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7KeyTyped
        char c = evt.getKeyChar();
        if (c7.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c7KeyTyped

    private void c8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8KeyTyped
        char c = evt.getKeyChar();
        if (c8.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c8KeyTyped

    private void c9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c9KeyTyped
        char c = evt.getKeyChar();
        if (c9.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c9KeyTyped

    private void c10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c10KeyTyped
        char c = evt.getKeyChar();
        if (c10.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c10KeyTyped

    private void c11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c11KeyTyped
        char c = evt.getKeyChar();
        if (c11.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c11KeyTyped

    private void c12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c12KeyTyped
        char c = evt.getKeyChar();
        if (c12.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c12KeyTyped

    private void c13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c13KeyTyped
        char c = evt.getKeyChar();
        if (c13.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c13KeyTyped

    private void c14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c14KeyTyped
        char c = evt.getKeyChar();
        if (c14.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c14KeyTyped

    private void c15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c15KeyTyped
        char c = evt.getKeyChar();
        if (c15.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c15KeyTyped

    private void c16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c16KeyTyped
        char c = evt.getKeyChar();
        if (c16.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c16KeyTyped

    private void c17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c17KeyTyped
        char c = evt.getKeyChar();
        if (c17.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c17KeyTyped

    private void c18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c18KeyTyped
        char c = evt.getKeyChar();
        if (c18.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c18KeyTyped

    private void c19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c19KeyTyped
        char c = evt.getKeyChar();
        if (c19.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c19KeyTyped

    private void c20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c20KeyTyped
        char c = evt.getKeyChar();
        if (c20.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c20KeyTyped

    private void c21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c21KeyTyped
        char c = evt.getKeyChar();
        if (c21.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c21KeyTyped

    private void c22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c22KeyTyped
        char c = evt.getKeyChar();
        if (c22.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c22KeyTyped

    private void c23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c23KeyTyped
        char c = evt.getKeyChar();
        if (c23.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c23KeyTyped

    private void c24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c24KeyTyped
        char c = evt.getKeyChar();
        if (c24.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c24KeyTyped

    private void c25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c25KeyTyped
        char c = evt.getKeyChar();
        if (c25.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c25KeyTyped

    private void c26KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c26KeyTyped
        char c = evt.getKeyChar();
        if (c26.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c26KeyTyped

    private void c27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c27KeyTyped
        char c = evt.getKeyChar();
        if (c27.getText().length() > 1 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }

    }//GEN-LAST:event_c27KeyTyped

    /**
     * Condição para verificar se o número foi selecionado e desativando-o se
     * for o caso.
     *
     * @param evt
     */
    private void ct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct1ActionPerformed
       
        
        if (ct1.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct1.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct1ActionPerformed

    private void ct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct2ActionPerformed
        if (ct2.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct2.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct2ActionPerformed

    private void ct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct3ActionPerformed
        if (ct3.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct3.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct3ActionPerformed

    private void ct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct4ActionPerformed
        if (ct4.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct4.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct4ActionPerformed

    private void ct5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct5ActionPerformed
        if (ct5.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct5.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct5ActionPerformed

    private void ct6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct6ActionPerformed
        if (ct6.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct6.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct6ActionPerformed

    private void ct7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct7ActionPerformed
        if (ct7.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct7.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct7ActionPerformed

    private void ct8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct8ActionPerformed
        if (ct8.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct8.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct8ActionPerformed

    private void ct9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct9ActionPerformed
        if (ct9.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct9.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct9ActionPerformed

    private void ct10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct10ActionPerformed
        if (ct10.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct10.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct10ActionPerformed

    private void ct11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct11ActionPerformed
        if (ct11.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct11.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct11ActionPerformed

    private void ct12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct12ActionPerformed
        if (ct12.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct12.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct12ActionPerformed

    private void ct13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct13ActionPerformed
        if (ct13.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct13.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct13ActionPerformed

    private void ct14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct14ActionPerformed
        if (ct14.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct14.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct14ActionPerformed

    private void ct15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct15ActionPerformed
        if (ct15.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct15.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct15ActionPerformed

    private void ct16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct16ActionPerformed
        if (ct16.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct16.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct16ActionPerformed

    private void ct17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct17ActionPerformed
        if (ct17.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct17.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct17ActionPerformed

    private void ct18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct18ActionPerformed
        if (ct18.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct18.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct18ActionPerformed

    private void ct19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct19ActionPerformed
        if (ct19.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct19.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct19ActionPerformed

    private void ct20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct20ActionPerformed
        if (ct20.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct20.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct20ActionPerformed

    private void ct21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct21ActionPerformed
        if (ct21.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct21.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct21ActionPerformed

    private void ct22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct22ActionPerformed
        if (ct22.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct22.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct22ActionPerformed

    private void ct23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct23ActionPerformed
        if (ct23.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct23.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct23ActionPerformed

    private void ct24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct24ActionPerformed
        if (ct24.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct24.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct24ActionPerformed

    private void ct25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct25ActionPerformed
        if (ct25.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct25.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct25ActionPerformed

    private void ct26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct26ActionPerformed
        if (ct26.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct26.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct26ActionPerformed

    private void ct27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct27ActionPerformed
        if (ct27.isSelected()) {
            this.checkcartao = checkcartao + 1;
            ct27.setEnabled(false);
        }
        fazerBingo();
    }//GEN-LAST:event_ct27ActionPerformed

    /**
     * Ao pressionar o Botão define tudo ao seu estado inicial.
     *
     * @param evt
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null, "Obrigado por participar", "Bingo v2.0", 1);
        Bingo.setVisible(false);

        for (JToggleButton jToggleButton : cartaoToggle) {
            jToggleButton.setSelected(false);
            jToggleButton.setEnabled(true);
        }
        for (JTextField jTF : cartao) {
            jTF.setEditable(false);
        }
        this.checkcartao = 0;
        this.l1 = false;
        this.l2 = false;
        this.l3 = false;
        jTextField1.setText("");
        
        Menu.setVisible(true);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if ((jTextField1.getText().equals("")) || (Integer.parseInt(jTextField1.getText()) > 1500) || (Integer.parseInt(jTextField1.getText()) <= 0)) {
            JOptionPane.showMessageDialog(null, "Aposte entre 1 e 1500€", "Erro", 2);
        }else{
            try {
                jogador.enviar(jTextField1.getText());
                try {
                    if (jogador.receber().equals("comecou")) {
                        Aposta.setVisible(false);
                        setSize(1068, 395);
                        setLocationRelativeTo(null);
                        Jogo.setVisible(true);
                        setSize(1068, 395);
                        setLocationRelativeTo(null);
                    }
                } catch (IOException ex) {
                    
                }
            } catch (IOException ex) {
                
            }
            
            new Thread(
                new Runnable(){
                @Override
                    public void run() {
                        while (true) {                        
                            try {
                                numSort = jogador.receber();
                                compararNumComCartao();
                            } catch (IOException ex) {
                               
                            }
                        }
                    }
                }
            ).start();
            
        }
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (jTextField1.getText().length() > 3 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aposta;
    private javax.swing.JPanel Bingo;
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
    private javax.swing.JToggleButton ct1;
    private javax.swing.JToggleButton ct10;
    private javax.swing.JToggleButton ct11;
    private javax.swing.JToggleButton ct12;
    private javax.swing.JToggleButton ct13;
    private javax.swing.JToggleButton ct14;
    private javax.swing.JToggleButton ct15;
    private javax.swing.JToggleButton ct16;
    private javax.swing.JToggleButton ct17;
    private javax.swing.JToggleButton ct18;
    private javax.swing.JToggleButton ct19;
    private javax.swing.JToggleButton ct2;
    private javax.swing.JToggleButton ct20;
    private javax.swing.JToggleButton ct21;
    private javax.swing.JToggleButton ct22;
    private javax.swing.JToggleButton ct23;
    private javax.swing.JToggleButton ct24;
    private javax.swing.JToggleButton ct25;
    private javax.swing.JToggleButton ct26;
    private javax.swing.JToggleButton ct27;
    private javax.swing.JToggleButton ct3;
    private javax.swing.JToggleButton ct4;
    private javax.swing.JToggleButton ct5;
    private javax.swing.JToggleButton ct6;
    private javax.swing.JToggleButton ct7;
    private javax.swing.JToggleButton ct8;
    private javax.swing.JToggleButton ct9;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
