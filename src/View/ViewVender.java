package View;
//Importação das Classes Utilizadas

import Controller.ClienteController;
import Controller.ComandaController;
import Controller.ProdutoController;
import Controller.itemComandaController;
import MODEL.Cliente;
import MODEL.Comanda;
import MODEL.Produto;
import MODEL.itemComanda;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class ViewVender extends javax.swing.JFrame {
    //Inicialização da Tela

    public ViewVender() {
        initComponents();
        txtIDProduto.setEditable(false);
        txtQuantidade.setEditable(false);
        BtnPesquisarProduto.setEnabled(false);
        BtnInserir.setEnabled(false);
        txtProduto.setEnabled(false);
    }
    //Validação se os camspo de IDCliente, IDProduto e de Quantidade estão preenchidos

    public boolean validaCampoCliente() {

        if (this.txtIDCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo do ID do cliente");
            return false;
        }
        return true;
    }

    public boolean validaCampoProduto() {
        if (this.txtIDProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo do ID do produto");
            return false;
        }

        if (this.txtQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha o campo de quantidade do produto");
            return false;
        }
        return true;
    }
    //Valida se o formato digitado no campo de ID cliente, ID Produto e Quantidade é do tipo Inteiro

    public boolean validaFormato() {

        try {
            if (!this.txtIDCliente.getText().equalsIgnoreCase("")) {
                Integer.parseInt(txtIDCliente.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na conversão dos dados no campo ID Cliente", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }

        try {
            if (!this.txtIDProduto.getText().equalsIgnoreCase("")) {
                Integer.parseInt(txtIDProduto.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na conversão dos dados no campo ID Produto", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }

        try {
            if (!this.txtQuantidade.getText().equalsIgnoreCase("")) {
                Integer.parseInt(txtQuantidade.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na conversão dos dados no campo Quantidade", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }
    //Limpa os campos de textos de seleção de produtos

    public void LimparCampos() {
        txtIDProduto.setText("");
        txtQuantidade.setText("");
        txtProduto.setText("");
    }

    //Habilita os botões e campos de seleção de Produto
    public void habilitarFormulario() {
        txtIDProduto.setEditable(true);
        txtQuantidade.setEditable(true);
        BtnPesquisarProduto.setEnabled(true);
        BtnInserir.setEnabled(true);
        txtProduto.setEnabled(true);
    }

    //Carrego os meus itens do Array de String que são relacionados aos produtos que pesquisei.
    public void loadTable(ArrayList<String[]> listaItens) {
        //modelo da tabela
        DefaultTableModel tmItens = new DefaultTableModel();
        tmItens.addColumn("Produto");
        tmItens.addColumn("Quantidade");
        tmItens.addColumn("Valor Unt");
        tmItens.addColumn("Total");
        tabelaItens.setModel(tmItens);
        //Adiciona os itens na tabela
        for (String[] elementosItens : listaItens) {

            tmItens.addRow(elementosItens);
        }

        tabelaItens.getColumnModel().getColumn(0).setPreferredWidth(250); //Produto
        tabelaItens.getColumnModel().getColumn(1).setPreferredWidth(250); //Quantidade
        tabelaItens.getColumnModel().getColumn(2).setPreferredWidth(250); //Valor unitário
        tabelaItens.getColumnModel().getColumn(3).setPreferredWidth(250); //Total

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        BtnSelecionarCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtIDProduto = new javax.swing.JTextField();
        BtnPesquisarProduto = new javax.swing.JButton();
        BtnInserir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        BtnLimpar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaItens = new javax.swing.JTable();
        BtnCancelar = new javax.swing.JButton();
        BtnConcluir = new javax.swing.JButton();
        TxtTotalComprado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Venda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("ID Cliente");

        BtnSelecionarCliente.setText("Selecionar");
        BtnSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelecionarClienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Cliente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(txtNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSelecionarCliente)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSelecionarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("ID Produto");

        jLabel3.setText("Quantidade");

        BtnPesquisarProduto.setText("Pesquisar");
        BtnPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarProdutoActionPerformed(evt);
            }
        });

        BtnInserir.setText("Inserir Produto");
        BtnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInserirActionPerformed(evt);
            }
        });

        jLabel5.setText("Produto");

        BtnLimpar.setText("Limpar");
        BtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                            .addComponent(txtProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnPesquisarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIDProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisarProduto)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpar))
                .addGap(18, 24, Short.MAX_VALUE)
                .addComponent(BtnInserir)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Itens", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produto", "Qtde", "Valor Unt", "Total"
            }
        ));
        jScrollPane1.setViewportView(tabelaItens);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BtnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnConcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnConcluir.setText("Concluir");
        BtnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConcluirActionPerformed(evt);
            }
        });

        jLabel4.setText("TOTAL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TxtTotalComprado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnConcluir)
                    .addComponent(TxtTotalComprado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Botão de pesquisa de Cliente, no qual ao achar o cliente ele libera que sejá possivel adicionar itens na minha comanda
    private void BtnSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelecionarClienteActionPerformed
       
        ArrayList<Cliente> listaCliente = ClienteController.getClientesList();
        boolean find = false;
        //Validação se os foram preenchidos de acordo com o solicitado
        if (validaCampoCliente() && validaFormato()) {
            for (Cliente lista : listaCliente) {
                //Valida se o ID digitado é de algum cliente cadastrado
                if (Integer.parseInt(txtIDCliente.getText()) == lista.getId()) {

                    find = true;
                    //Preenche os campos de texto com as informações do cliente
                    txtIDCliente.setText(String.valueOf(lista.getId()));
                    txtNomeCliente.setText(lista.getNome());
                    JOptionPane.showMessageDialog(this, "Cliente selecionado", "Cliente cadastrado", JOptionPane.INFORMATION_MESSAGE);
                    txtIDCliente.setEditable(false);
                    Comanda comanda = new Comanda(lista.getId());
                    habilitarFormulario();
                }
            }

            if (find == false) {
                JOptionPane.showMessageDialog(this, "Cliente não cadastrado na base de dados", "Cliente não cadastrado", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnSelecionarClienteActionPerformed

    private void BtnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarProdutoActionPerformed

        ArrayList<Produto> listaProduto = ProdutoController.getProdutoList();
        boolean find = false;
   
        if (validaCampoProduto() && validaFormato()) {
            for (Produto produtos : listaProduto) {
   
                if (Integer.parseInt(txtIDProduto.getText()) == produtos.getId()) {
                    find = true;
   
                    if (Integer.parseInt(txtQuantidade.getText()) > 0 && Integer.parseInt(txtQuantidade.getText()) <= produtos.getQuantidadeProduto()) {
   
                        txtProduto.setText(produtos.getNomeProduto());
                        txtIDProduto.setText(String.valueOf(produtos.getId()));
                        JOptionPane.showMessageDialog(this, "Produto localizado", "Produto cadastrado", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(this, "Produto sem estoque suficiente", "Produto sem estoque", JOptionPane.ERROR_MESSAGE);

                    }
                }
            }
            if (find == false) {
                JOptionPane.showMessageDialog(this, "Produto não cadastrado", "Produto sem cadastro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnPesquisarProdutoActionPerformed
//Botão que insere Produtos dentro do meu ArrayList itemComanda, baseado no que foi encontrado de produto.
    private void BtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInserirActionPerformed
       
        ArrayList<Produto> produto = ProdutoController.getProdutoList();
        itemComanda itemcomanda = new itemComanda();
        ArrayList<itemComanda> item = itemComandaController.getItensList();
        ArrayList<String[]> listaItens = new ArrayList<>();
        
        double calcTotal = 0;

        for (Produto elementos : produto) {
           
            if (Integer.parseInt(txtIDProduto.getText()) == elementos.getId()) {
           
                if (Integer.parseInt(txtQuantidade.getText()) <= elementos.getQuantidadeProduto()) {
           
                    itemComandaController.controllerSalvarItem(elementos.getId(),                            
                            Integer.parseInt(txtQuantidade.getText()),
                            elementos.getValorProduto());
           
                    itemcomanda.DecrementarEstoque(elementos,
                            elementos.getId(),
                            Integer.parseInt(txtQuantidade.getText()));
                    //passando o meu Array de item comanda para String para ser utilizado no meu metodo LoadTable
                    listaItens = itemComandaController.getItemLista(item, listaItens, elementos.getNomeProduto());
                    this.loadTable(listaItens);
                    JOptionPane.showMessageDialog(this, "Item Cadastrado", "Inserção de Itens", JOptionPane.INFORMATION_MESSAGE);
                    LimparCampos();
                    break;
                } else {
                    JOptionPane.showMessageDialog(this, "Não temos essa Quantidade de produtos em estoque!", "Estoque", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        //Laço para incrementar o valor total de acordo com os itens cadastrado
        for (itemComanda valor : item) {
            calcTotal += valor.getValorTotalProduto();
        }
        //Preenchimento do campo Total com o valor total de cada item
        TxtTotalComprado.setText(String.valueOf(calcTotal));
    }//GEN-LAST:event_BtnInserirActionPerformed
    //Botão que fecha a janela, cancela a compra e limpa a minha lista de itemComanda para que não aculume outros itens na minha proxima venda.
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        itemComandaController.limparlista();
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed
    //Limpa os campos de pesquisa de ID Produto e quantidade
    private void BtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_BtnLimparActionPerformed
    //Botão que conclui a compra, criando uma Comanda
    private void BtnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConcluirActionPerformed
        
        Comanda c = new Comanda();                
        
        itemComandaController.limparlista();
        JOptionPane.showMessageDialog(this, "Comanda Finalizada", "Status Comanda", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();

    }//GEN-LAST:event_BtnConcluirActionPerformed

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
            java.util.logging.Logger.getLogger(ViewVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewVender().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConcluir;
    private javax.swing.JButton BtnInserir;
    private javax.swing.JButton BtnLimpar;
    private javax.swing.JButton BtnPesquisarProduto;
    private javax.swing.JButton BtnSelecionarCliente;
    private javax.swing.JTextField TxtTotalComprado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaItens;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIDProduto;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables

}
