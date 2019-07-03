package View;

import Controller.ProdutoController;
import MODEL.Produto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class ViewProdutoPesquisa extends javax.swing.JFrame {

    public ViewProdutoPesquisa() {
        initComponents();
        jbtEditar.setEnabled(false);  //botão de edição começa desabilitado
        jbtExcluir.setEnabled(false); //botão de exclusão começa desabilitado
        txtStatus.setEditable(false); //campo de status permanece sem edição
    }

    //função para habilitar todos os campos de pesquisa
    public void HabilitarCampos() {
        txtNome.setEnabled(true);
        txtCategoria.setEnabled(true);
        txtMarca.setEnabled(true);
        txtModelo.setEnabled(true);
    }

    //função para limpar os campos de pesquisa
    public void LimparCampos() {
        txtNome.setText("");
        txtCategoria.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
    }

    //função de carregar tabela recebendo um Array de String[]
    public void loadTable(ArrayList<String[]> listaProdutos) {

        DefaultTableModel tmProdutos = new DefaultTableModel(); //crio o modelo da tabela
        tmProdutos.addColumn("ID"); //seto as colunas
        tmProdutos.addColumn("Nome");
        tmProdutos.addColumn("Categoria");
        tmProdutos.addColumn("Marca");
        tmProdutos.addColumn("Modelo");
        tmProdutos.addColumn("Descrição");
        tmProdutos.addColumn("Quantidade");
        tmProdutos.addColumn("Vlr. Unitário");
        tabelaProdutos.setModel(tmProdutos); //carrego o modelo na tabela

        for (String[] elementosProduto : listaProdutos) { //para cada elementro encontrado, insiro o dado na tabela

            tmProdutos.addRow(elementosProduto);
        }

        //definição de tamanho das colunas e suas posições
        tabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(250); //ID
        tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(250); //Nome
        tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(250); //Categoria
        tabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(250); //Marca
        tabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(250); //Modelo
        tabelaProdutos.getColumnModel().getColumn(5).setPreferredWidth(250); //Descrição
        tabelaProdutos.getColumnModel().getColumn(6).setPreferredWidth(250); //Quantidade
        tabelaProdutos.getColumnModel().getColumn(7).setPreferredWidth(250); //Valor

        //habilita os botões de exclusão  e edição
        jbtExcluir.setEnabled(true);
        jbtEditar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btControlProduto = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbtPesquisar = new javax.swing.JButton();
        jbtEditar = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtLimpar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioNome = new javax.swing.JRadioButton();
        jRadioCategoria = new javax.swing.JRadioButton();
        jRadioMarca = new javax.swing.JRadioButton();
        jRadioModelo = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jbtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/zoom_in.png"))); // NOI18N
        jbtPesquisar.setText("Pesquisar");
        jbtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPesquisarActionPerformed(evt);
            }
        });

        jbtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/computer_edit.png"))); // NOI18N
        jbtEditar.setText("Editar");
        jbtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditarActionPerformed(evt);
            }
        });

        jbtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/computer_delete.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtCancelar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa de Produto", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btControlProduto.add(jRadioNome);
        jRadioNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioNome.setText("Nome");
        jRadioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNomeActionPerformed(evt);
            }
        });

        btControlProduto.add(jRadioCategoria);
        jRadioCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioCategoria.setText("Categoria");
        jRadioCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCategoriaActionPerformed(evt);
            }
        });

        btControlProduto.add(jRadioMarca);
        jRadioMarca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioMarca.setText("Marca");
        jRadioMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMarcaActionPerformed(evt);
            }
        });

        btControlProduto.add(jRadioModelo);
        jRadioModelo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioModelo.setText("Modelo");
        jRadioModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioModeloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Status:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioNome)
                        .addGap(38, 38, 38)
                        .addComponent(txtNome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioMarca)
                            .addComponent(jRadioModelo))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                            .addComponent(txtModelo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioCategoria)
                        .addGap(14, 14, 14)
                        .addComponent(txtCategoria))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioCategoria))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Categoria", "Marca", "Modelo", "Descrição", "Quantidade", "Vlr. Unitário"
            }
        ));
        jScrollPane1.setViewportView(tabelaProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Evento ao apertar o botão de Pesquisar
    private void jbtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPesquisarActionPerformed
        //caso o nome seja selecionado
        if (jRadioNome.isSelected()) {

            boolean find = false;

            ArrayList<Produto> produtos = ProdutoController.getProdutoList();
            ArrayList<String[]> listaProdutos = new ArrayList<>();
            for (Produto produtosNomes : produtos) {

                if (produtosNomes.getNomeProduto().equals(txtNome.getText())) {

                    listaProdutos = ProdutoController.getProdutoNome(listaProdutos, txtNome.getText());
                    this.loadTable(listaProdutos);
                    find = true;
                    txtStatus.setText("Pesquisa Feita");
                    txtStatus.setBackground(Color.getHSBColor(0.2f, 0.3f, 0.7f));
                    break;
                }
            }

            if (find == false) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado",
                        "Produto não cadastrado", JOptionPane.ERROR_MESSAGE);
                txtStatus.setText("Produto não Encontrado");
                txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
            }
        }

        //Selecionando a opção Categoria
        if (jRadioCategoria.isSelected()) {

            boolean find = false;

            ArrayList<Produto> produtos = ProdutoController.getProdutoList();
            ArrayList<String[]> listaProdutos = new ArrayList<>();
            for (Produto produtosNomes : produtos) {

                if (produtosNomes.getCategoriaProduto().equals(txtCategoria.getText())) {

                    listaProdutos = ProdutoController.getProdutoCategoria(listaProdutos, txtCategoria.getText());
                    this.loadTable(listaProdutos);
                    find = true;
                    txtStatus.setText("Pesquisa Feita");
                    txtStatus.setBackground(Color.getHSBColor(0.2f, 0.3f, 0.7f));
                    break;
                }
            }

            if (find == false) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado",
                        "Produto não cadastrado", JOptionPane.ERROR_MESSAGE);
                txtStatus.setText("Produto não Encontrado");
                txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
            }
        }

        //Selecionando a opção Marca
        if (jRadioMarca.isSelected()) {

            boolean find = false;

            ArrayList<Produto> produtos = ProdutoController.getProdutoList();
            ArrayList<String[]> listaProdutos = new ArrayList<>();
            for (Produto produtosNomes : produtos) {

                if (produtosNomes.getMarcaProduto().equals(txtMarca.getText())) {

                    listaProdutos = ProdutoController.getProdutoMarca(listaProdutos, txtMarca.getText());
                    this.loadTable(listaProdutos);
                    find = true;
                    txtStatus.setText("Pesquisa Feita");
                    txtStatus.setBackground(Color.getHSBColor(0.2f, 0.3f, 0.7f));
                    break;
                }
            }

            if (find == false) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado",
                        "Produto não cadastrado", JOptionPane.ERROR_MESSAGE);
                txtStatus.setText("Produto não Encontrado");
                txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
            }
        }
        //Selecionando a opção Modelo
        if (jRadioModelo.isSelected()) {

            boolean find = false;

            ArrayList<Produto> produtos = ProdutoController.getProdutoList();
            ArrayList<String[]> listaProdutos = new ArrayList<>();
            for (Produto produtosNomes : produtos) {

                if (produtosNomes.getModeloProduto().equals(txtModelo.getText())) {

                    listaProdutos = ProdutoController.getProdutoModelo(listaProdutos, txtModelo.getText());
                    this.loadTable(listaProdutos);
                    find = true;
                    txtStatus.setText("Pesquisa Feita");
                    txtStatus.setBackground(Color.getHSBColor(0.2f, 0.3f, 0.7f));
                    break;
                }
            }

            if (find == false) {
                JOptionPane.showMessageDialog(null, "Produto não encontrado",
                        "Produto não cadastrado", JOptionPane.ERROR_MESSAGE);
                txtStatus.setText("Produto não Encontrado");
                txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
            }
        }
    }//GEN-LAST:event_jbtPesquisarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditarActionPerformed

        //Valido se há linha selecionada
        if (tabelaProdutos.getSelectedRow() != -1) {

            //Atribuo o valor da linha selecionada
            int numeroLinha = tabelaProdutos.getSelectedRow();
            Produto ID = new Produto(); //Instancio um objeto de Produto vazio

            //Utilizo a função de inserir o ID de acordo com a primeira coluna da tabela
            ID.inserirIDEditar(Integer.parseInt(tabelaProdutos.getValueAt(numeroLinha, 0).toString()));
            ViewProdutoEditar editar = new ViewProdutoEditar(); //Instancio a tela de Edição de Produto
            editar.setVisible(true); //Configuro para visível

        } else {
            //Em caso de nenhuma linha selecionada para edição de produto
            JOptionPane.showMessageDialog(this, "Não há produto selecionado", "Falha ao editar", JOptionPane.ERROR_MESSAGE);
            txtStatus.setText("Produto não Selecionado");
            txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
        }
    }//GEN-LAST:event_jbtEditarActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed

        //Valido se há linha selecionada
        if (tabelaProdutos.getSelectedRow() != -1) {

            //Atribuo o valor da linha selecionada
            int numeroLinha = tabelaProdutos.getSelectedRow();

            //Executo o método de Exclusão da Controller passando o valor da primeira coluna (ID)
            if (ProdutoController.controllerExcluirProduto(Integer.parseInt(tabelaProdutos.getValueAt(numeroLinha, 0).toString()))) {
                DefaultTableModel modeloTabela = (DefaultTableModel) tabelaProdutos.getModel(); //Carrega o modelo
                modeloTabela.removeRow(numeroLinha); //Efetuo a remoção da tabela
                JOptionPane.showMessageDialog(this, "Produto excluído da base de dados"); //Informo a exclusão do produto
                txtStatus.setText("Produto Excluído");
                txtStatus.setBackground(Color.getHSBColor(0.2f, 0.3f, 0.7f));

            } else {
                //Retorna em caso de falha da exclusão
                JOptionPane.showMessageDialog(this, "Falha ao excluir o produto!");
            }
        } else {
            //Retorna se não houver uma linha selecionada
            JOptionPane.showMessageDialog(this, "Não há produto selecionado para exclusão",
                    "Erro de Exclusão", JOptionPane.ERROR_MESSAGE);
            txtStatus.setText("Produto não Selecionado");
            txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
        }
    }//GEN-LAST:event_jbtExcluirActionPerformed

    //Botão para efetuar a limpeza dos campos
    private void jbtLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLimparActionPerformed
        LimparCampos(); //Executo a função para limpar Campos

    }//GEN-LAST:event_jbtLimparActionPerformed

    //Radio de Nome
    private void jRadioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNomeActionPerformed

        LimparCampos();
        HabilitarCampos();
        if (jRadioNome.isSelected()) { //Caso esteja selecionado, desabilita os outros campos
            txtCategoria.setEnabled(false);
            txtMarca.setEnabled(false);
            txtModelo.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioNomeActionPerformed
    //Radio de Categoria
    private void jRadioCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCategoriaActionPerformed

        LimparCampos();
        HabilitarCampos();
        if (jRadioCategoria.isSelected()) { //Caso esteja selecionado, desabilita os outros campos
            txtNome.setEnabled(false);
            txtMarca.setEnabled(false);
            txtModelo.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioCategoriaActionPerformed
    //Radio de Marca
    private void jRadioMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMarcaActionPerformed

        LimparCampos();
        HabilitarCampos();
        if (jRadioMarca.isSelected()) { //Caso esteja selecionado, desabilita os outros campos
            txtNome.setEnabled(false);
            txtCategoria.setEnabled(false);
            txtModelo.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioMarcaActionPerformed
    //Radio de Modelo
    private void jRadioModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioModeloActionPerformed
        //
        LimparCampos();
        HabilitarCampos();
        if (jRadioModelo.isSelected()) { //Caso esteja selecionado, desabilita os outros campos
            txtNome.setEnabled(false);
            txtCategoria.setEnabled(false);
            txtMarca.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioModeloActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProdutoPesquisa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoPesquisa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoPesquisa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoPesquisa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewProdutoPesquisa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btControlProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioCategoria;
    private javax.swing.JRadioButton jRadioMarca;
    private javax.swing.JRadioButton jRadioModelo;
    private javax.swing.JRadioButton jRadioNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtEditar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtLimpar;
    private javax.swing.JButton jbtPesquisar;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
