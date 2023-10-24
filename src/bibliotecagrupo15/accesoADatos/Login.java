/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecagrupo15.accesoADatos;

import bibliotecagrupo15.vistas.Inicio;
import bibliotecagrupo15.vistas.MenuBiblioteca;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Login {
private Connection con = null;
    
    public Login() {
        con = Conexion.getConexion();
    }

    public boolean Ingreso(JTextField usuario, JPasswordField contrasenia){
        boolean ingreso=false;
        String sql="SELECT * FROM `usuarios` WHERE usuarios.ingresoUsuario=? AND usuarios.ingresoContrasenia=?";
    try {
        PreparedStatement ps=con.prepareStatement(sql);
        String contra=String.valueOf(contrasenia.getPassword());
        ps.setString(1, usuario.getText());
        ps.setString(2, contra);
        
        ResultSet rs=ps.executeQuery();
        
        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "El usuario es correcto");
            ingreso=true;
        }else{
        JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectos,"
                + " intente de nuevo");
        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "ERROR DE CONEXION");
    }
    
        if (ingreso==true) {
            MenuBiblioteca mb = new MenuBiblioteca();
            mb.setVisible(true);
        }
        return ingreso;
    }
    
    
}
