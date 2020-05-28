/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package famatese;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ciudad extends javax.swing.JFrame {
//Comentario para verificar git

    String coneccionbd = ("jdbc:sqlserver://localhost:1433;databaseName=farmacia_tese;user=sa;password=sasa");

    public Ciudad() {
        initComponents();
        consultarTodo();
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
        claveci = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cp = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("ID Ciudad");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 73, 30);

        jLabel2.setText("Nombre Ciudad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 100, 20);
        getContentPane().add(claveci);
        claveci.setBounds(140, 50, 250, 30);
        getContentPane().add(nombre);
        nombre.setBounds(140, 80, 250, 30);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/7modificar.png"))); // NOI18N
        editar.setToolTipText("Modificar");
        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar);
        editar.setBounds(250, 180, 60, 60);

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/5eliminar.png"))); // NOI18N
        eliminar.setToolTipText("Eliminar");
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar);
        eliminar.setBounds(330, 180, 60, 64);

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/4agregar.png"))); // NOI18N
        agregar.setToolTipText("Agregar");
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar);
        agregar.setBounds(60, 180, 60, 60);

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/2buscarr.png"))); // NOI18N
        Buscar.setToolTipText("Buscar");
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar);
        Buscar.setBounds(140, 180, 70, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CIUDAD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 10, 450, 20);

        jLabel4.setText("Codigo postal");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 110, 80, 20);

        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });
        getContentPane().add(cp);
        cp.setBounds(140, 110, 250, 30);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 280);

        jMenu1.setText("Exit");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Empleado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Farmacia");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Farmaceutico");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Menu Principal");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(466, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String buscar = nombre.getText();
        Object dato[] = new Object[3];
        if (buscar.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese una nombre para buscar");
        } else {
            try {
                DefaultTableModel tabla = new DefaultTableModel();
                Connection con;
                con = DriverManager.getConnection(coneccionbd);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("Select * from ciudad where nom_c='" + buscar + "'");
                tabla.addColumn("ID CIUDAD");
                tabla.addColumn("CIUDAD");
                tabla.addColumn("CP");
                while (rs.next()) {
                    for (int i = 0; i < 3; i++) {
                        dato[i] = rs.getString(i + 1).toUpperCase();
                    }
                    tabla.addRow(dato);
                }

            } catch (Exception e) {
            }
            claveci.setText((String) dato[0]);
            nombre.setText((String) dato[1]);
            cp.setText((String) dato[2]);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if(Inicio.getAdmon()){
        if (claveci.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID");
        } else if (nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la ciudad");
        } else if (cp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo postal de la ciudad");
        } else {
            String clave, nomci, codP;
            clave = claveci.getText();
            nomci = nombre.getText();
            codP = cp.getText();
            try {
                DefaultTableModel tabla = new DefaultTableModel();
                Connection con;
                con = DriverManager.getConnection(coneccionbd);
                Statement stm = con.createStatement();
                /*Marcara excecp por que el ResulSet espera valor de retorno, usamos executeUpdate                
                ResultSet rs= stm.executeQuery("insert into ciudad values ('" + clave + "','" + nomci + "','" + codP + "')");*/
                //stt regresa uno si la actualizacion se efectuo, 0 si fue rechazada
                int stt = stm.executeUpdate("insert into ciudad values ('" + clave + "','" + nomci + "','" + codP + "')");
                if (stt >= 1) {
                    JOptionPane.showMessageDialog(rootPane, "Registro creado");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "no se  pudo crear");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, " No se  pudo crear");
            }
            claveci.setText("");
            nombre.setText("");
            cp.setText("");
        }
        consultarTodo();
        } else
            JOptionPane.showMessageDialog(rootPane,"No eres administrador");
    }//GEN-LAST:event_agregarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(Inicio.getAdmon()){
        String clave = claveci.getText();
        if (clave.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese al clave del elemento que desea eliminar");
        } else if (buscarID()) {
            int i = JOptionPane.showConfirmDialog(rootPane, "Confirma la eliminación?", "Eliminar elemento", 2, 2);
            if (i <= 0) {
                try {
                    Connection con;
                    con = DriverManager.getConnection(coneccionbd);
                    Statement stm = con.createStatement();
                    stm.executeUpdate("delete from ciudad where cod_c='" + clave + "'");
                } catch (Exception e) {
                }
                consultarTodo();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, ("No existe: " + clave));
        }
        } else
            JOptionPane.showMessageDialog(rootPane,"No eres administrador");
    }//GEN-LAST:event_eliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        Empleado obj = new Empleado();
        obj.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(false);
        Farma obj = new Farma();
        obj.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.setVisible(false);
        Farmaceutico obj = new Farmaceutico();
        obj.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.setVisible(false);
        Inicio obj = new Inicio();
        obj.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        if(Inicio.getAdmon()){
        if (claveci.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese una clave para editar elemento");
        } else if (buscarID()) {
            this.setVisible(false);
            editarCiudad obj = new editarCiudad(claveci.getText());
            obj.show();
        } else {
            JOptionPane.showMessageDialog(rootPane, ("No se encontro el id: " + claveci.getText()));
            consultarTodo();
        }
        }else 
            JOptionPane.showMessageDialog(rootPane,"No eres administrador");
    }//GEN-LAST:event_editarActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpActionPerformed

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
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ciudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ciudad().setVisible(true);
            }
        });
    }

    //Metodos 
    private void consultarTodo() {
        try {
            DefaultTableModel tabla = new DefaultTableModel();
            Connection con;
            con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from Ciudad");
            tabla.addColumn("ID CIUDAD");
            tabla.addColumn("CIUDAD");
            tabla.addColumn("CP");
            while (rs.next()) {
                Object dato[] = new Object[3];
                for (int i = 0; i < 3; i++) {
                    //convertir a mayusculas del lado de la app
                    dato[i] = rs.getString(i + 1).toUpperCase();
                }
                tabla.addRow(dato);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean buscarID() {
        String buscar = claveci.getText();
        try {
            Connection con;
            con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from ciudad where cod_c='" + buscar + "'");
            while (rs.next()) {
                claveci.setText(String.valueOf(rs.getString(1)));
                return true;
            }

        } catch (Exception e) {
        }
        return false; //si no encontro nada falso

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField claveci;
    private javax.swing.JTextField cp;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
