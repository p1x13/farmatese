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


public class Laboratorio extends javax.swing.JFrame {

      String coneccionbd = ("jdbc:sqlserver://localhost:1433;databaseName=farmacia_tese;user=sa;password=sasa");
    public Laboratorio() {
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

        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        calle = new javax.swing.JTextField();
        colonia = new javax.swing.JTextField();
        cp = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        nD = new javax.swing.JTextField();
        aD = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Nombre Laboratorio");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 50, 140, 30);
        getContentPane().add(nombre);
        nombre.setBounds(270, 50, 310, 30);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/7modificar.png"))); // NOI18N
        editar.setToolTipText("Modificar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar);
        editar.setBounds(400, 240, 60, 60);

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/5eliminar.png"))); // NOI18N
        eliminar.setToolTipText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar);
        eliminar.setBounds(510, 240, 60, 60);

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/4agregar.png"))); // NOI18N
        agregar.setToolTipText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar);
        agregar.setBounds(170, 240, 70, 60);

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/2buscarr.png"))); // NOI18N
        buscar.setToolTipText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(280, 240, 70, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LABORATORIO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 10, 460, 20);

        jLabel4.setText("Calle");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 100, 28, 30);

        jLabel5.setText("Colonia");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 100, 60, 30);

        jLabel6.setText("CP");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 130, 41, 30);

        jLabel7.setText("Estado");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(410, 130, 39, 30);

        jLabel8.setText("Nombre dueño");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 160, 110, 30);

        jLabel9.setText("Apellido dueño");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(370, 160, 90, 30);
        getContentPane().add(calle);
        calle.setBounds(120, 100, 210, 30);
        getContentPane().add(colonia);
        colonia.setBounds(480, 100, 210, 30);
        getContentPane().add(cp);
        cp.setBounds(120, 130, 210, 30);
        getContentPane().add(estado);
        estado.setBounds(480, 130, 210, 30);
        getContentPane().add(nD);
        nD.setBounds(120, 160, 210, 30);
        getContentPane().add(aD);
        aD.setBounds(480, 160, 210, 30);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -20, 760, 340);

        jMenu1.setText("Exit");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Medicamento");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Menu Principal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(752, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if((Inicio.getPuesto().equals("Administrador"))||(Inicio.getPuesto().equals("Supervisor"))||(Inicio.getPuesto().equals("Vendedor"))){
        String buscar = nombre.getText();
         Object dato[] = new Object[7];
         if (buscar.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "¿Qué laboratorio busca?");
        } else {
            try {
                DefaultTableModel tabla = new DefaultTableModel();
                Connection con;
                con = DriverManager.getConnection(coneccionbd);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("Select * from laboratorio where nom_l='" + buscar + "'");
                tabla.addColumn("Laboratorio");
            tabla.addColumn("Calle");
            tabla.addColumn("Colonia");
            tabla.addColumn("CP");
            tabla.addColumn("Estado");
            tabla.addColumn("NombreD");
            tabla.addColumn("ApellidoD");
                while (rs.next()) {
                   
                    for (int i = 0; i < 7; i++) {
                        dato[i] = rs.getString(i + 1).toUpperCase();
                    }
                    tabla.addRow(dato);
                }
             
            } catch (Exception e) {
            }
        }
       nombre.setText((String)dato[0]);
       calle.setText((String)dato[1]);
       colonia.setText((String)dato[2]);
       cp.setText((String)dato[3]);
       estado.setText((String)dato[4]);
       nD.setText((String)dato[5]);
       aD.setText((String)dato[6]);
        }else
            JOptionPane.showMessageDialog(rootPane,"Debe iniciar sesión para poder buscar");
    }//GEN-LAST:event_buscarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
       if((Inicio.getPuesto().equals("Administrador"))||(Inicio.getPuesto().equals("Supervisor"))){
        if (nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
        } else if (calle.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la calle");
        } else if (colonia.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la colonia");
        } else if (cp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese CP");
        } else if (estado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese estado");
        } else if (nD.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese nombre dueño");
        } else if (aD.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese apellido dueño");
        } else if (!verificarID()) { //Si no existe el ID entra en la creaci+on
            String nom,ca,co,cP,es,nd,ad;
            nom=nombre.getText();
            ca=calle.getText();
            co= colonia.getText();
            cP = cp.getText();
            es= estado.getText();
            nd = nD.getText();
            ad = aD.getText();
            try {
                DefaultTableModel tabla = new DefaultTableModel();
                Connection con;
                con = DriverManager.getConnection(coneccionbd);
                Statement stm = con.createStatement();
                int stt = stm.executeUpdate("insert into laboratorio values "
                        + "('" + nom
                        + "','" + ca
                        + "','" + co
                        + "','" + cP
                        + "','" + es
                        + "','" + nd
                        + "','" + ad
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
      } else
          JOptionPane.showMessageDialog(rootPane,"Solo los administradores y supervisores pueden agregar, por favor inicie sesión");
    }//GEN-LAST:event_agregarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       if(Inicio.getPuesto().equals("Administrador")){
        String clave = cp.getText();
        if (clave.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Por favor ingrese al clave del elemento que desea eliminar");
        } else if (buscarID()) {
            int i = JOptionPane.showConfirmDialog(rootPane, "Confirma la eliminación?", "Eliminar elemento", 2, 2);
            if (i <= 0) {
                try {
                    Connection con;
                    con = DriverManager.getConnection(coneccionbd);
                    Statement stm = con.createStatement();
                    stm.executeUpdate("delete from laboratorio where cp='" + clave + "'");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                consultarTodo();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, ("No existe: " + clave));
        }
        } else
            JOptionPane.showMessageDialog(rootPane,"Solo los administradores pueden eliminar");
    }//GEN-LAST:event_eliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    this.setVisible(false);
    Medicamento obj = new Medicamento();
    obj.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setVisible(false);
        Inicio obj = new Inicio();
        obj.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
       if(Inicio.getPuesto().equals("Administrador")){
        if (!(cp.getText().equals(""))) {
            System.out.println("paso1");
            if (verificarID() || !(nombre.getText().equals("") || calle.getText().equals("") || colonia.getText().equals("")
                    ||estado.getText().equals("")||nD.getText().equals("")||aD.getText().equals(""))) {
                System.out.println("paso2");
                String actualizar = "Nombre = '" + nombre.getText() + "' \n"
                        + "calle= '" + calle.getText() + "'\n"
                        + "colonia= '" + colonia.getText() + "'\n"
                        + "estado= '" + estado.getText() + "'\n"
                        + "nombre dueño= '" + nD.getText() + "'\n"                      
                        + "apellido dueño= '" + aD.getText() + "'";
                int procd = JOptionPane.showConfirmDialog(rootPane, actualizar, ("Se actualizara la informacion para: " + nombre.getText()), 2, 2);
                System.out.println(procd);
                if (procd <= 0) {
                    try {
                        Connection con = DriverManager.getConnection(coneccionbd);
                        Statement stm = con.createStatement();
                        int act = stm.executeUpdate("update laboratorio set "
                                + "nom_l='" + nombre.getText() + "',"
                                + "cal_l='" + calle.getText() + "',"
                                + "col_l='" + colonia.getText() + "',"
                                + "est_l='" + estado.getText() + "',"
                                + "nomd_l='" + nD.getText() + "',"
                                + "apd_l='" + aD.getText() + "'"
                                + "where cp_l='" + cp.getText() + "'");
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
            JOptionPane.showMessageDialog(rootPane, ("No se encontro el cp: " + cp.getText()));
            consultarTodo();
            clearfields();
        }
        System.out.println("paso0");
        }else
            JOptionPane.showMessageDialog(rootPane, "Solo el administrador puede editar");

    }//GEN-LAST:event_editarActionPerformed

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
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laboratorio().setVisible(true);
            }
        });
    }
    
    //Grunditses:
    private void clearfields() {
        nombre.setText("");
        calle.setText("");
        colonia.setText("");
        cp.setText("");
        estado.setText("");
        nD.setText("");
        aD.setText("");
    }

    private boolean verificarID() {
        String buscar = cp.getText();
        try {
            Connection con;
            con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from laboratorio where cp_l='" + buscar + "'");
            while (rs.next()) {
                cp.setText(String.valueOf(rs.getString(4)));
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
            ResultSet rs = stm.executeQuery("Select * from laboratorio");
            tabla.addColumn("Laboratorio");
            tabla.addColumn("Calle");
            tabla.addColumn("Colonia");
            tabla.addColumn("CP");
            tabla.addColumn("Estado");
            tabla.addColumn("NombreD");
            tabla.addColumn("ApellidoD");
            while (rs.next()) {
                Object dato[] = new Object[7];
                for (int i = 0; i < 7; i++) {
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
        String buscar = cp.getText();
        try {
            Connection con;
            con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from laboratorio where cp_l='" + buscar + "'");
            while (rs.next()) {
                cp.setText(String.valueOf(rs.getString(1)));
                return true;
            }

        } catch (Exception e) {
        }
        return false; //si no encontro nada falso

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aD;
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField calle;
    private javax.swing.JTextField colonia;
    private javax.swing.JTextField cp;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nD;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
