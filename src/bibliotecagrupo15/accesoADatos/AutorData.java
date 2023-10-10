/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecagrupo15.accesoADatos;
import bibliotecagrupo15.entidades.Autor;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AutorData {
    
    private Connection con = null;
    
    public AutorData() {
        con = Conexion.getConexion();
    }
    
    public void guardarAutor(Autor autor) {
        String sql = "INSERT INTO autor (identificacion, fechaNacimiento, nacionalidad)"
                + "VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, autor.getIdentificacion());
            ps.setDate(2, Date.valueOf(autor.getFechaNacimiento()));
            ps.setString(3, autor.getNacionalidad());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                autor.setIdAutor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Autor guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Autor");
        }
    }
    
    public Autor buscarAutor(int id) {
        String sql = "SELECT identificacion, fechaNacimiento, nacionalidad FROM autor WHERE idAutor=?";
        Autor autor = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                autor = new Autor();
                autor.setIdAutor(id);
                autor.setIdentificacion(rs.getString("identificacion"));
                autor.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                autor.setNacionalidad(rs.getString("nacionalidad"));
               
            } else {
                JOptionPane.showMessageDialog(null, "No existe el autor");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Autor");
        }
        return autor;
    }
    
    public void modificarAutor(Autor autor){
        String sql= "UPDATE autor SET identificacion=?, fechaNacimiento=?, nacionalidad=? WHERE idAutor=?";
        PreparedStatement ps=null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, autor.getIdentificacion());
            ps.setDate(2, Date.valueOf(autor.getFechaNacimiento()));
            ps.setString(3, autor.getNacionalidad());
            ps.setInt(4, autor.getIdAutor());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Autor modificado");

            } else {
                JOptionPane.showMessageDialog(null, "El autor no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Autor");
        }
    }
    
    public void eliminarAutor(int id) {
        String sql = "UPDATE autor SET estado = 0 WHERE idAutor= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Autor eliminado");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Autor");
        }
    }
    
    public List<Autor> ListarAutores() {
        String sql = "SELECT * FROM autor WHERE estado = 1";
        ArrayList<Autor> autores = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Autor autor = new Autor();
                
                autor.setIdAutor(rs.getInt("idAutor"));
                autor.setIdentificacion(rs.getString("identificacion"));
                autor.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                autor.setNacionalidad(rs.getString("nacionalidad"));
                autor.setEstado(rs.getBoolean("estado"));

                autores.add(autor);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos");
        }
        return autores;
    }
}
