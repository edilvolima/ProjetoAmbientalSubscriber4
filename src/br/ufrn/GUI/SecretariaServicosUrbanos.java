/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.GUI;

import java.awt.Color;

/**
 *
 * @author Zeff
 */
public class SecretariaServicosUrbanos extends javax.swing.JFrame {

    /**
     * Creates new form SecretariaMeioAmbiente
     */
    private AtualizaSubscriber conexao = new AtualizaSubscriber(null);
    private String Texto;

    public SecretariaServicosUrbanos() {
        initComponents();
    }

    public void exibirInformacao(String informacao) {
        String valores[] = informacao.split(";");
        //valores[0] = area
        //valores[1] = nome da function
        //valores[2] = estado do contexto ou informacao relevante (valores de atributos, 
        //valores[3] = nome do agente de coleta.(somente aparece quando vai chamar o agente
        if (valores[1].equals("trashMonitor")) {
            if (valores[2].equals("VAZIA")) {
                if (valores[0].equals(Integer.toString(1))) {
                    labelLixoA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Vazia";
                    jTextArea1.setText("" + Texto);
                    //setar lixeira como vazia
                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelLixoA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Vazia";
                    jTextArea1.setText("" + Texto);
                    //setar lixeira como vazia
                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelLixoA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Vazia";
                    jTextArea1.setText("" + Texto);
                    //setar lixeira como vazia
                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelLixoA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Vazia";
                    jTextArea1.setText("" + Texto);
                    //setar lixeira como vazia
                }
            } else if (valores[2].equals("ENCHENDO")) {
                if (valores[0].equals(Integer.toString(1))) {
                    labelLixoA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoEnchendo.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Enchendo";
                    jTextArea1.setText("" + Texto);
                    //setar lixeira como enchendo
                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelLixoA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoEnchendo.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Enchendo";
                    jTextArea1.setText("" + Texto);
                    //setar lixeira como enchendo
                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelLixoA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoEnchendo.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Enchendo";
                    jTextArea1.setText("" + Texto);
                    //setar lixeira como enchendo
                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelLixoA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoEnchendo.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Enchendo";
                    jTextArea1.setText("" + Texto);
                    //setar lixeira como enchendo
                }
            } else if (valores[2].equals("CHEIA")) {
                if (valores[0].equals(Integer.toString(1))) {
                    labelLixoA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoCheio.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia";
                    jTextArea1.setText("" + Texto);
                    //setar como cheia
                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelLixoA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoCheio.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia";
                    jTextArea1.setText("" + Texto);
                    //setar como cheia
                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelLixoA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoCheio.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia";
                    jTextArea1.setText("" + Texto);
                    //setar como cheia
                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelLixoA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoCheio.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia";
                    jTextArea1.setText("" + Texto);
                    //setar como cheia
                }
            }
        } else if (valores[1].equals("trashGathering")) {

            if (valores[2].equals("LIMITE")) {
                if (valores[0].equals(Integer.toString(1))) {
                    labelLixoA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoEnchendoLimite.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " está quase cheia";
                    jTextArea1.setText("" + Texto);
                    //avisar que a lixeira está proxima de sua capacidade
                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelLixoA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoEnchendoLimite.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " está quase cheia";
                    jTextArea1.setText("" + Texto);
                    //avisar que a lixeira está proxima de sua capacidade
                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelLixoA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoEnchendoLimite.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " está quase cheia";
                    jTextArea1.setText("" + Texto);
                    //avisar que a lixeira está proxima de sua capacidade
                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelLixoA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoEnchendoLimite.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " está quase cheia";
                    jTextArea1.setText("" + Texto);
                    //avisar que a lixeira está proxima de sua capacidade
                }

            } else if (valores[2].equals("CHEIA")) {
                if (valores[0].equals(Integer.toString(1))) {
                    labelAgenteA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Caminhao.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia, chamando " + valores[3];
                    jTextArea1.setText("" + Texto);
                    //avisar que esta chamando o agente e setar o estado do agente
                    //OBS: o nome do agente esta no valores[3].
                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelAgenteA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Caminhao.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia, chamando " + valores[3];
                    jTextArea1.setText("" + Texto);
                    //avisar que esta chamando o agente e setar o estado do agente
                    //OBS: o nome do agente esta no valores[3].
                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelAgenteA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Caminhao.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia, chamando " + valores[3];
                    jTextArea1.setText("" + Texto);
                    //avisar que esta chamando o agente e setar o estado do agente
                    //OBS: o nome do agente esta no valores[3].
                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelAgenteA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Caminhao.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia, chamando " + valores[3];
                    jTextArea1.setText("" + Texto);
                    //avisar que esta chamando o agente e setar o estado do agente
                    //OBS: o nome do agente esta no valores[3].
                }
            }
            else if (valores[2].equals("GATHERING_OFF")) {
                //setar icones do agente em OFF em cada area
                if (valores[0].equals(Integer.toString(1))) {
                    labelAgenteA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Caminhao.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia, chamando " + valores[3];
                    jTextArea1.setText("" + Texto);
                    //avisar que esta chamando o agente e setar o estado do agente
                    //OBS: o nome do agente esta no valores[3].
                }
                if (valores[0].equals(Integer.toString(2))) {
                    labelAgenteA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Caminhao.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia, chamando " + valores[3];
                    jTextArea1.setText("" + Texto);
                    //avisar que esta chamando o agente e setar o estado do agente
                    //OBS: o nome do agente esta no valores[3].
                }
                if (valores[0].equals(Integer.toString(3))) {
                    labelAgenteA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Caminhao.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia, chamando " + valores[3];
                    jTextArea1.setText("" + Texto);
                    //avisar que esta chamando o agente e setar o estado do agente
                    //OBS: o nome do agente esta no valores[3].
                }
                if (valores[0].equals(Integer.toString(4))) {
                    labelAgenteA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/Caminhao.png")));
                    Texto = Texto + "Lixeira da área " + valores[0] + " Cheia, chamando " + valores[3];
                    jTextArea1.setText("" + Texto);
                    //avisar que esta chamando o agente e setar o estado do agente
                    //OBS: o nome do agente esta no valores[3].
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelAgenteA2 = new javax.swing.JLabel();
        labelLixoA2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        labelAgenteA1 = new javax.swing.JLabel();
        labelLixoA1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        labelAgenteA3 = new javax.swing.JLabel();
        labelLixoA3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        labelAgenteA4 = new javax.swing.JLabel();
        labelLixoA4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/subscribers4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jButton1.setText("Desconectado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Clique para se conectar ao Hub");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 2"));

        labelAgenteA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/CaminhaoDesativado.png"))); // NOI18N

        labelLixoA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAgenteA2)
                .addGap(18, 18, 18)
                .addComponent(labelLixoA2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAgenteA2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelLixoA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 1"));

        labelAgenteA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/CaminhaoDesativado.png"))); // NOI18N

        labelLixoA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAgenteA1)
                .addGap(18, 18, 18)
                .addComponent(labelLixoA1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAgenteA1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelLixoA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 3"));

        labelAgenteA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/CaminhaoDesativado.png"))); // NOI18N

        labelLixoA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAgenteA3)
                .addGap(18, 18, 18)
                .addComponent(labelLixoA3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAgenteA3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelLixoA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Area 4"));

        labelAgenteA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/CaminhaoDesativado.png"))); // NOI18N

        labelLixoA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAgenteA4)
                .addGap(18, 18, 18)
                .addComponent(labelLixoA4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelAgenteA4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelLixoA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.getText() == "OFF") {
            conexao.subscribe();
            jButton1.setText("ON");
            jButton1.setBackground(Color.GREEN);
            jButton1.setForeground(Color.RED);
            jLabel2.setText("Clique para se desconectar do Hub");
        } else {
            conexao.unsubscribe();
            labelAgenteA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/CaminhaoDesativado.png")));
            labelLixoA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png")));
            labelAgenteA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/CaminhaoDesativado.png")));
            labelLixoA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png")));
            labelAgenteA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/CaminhaoDesativado.png")));
            labelLixoA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png")));
            labelAgenteA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/CaminhaoDesativado.png")));
            labelLixoA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufrn/imagens/LixoVazia.png")));
            jButton1.setText("OFF");
            jButton1.setBackground(Color.RED);
            jButton1.setForeground(Color.GREEN);
            jLabel2.setText("Clique para se conectar ao Hub");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SecretariaServicosUrbanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretariaServicosUrbanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretariaServicosUrbanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretariaServicosUrbanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretariaServicosUrbanos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelAgenteA1;
    private javax.swing.JLabel labelAgenteA2;
    private javax.swing.JLabel labelAgenteA3;
    private javax.swing.JLabel labelAgenteA4;
    private javax.swing.JLabel labelLixoA1;
    private javax.swing.JLabel labelLixoA2;
    private javax.swing.JLabel labelLixoA3;
    private javax.swing.JLabel labelLixoA4;
    // End of variables declaration//GEN-END:variables
}
