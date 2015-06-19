/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

/**
 *
 * @author Caio Pereira
 */
public class RelatorioFaturamentoUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form RelatorioFaturamentoUI
     */
    public RelatorioFaturamentoUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpRelatorioFaturamento = new javax.swing.JPanel();
        jDateChooserDataInicio = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFinal = new com.toedter.calendar.JDateChooser();
        jlDataInicio = new javax.swing.JLabel();
        jlDataFim = new javax.swing.JLabel();
        jbGerarRelatorioFaturamento = new javax.swing.JButton();

        setTitle("Relatório de Faturamento");

        jpRelatorioFaturamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlDataInicio.setText("Data Início:");

        jlDataFim.setText("Data Final:");

        javax.swing.GroupLayout jpRelatorioFaturamentoLayout = new javax.swing.GroupLayout(jpRelatorioFaturamento);
        jpRelatorioFaturamento.setLayout(jpRelatorioFaturamentoLayout);
        jpRelatorioFaturamentoLayout.setHorizontalGroup(
            jpRelatorioFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRelatorioFaturamentoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpRelatorioFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDataInicio)
                    .addComponent(jlDataFim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jpRelatorioFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
        jpRelatorioFaturamentoLayout.setVerticalGroup(
            jpRelatorioFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRelatorioFaturamentoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpRelatorioFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDataInicio))
                .addGap(18, 18, 18)
                .addGroup(jpRelatorioFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDataFim))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jbGerarRelatorioFaturamento.setText("Gerar Relatório");
        jbGerarRelatorioFaturamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerarRelatorioFaturamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpRelatorioFaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGerarRelatorioFaturamento))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jpRelatorioFaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbGerarRelatorioFaturamento)
                .addGap(20, 20, 20))
        );

        getAccessibleContext().setAccessibleName("Relatório de Faturamento");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGerarRelatorioFaturamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerarRelatorioFaturamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGerarRelatorioFaturamentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooserDataFinal;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicio;
    private javax.swing.JButton jbGerarRelatorioFaturamento;
    private javax.swing.JLabel jlDataFim;
    private javax.swing.JLabel jlDataInicio;
    private javax.swing.JPanel jpRelatorioFaturamento;
    // End of variables declaration//GEN-END:variables
}
