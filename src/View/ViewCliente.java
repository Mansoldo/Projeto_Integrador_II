
package View;

import Controller.ClienteController;
import MODEL.Cliente;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Diego Mansoldo and Gabriel Vital
 */
public class ViewCliente extends javax.swing.JFrame {
//Inicialização da Tela
    public ViewCliente() {
        initComponents();
        txtID.setEditable(false);//Campo ID nao pode ser Editado
        txtStatus.setEditable(false);//Campo de Status não pode ser editado
        DesabilitarFormulario();//Desabilita os campos até o Botão NOVO ser precionado
    }
    //Desabilita os campos até o Botão NOVO ser precionado
    public void DesabilitarFormulario() {

        txtNome.setEditable(false);
        txtNascimento.setEditable(false);
        txtCPF.setEditable(false);
        txtSexo.setEditable(false);
        txtEstCivil.setEditable(false);
        txtRua.setEditable(false);
        txtNumero.setEditable(false);
        txtComplemento.setEditable(false);
        txtCidade.setEditable(false);
        txtUF.setEditable(false);
        txtCep.setEditable(false);
        txtTelefone.setEditable(false);
        txtEmail.setEditable(false);

        jbtSalvar.setEnabled(false);
        jbtCancelar.setEnabled(false);
    }

    //Limpa todos os campos 
    public void LimparFormulario() {
        txtNome.setText("");
        txtNascimento.setText("");
        txtCPF.setText("");
        txtSexo.setText("");
        txtEstCivil.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtCidade.setText("");
        txtUF.setText("");
        txtCep.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
    }

    //Habilita os campos e Botões para Edição
    public void HabilitarFormulario() {
        txtNome.setEditable(true);
        txtNascimento.setEditable(true);
        txtCPF.setEditable(true);
        txtSexo.setEditable(true);
        txtEstCivil.setEditable(true);
        txtRua.setEditable(true);
        txtNumero.setEditable(true);
        txtComplemento.setEditable(true);
        txtCidade.setEditable(true);
        txtUF.setEditable(true);
        txtCep.setEditable(true);
        txtTelefone.setEditable(true);
        txtEmail.setEditable(true);

        jbtSalvar.setEnabled(true);
        jbtCancelar.setEnabled(true);
    }
//Valida se os campos Obrigatórios Foram preenchidos
    private boolean ValidarFormulario() {

        if (this.txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Nome obrigatório.");
            return false;
        }
        if (this.txtNascimento.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Nascimento obrigatório.");
            return false;
        }
        if (this.txtCPF.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo CPF obrigatório.");
            return false;
        }
        if (this.txtSexo.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Sexo obrigatório.");
            return false;
        }
        if (this.txtEstCivil.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Estado Civil obrigatório.");
            return false;
        }

        if (this.txtRua.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Rua obrigatório.");
            return false;
        }

        if (this.txtNumero.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Numero obrigatório.");
            return false;
        }

        if (this.txtCidade.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Cidade obrigatório.");
            return false;
        }
        if (this.txtUF.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo UF obrigatório.");
            return false;
        }
        if (this.txtCep.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo CEP obrigatório.");
            return false;
        }

        if (this.txtTelefone.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo Telefone obrigatório.");
            return false;
        }

        if (this.txtEmail.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Campo E-mail obrigatório.");
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jbtNovo = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        LabelID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");
            txtNascimento = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        txtCPF = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("###.###.###-##");
            txtCPF = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        txtSexo = new javax.swing.JTextField();
        txtEstCivil = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtUF = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("(##)#####-####");
            txtTelefone = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        txtEmail = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("#####-###");
            txtCep = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ações", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jbtNovo.setText("Novo");
        jbtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNovoActionPerformed(evt);
            }
        });

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
            .addComponent(jbtNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
            .addComponent(jbtSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

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
                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
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

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        txtSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSexoKeyTyped(evt);
            }
        });

        txtEstCivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstCivilKeyTyped(evt);
            }
        });

        txtRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRuaKeyTyped(evt);
            }
        });

        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCidadeKeyTyped(evt);
            }
        });

        txtUF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUFKeyTyped(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Nascimento");

        jLabel3.setText("CPF");

        jLabel4.setText("Sexo");

        jLabel5.setText("Estado Civil");

        jLabel6.setText("Rua");

        jLabel7.setText("Número");

        jLabel9.setText("Complemento");

        jLabel10.setText("Cidade");

        jLabel11.setText("UF");

        jLabel12.setText("CEP");

        jLabel13.setText("Telefone");

        jLabel14.setText("E-mail");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCep, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUF, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRua, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstCivil, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSexo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Habilita a Criaçao de um novo cliente
    private void jbtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtNovoActionPerformed

        HabilitarFormulario();
        LimparFormulario();
        txtID.setText("");
        txtStatus.setText("");
        txtStatus.setBackground(Color.WHITE);
        txtID.setBackground(Color.white);
    }//GEN-LAST:event_jbtNovoActionPerformed
    //Desabilita o formulario e limpa os campos preenchidos
    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        DesabilitarFormulario();
        LimparFormulario();
    }//GEN-LAST:event_jbtCancelarActionPerformed
    //Cria um novo cliente da Base de Dados
    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed

        txtStatus.setHorizontalAlignment(JTextField.CENTER);
        //Valida se os campos obrigatorios estão preenchido
        if (ValidarFormulario() == true) {
            if (ClienteController.controllerSalvarCliente(//Salva o Cliente os os valores digitados
                    txtNome.getText(),
                    txtNascimento.getText(),
                    txtCPF.getText(),
                    txtSexo.getText(),
                    txtEstCivil.getText(),
                    txtRua.getText(),
                    txtNumero.getText(),
                    txtComplemento.getText(),
                    txtCidade.getText(),
                    txtUF.getText(),
                    txtCep.getText(),
                    txtTelefone.getText(),
                    txtEmail.getText())) {

                LimparFormulario();
                JOptionPane.showMessageDialog(this, "Cadastro concluído", "Cadastro de Cliente", JOptionPane.INFORMATION_MESSAGE);
                txtStatus.setText("Cadastro Salvo");
                txtStatus.setBackground(Color.getHSBColor(0.2f, 0.3f, 0.7f));
                //txtID.setText(String.valueOf(Cliente.getQtdClienteCriado()));
                txtID.setText(String.valueOf(ClienteController.controllerUltimoID()));
                txtID.setBackground(Color.getHSBColor(0.2f, 0.3f, 0.7f));
            } else {
                JOptionPane.showMessageDialog(this, "Cliente já cadastrado", "Cadastro de Cliente", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
                txtStatus.setText("Falha");
                txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
            }

        } else {
            LimparFormulario();
            txtStatus.setText("Falha");
            txtStatus.setBackground(Color.getHSBColor(1.9f, 0.9f, 1.9f));
        }
        DesabilitarFormulario();
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        //Se o nome digitado for menor que 40
        if (txtNome.getText().length() < 40) {
            //verifica se foi digitado número
            if (txtNome.getText().matches("^[0-9].*")) {
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
    }//GEN-LAST:event_txtNomeKeyTyped

    private void txtSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoKeyTyped
        //Se o sexo digitado for menor que 10
        if (txtSexo.getText().length() < 10) {
            //verifica se foi digitado número
            if (txtSexo.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
            }
        } else {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 10", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtSexoKeyTyped

    private void txtEstCivilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstCivilKeyTyped
        //Se o Estado Civil digitado for menor que 10
        if (txtEstCivil.getText().length() < 10) {
            //verifica se foi digitado número
            if (txtEstCivil.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
            }
        } else {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 10", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtEstCivilKeyTyped
    private void txtRuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuaKeyTyped
        //Se a rua digitado for menor que 100
        if (txtRua.getText().length() < 100) {
            //verifica se foi digitado número
            if (txtRua.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
            }
        } else {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 100", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtRuaKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        //Se o número digitado for menor que 4
        if (txtNumero.getText().length() > 3) {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 3", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyTyped
        //Se a cidade digitada for menor que 20
        if (txtCidade.getText().length() < 20) {
            //verifica se foi digitado número
            if (txtCidade.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
            }
        } else {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 20", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtCidadeKeyTyped

    private void txtUFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUFKeyTyped
        //Se a cidade digitada for menor que 2
        if (txtUF.getText().length() < 2) {
            //verifica se foi digitado número
            if (txtUF.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
            }
        } else {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 2", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtUFKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        //Se o e-mail digitada for menor que 30
        if (txtEmail.getText().length() < 30) {
            //verifica se foi digitado número
            if (txtEmail.getText().matches("^[0-9].*")) {
                evt.consume();
                //caso tenha sido número, retorna que não é permitido número no campo
                JOptionPane.showMessageDialog(this, "Não é permitido números neste campo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                LimparFormulario();
            }
        } else {
            //caso seja maior, estoura o limite de caracteres
            evt.consume();
            JOptionPane.showMessageDialog(this, "Limite de caractere em 30", "Erro", JOptionPane.ERROR_MESSAGE);
            LimparFormulario();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

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
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtNovo;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstCivil;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
