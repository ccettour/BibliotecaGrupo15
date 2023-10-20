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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chris
 */
public class AdminLibrosView extends javax.swing.JInternalFrame {

    private DefaultTableModel tabla = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };

    LibroData ld = new LibroData();
    AutorData ad = new AutorData();

    /**
     * Creates new form AdminLibrosView
     */
    public AdminLibrosView() {
        initComponents();
        crearCabecera();
        cargarTabla();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfIsbn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfTitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbAutores = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtfAnio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jtfEditorial = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtLibros = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        fondoLibros = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setVisible(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(550, 328));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 328));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administrar libros");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos del libro seleccionado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ISBN:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel1.add(jtfIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Título:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));
        jPanel1.add(jtfTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 260, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Autor:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jPanel1.add(jcbAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Año:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 590, 10));
        jPanel1.add(jtfAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 50, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jcbTipo.setModel(new DefaultComboBoxModel(bibliotecagrupo15.Tipo.values()));
        jPanel1.add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 120, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Editorial:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));
        jPanel1.add(jtfEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 200, -1));

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Id:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jtfId.setEnabled(false);
        jPanel1.add(jtfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 50, -1));

        jtLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        jtLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLibrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtLibros);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 560, 140));

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, -1));

        fondoLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo15/vistas/imagenes/fondo-admin-libros.png"))); // NOI18N
        jPanel1.add(fondoLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 581, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLibrosMouseClicked
        // TODO add your handling code here:
        int libroElegido = jtLibros.getSelectedRow();
        int idLibro = ld.buscarLibroXIsbn((Integer) jtLibros.getValueAt(libroElegido, 0)).getIdLibro();
        Autor autor = ad.buscarAutorXNombre(jtLibros.getValueAt(libroElegido, 2).toString());
        Tipo tipo = Tipo.valueOf(jtLibros.getValueAt(libroElegido, 4).toString());

        jtfId.setText(idLibro + "");
        jtfIsbn.setText(jtLibros.getValueAt(libroElegido, 0).toString());
        jtfTitulo.setText(jtLibros.getValueAt(libroElegido, 1).toString());
        jcbAutores.setSelectedItem(autor);
        jtfAnio.setText((String) jtLibros.getValueAt(libroElegido, 3).toString());
        jcbTipo.setSelectedItem(tipo);
        jtfEditorial.setText((String) jtLibros.getValueAt(libroElegido, 5));
    }//GEN-LAST:event_jtLibrosMouseClicked

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:

        try {
            if (jtfId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Seleccione en la tabla el libro a editar");
            } else {
                int id = Integer.parseInt(jtfId.getText());
                int isbn = Integer.parseInt(jtfIsbn.getText());
                String titulo = jtfTitulo.getText();
                Autor autor = (Autor) jcbAutores.getSelectedItem();
                int anio = Integer.parseInt(jtfAnio.getText());
                Tipo tipo = (Tipo) jcbTipo.getSelectedItem();
                String editorial = jtfEditorial.getText();

                Libro libro = new Libro(id, isbn, titulo, autor, anio, tipo, editorial, true);
                ld.modificarLibro(libro);

                limpiarFormulario();
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Dato faltante o erróneo. \nIntente de nuevo");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        if (jtfId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione en la tabla el libro a eliminar");
        } else {

            int isbn = Integer.parseInt(jtfIsbn.getText());
            int id = ld.buscarLibroXIsbn(isbn).getIdLibro();

            ld.deshabilitarLibro(id);
            cargarTabla();
            limpiarFormulario();
        }
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoLibros;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<Autor> jcbAutores;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JTable jtLibros;
    private javax.swing.JTextField jtfAnio;
    private javax.swing.JTextField jtfEditorial;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfIsbn;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables

    private void crearCabecera() {
        tabla.addColumn("ISBN");
        tabla.addColumn("Titulo");
        tabla.addColumn("Autor");
        tabla.addColumn("Año");
        tabla.addColumn("Tipo");
        tabla.addColumn("Editorial");
        jtLibros.setModel(tabla);
    }

    private void limpiarTabla() {
        int f = jtLibros.getRowCount() - 1;

        for (; f >= 0; f--) {
            tabla.removeRow(f);
        }
    }

    private void cargarTabla() {
        limpiarTabla();

        List<Libro> libros = ld.listarLibros();

        for (Libro l : libros) {
            tabla.addRow(new Object[]{l.getIsbn(), l.getTitulo(), l.getAutor(), l.getAnio(), l.getTipo(), l.getEditorial()});
        }
    }

    private void cargarCombo() {
        List<Autor> autores = ad.ListarAutoresTodos();
        for (Autor autor : autores) {
            jcbAutores.addItem(autor);
        }
    }

    public void limpiarFormulario() {

        jtfIsbn.setText("");
        jtfTitulo.setText("");
        jtfAnio.setText("");
        jtfEditorial.setText("");
        jtfId.setText("");
    }

}
