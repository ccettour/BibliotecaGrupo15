
package bibliotecagrupo15.vistas;

import bibliotecagrupo15.accesoADatos.LectorData;
import bibliotecagrupo15.entidades.Lector;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListadoSociosView extends javax.swing.JInternalFrame {
    
private DefaultTableModel modelo=new DefaultTableModel();
private LectorData selec=new LectorData();
private Lector l=new Lector();



    public ListadoSociosView() {
        initComponents();
        armarCabecera();
        
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
        jTSocios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jTSocio = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTDomicilio = new javax.swing.JTextField();
        jTMail = new javax.swing.JTextField();
        jRBActivo = new javax.swing.JRadioButton();
        jRBInactivo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jBActivar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(450, 328));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 0, -1, 14));

        jTSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Socio", "Nombre", "Domicilio", "Mail", "Estado"
            }
        ));
        jTSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTSociosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTSocios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 406, 96));

        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Socio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Domicilio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Mail :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Estado  :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jTSocio.setEditable(false);
        getContentPane().add(jTSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 70, -1));
        getContentPane().add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 226, -1));
        getContentPane().add(jTDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 153, -1));
        getContentPane().add(jTMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 150, -1));

        jRBActivo.setBackground(new java.awt.Color(51, 0, 51));
        jRBActivo.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jRBActivo.setForeground(new java.awt.Color(255, 255, 51));
        jRBActivo.setText("Activo");
        jRBActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBActivoActionPerformed(evt);
            }
        });
        getContentPane().add(jRBActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jRBInactivo.setBackground(new java.awt.Color(51, 0, 0));
        jRBInactivo.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jRBInactivo.setForeground(new java.awt.Color(255, 255, 51));
        jRBInactivo.setText("Inactivo");
        jRBInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBInactivoActionPerformed(evt);
            }
        });
        getContentPane().add(jRBInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 51));
        jLabel6.setText("Listado de Socios");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jBActivar.setText("Activar");
        jBActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActivarActionPerformed(evt);
            }
        });
        getContentPane().add(jBActivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo15/vistas/imagenes/FondoListaLectores.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 470, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTSociosMouseClicked
        // TODO add your handling code here:
       int filaSeleccionada=jTSocios.getSelectedRow();
       if(filaSeleccionada!=-1){
        
           int socio=(Integer)jTSocios.getValueAt(filaSeleccionada, 0);
           String nombre=(String)jTSocios.getValueAt(filaSeleccionada,1);
           String domicilio=(String)jTSocios.getValueAt(filaSeleccionada, 2);
           String mail=(String)jTSocios.getValueAt(filaSeleccionada, 3);
          
                   
           jTSocio.setText(socio+""); 
           jTNombre.setText(nombre);
           jTDomicilio.setText(domicilio);
           jTMail.setText(mail);
           
       
       
       
       }
    }//GEN-LAST:event_jTSociosMouseClicked

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
       try {
           
          
            int socio=Integer.parseInt(jTSocio.getText());
            String nom = jTNombre.getText();
            String dom=jTDomicilio.getText();
            String mail=jTMail.getText();
            Lector l=new Lector(socio,nom,dom,mail,true);
            
            selec.modificarLector(l);
            limpiarCampos();
                
            
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Uno de los campos fue ingresado "
                    + "incorrectamente o se encuentra vacío"+"\nIntente de nuevo");
        }
        
        
        
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        try {
            int socio=Integer.parseInt(jTSocio.getText());
            String nom = jTNombre.getText();
            String dom=jTDomicilio.getText();
            String mail=jTMail.getText();
            Lector l=new Lector(socio,nom,dom,mail,true);
            selec.eliminarLector(socio);
            limpiarCampos();
                
            
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Uno de los campos fue ingresado "
                    + "incorrectamente o se encuentra vacío"+"\nIntente de nuevo");
        }
        
        
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jRBActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBActivoActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        jRBInactivo.setSelected(false);
        cargarTablaActivos();
        jRBActivo.setEnabled(true);
        jBEliminar.setEnabled(true);
        jBModificar.setEnabled(true);
        jBActivar.setEnabled(false);
        
        
       
     
    }//GEN-LAST:event_jRBActivoActionPerformed

    private void jRBInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInactivoActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        jRBActivo.setSelected(false);
        cargarTablaInactivos();
        jRBInactivo.setEnabled(true);
        jBModificar.setEnabled(false);
        jBEliminar.setEnabled(false);
        jBActivar.setEnabled(true);
    }//GEN-LAST:event_jRBInactivoActionPerformed

    private void jBActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActivarActionPerformed
        // TODO add your handling code here:
       try {
           
          
            int socio=Integer.parseInt(jTSocio.getText());
            String nom = jTNombre.getText();
            String dom=jTDomicilio.getText();
            String mail=jTMail.getText();
            Lector l=new Lector(socio,nom,dom,mail,true);
            
            selec.modificarLector(l);
            limpiarCampos();
                
            
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Uno de los campos fue ingresado "
                    + "incorrectamente o se encuentra vacío"+"\nIntente de nuevo");
        }
        
        
     
    }//GEN-LAST:event_jBActivarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActivar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBActivo;
    private javax.swing.JRadioButton jRBInactivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTMail;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTSocio;
    private javax.swing.JTable jTSocios;
    // End of variables declaration//GEN-END:variables
public void armarCabecera(){
modelo.addColumn("Socio");
modelo.addColumn("Nombre");
modelo.addColumn("Domicilio");
modelo.addColumn("Mail");

jTSocios.setModel(modelo);



} 
 private void limpiarTabla() {
        int f = jTSocios.getRowCount() - 1;

        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
private void cargarTablaActivos(){
        limpiarTabla();
       List<Lector> lectores;
       LectorData  selec=new LectorData();
        lectores=selec.listarLectoresActivos();

        for (Lector l : lectores) {
            modelo.addRow(new Object[]{l.getSocio(),l.getNombre(),l.getDomicilio(),l.getMail()});
        }

}
private void cargarTablaInactivos(){
        limpiarTabla();
       List<Lector> lectores;
       LectorData  selec=new LectorData();
        lectores=selec.listarLectoresInactivos();

        for (Lector l : lectores) {
            modelo.addRow(new Object[]{l.getSocio(),l.getNombre(),l.getDomicilio(),l.getMail()});
        }

}
private void limpiarCampos(){
jTSocio.setText("");
jTNombre.setText("");
jTDomicilio.setText("");
jTMail.setText("");


}
    
}








































