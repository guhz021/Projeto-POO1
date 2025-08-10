//Gustavo Alves de Aquino 2503646

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadEntregador extends javax.swing.JFrame {

    private Pessoa pessoa;
    private BdPizzaria gerPizzaria = new BdPizzaria();
    private Entregador entregador;
    
    private static FormCadEntregador FormCadEntregadorUnico;
    
    private FormCadEntregador() {
        initComponents();
    }
    
     public static FormCadEntregador getFormCadEntregadorUnico() {
        if (FormCadEntregadorUnico == null) {
            FormCadEntregadorUnico = new FormCadEntregador();
        }
        return FormCadEntregadorUnico;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btAlterar = new javax.swing.JButton();
        ctCPF = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        ctPlaca = new javax.swing.JTextField();
        lblTexto = new javax.swing.JLabel();
        ctRegiao = new javax.swing.JTextField();
        lblTexto1 = new javax.swing.JLabel();
        ctSalario = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        lblPlaca = new javax.swing.JLabel();
        btCadFun = new javax.swing.JButton();
        lblrRegiao = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        lblSalario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFun = new javax.swing.JTable();
        lblTitutlo = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        pDec2 = new javax.swing.JPanel();
        pDec3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionario: Entregador");

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1173, 648));

        btAlterar.setText("ALTERAR DADOS");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("EXCLUIR FUNCIONÁRIO");
        btExcluir.setActionCommand("EXCLUIR FUNCIONARIO");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        lblTexto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        lblTexto.setText("FUNÇÕES POR CPF:");

        lblTexto1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblTexto1.setText("ENTREGADORES CADASTRADOS:");

        ctSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSalarioActionPerformed(evt);
            }
        });

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

        btSair.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lblPlaca.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblPlaca.setText("PLACA DO VEICULO:");

        btCadFun.setText("CADASTRAR");
        btCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadFunActionPerformed(evt);
            }
        });

        lblrRegiao.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblrRegiao.setText("REGIAO DE TRABALHO:");

        btConsultar.setText("CONSULTAR FUNCIONÁRIO");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        lblSalario.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        lblSalario.setText("SALÁRIO:");

        tblFun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Placa", "Região", "Salário"
            }
        ));
        jScrollPane1.setViewportView(tblFun);

        lblTitutlo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        lblTitutlo.setText("===== CADASTRO DE FUNCIONÁRIO: ENTREGADOR =====");

        pDec2.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout pDec2Layout = new javax.swing.GroupLayout(pDec2);
        pDec2.setLayout(pDec2Layout);
        pDec2Layout.setHorizontalGroup(
            pDec2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDec2Layout.setVerticalGroup(
            pDec2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(63, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPlaca)
                                .addGap(18, 18, 18)
                                .addComponent(ctPlaca))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSalario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ctSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblrRegiao)
                                .addGap(18, 18, 18)
                                .addComponent(ctRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addGap(18, 18, 18)
                                .addComponent(ctCPF))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btAlterar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btCadFun))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTexto)
                                    .addComponent(btConsultar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btSair)
                        .addGap(237, 237, 237))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(lblTitutlo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pDec2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pDec3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTexto1)
                .addGap(197, 197, 197))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pDec3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblTitutlo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlaca)
                            .addComponent(ctPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblrRegiao)
                            .addComponent(ctRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalario)
                            .addComponent(ctSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLimpar)
                            .addComponent(btCadFun))
                        .addGap(18, 18, 18)
                        .addComponent(lblTexto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblTexto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btExcluir)
                            .addComponent(btConsultar)
                            .addComponent(btAlterar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btSair)
                        .addGap(15, 15, 15)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctSalarioActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadFunActionPerformed
            try {
            cadastrar();
        } catch (CPFInvalidoException ex) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao cadastrar: " + ex.getMessage(),
                    "Erro de Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            ctCPF.setText("");
            ctCPF.requestFocus();
        } catch (PlacaInvalidaException ex) {
            Logger.getLogger(FormCadEntregador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,
                    "Erro ao cadastrar: " + ex.getMessage(),
                    "Erro de Cadastro",
                    JOptionPane.ERROR_MESSAGE);
            ctPlaca.setText("");
            ctPlaca.requestFocus();
        }
        ListarFun();
    }//GEN-LAST:event_btCadFunActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            alterar();
        } catch (CPFInvalidoException | PlacaInvalidaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
          try {
            consultar();
        } catch (CPFInvalidoException ex) {
            Logger.getLogger(FormCadEntregador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed
    
    public void excluir() {
        String cpf = ctCPF.getText().trim();

        if (cpf == null || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CPF não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o funcionário com CPF: " + cpf + "?", "Confirmação", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            Entregador removido = gerPizzaria.removeEntregadorCpf(cpf);

            if (removido != null) {
                JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                limpar(); // Limpar campos após exclusão
            } else {
                JOptionPane.showMessageDialog(null, "Não existe um funcionário com este CPF!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            ListarFun();
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void alterar() throws CPFInvalidoException, PlacaInvalidaException {
        System.out.println("Método alterar chamado");

        String cpf = ctCPF.getText().trim();
        System.out.println("CPF: " + cpf);

        if (cpf == null || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CPF não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Entregador entregador = new Entregador();
        entregador.setCpf(cpf);

        Entregador resultado = gerPizzaria.consEntregadorCpf(entregador);

        if (resultado != null) {
            String novoNome = JOptionPane.showInputDialog(null, "Digite o novo Nome:", resultado.getNome());
            if (novoNome == null || novoNome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String novaPlaca = JOptionPane.showInputDialog(null, "Digite a nova Placa:", resultado.getPlaca());
            if (novaPlaca == null || novaPlaca.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Placa não pode estar vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String novaRegiao = JOptionPane.showInputDialog(null, "Digite a nova Região:", resultado.getRegiao());
            if (novaRegiao == null || novaRegiao.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Região não pode estar vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
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
                    + "Placa para: " + novaPlaca + "?\n"
                    + "Região para: " + novaRegiao + "?\n"
                    + "Salário para: " + novoSalario + "?",
                    "Confirmação", JOptionPane.YES_NO_OPTION);

            if (opcao == JOptionPane.YES_OPTION) {
                resultado.setNome(novoNome);
                resultado.setPlaca(novaPlaca);
                resultado.setRegiao(novaRegiao);
                resultado.setSalario(novoSalario);

                gerPizzaria.atualizaEntregadorCpf(resultado);
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                ListarFun();
            } else {
                JOptionPane.showMessageDialog(null, "Alteração cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe um Entregador com este CPF cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }

    public void consultar() throws CPFInvalidoException {
        String cpf = ctCPF.getText().trim();

        if (cpf == null || cpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CPF não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Entregador entregador = new Entregador();
        entregador.setCpf(cpf);

        Entregador resultado = gerPizzaria.consEntregadorCpf(entregador);

        if (resultado != null) {
            System.out.println("Regiao encontrada: " + resultado.getRegiao());
            ctNome.setText(resultado.getNome());
            ctPlaca.setText(resultado.getPlaca());
            ctRegiao.setText(resultado.getRegiao());
            ctSalario.setText(String.valueOf(resultado.getSalario()));

            JOptionPane.showMessageDialog(null, "Dados encontrados! Confirme os dados.", "Consulta realizada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Não existe um Entregador com este CPF cadastrado!", "Consulta não realizada", JOptionPane.ERROR_MESSAGE);
            limpar();
        }
    }

    public void limpar() {
        ctCPF.setText("");
        ctNome.setText("");
        ctPlaca.setText("");
        ctRegiao.setText("");
        ctSalario.setText("");
        ctNome.requestFocus();
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            this.dispose();
        }
    }

    public void cadastrar() throws CPFInvalidoException, PlacaInvalidaException {
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
        Entregador entregador = new Entregador();
        entregador.setCpf(cpf);
        entregador.setNome(ctNome.getText());
        entregador.setPlaca(ctPlaca.getText());
        entregador.setRegiao(ctRegiao.getText());
        entregador.setSalario(Double.parseDouble(ctSalario.getText()));

        entregador = gerPizzaria.cadEntregador(entregador);
        if (entregador != null) {
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
        DefaultTableModel modelo = (DefaultTableModel) tblFun.getModel();
        modelo.setRowCount(0);

        List<Cozinheiro> cozinheiros = gerPizzaria.getBdCozinheiros();
        List<Entregador> entregadores = gerPizzaria.getBdEntregadores(); 

        for (Cozinheiro cozinheiro : cozinheiros) {
            modelo.addRow(new Object[]{cozinheiro.getNome(), cozinheiro.getCpf(), cozinheiro.getEspecialidade(), cozinheiro.getTurno(), cozinheiro.getSalario()});
        }

        for (Entregador entregador : entregadores) {
            modelo.addRow(new Object[]{entregador.getNome(), entregador.getCpf(), entregador.getPlaca(), entregador.getRegiao(), entregador.getSalario()});
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
                new FormCadEntregador().setVisible(true);
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
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctPlaca;
    private javax.swing.JTextField ctRegiao;
    private javax.swing.JTextField ctSalario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTitutlo;
    private javax.swing.JLabel lblrRegiao;
    private javax.swing.JPanel pDec2;
    private javax.swing.JPanel pDec3;
    private javax.swing.JTable tblFun;
    // End of variables declaration//GEN-END:variables
}
