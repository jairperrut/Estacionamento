/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.senai.sc.view;

import br.senai.sc.controller.ClienteController;
import br.senai.sc.model.Cliente;
import br.senai.sc.util.ConnectionUtil;
import br.senai.sc.util.MaskFields;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroClienteUI extends javax.swing.JInternalFrame {

    private Cliente clienteAlteracao;
    private ArrayList<Cliente> listaCliente;
    private MaskFields mk = new MaskFields();

    public CadastroClienteUI(Cliente cliente) {
        initComponents();
        
        
    }
    
     public void atualizarTabelaClientes(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] {"Cartão","Cliente","Cpf","Placa","Modelo","Tipo Cliente"});
        this.listaCliente = ClienteController.obterInstancia().listarTodos();
        for ( int i=0; i < this.listaCliente.size(); i++){
            modelo.addRow(new Object[] { 
                this.listaCliente.get(i).getCartaoPark(),
                this.listaCliente.get(i).getNome(), 
                this.listaCliente.get(i).getCpf(),
                this.listaCliente.get(i).getPlaca(),
                this.listaCliente.get(i).getModelo(),
                this.listaCliente.get(i).getTipocliente()});
        }
        jtCadastroCliente.setModel(modelo);        
    }
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoCliente = new javax.swing.ButtonGroup();
        jpClientes = new javax.swing.JPanel();
        jspCadastroCliente = new javax.swing.JScrollPane();
        jtCadastroCliente = new javax.swing.JTable();
        jlNomeCadastroCliente = new javax.swing.JLabel();
        jtfNomeCadastroCliente = new javax.swing.JTextField();
        jlCPFCadastroCliente = new javax.swing.JLabel();
        jlPlacaCadastroCliente = new javax.swing.JLabel();
        jlModeloCadastroCliente = new javax.swing.JLabel();
        jtfModeloCadastroCliente = new javax.swing.JTextField();
        jbSalvarCadastroCliente = new javax.swing.JButton();
        jbCancelarCadastroCliente = new javax.swing.JButton();
        jbAlterarCadastroCliente = new javax.swing.JButton();
        jbDeletarCadastroCliente = new javax.swing.JButton();
        jbAtualizarClientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jrbAvulso = new javax.swing.JRadioButton();
        jrbMensalista = new javax.swing.JRadioButton();
        jtfCPFCadastroCliente = new javax.swing.JFormattedTextField();
        try{ 

            mk.maskCpf(jtfCPFCadastroCliente);

        }catch(Exception e){}

        jtfPlacaCadastroCliente = new javax.swing.JFormattedTextField();
        try{ 

            mk.maskPlaca(jtfPlacaCadastroCliente);

        }catch(Exception e){}

        setClosable(true);
        setResizable(true);
        setTitle("Cadastro de Cliente");
        setOpaque(false);

        jpClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Clientes:"), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10))); // NOI18N

        jtCadastroCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cartão", "Cliente", "CPF", "Placa", "Modelo", "Tipo Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jspCadastroCliente.setViewportView(jtCadastroCliente);

        javax.swing.GroupLayout jpClientesLayout = new javax.swing.GroupLayout(jpClientes);
        jpClientes.setLayout(jpClientesLayout);
        jpClientesLayout.setHorizontalGroup(
            jpClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jpClientesLayout.setVerticalGroup(
            jpClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jspCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jlNomeCadastroCliente.setText("Nome:");

        jtfNomeCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeCadastroClienteActionPerformed(evt);
            }
        });

        jlCPFCadastroCliente.setText("CPF:");

        jlPlacaCadastroCliente.setText("Placa:");

        jlModeloCadastroCliente.setText("Modelo:");

        jbSalvarCadastroCliente.setText("Salvar");
        jbSalvarCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarCadastroClienteActionPerformed(evt);
            }
        });

        jbCancelarCadastroCliente.setText("Cancelar");

        jbAlterarCadastroCliente.setText("Alterar");
        jbAlterarCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarCadastroClienteActionPerformed(evt);
            }
        });

        jbDeletarCadastroCliente.setText("Deletar");
        jbDeletarCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarCadastroClienteActionPerformed(evt);
            }
        });

        jbAtualizarClientes.setText("Atualizar");
        jbAtualizarClientes.setToolTipText("");
        jbAtualizarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarClientesActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo Cliente:");

        bgTipoCliente.add(jrbAvulso);
        jrbAvulso.setText("A ");

        bgTipoCliente.add(jrbMensalista);
        jrbMensalista.setText("M");

        jtfCPFCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCPFCadastroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jbCancelarCadastroCliente)
                        .addGap(26, 26, 26)
                        .addComponent(jbAlterarCadastroCliente)
                        .addGap(34, 34, 34)
                        .addComponent(jbDeletarCadastroCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlNomeCadastroCliente)
                                .addComponent(jlCPFCadastroCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlPlacaCadastroCliente, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jlModeloCadastroCliente))
                                .addGap(2, 2, 2)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNomeCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbAvulso)
                                .addGap(18, 18, 18)
                                .addComponent(jrbMensalista))
                            .addComponent(jtfModeloCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCPFCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfPlacaCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jbSalvarCadastroCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jbAtualizarClientes))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jpClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfNomeCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNomeCadastroCliente))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCPFCadastroCliente)
                    .addComponent(jtfCPFCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlacaCadastroCliente)
                    .addComponent(jtfPlacaCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlModeloCadastroCliente)
                    .addComponent(jtfModeloCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAvulso)
                    .addComponent(jrbMensalista)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizarClientes)
                    .addComponent(jbSalvarCadastroCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelarCadastroCliente)
                    .addComponent(jbAlterarCadastroCliente)
                    .addComponent(jbDeletarCadastroCliente))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeCadastroClienteActionPerformed
        
    }//GEN-LAST:event_jtfNomeCadastroClienteActionPerformed

    private void jbSalvarCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarCadastroClienteActionPerformed

        try {
            if ( clienteAlteracao != null ) {
             
                clienteAlteracao.setNome(jtfNomeCadastroCliente.getText().trim());
                clienteAlteracao.setCpf(jtfCPFCadastroCliente.getText().trim());
                clienteAlteracao.setPlaca(jtfPlacaCadastroCliente.getText().trim());
                clienteAlteracao.setModelo(jtfModeloCadastroCliente.getText().trim());
                 if(jrbAvulso.isSelected()){ 
                     clienteAlteracao.setTipocliente(jrbAvulso.getText());
                }else{
                    clienteAlteracao.setTipocliente(jrbMensalista.getText());                    
                }
                ClienteController.obterInstancia().alterar(clienteAlteracao);
               JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
            } else {
                Cliente cliente = new Cliente();
                cliente.setNome(jtfNomeCadastroCliente.getText().trim());
                cliente.setCpf(jtfCPFCadastroCliente.getText().trim());
                cliente.setPlaca(jtfPlacaCadastroCliente.getText().trim());
                cliente.setModelo(jtfModeloCadastroCliente.getText().trim());
                if(jrbAvulso.isSelected()){ 
                    cliente.setTipocliente(jrbAvulso.getText());
                }else{
                    cliente.setTipocliente(jrbMensalista.getText());                    
                }
                ClienteController.obterInstancia().inserir(cliente);
                atualizarTabelaClientes();
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
                
            }
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() );
        }
    }//GEN-LAST:event_jbSalvarCadastroClienteActionPerformed

    private void jbAtualizarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarClientesActionPerformed
      atualizarTabelaClientes();
    }//GEN-LAST:event_jbAtualizarClientesActionPerformed

    private void jbAlterarCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarCadastroClienteActionPerformed
       
        try{ 
            for ( int i=0; i < this.listaCliente.size(); i++ ){
                if ( jtCadastroCliente.getSelectedRow() == i ){
                    clienteAlteracao = new Cliente(this.listaCliente.get(i).getId());
                   
                    jtfNomeCadastroCliente.setText(clienteAlteracao.getNome());
                    jtfCPFCadastroCliente.setText(clienteAlteracao.getCpf());
                    jtfPlacaCadastroCliente.setText(clienteAlteracao.getPlaca());
                    jtfModeloCadastroCliente.setText(clienteAlteracao.getModelo());
                    if(clienteAlteracao.getTipocliente().equals("A")){
                        
                        jrbAvulso.setSelected(true);
                        jrbMensalista.setSelected(false);
                    }else{
                        
                        jrbAvulso.setSelected(false);
                        jrbMensalista.setSelected(true);
                    }
                }
            }
       } catch ( Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
       atualizarTabelaClientes();
                                                    
    }//GEN-LAST:event_jbAlterarCadastroClienteActionPerformed

    private void jbDeletarCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarCadastroClienteActionPerformed
        
         try {
          
            this.listaCliente = ClienteController.obterInstancia().listarTodos();
            ClienteController.obterInstancia().
                    remover(this.listaCliente.get(jtCadastroCliente.getSelectedRow()));
            
        } catch ( ArrayIndexOutOfBoundsException a){
            JOptionPane.showMessageDialog(null, "Selecione um cliente");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
        atualizarTabelaClientes();
                                                
    }//GEN-LAST:event_jbDeletarCadastroClienteActionPerformed

    private void jtfCPFCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCPFCadastroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCPFCadastroClienteActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbAlterarCadastroCliente;
    private javax.swing.JButton jbAtualizarClientes;
    private javax.swing.JButton jbCancelarCadastroCliente;
    private javax.swing.JButton jbDeletarCadastroCliente;
    private javax.swing.JButton jbSalvarCadastroCliente;
    private javax.swing.JLabel jlCPFCadastroCliente;
    private javax.swing.JLabel jlModeloCadastroCliente;
    private javax.swing.JLabel jlNomeCadastroCliente;
    private javax.swing.JLabel jlPlacaCadastroCliente;
    private javax.swing.JPanel jpClientes;
    private javax.swing.JRadioButton jrbAvulso;
    private javax.swing.JRadioButton jrbMensalista;
    private javax.swing.JScrollPane jspCadastroCliente;
    private javax.swing.JTable jtCadastroCliente;
    private javax.swing.JFormattedTextField jtfCPFCadastroCliente;
    private javax.swing.JTextField jtfModeloCadastroCliente;
    private javax.swing.JTextField jtfNomeCadastroCliente;
    private javax.swing.JFormattedTextField jtfPlacaCadastroCliente;
    // End of variables declaration//GEN-END:variables
}
