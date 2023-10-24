package bibliotecagrupo15.vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import bibliotecagrupo15.entidades.Autor;
import bibliotecagrupo15.accesoADatos.AutorData;
import bibliotecagrupo15.accesoADatos.Conexion;
import org.mariadb.jdbc.Connection;
        
public class AutoresView extends javax.swing.JInternalFrame {

   private DefaultTableModel dtm = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
   };
    private AutorData alu=new AutorData();

    public AutoresView() {
        initComponents();
        crearCabecera();
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
        jBotonCrear = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAutores = new javax.swing.JTable();
        jTexto = new javax.swing.JLabel();
        jTextoAutor = new javax.swing.JLabel();
        jBuscarAutor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jBotonEliminar = new javax.swing.JButton();
        jBotonModificar2 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jTextField1.setText("jTextField1");

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(550, 350));
        setPreferredSize(new java.awt.Dimension(550, 350));

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));
        jDesktopPane1.setForeground(new java.awt.Color(51, 51, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(211, 253));

        jTextoIdentificacion.setText("Identificacion");

        jTextoFechaNacimien.setText("Fecha Nacimiento");

        jIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdentificacionActionPerformed(evt);
            }
        });

        jNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNacionalidadActionPerformed(evt);
            }
        });

        jTextoNacion.setText("Nacionalidad");

        jBotonCrear.setText("Crear");
        jBotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonCrearActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jTextoNacion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextoIdentificacion)
                            .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextoFechaNacimien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jBotonCrear)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTextoIdentificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextoFechaNacimien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextoNacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonCrear))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 250));

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

        jBuscarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarAutorActionPerformed(evt);
            }
        });
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
                        .addGap(0, 17, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopPane1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 290, 180));

        jBotonEliminar.setText("Eliminar");
        jBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonEliminarActionPerformed(evt);
            }
        });

        jBotonModificar2.setText("Modificar");
        jBotonModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonModificar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBotonModificar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBotonModificar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotonEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
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

    
    
    private void jNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNacionalidadActionPerformed

    }//GEN-LAST:event_jNacionalidadActionPerformed

    private void jIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdentificacionActionPerformed
 
    }//GEN-LAST:event_jIdentificacionActionPerformed
    }
    private void jBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEliminarActionPerformed
    
       int idAutor=((Integer)jAutores.getValueAt(jAutores.getSelectedRow(), 0));
       
       alu.eliminarAutor(idAutor);
       limpiarTabla();
    }//GEN-LAST:event_jBotonEliminarActionPerformed

    private void jBotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCrearActionPerformed
        // TODO add your handling code here:
    //    Alumno a=new Alumno();
        
    //    int dni = Integer.parseInt(jTDocumento.getText());
    //    String apellido = jTApellido.getText();
    //    String nombre = jTNombre.getText();
    //    LocalDate f =jTFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
    //    a.setDni(dni);
    //    a.setApellido(apellido);
    //    a.setNombre(nombre);
    //    a.setFechaNac(f);
    //    a.setEstado(activo);
        
    //    alu.guardarAlumno(a);
    //    limpiarFormulario();
    }//GEN-LAST:event_jBotonCrearActionPerformed

    private void jBuscarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarAutorActionPerformed

    private void jBuscarAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscarAutorKeyReleased
        // TODO add your handling code here:
     limpiarTabla();
     for(Autor a:alu.ListarAutores()){
         if(a.getIdentificacion().toLowerCase().startsWith(jBuscarAutor.getText().toLowerCase())){
                dtm.addRow(new Object[]{a.getIdAutor(), a.getIdentificacion(), a.getFechaNacimiento(), a.getNacionalidad()});
            }
        }
    }//GEN-LAST:event_jBuscarAutorKeyReleased

    private void jAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAutoresMouseClicked
        // TODO add your handling code here:
        int idAutor=((Integer)jAutores.getValueAt(jAutores.getSelectedRow(), 0));
        String nombre = jAutores.getValueAt(jAutores.getSelectedRow(), 1).toString();
        String nacionalidad = jAutores.getValueAt(jAutores.getSelectedRow(), 3).toString();
        String fechaNacimiento =jAutores.getValueAt(jAutores.getSelectedRow(), 2).toString();
        LocalDate fecha = LocalDate.parse(fechaNacimiento);
        
        Autor autor =alu.buscarAutor(idAutor);
       
        jIdentificacion.setText(nombre);
        jNacionalidad.setText(nacionalidad);
        jFechaNacimiento.setDate(Date.valueOf(fecha));
        jIdAutor.setText(idAutor + "");
    }//GEN-LAST:event_jAutoresMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jBotonModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonModificar2ActionPerformed

        try {

            int idAutor=((Integer)jAutores.getValueAt(jAutores.getSelectedRow(), 0));
            String nombre = jAutores.getValueAt(jAutores.getSelectedRow(), 1).toString();
            String nacionalidad = jAutores.getValueAt(jAutores.getSelectedRow(), 3).toString();
            String fechaNacimiento =jAutores.getValueAt(jAutores.getSelectedRow(), 2).toString();
            LocalDate fecha = LocalDate.parse(fechaNacimiento);

            Autor autor =alu.buscarAutor(idAutor);

            jIdentificacion.setText(nombre);
            jNacionalidad.setText(nacionalidad);
            jFechaNacimiento.setDate(Date.valueOf(fecha));

            //        Alumno a1=new Alumno (id,dni,apellido,nombre,f,estado);
            //
            //        alu.modificarAlumno(a1);

        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Uno de los campos fue ingresado "
                + "incorrectamente o se encuentra vacío"+"\nIntente de nuevo");
    }//GEN-LAST:event_jBotonModificar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jAutores;
    private javax.swing.JButton jBotonCrear;
    private javax.swing.JButton jBotonEliminar;
    private javax.swing.JButton jBotonModificar2;
    private javax.swing.JTextField jBuscarAutor;
    private javax.swing.JDesktopPane jDesktopPane1;
    private com.toedter.calendar.JDateChooser jFechaNacimiento;
    private javax.swing.JTextField jIdentificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jNacionalidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
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
}
