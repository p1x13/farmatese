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


public class Monodroga extends javax.swing.JFrame {

   String coneccionbd = ("jdbc:sqlserver://localhost:1433;databaseName=farmacia_tese;user=sa;password=sasa");
       ArrayList<String> listaLaboratorios = new ArrayList<>();
    public Monodroga() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        accion = new javax.swing.JTextField();
        claveM = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        boxLaboratorio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        nC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nCo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 530, 140);

        accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionActionPerformed(evt);
            }
        });
        jPanel1.add(accion);
        accion.setBounds(400, 60, 150, 30);
        jPanel1.add(claveM);
        claveM.setBounds(120, 60, 150, 30);

        jLabel2.setText("Accion");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 70, 50, 20);

        jLabel1.setText("ID Monodorga");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 74, 80, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MONODROGA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 10, 470, 20);

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/5eliminar.png"))); // NOI18N
        eliminar.setToolTipText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar);
        eliminar.setBounds(440, 370, 70, 60);

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/7modificar.png"))); // NOI18N
        editar.setToolTipText("Modificar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPanel1.add(editar);
        editar.setBounds(350, 370, 70, 60);

        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/3consultar.png"))); // NOI18N
        consultar.setToolTipText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jPanel1.add(consultar);
        consultar.setBounds(260, 370, 70, 60);

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/2buscarr.png"))); // NOI18N
        buscar.setToolTipText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar);
        buscar.setBounds(170, 370, 70, 60);

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/famatese/4agregar.png"))); // NOI18N
        agregar.setToolTipText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar);
        agregar.setBounds(80, 370, 70, 60);

        jLabel4.setText("Laboratorio");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 160, 80, 20);

        boxLaboratorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(boxLaboratorio);
        boxLaboratorio.setBounds(370, 160, 160, 30);

        jLabel5.setText("nombreCientifico");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 120, 100, 16);
        jPanel1.add(nC);
        nC.setBounds(120, 110, 150, 30);

        jLabel6.setText("nombre comercial");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 120, 110, 16);
        jPanel1.add(nCo);
        nCo.setBounds(400, 110, 150, 30);

        jLabel7.setText("Cantidad");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 170, 80, 20);
        jPanel1.add(c);
        c.setBounds(120, 160, 150, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 450);

        jMenu1.setText("Exit");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Menu Principal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(597, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String clave = nC.getText();
        if (clave.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese un nombre para buscar");
        } else {
            try {
                DefaultTableModel tabla = new DefaultTableModel();
                Connection con;
                con = DriverManager.getConnection(coneccionbd);
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("Select * from monodroga where cod_m='" + clave + "'");
           tabla.addColumn("ID Monodroga");
            tabla.addColumn("Tipo Accion");
            tabla.addColumn("N. Cientifico");
            tabla.addColumn("N. Comercial");
            tabla.addColumn("Cant.");
            tabla.addColumn("N. Laboratorio");
                while (rs.next()) {
                    Object dato[] = new Object[6];
                    for (int i = 0; i <6; i++) {
                        dato[i] = rs.getString(i + 1);
                    }
                    tabla.addRow(dato);
                }
                this.Tabla1.setModel(tabla);
                int claveSelected = (boxLaboratorio.getSelectedIndex()) * 2;
                boxLaboratorio.setSelectedIndex(claveSelected);
                //listaCiudades.get(claveSelected);
                System.out.println(listaLaboratorios.get(claveSelected));
                // System.out.println(listaCiudades.get(ciucod * 2));
                clearfields();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se encontraron resultados");
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
      consultarTodo();
    }//GEN-LAST:event_consultarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
         if (claveM.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un ID de monodroga");
        } else if (accion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese la acción");
        } else if (nC.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre cientifico");
        } else if (nCo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre comercial");
        } else if (c.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese cantidad");
        } else if (!verificarID()) { //Si no existe el ID entra en la creaci+on
            String cM = claveM.getText();          
            int idFarmaceutico = (boxLaboratorio.getSelectedIndex() * 2)+1;
            String labo = (String) listaLaboratorios.get(idFarmaceutico);
            String a = accion.getText();
            String NC = nC.getText();
            String NCO = nCo.getText();
            String C = c.getText();
             System.out.println(labo);
            try {
                DefaultTableModel tabla = new DefaultTableModel();
                Connection con;
                con = DriverManager.getConnection(coneccionbd);
                Statement stm = con.createStatement();
                stm.executeUpdate("insert into monodroga values ('" + cM + "','"
                        + a + "','"
                        + NC + "','"
                        + NCO + "','"
                        + C + "','"
                        + labo + "')");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(rootPane, "No se pudo crear", "Compruebe los datos", 2);
            }
        }
        consultarTodo();
        clearfields();      
    }//GEN-LAST:event_agregarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        String clave;
        clave = claveM.getText();
        int idLabo = (boxLaboratorio.getSelectedIndex() * 2)+1;
      
        String labo = (String) listaLaboratorios.get(idLabo);
   
        String eliminar = "Laboratorio= '" + labo+ "' \n"
                + "accion= '" + accion.getText() + "'\n"
                + "nombreCientifico= '" + nC.getText() + "'\n"
                + "nombreComercial= '" + nCo.getText() + "'\n"
                + "cantidad= '" + c.getText() + "'";
        int procd = JOptionPane.showConfirmDialog(rootPane, eliminar, ("Se eliminara la informacion para: " + claveM.getText()), 2, 2);
        System.out.println(procd);
        if (procd <= 0) {
            try {
                DefaultTableModel tabla = new DefaultTableModel();
                Connection con;
                con = DriverManager.getConnection(coneccionbd);
                Statement stm = con.createStatement();
                int act = stm.executeUpdate("delete from monodroga where cod_m='" + clave + "'");
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
    }//GEN-LAST:event_eliminarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       this.setVisible(false);
        Inicio obj = new Inicio();
        obj.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
         if (!(claveM.getText().equals(""))) {
            System.out.println("paso 1 no esta vacia la clave");
            if (verificarID()) {
                System.out.println("paso2");
                // listaLabos;
                int idLabo = (boxLaboratorio.getSelectedIndex() * 2)+1;               
                String labo = (String) listaLaboratorios.get(idLabo);     
                String actualizar = "Accion= '" + accion.getText() + "' \n"
                        + "Nombre cientifico= '" + nC.getText() + "'\n"
                        + "Nombre comercial= '" + nCo.getText() + "'\n"
                        + "Cantidad= '" + c.getText() + "'\n"                        
                        + "Laboratorio= '" + labo + "'";
                int procd = JOptionPane.showConfirmDialog(rootPane, actualizar, ("Se actualizara la informacion para: " + claveM.getText()), 2, 2);
                System.out.println(procd);
                if (procd <= 0) {
                    try {
                        Connection con = DriverManager.getConnection(coneccionbd);
                        Statement stm = con.createStatement();
                        int act = stm.executeUpdate("update farmacia set "
                                + "acc_m='" + accion.getText() + "',"
                                + "nci_m='" + nC.getText() + "',"
                                + "nco_m='" + nCo.getText() + "',"
                                + "can_m='" + c.getText() + "',"
                                + "nom_l1='" + labo + "'"
                                + "where cod_f='" + claveM.getText() + "'");
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

    private void accionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accionActionPerformed

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked
         DefaultTableModel model = (DefaultTableModel) Tabla1.getModel();
        int selectedRowIndex = Tabla1.getSelectedRow();
        claveM.setText(model.getValueAt(selectedRowIndex, 0).toString());
        accion.setText(model.getValueAt(selectedRowIndex, 1).toString());
        nC.setText(model.getValueAt(selectedRowIndex, 2).toString());
        nCo.setText(model.getValueAt(selectedRowIndex, 3).toString());
        c.setText(model.getValueAt(selectedRowIndex, 4).toString());
        String compararLabo = (String) model.getValueAt(selectedRowIndex, 5);

        boxLaboratorio.setSelectedIndex((listaLaboratorios.indexOf(compararLabo)) / 2);
    }//GEN-LAST:event_Tabla1MouseClicked

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
            java.util.logging.Logger.getLogger(Monodroga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monodroga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monodroga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monodroga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monodroga().setVisible(true);
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
            ResultSet rs = stm.executeQuery("Select * from monodroga");
            tabla.addColumn("ID Monodroga");
            tabla.addColumn("Tipo Accion");
            tabla.addColumn("N. Cientifico");
            tabla.addColumn("N. Comercial");
            tabla.addColumn("Cant.");
            tabla.addColumn("N. Laboratorio");
            while (rs.next()) {
                Object dato[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    dato[i] = rs.getString(i + 1).toUpperCase();
                }
                tabla.addRow(dato);
            }
            this.Tabla1.setModel(tabla);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Actualizar cajas
    private void actualizarList() {
        boxLaboratorio.removeAllItems();

        listaLaboratorios = laboratorios();
        //ciclo del arreglo, recorriendo posiciones par para obtener el nombre, las
        //claves pertenecen a las posiciones non
        for (int i = 1; i < listaLaboratorios.size(); i += 2) {
            boxLaboratorio.addItem(listaLaboratorios.get(i));
            //  System.out.println(listaFarmaceuticos.get(i - 1));
        }
        
    }

    //Caja labos
    public ArrayList<String> laboratorios() {
        ArrayList<String> laboratorios = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            String q = "select cp_l,nom_l from laboratorio";
            ResultSet res = stm.executeQuery(q);
            while (res.next()) {
                // ciudades.add(res.getString("nom_c"));
                Object dato[] = new Object[2];
                for (int i = 0; i < 2; i++) {
                    //LLenado de array para el arraylist
                    dato[i] = res.getString(i + 1).toUpperCase();
                    laboratorios.add((String) dato[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return laboratorios;
    }

    //Limpiar campos
    public void clearfields() {
        claveM.setText("");
        accion.setText("");
        boxLaboratorio.setSelectedIndex(0);
        accion.setText("");
        nC.setText("");
        nC.setText("");
        c.setText("");

    }

    //verificarID
    private boolean verificarID() {
        String buscar = claveM.getText();
        try {
            Connection con;
            con = DriverManager.getConnection(coneccionbd);
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from monodroga where cod_m='" + buscar + "'");
            while (rs.next()) {
                claveM.setText(String.valueOf(rs.getString(1)));
                return true;
            }

        } catch (Exception e) {
        }
        return false; //si no encontro nada falso

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla1;
    private javax.swing.JTextField accion;
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox<String> boxLaboratorio;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField c;
    private javax.swing.JTextField claveM;
    private javax.swing.JButton consultar;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nC;
    private javax.swing.JTextField nCo;
    // End of variables declaration//GEN-END:variables
}
