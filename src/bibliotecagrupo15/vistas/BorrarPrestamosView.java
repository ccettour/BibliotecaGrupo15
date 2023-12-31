/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bibliotecagrupo15.vistas;

import bibliotecagrupo15.accesoADatos.PrestamoData;
import bibliotecagrupo15.entidades.Prestamo;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class BorrarPrestamosView extends javax.swing.JInternalFrame {

    PrestamoData pd = new PrestamoData();    
    
private DefaultTableModel tabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    /**
     * Creates new form Prestamos
     */
    public BorrarPrestamosView() {
        initComponents();
        cargarCabecera();
        cargarTabla();
        cancelar.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaP = new javax.swing.JTable();
        cancelar = new javax.swing.JButton();
        presS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(560, 370));
        setPreferredSize(new java.awt.Dimension(560, 370));

        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido Usuario!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Seleccione el prestamo que desea cancelar :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        tablaP.setForeground(new java.awt.Color(255, 255, 255));
        tablaP.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaP.setOpaque(false);
        tablaP.setSelectionBackground(new java.awt.Color(136, 92, 8));
        tablaP.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaP.getTableHeader().setResizingAllowed(false);
        tablaP.getTableHeader().setReorderingAllowed(false);
        tablaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaP);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 510, 200));

        cancelar.setBackground(new java.awt.Color(86, 86, 85));
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar Prestamo");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        presS.setEditable(false);
        presS.setBackground(new java.awt.Color(89, 89, 88));
        presS.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(presS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 330, -1));

        jLabel3.setText("Prestamo seleccionado: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo15/vistas/imagenes/fondo-borrarPrestamos.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPMouseClicked
        // TODO add your handling code here:
        int prestS=tablaP.getSelectedRow();
        presS.setText(tablaP.getValueAt(prestS, 0).toString());
        cancelar.setEnabled(true);
    }//GEN-LAST:event_tablaPMouseClicked

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        try{
            int prestS = tablaP.getSelectedRow();
            pd.cancelarPrestamo((Integer) tablaP.getValueAt(prestS, 0));
            cargarTabla();
            cancelar.setEnabled(false);
        } catch(java.lang.ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "No se seleccionó un préstamo para devolver");
        }
            
        
    }//GEN-LAST:event_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField presS;
    private javax.swing.JTable tablaP;
    // End of variables declaration//GEN-END:variables

private void cargarCabecera(){
tabla.addColumn("ID");
tabla.addColumn("NRO SOCIO");
tabla.addColumn("NOMBRE");
tabla.addColumn("LIBRO");
tabla.addColumn("FECHA DE INICIO");
tabla.addColumn("VENCIMIENTO");
tablaP.setModel(tabla);
Color color=new Color(87,87,86);
//Color color2=new Color(255,255,255);
tablaP.setBackground(color);
//jTabla_registro.getTableHeader().setBackground(new Color(32, 136, 203));
tablaP.getTableHeader().setBackground(color);
//tablaP.getTableHeader().setForeground(color2);
}

private void cargarTabla(){
    limpiar();
List<Prestamo>prestamos=pd.ListarPrestamos();
    for (Prestamo p : prestamos) {
        tabla.addRow(new Object[]{p.getIdPrestamo(),p.getLector().getSocio(),p.getLector().getNombre(),p.getEjemplar().getLibro().getTitulo(),p.getFechaInicio(), p.getFechaFin()});
    }
        
}

private void limpiar(){
int p=tablaP.getRowCount()-1;
    for (; p >= 0; p--) {
            tabla.removeRow(p);
        }
    presS.setText("");
}
}
