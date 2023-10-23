/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bibliotecagrupo15.vistas;

import java.awt.Color;

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
        Color color = new Color(0,0,0);
        jMenuBar1.setBackground(color);
        jMenuBar1.setForeground(Color.WHITE);
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
        fondoMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        socio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        agregarLibro = new javax.swing.JMenuItem();
        agregarEjemplares = new javax.swing.JMenuItem();
        prestamos = new javax.swing.JMenu();
        pedirPrestamo = new javax.swing.JMenuItem();
        devolver = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        adminSocios = new javax.swing.JMenuItem();
        adminLibros = new javax.swing.JMenuItem();
        listadoDePrestamos = new javax.swing.JMenuItem();
        adminAutores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondoMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo15/vistas/imagenes/Fondo-Inicio.jpg"))); // NOI18N
        fondoMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        escritorio.setLayer(fondoMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setForeground(new java.awt.Color(239, 239, 239));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setOpaque(true);

        jMenu1.setText("Socios");

        socio.setText("Crear Socio");
        jMenu1.add(socio);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Libros");

        agregarLibro.setText("Agregar Libro");
        jMenu2.add(agregarLibro);

        agregarEjemplares.setText("Agregar Ejemplares");
        jMenu2.add(agregarEjemplares);

        jMenuBar1.add(jMenu2);

        prestamos.setText("Prestamos");

        pedirPrestamo.setText("Pedir un Prestamo");
        pedirPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedirPrestamoActionPerformed(evt);
            }
        });
        prestamos.add(pedirPrestamo);

        devolver.setText("Devolver");
        devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverActionPerformed(evt);
            }
        });
        prestamos.add(devolver);

        jMenuBar1.add(prestamos);

        jMenu3.setText("Administracion");

        adminSocios.setText("Administracion de Socios");
        jMenu3.add(adminSocios);

        adminLibros.setText("Administracion de Libros");
        adminLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLibrosActionPerformed(evt);
            }
        });
        jMenu3.add(adminLibros);

        listadoDePrestamos.setText("Listado de Prestamos");
        listadoDePrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoDePrestamosActionPerformed(evt);
            }
        });
        jMenu3.add(listadoDePrestamos);

        adminAutores.setText("Administracion de autores");
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

    private void pedirPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedirPrestamoActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       fondo();
       PedirPrestamoView ppv=new PedirPrestamoView();
       ppv.setVisible(true);
       escritorio.add(ppv);
       escritorio.moveToFront(ppv);
        // TODO add your handling code here:
    }//GEN-LAST:event_pedirPrestamoActionPerformed

    private void adminAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAutoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminAutoresActionPerformed

    private void adminLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLibrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminLibrosActionPerformed

    private void devolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
       escritorio.repaint();
       fondo();
        BorrarPrestamosView bpv = new BorrarPrestamosView();
       bpv.setVisible(true);
       escritorio.add(bpv);
       escritorio.moveToFront(bpv);
    }//GEN-LAST:event_devolverActionPerformed

    private void listadoDePrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoDePrestamosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
       escritorio.repaint();
       fondo();
        ListaPrestamos lp = new ListaPrestamos();
       lp.setVisible(true);
       escritorio.add(lp);
       escritorio.moveToFront(lp);
    }//GEN-LAST:event_listadoDePrestamosActionPerformed

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
    private javax.swing.JMenuItem adminLibros;
    private javax.swing.JMenuItem adminSocios;
    private javax.swing.JMenuItem agregarEjemplares;
    private javax.swing.JMenuItem agregarLibro;
    private javax.swing.JMenuItem devolver;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel fondoMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listadoDePrestamos;
    private javax.swing.JMenuItem pedirPrestamo;
    private javax.swing.JMenu prestamos;
    private javax.swing.JMenuItem socio;
    // End of variables declaration//GEN-END:variables


private void fondo(){
fondoMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotecagrupo15/vistas/imagenes/Fondo-Inicio.jpg"))); // NOI18N
        fondoMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        escritorio.setLayer(fondoMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

}

}
