
package Interface;

import Clases.Cuentas;
import Clases.Cliente;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
 // @author oscarfranco
 
public class jfmCuentas extends javax.swing.JFrame {

    
    public jfmCuentas() {
        initComponents();
    }

    public jfmCuentas(Principal pr2) {
        initComponents();
        pr =pr2;
        jlstClienteCuenta.setModel(Ls);
        if(pr2.Lc !=null){
        Ls.clear();
        Cliente C1 = new Cliente();
        for (int i = 0; i < pr2.Lc.size(); i++) {
                C1 = (Cliente) pr2.Lc.get(i);
                Ls.add(Ls.getSize(), C1.Codigo + "-" + C1.Nombre);
                
            }
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstClienteCuenta = new javax.swing.JList<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NoIdC = new javax.swing.JLabel();
        jtfCtaNombre = new javax.swing.JTextField();
        jtfCtaCodigo = new javax.swing.JTextField();
        jtfCtaNoId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jlbCuenta1 = new javax.swing.JLabel();
        jlbCuenta2 = new javax.swing.JLabel();
        jtfCuenta2 = new javax.swing.JTextField();
        jtfCuenta1 = new javax.swing.JTextField();
        jbtActualizarD = new javax.swing.JButton();
        jbtAgregarCta = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlstClienteCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas"));
        jlstClienteCuenta.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlstClienteCuentaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jlstClienteCuenta);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Infomacion Cuentas"));

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        NoIdC.setText("No ID");

        jtfCtaNombre.setEditable(false);
        jtfCtaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCtaNombreActionPerformed(evt);
            }
        });

        jtfCtaCodigo.setEditable(false);
        jtfCtaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCtaCodigoActionPerformed(evt);
            }
        });

        jtfCtaNoId.setEditable(false);
        jtfCtaNoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCtaNoIdActionPerformed(evt);
            }
        });

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Bancarias"));

        jlbCuenta1.setText("Cuenta # 1");

        jlbCuenta2.setText("Cuenta # 2");

        jLayeredPane2.setLayer(jlbCuenta1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlbCuenta2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCuenta2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCuenta1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jlbCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jlbCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCuenta1)
                    .addComponent(jtfCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCuenta2)
                    .addComponent(jtfCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NoIdC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfCtaNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfCtaCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfCtaNoId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(NoIdC))
                                .addGap(18, 18, 18))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCtaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCtaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCtaNoId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLayeredPane2))))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCtaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCtaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoIdC)
                    .addComponent(jtfCtaNoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2)
                .addContainerGap())
        );

        jbtActualizarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/augmentedreality-5_111389.png"))); // NOI18N
        jbtActualizarD.setText("Actualizar");
        jbtActualizarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActualizarDActionPerformed(evt);
            }
        });

        jbtAgregarCta.setText("Agregar \nCuenta");
        jbtAgregarCta.setToolTipText("");
        jbtAgregarCta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregarCtaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jbtActualizarD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jbtAgregarCta, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtActualizarD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtAgregarCta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCtaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCtaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCtaNombreActionPerformed

    private void jtfCtaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCtaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCtaCodigoActionPerformed

    private void jtfCtaNoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCtaNoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCtaNoIdActionPerformed

    private void jbtActualizarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActualizarDActionPerformed
        if(Ls != null){
        Ls.clear();
        Cliente C1 = new Cliente();
        for (int i = 0; i < Lc.size(); i++) {
           C1 = (Cliente)Lc.get(i);
           Ls.add(Ls.getSize(),C1.Codigo+"-"+C1.Nombre);
            }
        }   
    }//GEN-LAST:event_jbtActualizarDActionPerformed

    private void jlstClienteCuentaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlstClienteCuentaValueChanged
       if (jlstClienteCuenta.getSelectedIndex() > -1) {
            Cliente C1 = new Cliente();
            C1 = (Cliente) pr.Lc.get(jlstClienteCuenta.getSelectedIndex());
            jtfCtaCodigo.setText(String.valueOf(C1.Codigo));
            jtfCtaNombre.setText(C1.Nombre);
            jtfCtaNoId.setText(C1.Id);
            
        }
    }//GEN-LAST:event_jlstClienteCuentaValueChanged

    private void jbtAgregarCtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarCtaActionPerformed
        if(jlstClienteCuenta.getSelectedIndex() != -1){
        int ind = -1;
        Cuentas CC1 = new Cuentas(Integer.parseInt(jtfCtaCodigo.getText()),
                jtfCtaNombre.getText(), jtfCtaNoId.getText(),
                Integer.parseInt(jtfCuenta1.getText()), Integer.parseInt(jtfCuenta2.getText()));
                
        ind = CC1.Buscar(LCc);
        if (ind == -1) {
            LCc.add(LCc.size(), CC1);
            Ls.add(Ls.getSize(), CC1.CtaCodigo + "-" + CC1.CtaNombre);
            Limpiar();
            JOptionPane.showMessageDialog(null, "Se agrego una cuenta..!");
        } else {
            JOptionPane.showMessageDialog(null, "Elemento ya Existe");
        }
        
        }else{
    
        } 
    }//GEN-LAST:event_jbtAgregarCtaActionPerformed

    public void Limpiar() {
        jtfCtaCodigo.setText("");
        jtfCtaNombre.setText("");
        jtfCtaNoId.setText("");
        jtfCuenta1.setText("");
        jtfCuenta2.setText("");
        
        
    }
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
            java.util.logging.Logger.getLogger(jfmCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfmCuentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NoIdC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtActualizarD;
    private javax.swing.JButton jbtAgregarCta;
    private javax.swing.JLabel jlbCuenta1;
    private javax.swing.JLabel jlbCuenta2;
    private javax.swing.JList<String> jlstClienteCuenta;
    private javax.swing.JTextField jtfCtaCodigo;
    private javax.swing.JTextField jtfCtaNoId;
    private javax.swing.JTextField jtfCtaNombre;
    private javax.swing.JTextField jtfCuenta1;
    private javax.swing.JTextField jtfCuenta2;
    // End of variables declaration//GEN-END:variables
DefaultListModel Ls = new DefaultListModel();
ArrayList Lc = new ArrayList();
ArrayList LCc = new ArrayList();
Principal pr;

}
