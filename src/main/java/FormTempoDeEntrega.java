//Gustavo Alves de Aquino 2503646

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormTempoDeEntrega extends javax.swing.JFrame {

    private Timer timer;
    private int tempoRestante;
    private static FormTempoDeEntrega FormTempoDeEntregaUnico;

    private FormTempoDeEntrega() {
        initComponents();
    }

    public static FormTempoDeEntrega getFormTempoDeEntregaUnico() {
        if (FormTempoDeEntregaUnico == null) {
            FormTempoDeEntregaUnico = new FormTempoDeEntrega();
        }
        return FormTempoDeEntregaUnico;
    }

    private void iniciarTemporizador() {
        if (timer != null) {
            timer.stop();
        }

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tempoRestante > 0) {
                    tempoRestante--;
                    int minutos = tempoRestante / 60;
                    int segundos = tempoRestante % 60;
                    lblTempoRestante.setText(String.format("Tempo Restante: %02d:%02d minutos", minutos, segundos));
                } else {
                    ((Timer) e.getSource()).stop();
                    lblTempoRestante.setText("Tempo Restante: 00:00 minutos");
                }
            }
        });
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pDec2 = new javax.swing.JPanel();
        pDec4 = new javax.swing.JPanel();
        lblTempoRestante = new javax.swing.JLabel();
        btPesquisar = new javax.swing.JButton();
        ctCPF = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        lblTexto2 = new javax.swing.JLabel();
        btSairPrincipal1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TEMPO DE ENTREGA");

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        pDec2.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout pDec2Layout = new javax.swing.GroupLayout(pDec2);
        pDec2.setLayout(pDec2Layout);
        pDec2Layout.setHorizontalGroup(
            pDec2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDec2Layout.setVerticalGroup(
            pDec2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        pDec4.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout pDec4Layout = new javax.swing.GroupLayout(pDec4);
        pDec4.setLayout(pDec4Layout);
        pDec4Layout.setHorizontalGroup(
            pDec4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDec4Layout.setVerticalGroup(
            pDec4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        lblTempoRestante.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTempoRestante.setForeground(new java.awt.Color(255, 255, 255));

        btPesquisar.setText("PESQUISAR POR CPF");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        ctCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCPFActionPerformed(evt);
            }
        });

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lblTexto2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        lblTexto2.setText("=== TEMPO RESTANTE DE PREPARO ===");

        btSairPrincipal1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSairPrincipal1.setText("SAIR");
        btSairPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairPrincipal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pDec2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pDec4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSairPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblTempoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lblTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pDec4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lblTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(lblTempoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btSairPrincipal1)
                .addGap(29, 29, 29)
                .addComponent(pDec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        String cpf = ctCPF.getText();
        Pedido pedido = BdPizzaria.getInstancia().consPedidoPorCpf(cpf);

        if (pedido != null) {
            tempoRestante = pedido.getTempoPreparo() * 60;
            iniciarTemporizador();
        } else {
            JOptionPane.showMessageDialog(this, "Pedido não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            ctCPF.setText("");
            ctCPF.requestFocus();
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void ctCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCPFActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairPrincipal1ActionPerformed
        sair();
    }//GEN-LAST:event_btSairPrincipal1ActionPerformed
    public void limpar() {
        ctCPF.setText("");
    }

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
            java.util.logging.Logger.getLogger(FormTempoDeEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTempoDeEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTempoDeEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTempoDeEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTempoDeEntrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSairPrincipal1;
    private javax.swing.JTextField ctCPF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTempoRestante;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JPanel pDec2;
    private javax.swing.JPanel pDec4;
    // End of variables declaration//GEN-END:variables
}
