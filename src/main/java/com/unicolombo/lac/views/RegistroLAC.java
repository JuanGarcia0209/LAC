/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.com.unicolombo.lac.views;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import main.java.com.unicolombo.lac.main.Main;

/**
 *
 * @author 57301
 */
public class RegistroLAC extends javax.swing.JFrame {
    //static DB db = Main.db;
    //static User user = Main.user;
    static DefaultComboBoxModel<String> modeloRoles = new DefaultComboBoxModel<>();
    static DefaultComboBoxModel<String> modeloDepartments = new DefaultComboBoxModel<>();
    static DefaultComboBoxModel<String> modeloMajors = new DefaultComboBoxModel<>();

    /**
     * Creates new form regristroLAC
     */
    public RegistroLAC() {
        modeloRoles.addElement("Seleccione");
        modeloDepartments.addElement("Seleccione");
        modeloMajors.addElement("Seleccione");
        
        for (String rol : Main.db.roles) {
            modeloRoles.addElement(rol);
        }
        for (String department : Main.db.departments) {
            modeloDepartments.addElement(department);
        }
        for (String major : Main.db.majors) {
            modeloMajors.addElement(major);
        }
        
        initComponents();
        this.setLocationRelativeTo(null);
        modeloRoles = new DefaultComboBoxModel<>();
        modeloDepartments = new DefaultComboBoxModel<>();
        modeloMajors = new DefaultComboBoxModel<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDocuemtoRegistro = new javax.swing.JTextField();
        txtNombresRegistro = new javax.swing.JTextField();
        txtApellidosRegistro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxRolRegistro = new javax.swing.JComboBox<>();
        cbxInstitucionRegistro = new javax.swing.JComboBox<>();
        cbxCarreraRegistro = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonAceptarRegistro = new javax.swing.JButton();
        ButtonCancelarRegistro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Access Control");
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/unicolombo/lac/images/registro.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRO DE ASISTENCIAS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Documento");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombres");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Apellidos");

        txtDocuemtoRegistro.setEditable(false);
        txtDocuemtoRegistro.setText(Main.user.document + "");
        txtDocuemtoRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDocuemtoRegistro.setFocusable(false);

        txtNombresRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtApellidosRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtApellidosRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosRegistroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Institucion");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Rol");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Programa de formación");

        cbxRolRegistro.setModel(modeloRoles);
        cbxRolRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbxRolRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRolRegistroActionPerformed(evt);
            }
        });

        cbxInstitucionRegistro.setModel(modeloDepartments);
        cbxInstitucionRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cbxCarreraRegistro.setModel(modeloMajors);
        cbxCarreraRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        ButtonAceptarRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        ButtonAceptarRegistro.setText("Aceptar");
        ButtonAceptarRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonAceptarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptarRegistroActionPerformed(evt);
            }
        });
        ButtonAceptarRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ButtonAceptarRegistroKeyReleased(evt);
            }
        });

        ButtonCancelarRegistro.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        ButtonCancelarRegistro.setText("Cancelar");
        ButtonCancelarRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarRegistroActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/unicolombo/lac/images/lac-single-dark-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonAceptarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(ButtonCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel10)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDocuemtoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(txtNombresRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtApellidosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxRolRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(1, 1, 1)
                                                    .addComponent(cbxInstitucionRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(cbxCarreraRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDocuemtoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombresRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cbxRolRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxInstitucionRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxCarreraRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addGap(54, 54, 54))
                            .addComponent(jSeparator1))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonAceptarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(350, 350, 350))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidosRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosRegistroActionPerformed

    private void cbxRolRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRolRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRolRegistroActionPerformed

    private void ButtonAceptarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptarRegistroActionPerformed
        if (txtNombresRegistro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (txtApellidosRegistro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo apellidos no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Main.user.id = (Main.db.users.size() + 1);
        Main.user.name = txtNombresRegistro.getText();
        Main.user.lastName = txtApellidosRegistro.getText();
        
        String rol = (String) cbxRolRegistro.getSelectedItem();
        String major = (String) cbxCarreraRegistro.getSelectedItem();
        String department = (String) cbxInstitucionRegistro.getSelectedItem();
        
        for (int i = 0; i < Main.db.roles.length; i++) {
            if (rol.equals(Main.db.roles[i])) {
                Main.user.id_rol = i;
                break;
            }else
            
            if (i == (Main.db.roles.length - 1)) {
                JOptionPane.showMessageDialog(null, "El rol no ha sido seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        for (int i = 0; i < Main.db.departments.length; i++) {
            if (department.equals(Main.db.departments[i])) {
                Main.user.id_department = i;
                break;
            }else
            
            if (i == (Main.db.departments.length - 1)) {
                JOptionPane.showMessageDialog(null, "La institución no ha sido seleccionada.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        for (int i = 0; i < Main.db.majors.length; i++) {
            if (major.equals(Main.db.majors[i])) {
                Main.user.id_major = i;
                break;
            }else
            
            if (i == (Main.db.majors.length - 1)) {
                JOptionPane.showMessageDialog(null, "El programa de formación no ha sido seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        Main.db.users.add(Main.user);
        
        FormularioLAC junior = new FormularioLAC();
        junior.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonAceptarRegistroActionPerformed

    private void ButtonCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarRegistroActionPerformed
        Welcome cancelar = new Welcome();
        cancelar.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ButtonCancelarRegistroActionPerformed

    private void ButtonAceptarRegistroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonAceptarRegistroKeyReleased
        //FormularioLAC junior = new FormularioLAC();
        //junior.setVisible(true);
        //this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAceptarRegistroKeyReleased

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
            java.util.logging.Logger.getLogger(RegistroLAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroLAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroLAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroLAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroLAC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAceptarRegistro;
    private javax.swing.JButton ButtonCancelarRegistro;
    private javax.swing.JComboBox<String> cbxCarreraRegistro;
    private javax.swing.JComboBox<String> cbxInstitucionRegistro;
    private javax.swing.JComboBox<String> cbxRolRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtApellidosRegistro;
    private javax.swing.JTextField txtDocuemtoRegistro;
    private javax.swing.JTextField txtNombresRegistro;
    // End of variables declaration//GEN-END:variables
}
