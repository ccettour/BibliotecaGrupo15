/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bibliotecagrupo15.vistas;

/**
 *
 * @author Chris
 */
public class MenuBiblioteca extends javax.swing.JFrame {

    /**
     * Creates new form MenuBiblioteca
     */
    public MenuBiblioteca() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        agregarLibro = new javax.swing.JMenuItem();
        agregarEjemplares = new javax.swing.JMenuItem();
        prestamos = new javax.swing.JMenu();
        pedirPrestamo = new javax.swing.JMenuItem();
        devolver = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        listadoDeSocios = new javax.swing.JMenuItem();
        listaDeLibros = new javax.swing.JMenuItem();
        listadoDePrestamos = new javax.swing.JMenuItem();
        adminAutores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo15/vistas/imagenes/Fondo-Inicio.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        escritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu1.setText("Socios");

        usuario.setText("Crear Socio");
        jMenu1.add(usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Libros");

        agregarLibro.setText("Agregar Libro");
        agregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarLibroActionPerformed(evt);
            }
        });
        jMenu2.add(agregarLibro);

        agregarEjemplares.setText("Agregar Ejemplares");
        agregarEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEjemplaresActionPerformed(evt);
            }
        });
        jMenu2.add(agregarEjemplares);

        jMenuBar1.add(jMenu2);

        prestamos.setText("Prestamos");

        pedirPrestamo.setText("Pedir un Prestamo");
        prestamos.add(pedirPrestamo);

        devolver.setText("Devolver");
        prestamos.add(devolver);

        jMenuBar1.add(prestamos);

        jMenu3.setText("Administracion");

        listadoDeSocios.setText("Listado de Socios");
        jMenu3.add(listadoDeSocios);

        listaDeLibros.setText("Administración de libros");
        listaDeLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeLibrosActionPerformed(evt);
            }
        });
        jMenu3.add(listaDeLibros);

        listadoDePrestamos.setText("Listado de Prestamos");
        jMenu3.add(listadoDePrestamos);

        adminAutores.setText("Administración de autores");
        adminAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAutoresActionPerformed(evt);
            }
        });
        jMenu3.add(adminAutores);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarLibroActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        fondoMenu();
        LibrosView mv = new LibrosView();
        mv.setVisible(true);
        escritorio.add(mv);
        escritorio.moveToFront(mv);
    }//GEN-LAST:event_agregarLibroActionPerformed

    private void agregarEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEjemplaresActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        fondoMenu();
        EjemplaresView ev = new EjemplaresView();
        ev.setVisible(true);
        escritorio.add(ev);
        escritorio.moveToFront(ev);
    }//GEN-LAST:event_agregarEjemplaresActionPerformed

    private void listaDeLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeLibrosActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        escritorio.repaint();
        fondoMenu();
        AdminLibrosView alv = new AdminLibrosView();
        alv.setVisible(true);
        escritorio.add(alv);
        escritorio.moveToFront(alv);
    }//GEN-LAST:event_listaDeLibrosActionPerformed

    private void adminAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAutoresActionPerformed
        // TODO add your handling code here:
        
        escritorio.removeAll();
        escritorio.repaint();
        fondoMenu();
        AutoresView auv = new AutoresView();
        auv.setVisible(true);
        escritorio.add(auv);
        escritorio.moveToFront(auv);
    }//GEN-LAST:event_adminAutoresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem adminAutores;
    private javax.swing.JMenuItem agregarEjemplares;
    private javax.swing.JMenuItem agregarLibro;
    private javax.swing.JMenuItem devolver;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem listaDeLibros;
    private javax.swing.JMenuItem listadoDePrestamos;
    private javax.swing.JMenuItem listadoDeSocios;
    private javax.swing.JMenuItem pedirPrestamo;
    private javax.swing.JMenu prestamos;
    private javax.swing.JMenuItem usuario;
    // End of variables declaration//GEN-END:variables

    private void fondoMenu() {
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));
        escritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
}
