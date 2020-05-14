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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Farma extends javax.swing.JFrame {

    String coneccionbd = ("jdbc:sqlserver://localhost:1433;databaseName=farmacia_tese;user=sa;password=sasa");
    ArrayList<String> listaFarmaceuticos = new ArrayList<>();
    ArrayList<String> listaCiudades = new ArrayList<>();

    public Farma() {
        initComponents();
        actualizarList();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        clavefa = new javax.swing.JTextField();
        colonia = new javax.swing.JTextField();
        calle = new javax.swing.JTextField();
        editar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        buscarNombre = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        boxCiudad = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        guardias = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        boxFarmaceutico = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("ID Farmacia");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 40, 70, 16);

        jLabel2.setText("Ciudad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 100, 60, 16);

        jLabel3.setText("Colonia");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 60, 16);

        jLabel4.setText("Calle");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 160, 40, 20);
        getContentPane().add(clavefa);
        clavefa.setBounds(90, 30, 110, 30);

        colonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coloniaActionPerformed(evt);
            }
        });
        getContentPane().add(colonia);
        colonia.setBounds(90, 150, 110, 30);
        getContentPane().add(calle);
        calle.setBounds(270, 150, 110, 30);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/7modificar.png"))); // NOI18N
        editar.setToolTipText("Modificar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar);
        editar.setBounds(330, 210, 70, 60);

        Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/5eliminar.png"))); // NOI18N
        Borrar.setToolTipText("Eliminar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        getContentPane().add(Borrar);
        Borrar.setBounds(440, 210, 70, 60);

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/4agregar.png"))); // NOI18N
        agregar.setToolTipText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar);
        agregar.setBounds(110, 210, 70, 60);

        buscarNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/2buscarr.png"))); // NOI18N
        buscarNombre.setToolTipText("Buscar");
        buscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNombreActionPerformed(evt);
            }
        });
        getContentPane().add(buscarNombre);
        buscarNombre.setBounds(220, 210, 60, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FARMACIA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 0, 310, 20);

        jLabel6.setText("nombre");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 40, 50, 16);
        getContentPane().add(nombre);
        nombre.setBounds(270, 30, 110, 30);

        boxCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(boxCiudad);
        boxCiudad.setBounds(360, 90, 130, 30);

        jLabel7.setText("CP");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(416, 160, 20, 16);
        getContentPane().add(cp);
        cp.setBounds(460, 150, 100, 30);

        jLabel8.setText("Dias de guardia");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 90, 100, 30);
        getContentPane().add(guardias);
        guardias.setBounds(180, 90, 73, 24);

        jLabel9.setText("Farmaceutico");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 30, 90, 20);

        boxFarmaceutico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(boxFarmaceutico);
        boxFarmaceutico.setBounds(490, 30, 90, 30);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, -30, 620, 340);

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

        setSize(new java.awt.Dimension(631, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNombreActionPerformed
        Object dato[] = new Object[8];
        String clave = nombre.getText();
        if (clave.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese un nombre para buscar");
        } else {
            try {
                DefaultTableModel tabla = new DefaultTableModel();
                Connection con;
                con = DriverManager.getConnection(coneccionbd);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("Select * from farmacias where nom_f='" + clave + "'");
                tabla.addColumn("ID Farmacia");
                tabla.addColumn("Nombre");
                tabla.addColumn("Calle");
                tabla.addColumn("Colonia");
                tabla.addColumn("CP");
                tabla.addColumn("Dias de guardias");
                tabla.addColumn("Ciudad");
                tabla.addColumn("Farmaceutico ");
                while (rs.next()) {
                    
                    for (int i = 0; i < 8; i++) {
                        dato[i] = rs.getString(i + 1).toUpperCase();
                    }
                    tabla.addRow(dato);
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se encontraron resultados");
            }
            clavefa.setText((String)dato[0]);
        nombre.setText((String)dato[1]);
        calle.setText((String)dato[2]);
        colonia.setText((String)dato[3]);
        cp.setText((String)dato[4]);
        guardias.setText((String)dato[5]);
        String compararCiudad = (String) dato[6];
        String compararFarma = (String) dato[7];
            System.out.println(listaCiudades.indexOf(compararCiudad)/2);
            System.out.println(compararCiudad);
            System.out.println((listaFarmaceuticos.indexOf(compararFarma)) / 2);
            System.out.println(compararFarma);
        boxFarmaceutico.setSelectedIndex((listaFarmaceuticos.indexOf(compararFarma)) / 2);
        boxCiudad.setSelectedIndex((listaCiudades.indexOf(compararCiudad)) / 2);
        }


    }//GEN-LAST:event_buscarNombreActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (clavefa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID de farmacia");
        } else if (nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre");
        } else if (guardias.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el horario");
        } else if (colonia.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la colonia");
        } else if (calle.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la calle");
        } else if (cp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el CP");
        } else if (!verificarID()) { //Si no existe el ID entra en la creaci+on
            String cF = clavefa.getText();
            String n = nombre.getText();
            int idFarmaceutico = (boxFarmaceutico.getSelectedIndex() * 2);
            String farmaceutico = (String) listaFarmaceuticos.get(idFarmaceutico);
            String gu = guardias.getText();
            int idCiudad = (boxCiudad.getSelectedIndex() * 2);
            String ciudad = (String) listaCiudades.get(idCiudad);
            String co = colonia.getText();
            String ca = calle.getText();
            String cop = cp.getText();
            try {
                DefaultTableModel tabla = new DefaultTableModel();
                Connection con;
                con = DriverManager.getConnection(coneccionbd);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("insert into farmacia values ('" + cF + "','"
                        + n + "','"
                        + ca + "','"
                        + co + "','"
                        + cop + "','"
                        + gu + "','"
                        + ciudad + "','"
                        + farmaceutico + "')");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se pudo crear", "Compruebe los datos", 2);
            }
        }
        consultarTodo();
        clearfields();
    }//GEN-LAST:event_agregarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        String clave;
        clave = clavefa.getText();
        int idFarmaceutico = (boxFarmaceutico.getSelectedIndex() * 2);
        int idCiudad = (boxCiudad.getSelectedIndex() * 2);
        String farmaceutico = (String) listaFarmaceuticos.get(idFarmaceutico);
        String ciudad = (String) listaCiudades.get(idCiudad);
        String eliminar = "Nombre= '" + nombre.getText() + "' \n"
                + "dias de guardia= '" + guardias.getText() + "'\n"
                + "colonia= '" + colonia.getText() + "'\n"
                + "calle= '" + calle.getText() + "'\n"
                + "codigo postal= '" + cp.getText() + "'\n"
                + "farmaceutico= '" + farmaceutico + "'\n"
                + "ciudad= '" + ciudad + "'";
        int procd = JOptionPane.showConfirmDialog(rootPane, eliminar, ("Se eliminara la informacion para: " + clavefa.getText()), 2, 2);
        System.out.println(procd);
        if (procd <= 0) {
            try {
                DefaultTableModel tabla = new DefaultTableModel();
                Connection con;
                con = DriverManager.getConnection(coneccionbd);
                Statement stm = con.createStatement();
                int act = stm.executeUpdate("delete from Farmacia where cod_f='" + clave + "'");
                if (act >= 1) {
                            JOptionPane.showMessageDialog(rootPane, "Eliminado");
                            consultarTodo();
                            clearfields();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "no se puede eliminar");
                        }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_BorrarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void coloniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coloniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coloniaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        Inicio obj = new Inicio();
        obj.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        if (!(clavefa.getText().equals(""))) {
            System.out.println("paso 1 no esta vacia la clave");
            if (verificarID()) {
                System.out.println("paso2");
                // listaFarmaceuticos;
                int idFarmaceutico = (boxFarmaceutico.getSelectedIndex() * 2);
                int idCiudad = (boxCiudad.getSelectedIndex() * 2);
                String farmaceutico = (String) listaFarmaceuticos.get(idFarmaceutico);
                String ciudad = (String) listaCiudades.get(idCiudad);
                String actualizar = "Nombre= '" + nombre.getText() + "' \n"
                        + "dias de guardia= '" + guardias.getText() + "'\n"
                        + "colonia= '" + colonia.getText() + "'\n"
                        + "calle= '" + calle.getText() + "'\n"
                        + "codigo postal= '" + cp.getText() + "'\n"
                        + "farmaceutico= '" + farmaceutico + "'\n"
                        + "ciudad= '" + ciudad + "'";
                int procd = JOptionPane.showConfirmDialog(rootPane, actualizar, ("Se actualizara la informacion para: " + clavefa.getText()), 2, 2);
                System.out.println(procd);
                if (procd <= 0) {
                    try {
                        Connection con = DriverManager.getConnection(coneccionbd);
                        Statement stm = con.createStatement();

                        int act = stm.executeUpdate("update farmacia set "
                                + "nom_f='" + nombre.getText() + "',"
                                + "cal_f='" + calle.getText() + "',"
                                + "col_f='" + colonia.getText() + "',"
                                + "cp_f='" + cp.getText() + "',"
                                + "gua_f='" + guardias.getText() + "',"
                                + "cod_c1='" + ciudad + "',"
                                + "cod_fa1='" + farmaceutico + "'"
                                + "where cod_f='" + clavefa.getText() + "'");
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
        }
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
            java.util.logging.Logger.getLogger(Farma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Farma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Farma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Farma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Farma().setVisible(true);
            }
        });
    }

    /*----------------------------------------------------------------------------------------------------------------*/
 /*----------------------------------------------------------------------------------------------------------------*/
    //MY METHOD´S 
    //Consultar tabla, usando views en DB 
    private void consultarTodo() {
        try {
            DefaultTableModel tabla = new DefaultTableModel();
            Connection con;
            con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            //Si se elimina alguna foranea no mostratra el registro por la limitación, investigar
            //como cambiar a otra clave, parece ser ondelete set default...
            ResultSet rs = stm.executeQuery("Select * from farmacias");
            tabla.addColumn("ID Farmacia");
            tabla.addColumn("Nombre");
            tabla.addColumn("Calle");
            tabla.addColumn("Colonia");
            tabla.addColumn("CP");
            tabla.addColumn("Dias de guardias");
            tabla.addColumn("Ciudad");
            tabla.addColumn("Farmaceutico ");
            while (rs.next()) {
                Object dato[] = new Object[8];
                for (int i = 0; i < 8; i++) {
                    dato[i] = rs.getString(i + 1).toUpperCase();
                }
                tabla.addRow(dato);
            }
         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Actualizar cajas
    private void actualizarList() {
        boxFarmaceutico.removeAllItems();

        listaFarmaceuticos = farmaceuticos();
        //ciclo del arreglo, recorriendo posiciones par para obtener el nombre, las
        //claves pertenecen a las posiciones non
        for (int i = 1; i < listaFarmaceuticos.size(); i += 2) {
            boxFarmaceutico.addItem(listaFarmaceuticos.get(i));
            //  System.out.println(listaFarmaceuticos.get(i - 1));
        }
        boxCiudad.removeAllItems();

        listaCiudades = ciudades();
        //ciclo del arreglo, recorriendo posiciones par para obtener el nombre, las
        //claves pertenecen a las posiciones non
        for (int j = 1; j < listaCiudades.size(); j += 2) {
            boxCiudad.addItem(listaCiudades.get(j));
            // System.out.println(listaCiudades.get(j - 1));
            int ciucod = boxCiudad.getSelectedIndex();
            // System.out.println(boxCiudad.getSelectedIndex());
            //System.out.println(listaCiudades.get(ciucod * 2));
        }
        //TRansformacion de nombre a codigo con el index del item seleccionado
        String ciucod = (String) boxCiudad.getSelectedItem();
        //String codigoCiudad=listaCiudades.get(ciucod);
        // System.out.println(ciucod);
    }

    // Caja farmaceuticos
    public ArrayList<String> farmaceuticos() {
        ArrayList<String> farmaceuticos = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            String q = "select cod_fa,nom_fa from farmaceutico";
            ResultSet res = stm.executeQuery(q);
            while (res.next()) {
                //farmaceuticos.add(res.getString("nom_fa"));
                Object dato[] = new Object[2];
                for (int i = 0; i < 2; i++) {
                    //LLenado de array para el arraylist
                    dato[i] = res.getString(i + 1).toUpperCase();
                    farmaceuticos.add((String) dato[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return farmaceuticos;
    }

    //Caja ciudades
    public ArrayList<String> ciudades() {
        ArrayList<String> ciudades = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            String q = "select cod_c,nom_c from ciudad";
            ResultSet res = stm.executeQuery(q);
            while (res.next()) {
                // ciudades.add(res.getString("nom_c"));
                Object dato[] = new Object[2];
                for (int i = 0; i < 2; i++) {
                    //LLenado de array para el arraylist
                    dato[i] = res.getString(i + 1).toUpperCase();
                    ciudades.add((String) dato[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ciudades;
    }

    //Limpiar campos
    public void clearfields() {
        clavefa.setText("");
        nombre.setText("");
        boxFarmaceutico.setSelectedIndex(0);
        guardias.setText("");
        boxCiudad.setSelectedIndex(0);
        colonia.setText("");
        calle.setText("");
        cp.setText("");
    }

    //verificarID
    private boolean verificarID() {
        String buscar = clavefa.getText();
        try {
            Connection con;
            con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from farmacia where cod_f='" + buscar + "'");
            while (rs.next()) {
                clavefa.setText(String.valueOf(rs.getString(1)));
                return true;
            }

        } catch (Exception e) {
        }
        return false; //si no encontro nada falso

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox<String> boxCiudad;
    private javax.swing.JComboBox<String> boxFarmaceutico;
    private javax.swing.JButton buscarNombre;
    private javax.swing.JTextField calle;
    private javax.swing.JTextField clavefa;
    private javax.swing.JTextField colonia;
    private javax.swing.JTextField cp;
    private javax.swing.JButton editar;
    private javax.swing.JTextField guardias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
