/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ING RUBER VILLAR PDA
 */
public class Formulario extends javax.swing.JFrame {

    Conexion con = new Conexion();

    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        listar();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        txtph = new javax.swing.JTextField();
        btnAg = new javax.swing.JButton();
        btnEl = new javax.swing.JButton();
        btnMo = new javax.swing.JButton();
        btnNu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtdirec = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("41_RubenVillar");

        jLabel2.setText("ID");

        jLabel3.setText("DNI");

        jLabel4.setText("Nombres");

        jLabel5.setText("Edad");

        jLabel6.setText("Telefono");

        btnAg.setBackground(new java.awt.Color(0, 0, 102));
        btnAg.setForeground(new java.awt.Color(255, 255, 255));
        btnAg.setText("Agregar");
        btnAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgActionPerformed(evt);
            }
        });

        btnEl.setBackground(new java.awt.Color(0, 0, 102));
        btnEl.setForeground(new java.awt.Color(255, 255, 255));
        btnEl.setText("Eliminar");
        btnEl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElActionPerformed(evt);
            }
        });

        btnMo.setBackground(new java.awt.Color(0, 0, 102));
        btnMo.setForeground(new java.awt.Color(255, 255, 255));
        btnMo.setText("Modificar");
        btnMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoActionPerformed(evt);
            }
        });

        btnNu.setBackground(new java.awt.Color(0, 51, 102));
        btnNu.setForeground(new java.awt.Color(255, 255, 255));
        btnNu.setText("Nuevo");
        btnNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuActionPerformed(evt);
            }
        });

        TablaDatos.setBackground(new java.awt.Color(0, 0, 51));
        TablaDatos.setForeground(new java.awt.Color(255, 255, 255));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Nombres", "Edad", "Direccion", "Telefono"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        jLabel7.setText("Direccion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdni, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtnom))))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtedad)
                                    .addComponent(txtph, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMo)
                                    .addComponent(btnAg))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEl)
                                    .addComponent(btnNu)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtdirec, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtdirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAg)
                    .addComponent(btnEl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMo)
                    .addComponent(btnNu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuActionPerformed

    private void btnAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgActionPerformed
        Agregar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAgActionPerformed

    private void btnMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoActionPerformed
        modificar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnMoActionPerformed

    private void btnElActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElActionPerformed
        eliminar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnElActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {

            JOptionPane.showMessageDialog(null, "Usuario no seleccionado ");
        } else {

            id = Integer.parseInt((String) TablaDatos.getValueAt(fila, 0).toString());
            String nom = (String) TablaDatos.getValueAt(fila, 2);
            String dni = (String) TablaDatos.getValueAt(fila, 1);
            int edad = Integer.parseInt((String) TablaDatos.getValueAt(fila, 3).toString());
            String direc = (String) TablaDatos.getValueAt(fila, 4);
            int telefono = Integer.parseInt((String) TablaDatos.getValueAt(fila, 5).toString());

            txtid.setText("" + id);
            txtnom.setText(nom);
            txtdni.setText(dni);
            txtph.setText("" + telefono);
            txtedad.setText("" + edad);
            txtdirec.setText(direc);

        }
    }//GEN-LAST:event_TablaDatosMouseClicked
    void listar() {
        String sql = "Select * From persona";

        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] persona = new Object[6];
            modelo = (DefaultTableModel) TablaDatos.getModel();

            while (rs.next()) {
                persona[0] = rs.getInt("id");
                persona[1] = rs.getString("DNI");
                persona[2] = rs.getString("Nombres");
                persona[3] = rs.getInt("Edad");
                persona[4] = rs.getString("Direccion");
                persona[5] = rs.getInt("Telefono");
                modelo.addRow(persona);
            }
            TablaDatos.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Este es el error de agregar: " + e);
        }
    }

    void Agregar() {
        String dni = txtdni.getText();
        String nom = txtnom.getText();
        int Edad = Integer.parseInt(txtedad.getText());
        String Direc = txtdirec.getText();
        int Tel = Integer.parseInt(txtph.getText());

        if (dni.equals("") || nom.equals("")) {
            JOptionPane.showMessageDialog(null, "Las cajas están vacías");
        } else {
            String sql = "INSERT INTO persona (DNI, Nombres, edad, direccion, telefono) VALUES ('" + dni + "','" + nom + "','" + Edad + "','" + Direc + "','" + Tel + "')";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario agregado");
                limpiar();
            } catch (Exception e) {
                System.out.println("Este es el error de agregar: " + e);
            }
        }
    }

    void limpiar() {
        for (int i = 0; i <= TablaDatos.getRowCount(); i++) {
            modelo.removeRow(i);
            i--;
        }

    }

    void modificar() {

        String dni = txtdni.getText();
        String nom = txtnom.getText();
        int Edad = Integer.parseInt(txtedad.getText());
        String Direc = txtdirec.getText();
        int Tel = Integer.parseInt(txtph.getText());

        String sql = "UPDATE persona set DNI ='" + dni + "' , Nombres='" + nom + "' , edad='" + Edad + "' , direccion='" + Direc + "' , telefono='" + Tel + "' WHERE id= " + id;
        if (dni.equals("") || nom.equals("")) {

            JOptionPane.showMessageDialog(null, "Ingresar datos");
        } else {

            try {

                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Usuario Actualizado");

                limpiar();

            } catch (Exception e) {
              
            }

        }
    }

    void eliminar() {
        int filaseleccionada = TablaDatos.getSelectedRow();

        if (filaseleccionada == -1) {

            JOptionPane.showMessageDialog(null, "Debe Seleccionar una fila");

        } else {
            String sql = "delete from persona where id =" + id;

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Usuario eliminado");
                limpiar();
            } catch (Exception e) {
              
            }

        }
    }

    void nuevo() {
        txtid.setText("");
        txtnom.setText("");
        txtdni.setText("");
        txtedad.setText("");
        txtdirec.setText("");
        txtph.setText("");
        txtdni.requestFocus();

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnAg;
    private javax.swing.JButton btnEl;
    private javax.swing.JButton btnMo;
    private javax.swing.JButton btnNu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtdirec;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtph;
    // End of variables declaration//GEN-END:variables
}
