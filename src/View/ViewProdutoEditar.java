package View;

import Controller.ProdutoController;
import MODEL.Produto;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public final class ViewProdutoEditar extends javax.swing.JFrame {

    /**
     * Creates new form ViewProduto
     */
    public ViewProdutoEditar() {
        initComponents();
        txtID.setEditable(false); //desabilita, pois não terá interação com usuário
        txtStatus.setEditable(false);
        preencherCampos(); //chama a função para preencher os campos
    }

    //limpando todos os campos do formulário
    public void LimparFormulario() {
        txtNomeProduto.setText("");
        txtCategoria.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtDescricao.setText("");
        txtQuantidade.setText("");
        txtValor.setText("");
    }

    public void preencherCampos() {

        int ID = Produto.receberIDEditar();

        ArrayList<Produto> editarP = ProdutoController.getProdutoList();

        for (Produto elementos : editarP) {

            //caso seja igual ao ID
            if (ID == elementos.getId()) {

                //preenche todos os campos de acordo com a lista daquele produto
                txtID.setText(String.valueOf(elementos.getId()));
                txtNomeProduto.setText(String.valueOf(elementos.getNomeProduto()));
                txtCategoria.setText(String.valueOf(elementos.getCategoriaProduto()));
                txtMarca.setText(String.valueOf(elementos.getMarcaProduto()));
                txtModelo.setText(String.valueOf(elementos.getModeloProduto()));
                txtDescricao.setText(String.valueOf(elementos.getDescricaoProduto()));
                txtQuantidade.setText(String.valueOf(elementos.getQuantidadeProduto()));
                txtValor.setText(String.valueOf(elementos.getValorProduto()));
            }
        }

        //verifica cada elemendo
    }

    //função que valida se formulário foi preenchido
    private boolean ValidarFormulario() {

        //valida o campo Nome Produto
        if (this.txtNomeProduto.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Nome obrigatório.");
            return false;
        }
        //valida o campo Categoria
        if (this.txtCategoria.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Categoria obrigatório.");
            return false;
        }
        //valida o campo Marca
        if (this.txtMarca.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Marca obrigatório.");
            return false;
        }
        //valida o campo Modelo
        if (this.txtModelo.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Modelo obrigatório.");
            return false;
        }
        //valida o campo Descrição
        if (this.txtDescricao.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Descrição obrigatório.");
            return false;
        }
        //valida o campo Quantidade
        if (this.txtQuantidade.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Quantidade obrigatório.");
            return false;
        }

        //valida o campo Valor
        if (this.txtValor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Valor obrigatório.");
            return false;
        }
        return true;
    }

    private boolean ValidacaoFormato() {

        //validação do campo Quantidade do cadastro de produto
        try {
            if (!this.txtQuantidade.getText().equalsIgnoreCase("")) {
                Integer.parseInt(txtQuantidade.getText());
            }
        } catch (NumberFormatException e) {
            //caso não consiga, exibe mensagem de erro de conversão 
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na conversão dos dados no campo Quantidade", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
            return false;
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        //validação do campo Valor do cadastro de produto
        try {
            if (!this.txtValor.getText().equalsIgnoreCase("")) {
                Double.parseDouble(txtValor.getText());
            }
        } catch (NumberFormatException e) {
            //caso não consiga, exibe mensagem de erro de conversão 
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na conversão dos dados no campo Valor", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
            return false;

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jbtCancelar = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LabelID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jbtSalvar.setText("Salvar");
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
            .addComponent(jbtSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbtCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edição de Produto", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LabelID.setText("ID:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome:");

        txtNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeProdutoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Categoria:");

        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Marca:");

        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Modelo:");

        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Descrição:");

        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Quantidade:");

        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Valor:");

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtModelo)
                            .addComponent(txtNomeProduto)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao)
                            .addComponent(txtQuantidade)
                            .addComponent(txtValor))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Status:");

        txtStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        //centraliza o valor no campo de Status
        txtStatus.setHorizontalAlignment(JTextField.CENTER);

        //formulários validados
        if (ValidarFormulario() && ValidacaoFormato()) {
            //encaminha os parâmetros para o Controller de Edição
            if (ProdutoController.controllerEditarProduto(
                    Integer.parseInt(txtID.getText()),
                    txtNomeProduto.getText(),
                    txtCategoria.getText(),
                    txtMarca.getText(),
                    txtModelo.getText(),
                    txtDescricao.getText(),
                    Integer.parseInt(this.txtQuantidade.getText()),
                    Double.parseDouble(this.txtValor.getText()))) {

                //sendo true, retorna que a edição foi concluída
                JOptionPane.showMessageDialog(this, "Edição concluída",
                        "Edição de Produto", JOptionPane.INFORMATION_MESSAGE);
                txtStatus.setText("Edição Salva");
                txtStatus.setBackground(Color.getHSBColor(0.2f, 0.3f, 0.7f)); //altera a cor do Status
                //txtID.setText(String.valueOf(Produto.getQtdProdutoCriado()));
                txtID.setText(txtID.getText());
                txtID.setBackground(Color.getHSBColor(0.2f, 0.3f, 0.7f)); //altera a cor do Status
            } else {
                //caso contrário, já existe produto cadastrado
                JOptionPane.showMessageDialog(this, "Produto já cadastrado",
                        "Edição de Produto", JOptionPane.ERROR_MESSAGE);
                txtStatus.setText("Falha");
                txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
            }

        } else {
            //formulários inválidos indicam falha
            txtStatus.setText("Falha");
            txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
        }

    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        //fecha a janela de edição
        this.dispose();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void txtNomeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProdutoKeyTyped
        //se o nome digitado for menor que 40
        if (txtNomeProduto.getText().length() < 40) {
            //verifica se foi digitado número
            if (txtNomeProduto.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
            }
        } else {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 40", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtNomeProdutoKeyTyped

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        //se a categoria digitada for menor que 40
        if (txtCategoria.getText().length() < 40) {

            //verifica se foi digitado número
            if (txtCategoria.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
            }
        } else {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 40", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        //se a marca digitada for menor que 40
        if (txtMarca.getText().length() < 40) {

            //verifica se foi digitado número
            if (txtMarca.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
            }
            //caso seja maior, estoura o limite de caracteres
        } else {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 40", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        //se a modelo digitada for menor que 40
        if (txtModelo.getText().length() < 40) {

            //verifica se foi digitado número
            if (txtModelo.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
            }
        } else {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 40", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyTyped
        //se a descrição digitada for menor que 40
        if (txtDescricao.getText().length() < 80) {

            //verifica se foi digitado número
            if (txtDescricao.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
            }
        } else {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 80", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtDescricaoKeyTyped

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        //se a quantidade for maior do que 10 
        if (txtQuantidade.getText().length() > 10) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 10", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtQuantidadeKeyTyped

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        //se o valor for maior do que 10 
        if (txtValor.getText().length() > 10) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 10", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtValorKeyTyped

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
            java.util.logging.Logger.getLogger(ViewProdutoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProdutoEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewProdutoEditar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
