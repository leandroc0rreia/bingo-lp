package ajog;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.IOException;
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
    private HashAJOG hash;
    private int jogGanharam;
    private Thread t;
    private Thread o;
    private boolean thread;

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

        cartaoToggle = new JToggleButton[]{ct1, ct2, ct3, ct4, ct5, ct6, ct7, ct8, ct9, ct10, ct11, ct12, ct13, ct14,
            ct15, ct16, ct17, ct18, ct19, ct20, ct21, ct22, ct23, ct24, ct25, ct26, ct27};

        cartao = new JTextField[]{c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27};

        cartaoDeFora = new String[]{c1.getText(), c2.getText(), c3.getText(), c4.getText(), c5.getText(), c6.getText(), c7.getText(), c8.getText(), c9.getText(),
            c10.getText(), c11.getText(), c12.getText(), c13.getText(), c14.getText(), c15.getText(), c16.getText(), c17.getText(), c18.getText(),
            c19.getText(), c20.getText(), c21.getText(), c22.getText(), c23.getText(), c24.getText(), c25.getText(), c26.getText(), c27.getText()};

        s = new Sorteador();
        cartaoClass = new Cartao();
        cartaoClass.sortear();
        this.checkcartao = 0;
        this.l1 = false;
        this.l2 = false;
        this.l3 = false;
        this.numSort = "";
        this.jogGanharam = 0;
        this.thread = true;

        Menu.setVisible(true);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        CriarCartao.setVisible(false);
        Aposta.setVisible(false);
        Jogo.setVisible(false);
        Perdeu.setVisible(false);
        Bingo.setVisible(false);
        Escolha.setVisible(false);

        ImageIcon imagem = new ImageIcon("src/ajog/imagem.png");
        img.setIcon(imagem);

    }

    /**
     * Passa os números do cartao para uma string( designada para hash )
     *
     * @return
     */
    public String cartaoString() {

        String cartao = "";
        for (int i = 0; i < cartaoDeFora.length; i++) {
            cartao += cartaoDeFora[i];
        }

        return cartao;
    }

    /**
     * Verifica se todos os números do cartão foram selecionados, para fazer
     * Bingo.
     */
    public void fazerBingo() throws IOException {
        CriarCartao.setVisible(false);
        Jogo.setVisible(false);

        jLabel9.setText(jogador.receber() + "€");

        Bingo.setVisible(true);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
    }

    /**
     * Verifica se todos os números do cartão foram selecionados, para fazer
     * Bingo.
     */
    public void perdeuBingo() {
        CriarCartao.setVisible(false);
        Jogo.setVisible(false);

        setSize(607, 500);
        this.setLocationRelativeTo(null);
        setSize(607, 500);
        Perdeu.setVisible(true);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        setSize(607, 500);
    }

    /**
     * Comparador de números sorteados com os do cartão
     *
     * @throws IOException
     */
    public void compararNumComCartao() throws IOException {

        // Percorre todos os número no cartão e se for igual desabilita e soma +1 até chegar a 15 números checked
        for (int i = 0; i < cartaoToggle.length; i++) {
            if (cartaoToggle[i].getText().equals(numSort)) {
                cartaoToggle[i].setEnabled(false);
                checkcartao++;
            }
        }

        // Verifica se o cartão está completo para fazer bingo
        if (checkcartao == 15) {
            jogador.enviar("fizbingo");
            if (numSort.equals("bingo")) {
                fazerBingo();
            }
        } else {
            if (checkcartao != 15 && numSort.equals("bingo")) {
                perdeuBingo();
            } else {
                jogador.enviar("Recebido");
            }
        }

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
        Perdeu = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Bingo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Escolha = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bingo v2.0");
        setResizable(false);

        Menu.setPreferredSize(new java.awt.Dimension(607, 500));

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
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
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

        Aposta.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel3.setText("Quanto vai apostar?");
        jLabel3.setAlignmentY(0.0F);

        jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setAlignmentX(0.0F);
        jTextField1.setAlignmentY(0.0F);
        jTextField1.setAutoscrolls(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N
        jLabel4.setText("Máximo: 1500 €");
        jLabel4.setAlignmentY(0.0F);

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jButton2.setText("Apostar");
        jButton2.setAlignmentY(0.0F);
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
                .addGap(43, 43, 43)
                .addGroup(ApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ApostaLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(ApostaLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel4))
                    .addGroup(ApostaLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        ApostaLayout.setVerticalGroup(
            ApostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApostaLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        Jogo.setBackground(new java.awt.Color(0, 170, 255));

        ct3.setBackground(new java.awt.Color(140, 224, 254));
        ct3.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct3.setForeground(new java.awt.Color(19, 74, 189));
        ct3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct1.setBackground(new java.awt.Color(140, 224, 254));
        ct1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct1.setForeground(new java.awt.Color(19, 74, 189));
        ct1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct2.setBackground(new java.awt.Color(140, 224, 254));
        ct2.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct2.setForeground(new java.awt.Color(19, 74, 189));
        ct2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct6.setBackground(new java.awt.Color(140, 224, 254));
        ct6.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct6.setForeground(new java.awt.Color(19, 74, 189));
        ct6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct4.setBackground(new java.awt.Color(140, 224, 254));
        ct4.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct4.setForeground(new java.awt.Color(19, 74, 189));
        ct4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct5.setBackground(new java.awt.Color(140, 224, 254));
        ct5.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct5.setForeground(new java.awt.Color(19, 74, 189));
        ct5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct10.setBackground(new java.awt.Color(140, 224, 254));
        ct10.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct10.setForeground(new java.awt.Color(19, 74, 189));
        ct10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct11.setBackground(new java.awt.Color(140, 224, 254));
        ct11.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct11.setForeground(new java.awt.Color(19, 74, 189));
        ct11.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct9.setBackground(new java.awt.Color(140, 224, 254));
        ct9.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct9.setForeground(new java.awt.Color(19, 74, 189));
        ct9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct7.setBackground(new java.awt.Color(140, 224, 254));
        ct7.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct7.setForeground(new java.awt.Color(19, 74, 189));
        ct7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct8.setBackground(new java.awt.Color(140, 224, 254));
        ct8.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct8.setForeground(new java.awt.Color(19, 74, 189));
        ct8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct12.setBackground(new java.awt.Color(140, 224, 254));
        ct12.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct12.setForeground(new java.awt.Color(19, 74, 189));
        ct12.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct16.setBackground(new java.awt.Color(140, 224, 254));
        ct16.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct16.setForeground(new java.awt.Color(19, 74, 189));
        ct16.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct17.setBackground(new java.awt.Color(140, 224, 254));
        ct17.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct17.setForeground(new java.awt.Color(19, 74, 189));
        ct17.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct22.setBackground(new java.awt.Color(140, 224, 254));
        ct22.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct22.setForeground(new java.awt.Color(19, 74, 189));
        ct22.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct23.setBackground(new java.awt.Color(140, 224, 254));
        ct23.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct23.setForeground(new java.awt.Color(19, 74, 189));
        ct23.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct21.setBackground(new java.awt.Color(140, 224, 254));
        ct21.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct21.setForeground(new java.awt.Color(19, 74, 189));
        ct21.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct19.setBackground(new java.awt.Color(140, 224, 254));
        ct19.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct19.setForeground(new java.awt.Color(19, 74, 189));
        ct19.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct20.setBackground(new java.awt.Color(140, 224, 254));
        ct20.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct20.setForeground(new java.awt.Color(19, 74, 189));
        ct20.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct15.setBackground(new java.awt.Color(140, 224, 254));
        ct15.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct15.setForeground(new java.awt.Color(19, 74, 189));
        ct15.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct24.setBackground(new java.awt.Color(140, 224, 254));
        ct24.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct24.setForeground(new java.awt.Color(19, 74, 189));
        ct24.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct13.setBackground(new java.awt.Color(140, 224, 254));
        ct13.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct13.setForeground(new java.awt.Color(19, 74, 189));
        ct13.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct14.setBackground(new java.awt.Color(140, 224, 254));
        ct14.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct14.setForeground(new java.awt.Color(19, 74, 189));
        ct14.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct18.setBackground(new java.awt.Color(140, 224, 254));
        ct18.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct18.setForeground(new java.awt.Color(19, 74, 189));
        ct18.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct25.setBackground(new java.awt.Color(140, 224, 254));
        ct25.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct25.setForeground(new java.awt.Color(19, 74, 189));
        ct25.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct26.setBackground(new java.awt.Color(140, 224, 254));
        ct26.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct26.setForeground(new java.awt.Color(19, 74, 189));
        ct26.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

        ct27.setBackground(new java.awt.Color(140, 224, 254));
        ct27.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        ct27.setForeground(new java.awt.Color(19, 74, 189));
        ct27.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(3, 0, 181), new java.awt.Color(6, 1, 182)));

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

        jButton7.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jButton7.setText("Novo Jogo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 64)); // NOI18N
        jLabel2.setText("Jogo acabou!");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setText("Boa sorte para a próxima");

        javax.swing.GroupLayout PerdeuLayout = new javax.swing.GroupLayout(Perdeu);
        Perdeu.setLayout(PerdeuLayout);
        PerdeuLayout.setHorizontalGroup(
            PerdeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerdeuLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(PerdeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PerdeuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PerdeuLayout.createSequentialGroup()
                        .addGroup(PerdeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jButton7))
                        .addGap(141, 141, 141))))
        );
        PerdeuLayout.setVerticalGroup(
            PerdeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PerdeuLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(71, 71, 71))
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 80)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Parabéns");

        jButton6.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jButton6.setText("Novo Jogo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel8.setText("Ganhas-te:");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 28)); // NOI18N

        javax.swing.GroupLayout BingoLayout = new javax.swing.GroupLayout(Bingo);
        Bingo.setLayout(BingoLayout);
        BingoLayout.setHorizontalGroup(
            BingoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BingoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addGap(162, 162, 162))
            .addGroup(BingoLayout.createSequentialGroup()
                .addGroup(BingoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BingoLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(BingoLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addGap(124, 124, 124))
        );
        BingoLayout.setVerticalGroup(
            BingoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BingoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addGroup(BingoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(86, 86, 86))
        );

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 56)); // NOI18N
        jLabel6.setText("Continuar com");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 56)); // NOI18N
        jLabel7.setText("o mesmo cartão?");

        jButton8.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jButton8.setText("Sim");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jButton9.setText("Não");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EscolhaLayout = new javax.swing.GroupLayout(Escolha);
        Escolha.setLayout(EscolhaLayout);
        EscolhaLayout.setHorizontalGroup(
            EscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscolhaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(107, 107, 107))
            .addGroup(EscolhaLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel7)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscolhaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(110, 110, 110)
                .addComponent(jButton9)
                .addGap(129, 129, 129))
        );
        EscolhaLayout.setVerticalGroup(
            EscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscolhaLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(75, 75, 75)
                .addGroup(EscolhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton8))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 691, Short.MAX_VALUE))
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
                    .addComponent(Bingo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 691, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Aposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Perdeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Escolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 90, Short.MAX_VALUE))
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
                    .addGap(0, 89, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Aposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Perdeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Escolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        o = new Thread(
                new Runnable() {
            @Override
            public void run() {
                try {
                    jogador = new Jogador("localhost", 33333);
                    jogador.start();
                } catch (IOException ex) {

                }
            }
        }
        );
        o.start();

        cartaoDeFora = new String[]{c1.getText(), c2.getText(), c3.getText(), c4.getText(), c5.getText(), c6.getText(), c7.getText(), c8.getText(), c9.getText(),
            c10.getText(), c11.getText(), c12.getText(), c13.getText(), c14.getText(), c15.getText(), c16.getText(), c17.getText(), c18.getText(),
            c19.getText(), c20.getText(), c21.getText(), c22.getText(), c23.getText(), c24.getText(), c25.getText(), c26.getText(), c27.getText()};

        cartaoClass.receberCcartao(cartaoDeFora);

        if (cartaoClass.prontoAJogar(cartaoDeFora) == true) {
            setSize(607, 485);
            CriarCartao.setVisible(false);

            //Define o texto do cartao para o cartaoToggle (cartao de jogo).
            for (int i = 0; i < cartao.length; i++) {

                cartaoToggle[i].setEnabled(true);
                cartaoToggle[i].setBackground(new Color(0, 170, 255));
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

            setSize(607, 500);
            setLocationRelativeTo(null);
            Aposta.setVisible(true);
            setLocationRelativeTo(null);
            setSize(607, 500);

            setLocationRelativeTo(null);
            //Condição para colorir todos os números do cartao 
            for (JToggleButton jToggleButton : cartaoToggle) {
                if (!(jToggleButton.getText().equals(""))) {

                    jToggleButton.setBackground(new Color(222, 222, 222));
                }
            }

//            // Tentativa do hash
//            try {
//                jogador.enviar(hash.criarHash(cartaoString()));
//            } catch (IOException ex) {
//                
//            }
        } else {

        }

    }//GEN-LAST:event_jButton5ActionPerformed

//    /**
//     * Confirmar linha completada
//     */
//    public void linhaCompleta(){
//        int linha1 = 0;
//        int linha2 = 0;
//        int linha3 = 0;
//        
//        //Conta as posicoes selecionadas por linha
//        for (int i = 0; i < cartaoToggle.length; i=i+3) {
//            if (cartaoToggle[i].isSelected()) {
//                linha1++;
//            }
//        }
//        for (int i = 1; i < cartaoToggle.length; i=i+3) {
//            if (cartaoToggle[i].isSelected()) {
//                linha2++;
//            }
//        }
//        for (int i = 2; i < cartaoToggle.length; i=i+3) {
//            if (cartaoToggle[i].isSelected()) {
//                linha3++;
//            }
//        }
//        
//        if (l1==false) {
//            if (linha1==5) {
//                JOptionPane.showMessageDialog(null, "1ª Linha Completada", "Aviso!", 1);
//                l1 = true;
//            }
//        }
//        if (l2==false) {
//            if (linha2==5) {
//                JOptionPane.showMessageDialog(null, "2ª Linha Completada", "Aviso!", 1);
//                l2 = true;
//            }
//        }
//        if (l3==false) {
//            if (linha3==5) {
//                JOptionPane.showMessageDialog(null, "3ª Linha Completada", "Aviso!", 1);
//                l3 = true;
//            }
//        }
//        
//    }
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
     * Ao pressionar o Botão define tudo ao seu estado inicial. Para quem
     * conseguir fazer bingo
     *
     * @param evt
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        Bingo.setVisible(false);

        for (JToggleButton jToggleButton : cartaoToggle) {
            jToggleButton.setSelected(false);
            jToggleButton.setEnabled(true);
        }
        for (JTextField jTF : cartao) {
            jTF.setEditable(false);
        }

        jTextField1.setText("");
        this.checkcartao = 0;
        this.l1 = false;
        this.l2 = false;
        this.l3 = false;
        this.numSort = "";
        this.jogGanharam = 0;

        setSize(607, 500);
        this.setLocationRelativeTo(null);
        Escolha.setVisible(true);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        setSize(607, 500);
        this.setLocationRelativeTo(null);


    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * Botão criado para enviar o valor da aposta ao servidor assim fazendo o
     * jogo começar
     *
     * @param evt
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if ((jTextField1.getText().equals("")) || (Integer.parseInt(jTextField1.getText()) > 1500) || (Integer.parseInt(jTextField1.getText()) <= 0)) {
            JOptionPane.showMessageDialog(null, "Aposte entre 1 e 1500€", "Erro", 2);
        } else {
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

            t = new Thread(
                    new Runnable() {
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
            );
            if (thread == false) {
                t.run();
            } else {
                t.start();
            }

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (jTextField1.getText().length() > 3 || !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    /**
     * Ao pressionar o Botão define tudo ao seu estado inicial. Para quem perdeu
     * o jogo do bingo
     *
     * @param evt
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        Perdeu.setVisible(false);

        for (JToggleButton jToggleButton : cartaoToggle) {
            jToggleButton.setSelected(false);
            jToggleButton.setEnabled(true);
        }
        for (JTextField jTF : cartao) {
            jTF.setEditable(false);
        }

        jTextField1.setText("");
        this.checkcartao = 0;
        this.l1 = false;
        this.l2 = false;
        this.l3 = false;
        this.numSort = "";
        this.jogGanharam = 0;

        setSize(607, 500);
        this.setLocationRelativeTo(null);
        Escolha.setVisible(true);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        setSize(607, 500);
        this.setLocationRelativeTo(null);
        setSize(607, 500);
        this.setLocationRelativeTo(null);

    }//GEN-LAST:event_jButton7ActionPerformed

    // Botão de quem não quer continuar com o mesmo cartão
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        t.interrupt();
        thread = false;
        Escolha.setVisible(false);

        setSize(607, 500);
        this.setLocationRelativeTo(null);
        Menu.setVisible(true);
        setSize(607, 500);
        this.setLocationRelativeTo(null);

        try {
            this.jogador = new Jogador("localhost", 33333);
            this.jogador.start();
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    // Botão de quem quer continuar com o mesmo cartão
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        t.interrupt();
        thread = false;
        Escolha.setVisible(false);

        cartaoClass.sortear();
        for (int i = 0; i < cartao.length; i++) {
            cartao[i].setText(cartaoClass.ccartao[i]);
        }

        setSize(607, 500);
        this.setLocationRelativeTo(null);
        Menu.setVisible(true);
        setSize(607, 500);
        this.setLocationRelativeTo(null);

        try {
            this.jogador = new Jogador("localhost", 33333);
            this.jogador.start();
        } catch (IOException ex) {

        }
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aposta;
    private javax.swing.JPanel Bingo;
    private javax.swing.JPanel CriarCartao;
    private javax.swing.JPanel Escolha;
    private javax.swing.JPanel Jogo;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Perdeu;
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
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
