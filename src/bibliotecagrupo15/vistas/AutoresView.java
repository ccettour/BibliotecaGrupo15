package bibliotecagrupo15.vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import bibliotecagrupo15.entidades.Autor;
import bibliotecagrupo15.accesoADatos.AutorData;

public class AutoresView extends javax.swing.JInternalFrame {

    private DefaultTableModel dtm = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    private AutorData alu = new AutorData();

    public AutoresView() {
        initComponents();
        crearCabecera();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jTextoIdentificacion = new javax.swing.JLabel();
        jTextoFechaNacimien = new javax.swing.JLabel();
        jIdentificacion = new javax.swing.JTextField();
        jFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jNacionalidad = new javax.swing.JTextField();
        jTextoNacion = new javax.swing.JLabel();
        jIdAutor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBotonGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAutores = new javax.swing.JTable();
        jTexto = new javax.swing.JLabel();
        jTextoAutor = new javax.swing.JLabel();
        jBuscarAutor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBotonEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jTextField1.setText("jTextField1");

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(660, 350));
        setMinimumSize(new java.awt.Dimension(660, 350));
        setPreferredSize(new java.awt.Dimension(660, 350));

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));
        jDesktopPane1.setForeground(new java.awt.Color(51, 51, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(211, 253));

        jTextoIdentificacion.setText("Identificacion");

        jTextoFechaNacimien.setText("Fecha Nacimiento");

        jTextoNacion.setText("Nacionalidad");

        jIdAutor.setEditable(false);

        jLabel1.setText("ID");

        jBotonGuardar.setText("Guardar");
        jBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextoIdentificacion)
                    .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextoFechaNacimien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBotonGuardar))
                    .addComponent(jTextoNacion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTextoIdentificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextoFechaNacimien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTextoNacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonGuardar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, 260));

        jAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha de Nacimiento", "Nacionalidad"
            }
        ));
        jAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAutoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jAutores);

        jTexto.setText("Seleccione un autor a gestionar");

        jTextoAutor.setText("Buscar autor");

        jBuscarAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jBuscarAutorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTexto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextoAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBuscarAutor)))
                        .addGap(0, 175, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoAutor)
                    .addComponent(jBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopPane1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 440, 220));

        jBotonEliminar.setText("Eliminar");
        jBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBotonEliminar)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo15/vistas/imagenes/fondo-autores.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 670, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        jDesktopPane1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEliminarActionPerformed

        int idAutor = ((Integer) jAutores.getValueAt(jAutores.getSelectedRow(), 0));

        alu.eliminarAutor(idAutor);
        limpiarTabla();
        cargarTabla();
    }//GEN-LAST:event_jBotonEliminarActionPerformed

    private void jBuscarAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarAutorKeyReleased
        // TODO add your handling code here:
        limpiarTabla();
        for (Autor a : alu.ListarAutores()) {
            if (a.getIdentificacion().toLowerCase().startsWith(jBuscarAutor.getText().toLowerCase())) {
                dtm.addRow(new Object[]{a.getIdAutor(), a.getIdentificacion(), a.getFechaNacimiento(), a.getNacionalidad()});
            }
        }
    }//GEN-LAST:event_jBuscarAutorKeyReleased

    private void jAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAutoresMouseClicked
        // TODO add your handling code here:
        int idAutor = (Integer) jAutores.getValueAt(jAutores.getSelectedRow(), 0);
        String nombre = jAutores.getValueAt(jAutores.getSelectedRow(), 1).toString();
        String nacionalidad = jAutores.getValueAt(jAutores.getSelectedRow(), 3).toString();
        String fechaNacimiento = jAutores.getValueAt(jAutores.getSelectedRow(), 2).toString();
        LocalDate fecha = LocalDate.parse(fechaNacimiento);

        jIdentificacion.setText(nombre);
        jNacionalidad.setText(nacionalidad);
        jFechaNacimiento.setDate(Date.valueOf(fecha));
        jIdAutor.setText(idAutor + "");
    }//GEN-LAST:event_jAutoresMouseClicked

    private void jBotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonGuardarActionPerformed

        try {
            String nombre = jIdentificacion.getText();
            String nacionalidad = jNacionalidad.getText();
            LocalDate fecha = jFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (nombre.isEmpty() || nacionalidad.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
            } else {
                if (jIdAutor.getText().isEmpty()) {
                    Autor autor = new Autor(nombre, fecha, nacionalidad, true);
                    alu.guardarAutor(autor);
                } else {
                    int idAutor = Integer.parseInt(jIdAutor.getText());

                    Autor autor = new Autor(idAutor, nombre, fecha, nacionalidad, true);
                    alu.modificarAutor(autor);
                    limpiar();
                }
            }
            limpiarTabla();
            cargarTabla();
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Uno de los campos fue ingresado "
                    + "incorrectamente o se encuentra vacío" + "\nIntente de nuevo");
    }//GEN-LAST:event_jBotonGuardarActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jAutores;
    private javax.swing.JButton jBotonEliminar;
    private javax.swing.JButton jBotonGuardar;
    private javax.swing.JTextField jBuscarAutor;
    private javax.swing.JDesktopPane jDesktopPane1;
    private com.toedter.calendar.JDateChooser jFechaNacimiento;
    private javax.swing.JTextField jIdAutor;
    private javax.swing.JTextField jIdentificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jNacionalidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jTexto;
    private javax.swing.JLabel jTextoAutor;
    private javax.swing.JLabel jTextoFechaNacimien;
    private javax.swing.JLabel jTextoIdentificacion;
    private javax.swing.JLabel jTextoNacion;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla() {
        int f = jAutores.getRowCount() - 1;

        for (; f >= 0; f--) {
            dtm.removeRow(f);
        }
    }

    private void crearCabecera() {
        dtm.addColumn("ID");
        dtm.addColumn("Nombre");
        dtm.addColumn("Fecha de Nacimiento");
        dtm.addColumn("Nacionalidad");
        jAutores.setModel(dtm);
    }

    private void limpiar() {
        jIdentificacion.setText("");
        jNacionalidad.setText("");
        jFechaNacimiento.setDate(Date.valueOf(LocalDate.now()));
        jIdAutor.setText("");
    }
    
    private void cargarTabla(){
        for (Autor a : alu.ListarAutores()) {
                dtm.addRow(new Object[]{a.getIdAutor(), a.getIdentificacion(), a.getFechaNacimiento(), a.getNacionalidad()});
        }
    }
}
