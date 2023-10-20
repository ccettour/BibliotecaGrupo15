/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bibliotecagrupo15.vistas;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ListaPrestamos extends javax.swing.JInternalFrame {
private DefaultTableModel tabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    /**
     * Creates new form ListaPrestamos
     */
    public ListaPrestamos() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ListaPrestamos = new javax.swing.JRadioButton();
        SociosActivos = new javax.swing.JRadioButton();
        LibrosPrestadosxFecha = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaP = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(500, 370));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido al Listado Administrativo de Prestamos ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setText("Seleccione la vista que desea revisar: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        ListaPrestamos.setText("Lista de Prestamos");
        ListaPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaPrestamosActionPerformed(evt);
            }
        });
        jPanel1.add(ListaPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        SociosActivos.setText("Socios con Prestamos activos");
        SociosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SociosActivosActionPerformed(evt);
            }
        });
        jPanel1.add(SociosActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        LibrosPrestadosxFecha.setText("Libros Prestados");
        jPanel1.add(LibrosPrestadosxFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

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
        jScrollPane1.setViewportView(tablaP);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 470, 180));

        jButton1.setText("limpiar seleccion");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaPrestamosActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_ListaPrestamosActionPerformed

    private void SociosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SociosActivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SociosActivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton LibrosPrestadosxFecha;
    private javax.swing.JRadioButton ListaPrestamos;
    private javax.swing.JRadioButton SociosActivos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaP;
    // End of variables declaration//GEN-END:variables

private void limpiar(){
int p=tablaP.getRowCount()-1;
    for (; p >= 0; p--) {
            tabla.removeRow(p);
        }
    
}

private void cargarCabecera1(){

    

}

}
