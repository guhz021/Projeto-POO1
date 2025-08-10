//Gustavo Alves de Aquino 2503646
import javax.swing.JOptionPane;

public class FormPizzaria extends javax.swing.JFrame {
    
    private static FormPizzaria FormPizzariaUnico;
    
    public FormPizzaria() {
        initComponents();
    }
     public static FormPizzaria getFormPizzariaUnico() {
        if (FormPizzariaUnico == null) {
            FormPizzariaUnico = new FormPizzaria();
        }
        return FormPizzariaUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblTitutlo = new javax.swing.JLabel();
        lblTxt16 = new javax.swing.JLabel();
        lblTxt17 = new javax.swing.JLabel();
        lblTxt18 = new javax.swing.JLabel();
        lblTxt19 = new javax.swing.JLabel();
        lblTxt20 = new javax.swing.JLabel();
        lblTxt21 = new javax.swing.JLabel();
        lblTxt22 = new javax.swing.JLabel();
        lblTxt23 = new javax.swing.JLabel();
        lblTxt24 = new javax.swing.JLabel();
        lblTxt25 = new javax.swing.JLabel();
        lblTxt26 = new javax.swing.JLabel();
        lblTxt27 = new javax.swing.JLabel();
        lblTxt28 = new javax.swing.JLabel();
        lblTxt29 = new javax.swing.JLabel();
        lblTxt30 = new javax.swing.JLabel();
        btSair3 = new javax.swing.JButton();
        pDec = new javax.swing.JPanel();
        pDec1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INFORMAÇÕES DA PIZZARIA");

        jPanel2.setBackground(new java.awt.Color(204, 153, 0));

        lblTitutlo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        lblTitutlo.setText("===== INFORMAÇÕES DA PIZZARIA =====");

        lblTxt16.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt16.setText("Endereço: Rua Alameda da Paixão, 1527, Copacabana");

        lblTxt17.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt17.setText("Pizzaria Big Mamma Group");

        lblTxt18.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt18.setText("==== SERVIÇOS ====");

        lblTxt19.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt19.setText("==== PIZZAS FAVORITAS ====");

        lblTxt20.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt20.setText("- Pepperoni");

        lblTxt21.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt21.setText("==== BEBIDAS FAVORITAS ====");

        lblTxt22.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt22.setText("- Marguerita");

        lblTxt23.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt23.setText("- Refrigerante");

        lblTxt24.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt24.setText("- Quatro Queijos");

        lblTxt25.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt25.setText("- Refrigerante");

        lblTxt26.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt26.setText("- Suco");

        lblTxt27.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt27.setText("- Retirada no local");

        lblTxt28.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt28.setText("- Cerveja");

        lblTxt29.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt29.setText("- Água");

        lblTxt30.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTxt30.setText("- Entrega a domicílio");

        btSair3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btSair3.setText("SAIR");
        btSair3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSair3ActionPerformed(evt);
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
            .addGap(0, 45, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTxt22)
                    .addComponent(lblTxt20)
                    .addComponent(lblTxt24)
                    .addComponent(lblTxt23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTxt25)
                    .addComponent(lblTxt26)
                    .addComponent(lblTxt28)
                    .addComponent(lblTxt29))
                .addGap(177, 177, 177)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTxt18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTxt27)
                        .addComponent(lblTxt30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btSair3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTxt21)
                .addGap(354, 354, 354))
            .addComponent(pDec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pDec1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblTxt19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(lblTxt16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(lblTitutlo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(lblTxt17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pDec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblTitutlo)
                .addGap(28, 28, 28)
                .addComponent(lblTxt17)
                .addGap(18, 18, 18)
                .addComponent(lblTxt16)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTxt18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTxt19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTxt21, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTxt22)
                    .addComponent(lblTxt25)
                    .addComponent(lblTxt30))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTxt20)
                    .addComponent(lblTxt26)
                    .addComponent(lblTxt27))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTxt24)
                    .addComponent(lblTxt28))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTxt23)
                            .addComponent(lblTxt29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btSair3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addComponent(pDec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSair3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSair3ActionPerformed
        sair();
    }//GEN-LAST:event_btSair3ActionPerformed
    public void sair() {
            this.dispose();       
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
            java.util.logging.Logger.getLogger(FormPizzaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPizzaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPizzaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPizzaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPizzaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitutlo;
    private javax.swing.JLabel lblTxt16;
    private javax.swing.JLabel lblTxt17;
    private javax.swing.JLabel lblTxt18;
    private javax.swing.JLabel lblTxt19;
    private javax.swing.JLabel lblTxt20;
    private javax.swing.JLabel lblTxt21;
    private javax.swing.JLabel lblTxt22;
    private javax.swing.JLabel lblTxt23;
    private javax.swing.JLabel lblTxt24;
    private javax.swing.JLabel lblTxt25;
    private javax.swing.JLabel lblTxt26;
    private javax.swing.JLabel lblTxt27;
    private javax.swing.JLabel lblTxt28;
    private javax.swing.JLabel lblTxt29;
    private javax.swing.JLabel lblTxt30;
    private javax.swing.JPanel pDec;
    private javax.swing.JPanel pDec1;
    // End of variables declaration//GEN-END:variables
}
