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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Farmaceutico extends javax.swing.JFrame {

    String coneccionbd = ("jdbc:sqlserver://localhost:1433;databaseName=farmacia_tese;user=sa;password=sasa");

    public Farmaceutico() {
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

        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buscar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clavefa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ap = new javax.swing.JTextField();
        am = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("FARMACEUTICO");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 20, 200, 22);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/2buscarr.png"))); // NOI18N
        buscar.setToolTipText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar);
        buscar.setBounds(140, 270, 60, 60);

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/4agregar.png"))); // NOI18N
        agregar.setToolTipText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar);
        agregar.setBounds(40, 270, 60, 60);

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/5eliminar.png"))); // NOI18N
        eliminar.setToolTipText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar);
        eliminar.setBounds(340, 270, 60, 60);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/7modificar.png"))); // NOI18N
        editar.setToolTipText("Modificar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPanel1.add(editar);
        editar.setBounds(250, 270, 60, 60);

        jLabel1.setText("ID Farmaceutico");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 70, 100, 20);

        clavefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clavefaActionPerformed(evt);
            }
        });
        jPanel1.add(clavefa);
        clavefa.setBounds(200, 60, 130, 30);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 110, 50, 30);

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel1.add(nombre);
        nombre.setBounds(200, 110, 130, 30);

        jLabel3.setText("Apellido Paterno");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 150, 100, 40);

        ap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apActionPerformed(evt);
            }
        });
        jPanel1.add(ap);
        ap.setBounds(200, 150, 130, 30);
        jPanel1.add(am);
        am.setBounds(200, 200, 130, 30);

        jLabel4.setText("Apellido Materno");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 190, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 440, 450);

        jMenu2.setText("Exit");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(451, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clavefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clavefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clavefaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        Inicio obj = new Inicio();
        obj.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void apActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
       if(Inicio.getPuesto().equals("Administrador")){
            if (!(clavefa.getText().equals(""))) {
                System.out.println("paso1");
                if (verificarID() || !(nombre.getText().equals("") || ap.getText().equals("") || am.getText().equals(""))) {
                    System.out.println("paso2");
                    String actualizar = "Nombre= '" + nombre.getText() + "' \n"
                            + "Apellido paterno= '" + ap.getText() + "'\n"
                            + "Apellido materno= '" + am.getText() + "'";
                    int procd = JOptionPane.showConfirmDialog(rootPane, actualizar, ("Se actualizara la informacion para: " + clavefa.getText()), 2, 2);
                    System.out.println(procd);
                    if (procd <= 0) {
                        try {
                            Connection con = DriverManager.getConnection(coneccionbd);
                            Statement stm = con.createStatement();
                            int act = stm.executeUpdate("update farmaceutico set "
                                    + "nom_fa='" + nombre.getText() + "',"
                                    + "app_fa='" + ap.getText() + "',"
                                    + "apm_fa='" + am.getText() + "'"
                                    + "where cod_fa='" + clavefa.getText() + "'");
                            if (act >= 1) {
                                JOptionPane.showMessageDialog(rootPane, "Actualizado");
                                consultarTodo();
                                clearfields();
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "no se puede actualizar");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, ("No se encontro el id: " + clavefa.getText()));
                consultarTodo();
                clearfields();
            }
            System.out.println("paso0");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Solo el administrador puede editar");
        }

    }//GEN-LAST:event_editarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       if(Inicio.getPuesto().equals("Administrador")){
        String clave = clavefa.getText();
        if (clave.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese al clave del elemento que desea eliminar");
        } else if (buscarID()) {
            int i = JOptionPane.showConfirmDialog(rootPane, "Confirma la eliminación?", "Eliminar elemento", 2, 2);
            if (i <= 0) {
                try {
                    Connection con;
                    con = DriverManager.getConnection(coneccionbd);
                    Statement stm = con.createStatement();
                    stm.executeUpdate("delete from farmaceutico where cod_fa='" + clave + "'");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                consultarTodo();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, ("No existe: " + clave));
        }
        }else 
JOptionPane.showMessageDialog(rootPane,"Solo los administradores pueden eliminar");
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
         if((Inicio.getPuesto().equals("Administrador"))||(Inicio.getPuesto().equals("Supervisor"))){
            if (clavefa.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese un ID");
            } else if (nombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese el nombre");
            } else if (ap.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese el apellido paterno");
            } else if (am.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese el apellido materno");
            } else if (!verificarID()) { //Si no existe el ID entra en la creaci+on
                String Clavefa, Nombre, Ap, Am;
                Clavefa = clavefa.getText();
                Nombre = nombre.getText();
                Ap = ap.getText();
                Am = am.getText();
                try {
                    DefaultTableModel tabla = new DefaultTableModel();
                    Connection con;
                    con = DriverManager.getConnection(coneccionbd);
                    Statement stm = con.createStatement();
                    int stt = stm.executeUpdate("insert into farmaceutico values "
                            + "('" + Clavefa
                            + "','" + Nombre
                            + "','" + Ap
                            + "','" + Am
                            + "')");
                    if (stt >= 1) {
                        JOptionPane.showMessageDialog(rootPane, "Registro creado");
                        clearfields();
                        consultarTodo();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "no se  pudo crear");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(rootPane, " No se  pudo crear");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "YA EXISTE LA CLAVE QUE INTENTA ASIGNAR", "No se puede crear", 2);
            }
        } else {
           JOptionPane.showMessageDialog(rootPane,"Solo los administradores y supervisores pueden agregar, por favor inicie sesión");
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if((Inicio.getPuesto().equals("Administrador"))||(Inicio.getPuesto().equals("Supervisor"))||(Inicio.getPuesto().equals("Vendedor"))){
        Object dato[] = new Object[4];
        String buscar = nombre.getText();
        if (buscar.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese un nombre para buscar");
        } else {
            try {
                DefaultTableModel tabla = new DefaultTableModel();
                Connection con;
                con = DriverManager.getConnection(coneccionbd);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("Select * from farmaceutico where nom_fa='" + buscar + "'");
                tabla.addColumn("ID Farmaceutico");
                tabla.addColumn("Nombre");
                tabla.addColumn("Apellido paterno");
                tabla.addColumn("Apellido materno");
                while (rs.next()) {

                    for (int i = 0; i < 4; i++) {
                        dato[i] = rs.getString(i + 1).toUpperCase();
                    }
                    tabla.addRow(dato);
                }

            } catch (Exception e) {
            }
        }
        clavefa.setText((String) dato[0]);
        nombre.setText((String) dato[1]);
        ap.setText((String) dato[2]);
        am.setText((String) dato[3]);
        } else
        JOptionPane.showMessageDialog(rootPane,"Debe iniciar sesión para poder buscar");
    }//GEN-LAST:event_buscarActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(Farmaceutico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farmaceutico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farmaceutico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farmaceutico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Farmaceutico().setVisible(true);
            }
        });
    }
    //Grunditses:

    private void clearfields() {
        clavefa.setText("");
        nombre.setText("");
        ap.setText("");
        am.setText("");
    }

    private boolean verificarID() {
        String buscar = clavefa.getText();
        try {
            Connection con;
            con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from farmaceutico where cod_fa='" + buscar + "'");
            while (rs.next()) {
                clavefa.setText(String.valueOf(rs.getString(1)));
                return true;
            }

        } catch (Exception e) {
        }
        return false; //si no encontro nada falso

    }

    private void consultarTodo() {
        try {
            DefaultTableModel tabla = new DefaultTableModel();
            Connection con;
            con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from farmaceutico");
            tabla.addColumn("ID Farmaceutico");
            tabla.addColumn("Nombre");
            tabla.addColumn("Apellido Paterno");
            tabla.addColumn("Apellido materno");
            while (rs.next()) {
                Object dato[] = new Object[4];
                for (int i = 0; i < 4; i++) {
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
        String buscar = clavefa.getText();
        try {
            Connection con;
            con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from farmaceutico where cod_fa='" + buscar + "'");
            while (rs.next()) {
                clavefa.setText(String.valueOf(rs.getString(1)));
                return true;
            }

        } catch (Exception e) {
        }
        return false; //si no encontro nada falso

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField am;
    private javax.swing.JTextField ap;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField clavefa;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
