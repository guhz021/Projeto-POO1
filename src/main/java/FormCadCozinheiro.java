//Gustavo Alves de Aquino 2503646

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadCozinheiro extends javax.swing.JFrame {

    private Pessoa pessoa;
    private BdPizzaria gerFuncionario = new BdPizzaria();
    private Cozinheiro cozinheiro;

    private static FormCadCozinheiro FormCadCozinheiroUnico;

    private FormCadCozinheiro() {
        initComponents();
    }

    public static FormCadCozinheiro getFormCadCozinheiroUnico() {
        if (FormCadCozinheiroUnico == null) {
            FormCadCozinheiroUnico = new FormCadCozinheiro();
        }
        return FormCadCozinheiroUnico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSair = new javax.swing.JButton();
        ctTurno = new javax.swing.JTextField();
        lblTexto1 = new javax.swing.JLabel();
        ctSalario = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        btCadFun = new javax.swing.JButton();
        lblEspecialidade = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        lblTurno = new javax.swing.JLabel();
        btAlterar = new javax.swing.JButton();
        lblSalario = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        lblTitutlo = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ctCPF = new javax.swing.JTextField();
        ctEspecialidade = new javax.swing.JTextField();
        pDec3 = new javax.swing.JPanel();
        pDec4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionario: Cozinheiro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        btSair.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lblTexto1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblTexto1.setText("COZINHEIROS CADASTRADOS:");

        lblNome.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblNome.setText("NOME:");

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblCPF.setText("CPF:");

        btCadFun.setText("CADASTRAR");
        btCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadFunActionPerformed(evt);
            }
        });

        lblEspecialidade.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblEspecialidade.setText("ESPECIALIDADE:");

        btConsultar.setText("CONSULTAR FUNCIONÁRIO");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        lblTurno.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblTurno.setText("TURNO DE TRABALHO:");

        btAlterar.setText("ALTERAR DADOS");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        lblSalario.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblSalario.setText("SALÁRIO:");

        btExcluir.setText("EXCLUIR FUNCIONÁRIO");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        lblTitutlo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        lblTitutlo.setText("===== CADASTRO DE FUNCIONÁRIO: COZINHEIRO =====");

        lblTexto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        lblTexto.setText("FUNÇÕES POR CPF:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Especialidade", "Turno", "Salário"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pDec3.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout pDec3Layout = new javax.swing.GroupLayout(pDec3);
        pDec3.setLayout(pDec3Layout);
        pDec3Layout.setHorizontalGroup(
            pDec3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDec3Layout.setVerticalGroup(
            pDec3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        pDec4.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout pDec4Layout = new javax.swing.GroupLayout(pDec4);
        pDec4.setLayout(pDec4Layout);
        pDec4Layout.setHorizontalGroup(
            pDec4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDec4Layout.setVerticalGroup(
            pDec4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btSair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(lblTexto1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSalario)
                                .addGap(18, 18, 18)
                                .addComponent(ctSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTurno)
                                .addGap(18, 18, 18)
                                .addComponent(ctTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCPF)
                                    .addGap(18, 18, 18)
                                    .addComponent(ctCPF))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(193, 193, 193)
                                    .addComponent(btLimpar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btCadFun))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblNome)
                                    .addGap(18, 18, 18)
                                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEspecialidade)
                                .addGap(18, 18, 18)
                                .addComponent(ctEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAlterar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTexto)
                            .addComponent(btConsultar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir)
                        .addGap(73, 73, 73))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitutlo)
                .addGap(250, 250, 250))
            .addComponent(pDec3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pDec4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pDec4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(lblTitutlo)
                .addGap(39, 39, 39)
                .addComponent(lblTexto1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(btSair)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEspecialidade)
                            .addComponent(ctEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTurno)
                            .addComponent(ctTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ctSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalario))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btCadFun))
                        .addGap(30, 30, 30)
                        .addComponent(lblTexto)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAlterar)
                            .addComponent(btConsultar)
                            .addComponent(btExcluir))
                        .addGap(38, 38, 38)))
                .addComponent(pDec3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
       sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            alterarCozinheiro();
        } catch (CPFInvalidoException ex) {
            Logger.getLogger(FormCadCozinheiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        try {
            consultar();
        } catch (CPFInvalidoException ex) {
            Logger.getLogger(FormCadCozinheiro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluirCozinheiro();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadFunActionPerformed
        try {
        cadastrar();
        ListarFun(); // Atualiza a tabela após o cadastro
    } catch (CPFInvalidoException ex) {
        JOptionPane.showMessageDialog(null,
                "Erro ao cadastrar: " + ex.getMessage(),
                "Erro de Cadastro",
                JOptionPane.ERROR_MESSAGE);
        ctCPF.setText("");
        ctCPF.requestFocus();
    }
    }//GEN-LAST:event_btCadFunActionPerformed
    public void alterarCozinheiro() throws CPFInvalidoException {
        String cpf = ctCPF.getText().trim();

        if (cpf == null || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CPF não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.setCpf(cpf);

        Cozinheiro resultado = gerFuncionario.consCozinheiroCpf(cozinheiro);

        if (resultado != null) {
            String novoNome = JOptionPane.showInputDialog(null, "Digite o novo Nome:", resultado.getNome());
            if (novoNome == null || novoNome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String novaEspecialidade = JOptionPane.showInputDialog(null, "Digite a nova Especialidade:", resultado.getEspecialidade());
            if (novaEspecialidade == null || novaEspecialidade.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Especialidade não pode estar vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String novoTurno = JOptionPane.showInputDialog(null, "Digite o novo Turno:", resultado.getTurno());
            if (novoTurno == null || novoTurno.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Turno não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String salarioStr = JOptionPane.showInputDialog(null, "Digite o novo Salário:", resultado.getSalario());
            double novoSalario;
            try {
                novoSalario = Double.parseDouble(salarioStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Salário inválido! Por favor, insira um valor numérico.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int opcao = JOptionPane.showConfirmDialog(null,
                    "Deseja alterar o Nome para: " + novoNome + "?\n"
                    + "Especialidade para: " + novaEspecialidade + "?\n"
                    + "Turno para: " + novoTurno + "?\n"
                    + "Salário para: " + novoSalario + "?",
                    "Confirmação", JOptionPane.YES_NO_OPTION);

            if (opcao == JOptionPane.YES_OPTION) {
                resultado.setNome(novoNome);
                resultado.setEspecialidade(novaEspecialidade);
                resultado.setTurno(novoTurno);
                resultado.setSalario(novoSalario);

                gerFuncionario.atualizaCozinheiroCpf(resultado);
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                ListarFun();
            } else {
                JOptionPane.showMessageDialog(null, "Alteração cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe um Cozinheiro com este CPF cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }

    public void excluirCozinheiro() {
        String cpf = ctCPF.getText().trim();

        if (cpf == null || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CPF não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o Cozinheiro com CPF: " + cpf + "?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            Cozinheiro removido = gerFuncionario.removeCozinheiroCpf(cpf);

            if (removido != null) {
                JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                limpar();
            } else {
                JOptionPane.showMessageDialog(null, "Não existe um Cozinheiro com este CPF!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            ListarFun();
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void consultar() throws CPFInvalidoException {
        String cpf = ctCPF.getText().trim();

        if (cpf == null || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CPF não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.setCpf(cpf);

        Cozinheiro resultado = gerFuncionario.consCozinheiroCpf(cozinheiro);

        if (resultado != null) {
            ctNome.setText(resultado.getNome());
            ctEspecialidade.setText(resultado.getEspecialidade());
            ctTurno.setText(resultado.getTurno());
            ctSalario.setText(String.valueOf(resultado.getSalario()));

            JOptionPane.showMessageDialog(null, "Dados encontrados!", "Consulta realizada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Não existe um Cozinheiro com este CPF cadastrado!", "Consulta não realizada", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }

    public void limpar() {
        ctCPF.setText("");
        ctNome.setText("");
        ctEspecialidade.setText("");
        ctTurno.setText("");
        ctSalario.setText("");
        ctNome.requestFocus();
    }

    ;
    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

    ;
    
    public void cadastrar() throws CPFInvalidoException {
        String cpf = ctCPF.getText();
        if (!isValidCPF(cpf)) {
            throw new CPFInvalidoException("O CPF deve conter apenas números.");
        }
        String salarioText = ctSalario.getText();
        double salario;
        try {
            salario = Double.parseDouble(salarioText);
        } catch (NumberFormatException e) {
            ctSalario.setText("");
            throw new CPFInvalidoException("O salário deve ser um número válido.");
        }
        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.setCpf(cpf);
        cozinheiro.setNome(ctNome.getText());
        cozinheiro.setEspecialidade(ctEspecialidade.getText());
        cozinheiro.setTurno(ctTurno.getText());
        cozinheiro.setSalario(Double.parseDouble(ctSalario.getText()));

        cozinheiro = gerFuncionario.cadCozinheiro(cozinheiro);
        if (cozinheiro != null) {
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!", "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
            limpar();
        } else {
            JOptionPane.showMessageDialog(null, "CPF já cadastrado", "Cadastro não realizado", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean isValidCPF(String cpf) {
        return cpf.matches("\\d+");
    }

    public void ListarFun() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        List<Cozinheiro> cozinheiros = gerFuncionario.getBdCozinheiros();
        List<Entregador> entregadores = gerFuncionario.getBdEntregadores();

        for (Cozinheiro cozinheiro : cozinheiros) {
            modelo.addRow(new Object[]{cozinheiro.getNome(), cozinheiro.getCpf(), cozinheiro.getEspecialidade(), cozinheiro.getTurno(), cozinheiro.getSalario()});
        }

        for (Entregador entregador : entregadores) {
            modelo.addRow(new Object[]{entregador.getNome(), entregador.getCpf(),});
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
            java.util.logging.Logger.getLogger(FormCadCozinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadCozinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadCozinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadCozinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadCozinheiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadFun;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctCPF;
    private javax.swing.JTextField ctEspecialidade;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctSalario;
    private javax.swing.JTextField ctTurno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEspecialidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTitutlo;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JPanel pDec3;
    private javax.swing.JPanel pDec4;
    // End of variables declaration//GEN-END:variables

}
