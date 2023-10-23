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

    DefaulTableModel dtm=new DefaulTableModel ();
    private AutorData alu=new AutorData();
    private Conexion conet=new Conexion ();
    
    Conexion con1 = new Conexion ();
    Connection conet;
    DefaulTableModel modelo;
    Statement st;
    ResultSet rs;
    

    public AutoresView() {
        initComponents();
        setLocationRelativeTo(null);
        consultar ();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        samplePUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("samplePU").createEntityManager();
        customerQuery = java.beans.Beans.isDesignTime() ? null : samplePUEntityManager.createQuery("SELECT c FROM Customer c");
        customerList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : customerQuery.getResultList();
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAutores = new javax.swing.JTable();
        jTexto = new javax.swing.JLabel();
        jTextoAutor = new javax.swing.JLabel();
        jBuscarAutor = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jBotonEliminar = new javax.swing.JButton();
        jBotonModificar2 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(550, 350));
        setPreferredSize(new java.awt.Dimension(550, 350));

        jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));
        jDesktopPane1.setForeground(new java.awt.Color(51, 51, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextoIdentificacion)
                            .addComponent(jTextoNacion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextoFechaNacimien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBotonCrear)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTextoIdentificacion)
                .addGap(3, 3, 3)
                .addComponent(jIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextoFechaNacimien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jTextoNacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBotonCrear)
                .addGap(31, 31, 31))
        );

        jDesktopPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 250));

        jAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha de Nacimiento", "Nacionalidad"
            }
        ));
        jScrollPane1.setViewportView(jAutores);

        jTexto.setText("Seleccione un autor a gestionar");

        jTextoAutor.setText("Buscar autor");

        jBuscarAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jBuscarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarAutorActionPerformed(evt);
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextoAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void jBuscarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarAutorActionPerformed

    }//GEN-LAST:event_jBuscarAutorActionPerformed

    private void jBotonModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonModificar2ActionPerformed
        // TODO add your handling code here:
    //    try {
     
    //    int dni = Integer.parseInt(jTDocumento.getText());
    //    String apellido = jTApellido.getText();
    //    String nombre = jTNombre.getText();
    //    LocalDate f =jTFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    //    boolean estado=activo;
    //    int id=alu.buscarAlumnoPorDNI(dni).getIdAlumno();
       
        
    //    Alumno a1=new Alumno (id,dni,apellido,nombre,f,estado);
        
    //    alu.modificarAlumno(a1);
        
    //    } catch (java.lang.NumberFormatException e) {
    //        JOptionPane.showMessageDialog(this, "Uno de los campos fue ingresado "
    //                + "incorrectamente o se encuentra vacío"+"\nIntente de nuevo")
    }//GEN-LAST:event_jBotonModificar2ActionPerformed

    private void jBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEliminarActionPerformed
    //int dni=Integer.parseInt(jTDocumento.getText());
    //   int id=alu.buscarAlumnoPorDNI(dni).getIdAlumno();
       
    //   alu.eliminarAlumno(id);
    //   limpiarFormulario();
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

    void consultar() {
        String sql = "select * from clientes"
                try {
                    conet = con1.getConnection;
                    st = conet.createStatement ();
                    Object[] cliente = new Object[3];
                    modelo = (DefaulTableModel) jAutores.getModel ();
                    while (rs.next()){
                        cliente [0] = rs.getString ("Nombre");
                        cliente [1] = rs.getInt ("Fecha de Nacimiento");
                        cliente [2] = rs.getString ("Nacionalidad");
                        modelo.addRow (cliente)
                    }
                    jAutores.setModel (modelo);
                } catch (Exception e) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<bibliotecagrupo15.vistas.Customer> customerList;
    private javax.persistence.Query customerQuery;
    private javax.swing.JTable jAutores;
    private javax.swing.JButton jBotonCrear;
    private javax.swing.JButton jBotonEliminar;
    private javax.swing.JButton jBotonModificar2;
    private javax.swing.JComboBox<String> jBuscarAutor;
    private javax.swing.JDesktopPane jDesktopPane1;
    private com.toedter.calendar.JDateChooser jFechaNacimiento;
    private javax.swing.JTextField jIdentificacion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jNacionalidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jTexto;
    private javax.swing.JLabel jTextoAutor;
    private javax.swing.JLabel jTextoFechaNacimien;
    private javax.swing.JLabel jTextoIdentificacion;
    private javax.swing.JLabel jTextoNacion;
    private javax.persistence.EntityManager samplePUEntityManager;
    // End of variables declaration//GEN-END:variables
}
