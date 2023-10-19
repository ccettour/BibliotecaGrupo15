/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bibliotecagrupo15.vistas;

import bibliotecagrupo15.Tipo;
import bibliotecagrupo15.accesoADatos.*;
import bibliotecagrupo15.entidades.*;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Chris
 */
public class LibrosView extends javax.swing.JInternalFrame {
    
    LibroData ld = new LibroData();
    AutorData ad = new AutorData();
    EjemplarData ed = new EjemplarData();
    
    /**
     * Creates new form LibrosView
     */
    
    public LibrosView() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jtfIsbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfTitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfAnio = new javax.swing.JTextField();
        jcbAutores = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfEditorial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jcbCantEjemplares = new javax.swing.JComboBox<>();
        jbAgregar = new javax.swing.JButton();
        jcbTipo = new javax.swing.JComboBox<>();
        fondoLibros = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(550, 350));
        setMinimumSize(new java.awt.Dimension(550, 350));
        setPreferredSize(new java.awt.Dimension(550, 350));
        setVisible(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(550, 328));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 328));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jtfIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 160, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ISBN:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Agregar libro");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Título:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jPanel1.add(jtfTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Año:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Autor:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel1.add(jtfAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, -1));

        jPanel1.add(jcbAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cantidad de ejemplares:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        jPanel1.add(jtfEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 160, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Editorial:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jcbCantEjemplares.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(jcbCantEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 50, -1));

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jcbTipo.setModel(new DefaultComboBoxModel(bibliotecagrupo15.Tipo.values()));
        jPanel1.add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 160, -1));

        fondoLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo15/vistas/imagenes/fondo-libros.png"))); // NOI18N
        jPanel1.add(fondoLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
        
        try {
            int isbn = Integer.parseInt(jtfIsbn.getText());
            String titulo = jtfTitulo.getText();
            Autor autor = (Autor) jcbAutores.getSelectedItem();
            int anio = Integer.parseInt(jtfAnio.getText());
            Tipo tipo = (Tipo)jcbTipo.getSelectedItem();
            String editorial = jtfEditorial.getText();
            Libro libro = new Libro(isbn, titulo, autor, anio, tipo, editorial, true);
            ld.guardarLibro(libro);
            
            int cantEjemp = jcbCantEjemplares.getSelectedIndex();
            
            if (cantEjemp >= 1) {
                for (int i = 1; i <= cantEjemp; i++) {
                    Ejemplar ejemplar = new Ejemplar(libro, 0);
                    ed.crearEjemplar(ejemplar);
                }
                JOptionPane.showMessageDialog(null, "Ejemplares creados");
            }
            
            // Limpiar formulario
            
            
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "ISBN o año incorrecto. Debe introducir un valor numérico");

        }
    }//GEN-LAST:event_jbAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoLibros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JComboBox<Autor> jcbAutores;
    private javax.swing.JComboBox<String> jcbCantEjemplares;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JTextField jtfAnio;
    private javax.swing.JTextField jtfEditorial;
    private javax.swing.JTextField jtfIsbn;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        List<Autor> autores = ad.ListarAutores();
        for (Autor autor : autores) {
            jcbAutores.addItem(autor);
        }
    }

}
