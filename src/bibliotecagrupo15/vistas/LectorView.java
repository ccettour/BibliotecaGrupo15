/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecagrupo15.vistas;

import bibliotecagrupo15.accesoADatos.LectorData;
import bibliotecagrupo15.entidades.Lector;
import javax.swing.JOptionPane;

/**
 *
 * @author maria
 */
public class LectorView extends javax.swing.JInternalFrame {

    private LectorData lectorData=new LectorData();
    private Lector lector=null;
    
    
    public LectorView() {
        initComponents();
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
        jTNombre = new javax.swing.JTextField();
        jBCrear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTDomicilio = new javax.swing.JTextField();
        jTMail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel2.setText("Nombre  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        getContentPane().add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, -1));

        jBCrear.setText("Crear");
        jBCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearActionPerformed(evt);
            }
        });
        getContentPane().add(jBCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel3.setText("Domicilio  :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel4.setText("Mail  :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        getContentPane().add(jTDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 170, -1));
        getContentPane().add(jTMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 170, -1));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel6.setText("Crear Socio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo15/vistas/imagenes/FondoLector.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearActionPerformed
        // TODO add your handling code here:
        try {
            
            String nom = jTNombre.getText();
            String dom=jTDomicilio.getText();
            String mail=jTMail.getText();
            if(nom.isEmpty()||dom.isEmpty()||mail.isEmpty()){
            JOptionPane.showMessageDialog(null,"No debe haber campos vacíos");
            return;
            }
        
            if ( lector==null);{
            Lector l=new Lector(nom,dom,mail,true);
            lectorData.guardarLector(l);
        }
                limpiarCampos();    
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El dato ingresado no es válido");
        
        
        
        }
    }//GEN-LAST:event_jBCrearActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTMail;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
private void limpiarCampos(){

jTNombre.setText("");
jTDomicilio.setText("");
jTMail.setText("");


}
}
