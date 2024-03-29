package View;

import Controller.ClienteController;
import MODEL.Cliente;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class ViewClientePesquisar extends javax.swing.JFrame {

    //Inicialização da Tela
    public ViewClientePesquisar() {
        initComponents();
        jbtEditar.setEnabled(false);
        jbtExcluir.setEnabled(false);
        txtStatus.setEnabled(false);
    }

    //Habilita os Campos de Pesquisa por Nome, CPF e Sexo
    public void HabilitarCampos() {

        txtNome.setEnabled(true);
        txtCPF.setEnabled(true);
        txtSexo.setEnabled(true);
    }

    //Limpa os Campos de textos de pesquisa Nome, CPF e Sexo
    public void LimparCampos() {

        txtNome.setText("");
        txtCPF.setText("");
        txtSexo.setText("");
    }

    //função de carregar tabela recebendo um Array de String[]
    public void loadTable(ArrayList<String[]> listaClientes) {

        DefaultTableModel tmClientes = new DefaultTableModel();//crio o modelo da tabela
        tmClientes.addColumn("ID");//seto as colunas
        tmClientes.addColumn("Nome");
        tmClientes.addColumn("CPF");
        tmClientes.addColumn("Sexo");
        tabelaCliente.setModel(tmClientes);//carrego o modelo na tabela

        for (String[] elementosCliente : listaClientes) {//para cada elementro encontrado, insiro o dado na tabela

            tmClientes.addRow(elementosCliente);
        }
        //definição de tamanho das colunas e suas posições
        tabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tabelaCliente.getColumnModel().getColumn(1).setPreferredWidth(250); //Nome
        tabelaCliente.getColumnModel().getColumn(2).setPreferredWidth(250); //CPF
        tabelaCliente.getColumnModel().getColumn(3).setPreferredWidth(250); //Sexo       

        jbtExcluir.setEnabled(true);
        jbtEditar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioNome = new javax.swing.JRadioButton();
        jRadioCPF = new javax.swing.JRadioButton();
        jRadioSexo = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtPesquisar = new javax.swing.JButton();
        jbtEditar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtLimpar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa de Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setToolTipText("");

        buttonGroup1.add(jRadioNome);
        jRadioNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioNome.setText("Nome");
        jRadioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioCPF);
        jRadioCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioCPF.setText("CPF");
        jRadioCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCPFActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioSexo);
        jRadioSexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioSexo.setText("Sexo");
        jRadioSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSexoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioCPF)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioNome)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtCPF)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioSexo)
                        .addGap(10, 10, 10)
                        .addComponent(txtSexo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 231, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioSexo)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jbtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/zoom_in.png"))); // NOI18N
        jbtPesquisar.setText("Pesquisar");
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
            }
        });

        jbtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user_edit.png"))); // NOI18N
        jbtEditar.setText("Editar");
        jbtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditarActionPerformed(evt);
            }
        });

        jbtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user_delete.png"))); // NOI18N
        jbtExcluir.setText("Excluir");
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });

        jbtLimpar.setText("Limpar");
        jbtLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLimparActionPerformed(evt);
            }
        });

        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jbtPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Sexo"
            }
        ));
        jScrollPane1.setViewportView(tabelaCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Botão que limpa os campos de textos Preenchidos
    private void jbtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLimparActionPerformed

        LimparCampos();
    }//GEN-LAST:event_jbtLimparActionPerformed
    //Opção selecionada de pesquisa por NOME, Desabilita as formas de pesquisa por CPF e SEXO
    private void jRadioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNomeActionPerformed

        LimparCampos();
        HabilitarCampos();
        if (jRadioNome.isSelected()) {
            txtCPF.setEnabled(false);
            txtSexo.setEnabled(false);
        }

    }//GEN-LAST:event_jRadioNomeActionPerformed
    //Opção selecionada de pesquisa por CPF, Desabilita as formas de pesquisa por NOME e SEXO
    private void jRadioCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCPFActionPerformed

        LimparCampos();
        HabilitarCampos();
        if (jRadioCPF.isSelected()) {
            txtNome.setEnabled(false);
            txtSexo.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioCPFActionPerformed
    //Opção selecionada de pesquisa por SEXO, Desabilita as formas de pesquisa por CPF e NOME
    private void jRadioSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSexoActionPerformed

        LimparCampos();
        HabilitarCampos();
        if (jRadioSexo.isSelected()) {
            txtNome.setEnabled(false);
            txtCPF.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioSexoActionPerformed
    //Botão que faz a pesquisa com o texto digitado no campo selecionado
    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed

        if (jRadioNome.isSelected()) {

            boolean find = false;

            ArrayList<Cliente> listaNome = ClienteController.getClientesList();
            ArrayList<String[]> listaClientes = new ArrayList<>();

            for (Cliente clientesNome : listaNome) {

                if (clientesNome.getNome().equals(txtNome.getText())) {

                    listaClientes = ClienteController.getClienteNome(listaClientes, txtNome.getText());
                    this.loadTable(listaClientes);
                    find = true;
                    txtStatus.setText("Pesquisa Feita");
                    txtStatus.setBackground(Color.getHSBColor(0.5f, 0.3f, 0.7f));
                    break;
                }
            }

            if (find == false) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado",
                        "Cliente não cadastrado", JOptionPane.ERROR_MESSAGE);
                txtStatus.setText("Cliente não Encontrado");
                txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
            }
        }
        //Pesquisa por CPF
        if (jRadioCPF.isSelected()) {

            boolean find = false;

            ArrayList<Cliente> listaNome = ClienteController.getClientesList();
            ArrayList<String[]> listaClientes = new ArrayList<>();

            for (Cliente clientesNome : listaNome) {

                if (clientesNome.getCPF().equals(txtCPF.getText())) {

                    listaClientes = ClienteController.getClienteCPF(listaClientes, txtCPF.getText());
                    this.loadTable(listaClientes);
                    find = true;
                    txtStatus.setText("Pesquisa Feita");
                    txtStatus.setBackground(Color.getHSBColor(0.5f, 0.3f, 0.7f));
                    break;
                }
            }

            if (find == false) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado",
                        "Cliente não cadastrado", JOptionPane.ERROR_MESSAGE);
                txtStatus.setText("Cliente não Encontrado");
                txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
            }
        }
        //Pesquisa por SEXO
        if (jRadioSexo.isSelected()) {

            boolean find = false;

            ArrayList<Cliente> listaNome = ClienteController.getClientesList();
            ArrayList<String[]> listaClientes = new ArrayList<>();

            for (Cliente clientesNome : listaNome) {
                //Validação de todos os Clientes cadastrados para poder preencher a tabela
                if (clientesNome.getSexo().equals(txtSexo.getText())) {

                    listaClientes = ClienteController.getClienteSexo(listaClientes, txtSexo.getText());
                    this.loadTable(listaClientes);
                    find = true;
                    txtStatus.setText("Pesquisa Feita");
                    txtStatus.setBackground(Color.getHSBColor(0.5f, 0.3f, 0.7f));
                    break;
                }
            }

            if (find == false) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado",
                        "Cliente não cadastrado", JOptionPane.ERROR_MESSAGE);
                txtStatus.setText("Cliente não Encontrado");
                txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
            }
        }

    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        //Botão que Fecha a tela
        this.dispose();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        //Botão que Pega o Item Selecionado na tebela e Exclui da Base de dados
        if (tabelaCliente.getSelectedRow() != -1) {

            int numeroLinha = tabelaCliente.getSelectedRow();
            //Validação se o Cliente Existe na Base de Dados para ser possivel Excluir o mesmo
            if (ClienteController.controllerExcluirCliente(Integer.parseInt(tabelaCliente.getValueAt(numeroLinha, 0).toString()))) {
                DefaultTableModel modeloTabela = (DefaultTableModel) tabelaCliente.getModel();
                modeloTabela.removeRow(numeroLinha);//Exclui item da tabela
                JOptionPane.showMessageDialog(this, "Cliente excluído da base de dados");
                txtStatus.setText("Cliente Excluído");
                txtStatus.setBackground(Color.getHSBColor(0.2f, 0.3f, 0.7f));

            } else {
                JOptionPane.showMessageDialog(this, "Falha ao excluir o cliente!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há cliente selecionado para exclusão",
                    "Erro de Exclusão", JOptionPane.ERROR_MESSAGE);
            txtStatus.setText("Cliente não Selecionado");
            txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
        }
    }//GEN-LAST:event_jbtExcluirActionPerformed
    //Botão que de acordo com o item selecionado na tabela ele abre a tela de Edição caso exista o Cliente Cadastrado
    private void jbtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditarActionPerformed

        if (tabelaCliente.getSelectedRow() != -1) {

            int numeroLinha = tabelaCliente.getSelectedRow();
            Cliente ID = new Cliente();
            //Armazena o ID do Cliente a ser Editado
            ID.inserirIDEditar(Integer.parseInt(tabelaCliente.getValueAt(numeroLinha, 0).toString()));
            ViewClienteEditar editar = new ViewClienteEditar();
            editar.setVisible(true);//Inicializa a Tela de Alteração de Cadastro

        } else {
            JOptionPane.showMessageDialog(this, "Não há cliente selecionado", "Falha ao editar", JOptionPane.ERROR_MESSAGE);
            txtStatus.setText("Cliente não Selecionado");
            txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
        }
    }//GEN-LAST:event_jbtEditarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewClientePesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClientePesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClientePesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClientePesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewClientePesquisar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioCPF;
    private javax.swing.JRadioButton jRadioNome;
    private javax.swing.JRadioButton jRadioSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtEditar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtLimpar;
    private javax.swing.JButton jbtPesquisar;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
