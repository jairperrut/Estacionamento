/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.senai.sc.view;

import br.senai.sc.controller.MovimentacaoController;
import br.senai.sc.controller.VagaController;
import br.senai.sc.model.Cliente;
import br.senai.sc.model.Movimentacao;
import br.senai.sc.model.Vaga;
import br.senai.sc.util.ConnectionUtil;
import com.sun.org.apache.xpath.internal.operations.String;
import java.beans.PropertyVetoException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

/**
 *
 * @author Lucas
 */
public class RegistroMovimentacaoUI extends javax.swing.JInternalFrame {

    
private Cliente clienteAlteracao;
private Movimentacao movimentacao;    
private ArrayList<Cliente> listaCliente;
private ArrayList<Movimentacao> listaMovimentacao;
private ConnectionUtil con;
private Integer id;
private ArrayList<Vaga> listaVaga;
private Cliente cliente;
private Vaga vaga;

    public RegistroMovimentacaoUI() {
        initComponents();
        
        Vaga v = new Vaga();
        labelNumeroVagas.setText(""+v.listarVagasLivreAvulso().size());
        labelVagasLivresMensalista.setText(""+v.listarVagasLivreMensalista().size());
    }

    RegistroMovimentacaoUI(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlPlacaRegistroMovimentacao = new javax.swing.JLabel();
        jtfPlacaRegistroMovimentacao = new javax.swing.JTextField();
        jbOkRegistroMovimentacao = new javax.swing.JButton();
        jtpRegistroMovimentacao = new javax.swing.JTabbedPane();
        jpEntradaRegistroMovimentacao = new javax.swing.JPanel();
        jbConcluirEntradaRegistroMovimentacao = new javax.swing.JButton();
        jbCancelarEntradaRegistroMovimentacao = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtfNumeroCartaoEntradaRegistroMovimentacao = new javax.swing.JTextField();
        jlNumeroCartaoEntradaRegistroMovimentacao = new javax.swing.JLabel();
        jtfClienteEntradaRegistroMovimentacao = new javax.swing.JTextField();
        jlClienteEntradaRegistroMovimentacao = new javax.swing.JLabel();
        jtfPlacaEntradaRegistroMovimentacao = new javax.swing.JTextField();
        jlPlacaEntradaRegistroMovimentacao = new javax.swing.JLabel();
        jtfVagaEntradaRegistroMovimentacao = new javax.swing.JTextField();
        jlVagaEntradaRegistroMovimentacao = new javax.swing.JLabel();
        jlModeloEntradaRegistroMovimentacao1 = new javax.swing.JLabel();
        jtfModeloEntradaRegistroMovimentacao = new javax.swing.JTextField();
        jpSaidaRegistroMovimentacao = new javax.swing.JPanel();
        jbConcluirSaidaRegistroMovimentacao = new javax.swing.JButton();
        jbCancelarSaidaRegistroMovimentacao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtfHoraEntradaSaidaRegistroMovimentacao = new javax.swing.JTextField();
        jlHoraEntradaSaidaRegistroMovimentacao = new javax.swing.JLabel();
        jtfCartaoEstacionamentoSaidaRegistroMovimentacao = new javax.swing.JTextField();
        CartaoEstacionamentSaidaRegistroMovimentacao = new javax.swing.JLabel();
        jtfTotalPagarSaidaRegistroMovimentacao = new javax.swing.JTextField();
        jlTotalPagarSaidaRegistroMovimentacao = new javax.swing.JLabel();
        jlPlacaRegistroMovimentacao1 = new javax.swing.JLabel();
        labelNumeroVagas = new javax.swing.JLabel();
        jlPlacaRegistroMovimentacao2 = new javax.swing.JLabel();
        labelVagasLivresMensalista = new javax.swing.JLabel();

        setClosable(true);

        jlPlacaRegistroMovimentacao.setText("Placa:");

        jbOkRegistroMovimentacao.setText("Ok");
        jbOkRegistroMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkRegistroMovimentacaoActionPerformed(evt);
            }
        });

        jtpRegistroMovimentacao.setToolTipText("");

        jbConcluirEntradaRegistroMovimentacao.setText("Concluir");
        jbConcluirEntradaRegistroMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConcluirEntradaRegistroMovimentacaoActionPerformed(evt);
            }
        });

        jbCancelarEntradaRegistroMovimentacao.setText("Cancelar");
        jbCancelarEntradaRegistroMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarEntradaRegistroMovimentacaoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jlNumeroCartaoEntradaRegistroMovimentacao.setText("Número do Cartão:");

        jtfClienteEntradaRegistroMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClienteEntradaRegistroMovimentacaoActionPerformed(evt);
            }
        });

        jlClienteEntradaRegistroMovimentacao.setText("Cliente:");

        jtfPlacaEntradaRegistroMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPlacaEntradaRegistroMovimentacaoActionPerformed(evt);
            }
        });

        jlPlacaEntradaRegistroMovimentacao.setText("Placa:");

        jlVagaEntradaRegistroMovimentacao.setText("Vaga:");

        jlModeloEntradaRegistroMovimentacao1.setText("Modelo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlNumeroCartaoEntradaRegistroMovimentacao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlClienteEntradaRegistroMovimentacao)
                            .addComponent(jlPlacaEntradaRegistroMovimentacao)
                            .addComponent(jlVagaEntradaRegistroMovimentacao)
                            .addComponent(jlModeloEntradaRegistroMovimentacao1))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfNumeroCartaoEntradaRegistroMovimentacao)
                    .addComponent(jtfClienteEntradaRegistroMovimentacao)
                    .addComponent(jtfPlacaEntradaRegistroMovimentacao)
                    .addComponent(jtfModeloEntradaRegistroMovimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jtfVagaEntradaRegistroMovimentacao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumeroCartaoEntradaRegistroMovimentacao)
                    .addComponent(jtfNumeroCartaoEntradaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfClienteEntradaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlClienteEntradaRegistroMovimentacao))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlacaEntradaRegistroMovimentacao)
                    .addComponent(jtfPlacaEntradaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlModeloEntradaRegistroMovimentacao1)
                    .addComponent(jtfModeloEntradaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfVagaEntradaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVagaEntradaRegistroMovimentacao))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout jpEntradaRegistroMovimentacaoLayout = new javax.swing.GroupLayout(jpEntradaRegistroMovimentacao);
        jpEntradaRegistroMovimentacao.setLayout(jpEntradaRegistroMovimentacaoLayout);
        jpEntradaRegistroMovimentacaoLayout.setHorizontalGroup(
            jpEntradaRegistroMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEntradaRegistroMovimentacaoLayout.createSequentialGroup()
                .addGroup(jpEntradaRegistroMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEntradaRegistroMovimentacaoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jbConcluirEntradaRegistroMovimentacao)
                        .addGap(55, 55, 55)
                        .addComponent(jbCancelarEntradaRegistroMovimentacao))
                    .addGroup(jpEntradaRegistroMovimentacaoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jpEntradaRegistroMovimentacaoLayout.setVerticalGroup(
            jpEntradaRegistroMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEntradaRegistroMovimentacaoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jpEntradaRegistroMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelarEntradaRegistroMovimentacao)
                    .addComponent(jbConcluirEntradaRegistroMovimentacao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtpRegistroMovimentacao.addTab("ENTRADA", jpEntradaRegistroMovimentacao);

        jbConcluirSaidaRegistroMovimentacao.setText("Concluir");
        jbConcluirSaidaRegistroMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConcluirSaidaRegistroMovimentacaoActionPerformed(evt);
            }
        });

        jbCancelarSaidaRegistroMovimentacao.setText("Cancelar");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jlHoraEntradaSaidaRegistroMovimentacao.setText("Hora de Entrada:");

        CartaoEstacionamentSaidaRegistroMovimentacao.setText("Cartão-Estacionamento:");

        jlTotalPagarSaidaRegistroMovimentacao.setText("Total a Pagar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlHoraEntradaSaidaRegistroMovimentacao)
                    .addComponent(jlTotalPagarSaidaRegistroMovimentacao)
                    .addComponent(CartaoEstacionamentSaidaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfCartaoEstacionamentoSaidaRegistroMovimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jtfTotalPagarSaidaRegistroMovimentacao))
                    .addComponent(jtfHoraEntradaSaidaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlHoraEntradaSaidaRegistroMovimentacao)
                    .addComponent(jtfHoraEntradaSaidaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCartaoEstacionamentoSaidaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CartaoEstacionamentSaidaRegistroMovimentacao))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotalPagarSaidaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTotalPagarSaidaRegistroMovimentacao))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpSaidaRegistroMovimentacaoLayout = new javax.swing.GroupLayout(jpSaidaRegistroMovimentacao);
        jpSaidaRegistroMovimentacao.setLayout(jpSaidaRegistroMovimentacaoLayout);
        jpSaidaRegistroMovimentacaoLayout.setHorizontalGroup(
            jpSaidaRegistroMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSaidaRegistroMovimentacaoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpSaidaRegistroMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpSaidaRegistroMovimentacaoLayout.createSequentialGroup()
                        .addComponent(jbConcluirSaidaRegistroMovimentacao)
                        .addGap(53, 53, 53)
                        .addComponent(jbCancelarSaidaRegistroMovimentacao)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jpSaidaRegistroMovimentacaoLayout.setVerticalGroup(
            jpSaidaRegistroMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSaidaRegistroMovimentacaoLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpSaidaRegistroMovimentacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConcluirSaidaRegistroMovimentacao)
                    .addComponent(jbCancelarSaidaRegistroMovimentacao))
                .addGap(22, 22, 22))
        );

        jtpRegistroMovimentacao.addTab("SAÍDA", jpSaidaRegistroMovimentacao);

        jlPlacaRegistroMovimentacao1.setText("Vagas livres (avulso):");

        jlPlacaRegistroMovimentacao2.setText("Vagas livres (mensal):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpRegistroMovimentacao)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlPlacaRegistroMovimentacao2)
                    .addComponent(jlPlacaRegistroMovimentacao1)
                    .addComponent(jlPlacaRegistroMovimentacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfPlacaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbOkRegistroMovimentacao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelVagasLivresMensalista)
                            .addComponent(labelNumeroVagas))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlacaRegistroMovimentacao)
                    .addComponent(jtfPlacaRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbOkRegistroMovimentacao))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlacaRegistroMovimentacao1)
                    .addComponent(labelNumeroVagas))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlacaRegistroMovimentacao2)
                    .addComponent(labelVagasLivresMensalista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtpRegistroMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jtpRegistroMovimentacao.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbOkRegistroMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkRegistroMovimentacaoActionPerformed
     
        try {
            MovimentacaoController controllerMov = new MovimentacaoController();
            java.lang.String condicaoCliente = controllerMov.consultarClienteMovimentacao(jtfPlacaRegistroMovimentacao.getText());
            //Verficiar êxistencia do cliente  e sua  placa
            if (condicaoCliente.equals("Clientenaoexiste")) {
                JOptionPane.showMessageDialog(rootPane, "cliente não existe");
                CadastroClienteUI cadastroClienteUI = new CadastroClienteUI(null);
                cadastroClienteUI.setVisible(true);
                PrincipalUI.obterInstancia().getPainelPrincipal().add(cadastroClienteUI);

                try {
                    cadastroClienteUI.setSelected(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(RegistroMovimentacaoUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                cadastroClienteUI.show();
                cadastroClienteUI.moveToFront();
            } else {
                Vaga vaga = new Vaga();
                                
                VagaController vc = new VagaController();
                cliente = new Cliente(jtfPlacaRegistroMovimentacao.getText());                
                
                if (condicaoCliente.equals("Clientenaoestacionado")) {

                    jpEntradaRegistroMovimentacao.setVisible(true);
                    jtpRegistroMovimentacao.setSelectedComponent(jpEntradaRegistroMovimentacao);
                    jtfModeloEntradaRegistroMovimentacao.setText(cliente.getModelo());
                    jtfPlacaEntradaRegistroMovimentacao.setText(cliente.getPlaca().trim());
                    jtfClienteEntradaRegistroMovimentacao.setText(new Integer(cliente.getId()).toString());

                    //Validação de ausência de vagas
                    if(vaga.listarVagasLivreAvulso().size() == 0 && cliente.getTipocliente().equals("A")){
                        JOptionPane.showMessageDialog(null, "Não há vagas para clientes Avulsos");
                        this.dispose();            
                        return;
                    }
                    if(vaga.listarVagasLivreMensalista().size() == 0 && cliente.getTipocliente().equals("M")){
                        JOptionPane.showMessageDialog(null, "Não há vagas para clientes Mensalistas");
                        this.dispose();   
                        return;
                    }
                    
                    if (cliente.getTipocliente().equals("A")) {
                        jtfVagaEntradaRegistroMovimentacao.setText(""+vaga.listarVagasLivreAvulso().get(0).getId());
                    }else{
                        jtfVagaEntradaRegistroMovimentacao.setText(""+vaga.listarVagasLivreMensalista().get(0).getId());                        
                    }
                } else {

                    Movimentacao m = new Movimentacao(cliente.getPlaca());
                    jpSaidaRegistroMovimentacao.setVisible(true);
                    jtpRegistroMovimentacao.setSelectedComponent(jpSaidaRegistroMovimentacao);
                    
                    jtfClienteEntradaRegistroMovimentacao.setText(new Integer(cliente.getId()).toString());
                    jtfTotalPagarSaidaRegistroMovimentacao.setText(""+m.calcularSaida(new Date()));

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
                    jtfHoraEntradaSaidaRegistroMovimentacao.setText(sdf.format(m.getDataentrada()));
                }
            }

        } catch (ParseException ex) {
            //    } catch (PropertyVetoException ex) {
            Logger.getLogger(RegistroMovimentacaoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbOkRegistroMovimentacaoActionPerformed

    private void jtfClienteEntradaRegistroMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClienteEntradaRegistroMovimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfClienteEntradaRegistroMovimentacaoActionPerformed

    private void jbCancelarEntradaRegistroMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarEntradaRegistroMovimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCancelarEntradaRegistroMovimentacaoActionPerformed

    private void jtfPlacaEntradaRegistroMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPlacaEntradaRegistroMovimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPlacaEntradaRegistroMovimentacaoActionPerformed

    private void jbConcluirEntradaRegistroMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConcluirEntradaRegistroMovimentacaoActionPerformed
        try {
            jpEntradaRegistroMovimentacao.setVisible(true);
            jtpRegistroMovimentacao.setSelectedComponent(jpEntradaRegistroMovimentacao);
            Vaga v = new Vaga();

            //Se houverem vagas
            if(cliente.getTipocliente().equals("A") && v.listarVagasLivreAvulso().size() > 0){
                Movimentacao m = new Movimentacao();
                m.setCliente(cliente);
                m.setVaga(v.listarVagasLivreAvulso().get(0));
                m.setDataentrada(new Date());
                MovimentacaoController.obterInstancia().estacionar(m);
                JOptionPane.showMessageDialog(null, "Registro de Entrada realiazado");
            }

            if(cliente.getTipocliente().equals("M") && v.listarVagasLivreMensalista().size() > 0){
                Movimentacao m = new Movimentacao();
                m.setCliente(cliente);
                m.setVaga(v.listarVagasLivreMensalista().get(0));
                m.setDataentrada(new Date());
                MovimentacaoController.obterInstancia().estacionar(m);
                JOptionPane.showMessageDialog(null, "Registro de Entrada realiazado");
            }
            
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(RegistroMovimentacaoUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbConcluirEntradaRegistroMovimentacaoActionPerformed

    private void jbConcluirSaidaRegistroMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConcluirSaidaRegistroMovimentacaoActionPerformed
        try {
            jpSaidaRegistroMovimentacao.setVisible(true);
            jtpRegistroMovimentacao.setSelectedComponent(jpSaidaRegistroMovimentacao);

            Movimentacao m = new Movimentacao(jtfPlacaRegistroMovimentacao.getText());
            MovimentacaoController.obterInstancia().desestacionar(m);
            JOptionPane.showMessageDialog(null, "Registro de Saída realiazado");
            
            this.dispose();            
        } catch (Exception ex) {
            Logger.getLogger(RegistroMovimentacaoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbConcluirSaidaRegistroMovimentacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CartaoEstacionamentSaidaRegistroMovimentacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCancelarEntradaRegistroMovimentacao;
    private javax.swing.JButton jbCancelarSaidaRegistroMovimentacao;
    private javax.swing.JButton jbConcluirEntradaRegistroMovimentacao;
    private javax.swing.JButton jbConcluirSaidaRegistroMovimentacao;
    private javax.swing.JButton jbOkRegistroMovimentacao;
    private javax.swing.JLabel jlClienteEntradaRegistroMovimentacao;
    private javax.swing.JLabel jlHoraEntradaSaidaRegistroMovimentacao;
    private javax.swing.JLabel jlModeloEntradaRegistroMovimentacao1;
    private javax.swing.JLabel jlNumeroCartaoEntradaRegistroMovimentacao;
    private javax.swing.JLabel jlPlacaEntradaRegistroMovimentacao;
    private javax.swing.JLabel jlPlacaRegistroMovimentacao;
    private javax.swing.JLabel jlPlacaRegistroMovimentacao1;
    private javax.swing.JLabel jlPlacaRegistroMovimentacao2;
    private javax.swing.JLabel jlTotalPagarSaidaRegistroMovimentacao;
    private javax.swing.JLabel jlVagaEntradaRegistroMovimentacao;
    private javax.swing.JPanel jpEntradaRegistroMovimentacao;
    private javax.swing.JPanel jpSaidaRegistroMovimentacao;
    private javax.swing.JTextField jtfCartaoEstacionamentoSaidaRegistroMovimentacao;
    private javax.swing.JTextField jtfClienteEntradaRegistroMovimentacao;
    private javax.swing.JTextField jtfHoraEntradaSaidaRegistroMovimentacao;
    private javax.swing.JTextField jtfModeloEntradaRegistroMovimentacao;
    private javax.swing.JTextField jtfNumeroCartaoEntradaRegistroMovimentacao;
    private javax.swing.JTextField jtfPlacaEntradaRegistroMovimentacao;
    private javax.swing.JTextField jtfPlacaRegistroMovimentacao;
    private javax.swing.JTextField jtfTotalPagarSaidaRegistroMovimentacao;
    private javax.swing.JTextField jtfVagaEntradaRegistroMovimentacao;
    private javax.swing.JTabbedPane jtpRegistroMovimentacao;
    private javax.swing.JLabel labelNumeroVagas;
    private javax.swing.JLabel labelVagasLivresMensalista;
    // End of variables declaration//GEN-END:variables


}
