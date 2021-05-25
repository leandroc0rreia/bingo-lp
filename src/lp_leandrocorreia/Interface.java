
package lp_leandrocorreia;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
        
        ImageIcon imagem = new ImageIcon("src/img/imagem.png");
        img.setIcon(imagem);
        
        
    }
    
    private void sortear(){
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
    
    //https://www.w3schools.com/java/java_try_catch.asp
    private void verificarNumCartao(){
        for (int i = 0; i < 27; i++) {
            try {
                if(Integer.parseInt(cartao[i].getText()) < 1 || Integer.parseInt(cartao[i].getText()) > 90){ 
                    JOptionPane.showMessageDialog(null, "Insira números entre 1 e 90", "Erro", 2);
                    cartao[i].setText("");
                }
            } catch (Exception e) {
                cartao[i].setText("");
            }
        }
    }
    
    private boolean verificarEspacosBranco(){
        int check = 0;
        
        for (JTextField jTextField : cartao) {
            if (jTextField.getText().equals("")) {
                check=check+1;
            }
        }
        
        if (check!=12) {
            JOptionPane.showMessageDialog(null, "O seu cartão não cumpre com 5 números por linha", "Erro", 2);
            return false;
        }else{
            return true;
        }
    }
    
    private boolean verificarNumColuna(){
        
        int check = 0;

        for (int i = 0; i < 27; i++) {
            if (i==0 || i==1 || i==2) {
                if ( cartao[i].getText().equals("") || (Integer.parseInt(cartao[i].getText()) >= 1 && Integer.parseInt(cartao[i].getText()) <= 9)) check = check + 1;
            }
            if (i==3 || i==4 || i==5) {
                if ( cartao[i].getText().equals("") || (Integer.parseInt(cartao[i].getText()) >= 10 && Integer.parseInt(cartao[i].getText()) <= 19)) check = check + 1;
            }
            if (i==6 || i==7 || i==8) {
                if ( cartao[i].getText().equals("") || (Integer.parseInt(cartao[i].getText()) >= 20 && Integer.parseInt(cartao[i].getText()) <= 29)) check = check + 1;
            }
            if (i==9 || i==10 || i==11) {
                if ( cartao[i].getText().equals("") || (Integer.parseInt(cartao[i].getText()) >= 30 && Integer.parseInt(cartao[i].getText()) <= 39)) check = check + 1;
            }
            if (i==12 || i==13 || i==14) {
                if ( cartao[i].getText().equals("") || (Integer.parseInt(cartao[i].getText()) >= 40 && Integer.parseInt(cartao[i].getText()) <= 49)) check = check + 1;
            }
            if (i==15 || i==16 || i==17) {
                if ( cartao[i].getText().equals("") || (Integer.parseInt(cartao[i].getText()) >= 50 && Integer.parseInt(cartao[i].getText()) <= 59)) check = check + 1;
            }
            if (i==18 || i==19 || i==20) {
                if ( cartao[i].getText().equals("") || (Integer.parseInt(cartao[i].getText()) >= 60 && Integer.parseInt(cartao[i].getText()) <= 69)) check = check + 1;
            }
            if (i==21 || i==22 || i==23) {
                if ( cartao[i].getText().equals("") || (Integer.parseInt(cartao[i].getText()) >= 70 && Integer.parseInt(cartao[i].getText()) <= 79)) check = check + 1;
            }
            if (i==24 || i==25 || i==26) {
                if ( cartao[i].getText().equals("") || (Integer.parseInt(cartao[i].getText()) >= 80 && Integer.parseInt(cartao[i].getText()) <= 90)) check = check + 1;
            }
        }
        
        if (check!=27){
            JOptionPane.showMessageDialog(null, "Cada coluna apenas pode ter números da dezena correspondente à sua posição", "Erro", 2);
            return false;
        }else{
            return true;
        }
        
    }
    
    private boolean verificarRepetido(){
        
        int check = 0;
        
        for (int i = 0; i < cartao.length; i=i+3) {
            
            if (cartao[i].getText().equals("")) {
                
            }else{
                if (cartao[i].getText().equals(cartao[i+1].getText()) || cartao[i].getText().equals(cartao[i+2].getText())) {
                    JOptionPane.showMessageDialog(null, "Números repetidos!", "Erro", 2);
                    break;
                }else{
                    check = 1;
                }
            }
            
            if (cartao[i+1].getText().equals("")) { 
            }else{
                if (cartao[i+1].getText().equals(cartao[i+2].getText())) {
                    JOptionPane.showMessageDialog(null, "Números repetidos!", "Erro", 2);
                    break;
                }else{
                    check = 1;
                }
            }
            
            
        }
        
        if (check==1){
            return true;
        }else{
            return false;
        }
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bingo v2.0");
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
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        c1.setEditable(false);
        c1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1KeyTyped(evt);
            }
        });

        c2.setEditable(false);
        c2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2KeyTyped(evt);
            }
        });

        c3.setEditable(false);
        c3.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3KeyTyped(evt);
            }
        });

        c4.setEditable(false);
        c4.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4KeyTyped(evt);
            }
        });

        c5.setEditable(false);
        c5.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5KeyTyped(evt);
            }
        });

        c6.setEditable(false);
        c6.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6KeyTyped(evt);
            }
        });

        c7.setEditable(false);
        c7.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7KeyTyped(evt);
            }
        });

        c8.setEditable(false);
        c8.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8KeyTyped(evt);
            }
        });

        c9.setEditable(false);
        c9.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c9KeyTyped(evt);
            }
        });

        c10.setEditable(false);
        c10.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c10KeyTyped(evt);
            }
        });

        c11.setEditable(false);
        c11.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c11KeyTyped(evt);
            }
        });

        c12.setEditable(false);
        c12.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c12KeyTyped(evt);
            }
        });

        c13.setEditable(false);
        c13.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c13KeyTyped(evt);
            }
        });

        c14.setEditable(false);
        c14.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c14KeyTyped(evt);
            }
        });

        c15.setEditable(false);
        c15.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c15KeyTyped(evt);
            }
        });

        c16.setEditable(false);
        c16.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c16KeyTyped(evt);
            }
        });

        c17.setEditable(false);
        c17.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c17KeyTyped(evt);
            }
        });

        c18.setEditable(false);
        c18.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c18KeyTyped(evt);
            }
        });

        c19.setEditable(false);
        c19.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c19KeyTyped(evt);
            }
        });

        c20.setEditable(false);
        c20.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c20KeyTyped(evt);
            }
        });

        c21.setEditable(false);
        c21.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c21KeyTyped(evt);
            }
        });

        c22.setEditable(false);
        c22.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c22KeyTyped(evt);
            }
        });

        c23.setEditable(false);
        c23.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c23KeyTyped(evt);
            }
        });

        c24.setEditable(false);
        c24.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c24KeyTyped(evt);
            }
        });

        c25.setEditable(false);
        c25.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c25KeyTyped(evt);
            }
        });

        c26.setEditable(false);
        c26.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c26KeyTyped(evt);
            }
        });

        c27.setEditable(false);
        c27.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        c27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Menu.setVisible(false);
        setSize(1068, 550);
        CriarCartao.setVisible(true);
        this.setLocationRelativeTo(null);
        sortear();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sortear();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        for (JTextField jTextField : cartao) {
            jTextField.setEditable(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        verificarNumCartao();
        
        if ((verificarEspacosBranco() == true) && (verificarNumColuna() == true) && (verificarRepetido() == true)) {
            setSize(1068, 385);
            for (JTextField jTextField : cartao) {
                jTextField.setEditable(false);
            }
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jButton5.setVisible(false);
        }else{
            
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed
    
//https://www.youtube.com/watch?v=9B5ZgItFxNA
    private void c1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1KeyTyped
        char c=evt.getKeyChar();
        if ( c1.getText().length() > 0 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_c1KeyTyped

    private void c2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2KeyTyped
        char c=evt.getKeyChar();
        if ( c2.getText().length() > 0 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_c2KeyTyped

    private void c3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3KeyTyped
        char c=evt.getKeyChar();
        if ( c3.getText().length() > 0 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_c3KeyTyped

    private void c4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4KeyTyped
        char c=evt.getKeyChar();
        if ( c4.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_c4KeyTyped

    private void c5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5KeyTyped
        char c=evt.getKeyChar();
        if ( c5.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_c5KeyTyped

    private void c6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6KeyTyped
        char c=evt.getKeyChar();
        if ( c6.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c6KeyTyped

    private void c7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7KeyTyped
        char c=evt.getKeyChar();
        if ( c7.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c7KeyTyped

    private void c8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8KeyTyped
        char c=evt.getKeyChar();
        if ( c8.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c8KeyTyped

    private void c9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c9KeyTyped
        char c=evt.getKeyChar();
        if ( c9.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c9KeyTyped

    private void c10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c10KeyTyped
        char c=evt.getKeyChar();
        if ( c10.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c10KeyTyped

    private void c11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c11KeyTyped
        char c=evt.getKeyChar();
        if ( c11.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c11KeyTyped

    private void c12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c12KeyTyped
        char c=evt.getKeyChar();
        if ( c12.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c12KeyTyped

    private void c13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c13KeyTyped
        char c=evt.getKeyChar();
        if ( c13.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c13KeyTyped

    private void c14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c14KeyTyped
        char c=evt.getKeyChar();
        if ( c14.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c14KeyTyped

    private void c15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c15KeyTyped
        char c=evt.getKeyChar();
        if ( c15.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c15KeyTyped

    private void c16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c16KeyTyped
        char c=evt.getKeyChar();
        if ( c16.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c16KeyTyped

    private void c17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c17KeyTyped
        char c=evt.getKeyChar();
        if ( c17.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c17KeyTyped

    private void c18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c18KeyTyped
        char c=evt.getKeyChar();
        if ( c18.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c18KeyTyped

    private void c19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c19KeyTyped
        char c=evt.getKeyChar();
        if ( c19.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c19KeyTyped

    private void c20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c20KeyTyped
        char c=evt.getKeyChar();
        if ( c20.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c20KeyTyped

    private void c21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c21KeyTyped
        char c=evt.getKeyChar();
        if ( c21.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c21KeyTyped

    private void c22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c22KeyTyped
        char c=evt.getKeyChar();
        if ( c22.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c22KeyTyped

    private void c23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c23KeyTyped
        char c=evt.getKeyChar();
        if ( c23.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c23KeyTyped

    private void c24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c24KeyTyped
        char c=evt.getKeyChar();
        if ( c24.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c24KeyTyped

    private void c25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c25KeyTyped
        char c=evt.getKeyChar();
        if ( c25.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c25KeyTyped

    private void c26KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c26KeyTyped
        char c=evt.getKeyChar();
        if ( c26.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c26KeyTyped

    private void c27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c27KeyTyped
        char c=evt.getKeyChar();
        if ( c27.getText().length() > 1 || !(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
            evt.consume();
        }
        
    }//GEN-LAST:event_c27KeyTyped
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CriarCartao;
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
