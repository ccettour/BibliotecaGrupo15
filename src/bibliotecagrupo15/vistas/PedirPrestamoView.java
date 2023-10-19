/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bibliotecagrupo15.vistas;

import bibliotecagrupo15.accesoADatos.EjemplarData;
import bibliotecagrupo15.accesoADatos.LectorData;
import bibliotecagrupo15.accesoADatos.PrestamoData;
import bibliotecagrupo15.entidades.*;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class PedirPrestamoView extends javax.swing.JInternalFrame {
    PrestamoData pd = new PrestamoData();
    EjemplarData ed = new EjemplarData();
    LectorData ld = new LectorData();
    LocalDate date = LocalDate.now();
    LocalDate date2= LocalDate.now();
    boolean tiempo=false;
    
    /**
     * Creates new form PedirPrestamo
     */
    public PedirPrestamoView() {
        initComponents();
        agrupar();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        socio = new javax.swing.JTextField();
        cb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        d = new javax.swing.JRadioButton();
        m = new javax.swing.JRadioButton();
        s = new javax.swing.JRadioButton();
        crearPrestamo = new javax.swing.JButton();
        limparDatos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setToolTipText("");
        setVisible(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 1));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 385));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido Usuario!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por favor seleccione o rellene las casillas para pedir un Prestamo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Libro Disponible a prestar :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo de Socio : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        socio.setBackground(new java.awt.Color(55, 53, 53));
        socio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(socio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, -1));

        cb.setBackground(new java.awt.Color(55, 53, 53));
        cb.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 320, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tiempo de Prestamo: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        d.setForeground(new java.awt.Color(255, 255, 255));
        d.setText("3 dias");
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        jPanel1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        m.setForeground(new java.awt.Color(255, 255, 255));
        m.setText("1 mes");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        jPanel1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        s.setForeground(new java.awt.Color(255, 255, 255));
        s.setText("1 semana");
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        jPanel1.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        crearPrestamo.setBackground(new java.awt.Color(55, 53, 53));
        crearPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        crearPrestamo.setText("Crear Prestamo");
        crearPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPrestamoActionPerformed(evt);
            }
        });
        jPanel1.add(crearPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        limparDatos.setBackground(new java.awt.Color(55, 53, 53));
        limparDatos.setForeground(new java.awt.Color(255, 255, 255));
        limparDatos.setText("Limpiar Datos");
        limparDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparDatosActionPerformed(evt);
            }
        });
        jPanel1.add(limparDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo15/vistas/imagenes/fondo-prestamos.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
        date2 = date.plusDays(3);
        
        tiempo=true;
    }//GEN-LAST:event_dActionPerformed

    private void limparDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparDatosActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_limparDatosActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        // TODO add your handling code here:
        date2 =date.plusWeeks(1);
        
        tiempo=true;
    }//GEN-LAST:event_sActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
        date2 =date.plusMonths(1);
        tiempo=true;
    }//GEN-LAST:event_mActionPerformed

    private void crearPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPrestamoActionPerformed
        // TODO add your handling code here:
        try {
         if (tiempo=true) {
        Ejemplar e=(Ejemplar)cb.getSelectedItem();
        Lector l=ld.buscarLector(Integer.parseInt(socio.getText()));
        LocalDate fechafinal=date2;
        Prestamo pres=new Prestamo(date, fechafinal, e, l, true);
        pd.crearPrestamo(pres);
        limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un tiempo de prestamo valido");
        }   
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                     "Ingrese un numero valido en la casilla de socio");
        }
        
        
    }//GEN-LAST:event_crearPrestamoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Ejemplar> cb;
    private javax.swing.JButton crearPrestamo;
    private javax.swing.JRadioButton d;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparDatos;
    private javax.swing.JRadioButton m;
    private javax.swing.JRadioButton s;
    private javax.swing.JTextField socio;
    // End of variables declaration//GEN-END:variables

private void agrupar(){
grupo.add(d);
grupo.add(s);
grupo.add(m);
}

private void limpiar(){
socio.setText("");
grupo.clearSelection();

}

private void cargarCombo(){
List<Ejemplar> ejemplar=ed.listarEjemplares();
    for (Ejemplar eje1 : ejemplar) {
        cb.addItem(eje1);
    }
    
}

}
