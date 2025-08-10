//Gustavo Alves de Aquino 2503646

import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormPedido extends javax.swing.JFrame {

    private BdPizzaria gerPizzaria;

    private static FormPedido FormPedidoUnico;

    private FormPedido() {
        initComponents();
        gerPizzaria = BdPizzaria.getInstancia();
    }

    public static FormPedido getFormPedidoUnico() {
        if (FormPedidoUnico == null) {
            FormPedidoUnico = new FormPedido();
        }
        return FormPedidoUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCor = new javax.swing.JPanel();
        lblTitutlo = new javax.swing.JLabel();
        lblrTelefone = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        ctCPF = new javax.swing.JTextField();
        ctPrato = new javax.swing.JTextField();
        ctTelefone = new javax.swing.JTextField();
        ctEndereco = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        lblTexto1 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btCadPedido = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        lblPrato = new javax.swing.JLabel();
        lblrBebida = new javax.swing.JLabel();
        ctBebida = new javax.swing.JTextField();
        pDec1 = new javax.swing.JPanel();
        pDec2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PEDIDOS");

        pCor.setBackground(new java.awt.Color(255, 153, 0));

        lblTitutlo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        lblTitutlo.setText("===== FAÇA SEU PEDIDO =====");

        lblrTelefone.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblrTelefone.setText("TELEFONE :");

        lblEndereco.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblEndereco.setText("ENDEREÇO DE ENTREGA:");

        ctCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCPFActionPerformed(evt);
            }
        });

        ctTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctTelefoneActionPerformed(evt);
            }
        });

        ctEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctEnderecoActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblNome.setText("NOME DO CLIENTE:");

        lblCPF.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblCPF.setText("CPF DO CLIENTE:");

        btSair.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Prato", "Bebida", "Telefone", "Endereço"
            }
        ));
        jScrollPane1.setViewportView(tblPedido);

        lblTexto1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblTexto1.setText("PEDIDOS REGISTRADOS:");

        btLimpar.setText("LIMPAR PEDIDO");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCadPedido.setText("REALIZAR PEDIDO");
        btCadPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadPedidoActionPerformed(evt);
            }
        });

        btConsultar.setText("CONSULTAR PEDIDO POR CPF");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        lblPrato.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblPrato.setText("PRATO DESEJADO:");

        lblrBebida.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblrBebida.setText("BEBIDA DESEJADA:");

        ctBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctBebidaActionPerformed(evt);
            }
        });

        pDec1.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout pDec1Layout = new javax.swing.GroupLayout(pDec1);
        pDec1.setLayout(pDec1Layout);
        pDec1Layout.setHorizontalGroup(
            pDec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDec1Layout.setVerticalGroup(
            pDec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        pDec2.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout pDec2Layout = new javax.swing.GroupLayout(pDec2);
        pDec2.setLayout(pDec2Layout);
        pDec2Layout.setHorizontalGroup(
            pDec2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDec2Layout.setVerticalGroup(
            pDec2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pCorLayout = new javax.swing.GroupLayout(pCor);
        pCor.setLayout(pCorLayout);
        pCorLayout.setHorizontalGroup(
            pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitutlo)
                    .addComponent(lblTexto1))
                .addGap(214, 214, 214))
            .addGroup(pCorLayout.createSequentialGroup()
                .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCorLayout.createSequentialGroup()
                        .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pCorLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btLimpar)
                                .addGap(29, 29, 29)
                                .addComponent(btCadPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btConsultar))
                            .addGroup(pCorLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pCorLayout.createSequentialGroup()
                                        .addComponent(lblNome)
                                        .addGap(18, 18, 18)
                                        .addComponent(ctNome))
                                    .addGroup(pCorLayout.createSequentialGroup()
                                        .addComponent(lblCPF)
                                        .addGap(18, 18, 18)
                                        .addComponent(ctCPF))
                                    .addGroup(pCorLayout.createSequentialGroup()
                                        .addComponent(lblPrato)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ctPrato))
                                    .addGroup(pCorLayout.createSequentialGroup()
                                        .addComponent(lblrBebida)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ctBebida))
                                    .addGroup(pCorLayout.createSequentialGroup()
                                        .addComponent(lblrTelefone)
                                        .addGap(18, 18, 18)
                                        .addComponent(ctTelefone))
                                    .addGroup(pCorLayout.createSequentialGroup()
                                        .addComponent(lblEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ctEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18))
                    .addGroup(pCorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addComponent(pDec1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pDec2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pCorLayout.setVerticalGroup(
            pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCorLayout.createSequentialGroup()
                .addComponent(pDec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblTitutlo)
                .addGap(12, 12, 12)
                .addComponent(lblTexto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCorLayout.createSequentialGroup()
                        .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrato)
                            .addComponent(ctPrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblrBebida)
                            .addComponent(ctBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblrTelefone)
                            .addComponent(ctTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEndereco)
                            .addComponent(ctEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(pCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btCadPedido)
                            .addComponent(btConsultar))
                        .addGap(31, 31, 31)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pDec1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadPedidoActionPerformed
        try {
            cadastrar();
        } catch (CPFInvalidoException ex) {
            Logger.getLogger(FormPedido.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            ctCPF.setText("");
            ctCPF.requestFocus();

        }
    }//GEN-LAST:event_btCadPedidoActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void ctTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctTelefoneActionPerformed

    private void ctEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctEnderecoActionPerformed

    private void ctBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctBebidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctBebidaActionPerformed

    private void ctCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCPFActionPerformed

    public void consultar() {
        String cpf = ctCPF.getText().trim();
        if (cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, informe o CPF.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Pedido pedido = gerPizzaria.consPedidoPorCpf(cpf);
        if (pedido != null) {
            ctNome.setText(pedido.getCliente().getNome());
            ctTelefone.setText(pedido.getCliente().getTelefone());
            ctEndereco.setText(pedido.getCliente().getEndereco());
            ctPrato.setText(pedido.getPrato());
            ctBebida.setText(pedido.getBebida());
        } else {
            JOptionPane.showMessageDialog(null, "Pedido não encontrado para o CPF informado.", "Erro", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }

    public void cadastrar() throws CPFInvalidoException {
        String cpfCliente = ctCPF.getText();
        if (!isValidCPF(cpfCliente)) {
            throw new CPFInvalidoException("O CPF do cliente deve conter exatamente 11 dígitos e deve ser numérico.");
        }

        String nomeCliente = ctNome.getText();
        String telefoneCliente = ctTelefone.getText();

        Cliente cliente = new Cliente();
        cliente.setCpf(cpfCliente);
        cliente.setNome(nomeCliente);
        cliente.setTelefone(telefoneCliente);

        String prato = ctPrato.getText();
        String bebida = ctBebida.getText();
        String endereco = ctEndereco.getText();

        Random random = new Random();
        int tempoPreparo = 15 + random.nextInt(46);

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setPrato(prato);
        pedido.setBebida(bebida);
        pedido.setTempoPreparo(tempoPreparo);

        pedido = gerPizzaria.cadPedido(pedido);
        if (pedido != null) {
            DefaultTableModel model = (DefaultTableModel) tblPedido.getModel();
            model.insertRow(0, new Object[]{nomeCliente, cpfCliente, prato, bebida, telefoneCliente, endereco});

            JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso! Tempo de preparo: " + tempoPreparo + " minutos.", "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o pedido", "Cadastro não realizado", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean isValidCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    public void limpar() {
        ctCPF.setText("");
        ctNome.setText("");
        ctPrato.setText("");
        ctBebida.setText("");
        ctTelefone.setText("");
        ctEndereco.setText("");
        ctNome.requestFocus();
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
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPedido().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadPedido;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctBebida;
    private javax.swing.JTextField ctCPF;
    private javax.swing.JTextField ctEndereco;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctPrato;
    private javax.swing.JTextField ctTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrato;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTitutlo;
    private javax.swing.JLabel lblrBebida;
    private javax.swing.JLabel lblrTelefone;
    private javax.swing.JPanel pCor;
    private javax.swing.JPanel pDec1;
    private javax.swing.JPanel pDec2;
    private javax.swing.JTable tblPedido;
    // End of variables declaration//GEN-END:variables

}
