
package Interface;
 //@author oscarfranco
import Clases.Cliente;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import java.util.ArrayList;

public class Principal extends javax.swing.JFrame {

    

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        jlstClientesP.setModel(Ls);
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jlstClientesP = new javax.swing.JList<>();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtActualizarP = new javax.swing.JButton();
        jmbMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiAbrir = new javax.swing.JMenuItem();
        jmiGuardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiImprimir = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiClientes = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiCuentas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiMovimientos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiVersion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jlstClientesP.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de Clientes"));
        jScrollPane1.setViewportView(jlstClientesP);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pantalla Principal Cuentas De Banco"));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/1486564172-finance-loan-money_81492.png"))); // NOI18N

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtActualizarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/augmentedreality-5_111389.png"))); // NOI18N
        jbtActualizarP.setText("Actualizar Lista");
        jbtActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActualizarPActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jmiAbrir.setText("Abrir");
        jMenu1.add(jmiAbrir);

        jmiGuardar.setText("Guardar");
        jMenu1.add(jmiGuardar);
        jMenu1.add(jSeparator1);

        jmiImprimir.setText("Imprimir");
        jMenu1.add(jmiImprimir);

        jmiSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jmiSalir.setText("Salir");
        jMenu1.add(jmiSalir);

        jmbMenu.add(jMenu1);

        jMenu2.setText("Edicion");

        jmiClientes.setText("Crear Clientes");
        jmiClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClientesActionPerformed(evt);
            }
        });
        jMenu2.add(jmiClientes);
        jMenu2.add(jSeparator2);

        jmiCuentas.setText("Cuentas");
        jmiCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCuentasActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCuentas);

        jmbMenu.add(jMenu2);

        jMenu3.setText("Transacciones");

        jmiMovimientos.setText("Movimentos Bancarios");
        jmiMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMovimientosActionPerformed(evt);
            }
        });
        jMenu3.add(jmiMovimientos);

        jmbMenu.add(jMenu3);

        jMenu4.setText("Ayuda");

        jmiVersion.setText("Acerca de");
        jmiVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVersionActionPerformed(evt);
            }
        });
        jMenu4.add(jmiVersion);

        jmbMenu.add(jMenu4);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(jbtActualizarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtActualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCuentasActionPerformed
        jfmCuentas mc = new jfmCuentas(this);
        mc.setVisible(true);
    }//GEN-LAST:event_jmiCuentasActionPerformed

    private void jbtActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActualizarPActionPerformed
        if(Ls != null){
        Ls.clear();
        Cliente C1 = new Cliente();
        for (int i = 0; i < Lc.size(); i++) {
           C1 = (Cliente)Lc.get(i);
           Ls.add(Ls.getSize(),C1.Codigo+"-"+C1.Nombre);
            }
        }   
    }//GEN-LAST:event_jbtActualizarPActionPerformed

    private void jmiClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClientesActionPerformed
    jfmCliente mc = new jfmCliente(this);
        mc.setVisible(true);
    }//GEN-LAST:event_jmiClientesActionPerformed

    private void jmiVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVersionActionPerformed
        jfmZAcercade AC = new jfmZAcercade ();
        AC.setVisible(true);
    }//GEN-LAST:event_jmiVersionActionPerformed

    private void jmiMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMovimientosActionPerformed
        jfmMovimientosBco MVB = new jfmMovimientosBco ();
        MVB.setVisible(true);
    }//GEN-LAST:event_jmiMovimientosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JButton jbtActualizarP;
    private javax.swing.JList<String> jlstClientesP;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiAbrir;
    private javax.swing.JMenuItem jmiClientes;
    private javax.swing.JMenuItem jmiCuentas;
    private javax.swing.JMenuItem jmiGuardar;
    private javax.swing.JMenuItem jmiImprimir;
    private javax.swing.JMenuItem jmiMovimientos;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem jmiVersion;
    // End of variables declaration//GEN-END:variables
DefaultListModel Ls = new DefaultListModel();
ArrayList Lc = new ArrayList();
}
