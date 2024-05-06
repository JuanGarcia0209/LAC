/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.com.unicolombo.lac.views;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import main.java.com.unicolombo.lac.main.Main;
import main.java.com.unicolombo.lac.models.DB;
import main.java.com.unicolombo.lac.models.*;

/**
 *
 * @author 57301
 */
public class LoginLAC extends javax.swing.JFrame {

    //static DB db = Main.db;
    
    /**
     * Creates new form LoginLAC
     */
    public LoginLAC() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtcomprobarIdentificacion = new javax.swing.JTextField();
        ButtonAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ButtonAceptar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Access Control");
        setType(java.awt.Window.Type.UTILITY);

        TxtcomprobarIdentificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtcomprobarIdentificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtcomprobarIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtcomprobarIdentificacionKeyPressed(evt);
            }
        });

        ButtonAceptar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonAceptar.setText("ACEPTAR");
        ButtonAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese su documento");

        ButtonAceptar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonAceptar1.setText("Ingresar a la DB");
        ButtonAceptar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptar1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/unicolombo/lac/images/lac-high-resolution-logo-black-transparent.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonAceptar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(TxtcomprobarIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(ButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(TxtcomprobarIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(ButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(ButtonAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/unicolombo/lac/images/uni222.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptarActionPerformed
        if (TxtcomprobarIdentificacion.getText().isEmpty()
                || validateNumbers(TxtcomprobarIdentificacion.getText()) == false
                || TxtcomprobarIdentificacion.getText().length() > 10) {
            JOptionPane.showMessageDialog(null, "El campo debe contener menos de 10 números.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int document = Integer.parseInt(TxtcomprobarIdentificacion.getText());

        User foundUser = findUserByDocument(document);
        
        if (document == 1001) {
            DBLAC vv = new DBLAC();
            vv.setVisible(true);
            this.dispose();
            return;
        }
        
        Main.user = new User();

        if (foundUser != null) {
            Main.user = foundUser;
            FormularioLAC vv = new FormularioLAC();
            vv.setVisible(true);
            this.dispose();
        } else {
            String[] opciones = {"Aceptar", "Cancelar"};
            
            int respuesta = JOptionPane.showOptionDialog(null, "La identificación ingresada no se encuentra registrada. ¿Deseas registrarla?", "Registrar usuario",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
            
            if (respuesta == JOptionPane.YES_OPTION) {
                Main.user.document = document;
                RegistroLAC vv = new RegistroLAC();
                vv.setVisible(true);
                this.dispose();
            }else{
                Welcome vv = new Welcome();
                vv.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_ButtonAceptarActionPerformed

    private void ButtonAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptar1ActionPerformed
        // TODO add your handling code here:
        DBLAC vv = new DBLAC();
        vv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonAceptar1ActionPerformed

    private void TxtcomprobarIdentificacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtcomprobarIdentificacionKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            if (TxtcomprobarIdentificacion.getText().isEmpty()
                || validateNumbers(TxtcomprobarIdentificacion.getText()) == false
                || TxtcomprobarIdentificacion.getText().length() > 10) {
                JOptionPane.showMessageDialog(null, "El campo debe contener menos de 10 números.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int document = Integer.parseInt(TxtcomprobarIdentificacion.getText());

            User foundUser = findUserByDocument(document);

            if (document == 1001) {
                DBLAC vv = new DBLAC();
                vv.setVisible(true);
                this.dispose();
                return;
            }

            Main.user = new User();

            if (foundUser != null) {
                Main.user = foundUser;
                FormularioLAC vv = new FormularioLAC();
                vv.setVisible(true);
                this.dispose();
            } else {
                String[] opciones = {"Aceptar", "Cancelar"};

                int respuesta = JOptionPane.showOptionDialog(null, "La identificación ingresada no se encuentra registrada. ¿Deseas registrarla?", "Registrar usuario",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

                if (respuesta == JOptionPane.YES_OPTION) {
                    Main.user.document = document;
                    RegistroLAC vv = new RegistroLAC();
                    vv.setVisible(true);
                    this.dispose();
                }else{
                    Welcome vv = new Welcome();
                    vv.setVisible(true);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_TxtcomprobarIdentificacionKeyPressed

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
            java.util.logging.Logger.getLogger(LoginLAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginLAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginLAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginLAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginLAC().setVisible(true);
            }
        });
    }
    
    public static User findUserByDocument(int document) {
        for (User user : Main.db.users) {
            if (user.document == document) {
                return user;
            }
        }
        return null;
    }
    
    private static boolean validateNumbers(String cadena) {
        for (char caracter : cadena.toCharArray()) {
            if (!Character.isDigit(caracter)) {
                return false;
            }
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAceptar;
    private javax.swing.JButton ButtonAceptar1;
    private javax.swing.JTextField TxtcomprobarIdentificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
