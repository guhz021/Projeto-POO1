//Apache NetBeans IDE 22
//Gustavo Alves de Aquino 2503646
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btInfo3 = new javax.swing.JButton();
        btAbreCadCozinheiro1 = new javax.swing.JButton();
        btAbreCadEntregador1 = new javax.swing.JButton();
        btSairPrincipal1 = new javax.swing.JButton();
        lblTitutlo1 = new javax.swing.JLabel();
        lblInfo1 = new javax.swing.JLabel();
        lblInfo3 = new javax.swing.JLabel();
        lblTexto5 = new javax.swing.JLabel();
        lblTexto6 = new javax.swing.JLabel();
        btInfo5 = new javax.swing.JButton();
        pDec = new javax.swing.JPanel();
        pDec1 = new javax.swing.JPanel();
        lblTexto8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblTexto7 = new javax.swing.JLabel();
        mnBarPrincipal = new javax.swing.JMenuBar();
        mnInformações = new javax.swing.JMenu();
        mnDetalhes = new javax.swing.JMenuItem();
        mnCadastro = new javax.swing.JMenu();
        mnCadEntregador = new javax.swing.JMenuItem();
        mnCadCozinheiro = new javax.swing.JMenuItem();
        mnPEDIDO = new javax.swing.JMenu();
        mnPedido = new javax.swing.JMenuItem();
        mnPed = new javax.swing.JMenu();
        mnVerificar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(204, 102, 0));

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));

        btInfo3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btInfo3.setText("INFORMAÇÕES");
        btInfo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfo3ActionPerformed(evt);
            }
        });

        btAbreCadCozinheiro1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btAbreCadCozinheiro1.setText("CADASTRAR COZINHEIRO");
        btAbreCadCozinheiro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbreCadCozinheiro1ActionPerformed(evt);
            }
        });

        btAbreCadEntregador1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btAbreCadEntregador1.setText("CADASTRAR ENTREGADOR");
        btAbreCadEntregador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbreCadEntregador1ActionPerformed(evt);
            }
        });

        btSairPrincipal1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btSairPrincipal1.setText("SAIR");
        btSairPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairPrincipal1ActionPerformed(evt);
            }
        });

        lblTitutlo1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 44)); // NOI18N
        lblTitutlo1.setText("===== BEM-VINDOS A PIZZARIA BIG MAMMA GROUP =====");
        lblTitutlo1.setToolTipText("");

        lblInfo1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        lblInfo1.setText("INFORMAÇÕES IMPORTANTES:");

        lblInfo3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblInfo3.setText("Rua Alameda da Paixão, 1527, Copacabana");

        lblTexto5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        lblTexto5.setText("== VERIFICAR TEMPO DO PEDIDO ==");

        lblTexto6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        lblTexto6.setText("CADASTRAR FUNCIONÁRIOS:");

        btInfo5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btInfo5.setText("EFETUAR PEDIDO");
        btInfo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInfo5ActionPerformed(evt);
            }
        });

        pDec.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout pDecLayout = new javax.swing.GroupLayout(pDec);
        pDec.setLayout(pDecLayout);
        pDecLayout.setHorizontalGroup(
            pDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDecLayout.setVerticalGroup(
            pDecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        pDec1.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout pDec1Layout = new javax.swing.GroupLayout(pDec1);
        pDec1.setLayout(pDec1Layout);
        pDec1Layout.setHorizontalGroup(
            pDec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDec1Layout.setVerticalGroup(
            pDec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        lblTexto8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        lblTexto8.setText("=====FAZER PEDIDO! =====");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("VERIFICAR PEDIDO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblTexto7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        lblTexto7.setText("== DETALHES DA PIZZARIA ==");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pDec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pDec1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btAbreCadEntregador1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btAbreCadCozinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(287, 287, 287))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTexto5)
                                .addGap(190, 190, 190))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(631, 631, 631)
                        .addComponent(btSairPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTexto7)
                                .addGap(299, 299, 299)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInfo3)
                                    .addComponent(lblInfo1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTitutlo1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblTexto6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btInfo5)
                                    .addGap(164, 164, 164))))))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(btInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTexto8)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pDec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lblTitutlo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblInfo1)
                        .addGap(18, 18, 18)
                        .addComponent(lblInfo3)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTexto7)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInfo3)
                    .addComponent(lblTexto8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblTexto6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btInfo5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSairPrincipal1)
                        .addGap(39, 39, 39)
                        .addComponent(pDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btAbreCadEntregador1)
                                .addGap(38, 38, 38)
                                .addComponent(btAbreCadCozinheiro1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(lblTexto5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(170, Short.MAX_VALUE))))
        );

        mnBarPrincipal.setBackground(new java.awt.Color(204, 0, 0));

        mnInformações.setText("INFORMAÇÕES");

        mnDetalhes.setText("Detalhes da Pizzaria");
        mnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDetalhesActionPerformed(evt);
            }
        });
        mnInformações.add(mnDetalhes);

        mnBarPrincipal.add(mnInformações);

        mnCadastro.setText("CADASTRO DE FUNCIONÁRIO");

        mnCadEntregador.setText("Cadastro de Entregador");
        mnCadEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadEntregadorActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadEntregador);

        mnCadCozinheiro.setText("Cadastro de Cozinheiro");
        mnCadCozinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadCozinheiroActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadCozinheiro);

        mnBarPrincipal.add(mnCadastro);

        mnPEDIDO.setText("FAZER PEDIDO!");

        mnPedido.setText("Faça seu pedido!");
        mnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPedidoActionPerformed(evt);
            }
        });
        mnPEDIDO.add(mnPedido);

        mnBarPrincipal.add(mnPEDIDO);

        mnPed.setText("VERIFICAR PEDIDO");

        mnVerificar.setText("Checar tempo de preparo");
        mnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVerificarActionPerformed(evt);
            }
        });
        mnPed.add(mnVerificar);

        mnBarPrincipal.add(mnPed);

        setJMenuBar(mnBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPedidoActionPerformed
        FormPedido.getFormPedidoUnico().setVisible(true);
    }//GEN-LAST:event_mnPedidoActionPerformed

    private void mnCadCozinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadCozinheiroActionPerformed
        FormCadCozinheiro.getFormCadCozinheiroUnico().setVisible(true);
    }//GEN-LAST:event_mnCadCozinheiroActionPerformed

    private void mnCadEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadEntregadorActionPerformed
        FormCadEntregador.getFormCadEntregadorUnico().setVisible(true);
    }//GEN-LAST:event_mnCadEntregadorActionPerformed

    private void mnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDetalhesActionPerformed
        FormPizzaria.getFormPizzariaUnico().setVisible(true);
    }//GEN-LAST:event_mnDetalhesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FormTempoDeEntrega.getFormTempoDeEntregaUnico().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btInfo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfo5ActionPerformed
        FormPedido.getFormPedidoUnico().setVisible(true);
    }//GEN-LAST:event_btInfo5ActionPerformed

    private void btSairPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairPrincipal1ActionPerformed
        sair();
    }//GEN-LAST:event_btSairPrincipal1ActionPerformed

    private void btAbreCadEntregador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbreCadEntregador1ActionPerformed
        FormCadEntregador.getFormCadEntregadorUnico().setVisible(true);
    }//GEN-LAST:event_btAbreCadEntregador1ActionPerformed

    private void btAbreCadCozinheiro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbreCadCozinheiro1ActionPerformed
        FormCadCozinheiro.getFormCadCozinheiroUnico().setVisible(true);
    }//GEN-LAST:event_btAbreCadCozinheiro1ActionPerformed

    private void btInfo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInfo3ActionPerformed
        FormPizzaria.getFormPizzariaUnico().setVisible(true);
    }//GEN-LAST:event_btInfo3ActionPerformed

    private void mnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVerificarActionPerformed
        FormTempoDeEntrega.getFormTempoDeEntregaUnico().setVisible(true);
    }//GEN-LAST:event_mnVerificarActionPerformed

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

  
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbreCadCozinheiro1;
    private javax.swing.JButton btAbreCadEntregador1;
    private javax.swing.JButton btInfo3;
    private javax.swing.JButton btInfo5;
    private javax.swing.JButton btSairPrincipal1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo3;
    private javax.swing.JLabel lblTexto5;
    private javax.swing.JLabel lblTexto6;
    private javax.swing.JLabel lblTexto7;
    private javax.swing.JLabel lblTexto8;
    private javax.swing.JLabel lblTitutlo1;
    private javax.swing.JMenuBar mnBarPrincipal;
    private javax.swing.JMenuItem mnCadCozinheiro;
    private javax.swing.JMenuItem mnCadEntregador;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnDetalhes;
    private javax.swing.JMenu mnInformações;
    private javax.swing.JMenu mnPEDIDO;
    private javax.swing.JMenu mnPed;
    private javax.swing.JMenuItem mnPedido;
    private javax.swing.JMenuItem mnVerificar;
    private javax.swing.JPanel pDec;
    private javax.swing.JPanel pDec1;
    // End of variables declaration//GEN-END:variables
}
