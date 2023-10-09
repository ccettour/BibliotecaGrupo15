package bibliotecagrupo15.accesoADatos;

import bibliotecagrupo15.entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EjemplarData {
    private Connection con = null;
    private LibroData libroD = new LibroData();
    
    public EjemplarData(){
        con = Conexion.getConexion();
    }
    
    public void crearEjemplar(Ejemplar ejemplar){
        String sql = "INSERT INTO ejemplar(idLibro, estado) VALUES (?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ejemplar.getLibro().getIdLibro());
            ps.setInt(2, ejemplar.getEstado());
            ps.executeUpdate();
            
            ResultSet exito = ps.getGeneratedKeys();
            if(exito.next()){
                ejemplar.setCodigo(exito.getInt(1));
                JOptionPane.showMessageDialog(null, "Ejemplar creado");
            }
            ps.close();
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ejemplar");
        }
    }
    
    public void modificarEjemplar(Ejemplar ejemplar){
        String sql = "UPDATE ejemplar SET idLibro=?,estado=? WHERE codigo=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ejemplar.getLibro().getIdLibro());
            ps.setInt(2, ejemplar.getEstado());
            ps.setInt(3, ejemplar.getCodigo());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ejemplar modificado");

            } else {
                JOptionPane.showMessageDialog(null, "El ejemplar no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ejemplar");
        }
    }
    
    // Para eliminar el estado se establece en 4
    // Para prestar el estado es 1
    // Para devolución el estado es 0
    public void modificarEstadoEjemplar(int codigo, int estado){
         String sql = "UPDATE ejemplar SET estado=? WHERE codigo=?";
         PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estado);
            ps.setInt(2, codigo);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Estado de ejemplar modificado");

            } else {
                JOptionPane.showMessageDialog(null, "El ejemplar no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ejemplar");
        }
    }
    
    public Ejemplar buscarEjemplar(int id) {
        String sql = "SELECT * FROM ejemplar WHERE codigo= ?";
        Ejemplar ejemplar = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ejemplar = new Ejemplar();
                ejemplar.setCodigo(id);
                ejemplar.setLibro(libroD.buscarLibro(rs.getInt("idLibro")));
                ejemplar.setEstado(rs.getInt("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "Ejemplar no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ejemplar");
        }
        return ejemplar;
    }
    
    // Trae un único ejemplar por cada libro, que esté disponible
    public List<Ejemplar> listarEjemplares(){
        String sql = "SELECT ej.codigo, ej.idLibro, ej.estado FROM ejemplar as ej "
                + "WHERE idLibro in (SELECT e.idLibro FROM ejemplar AS e JOIN libro AS l ON l.idLibro = e.idLibro "
                + "WHERE e.estado = 0) GROUP BY idLibro";
        
        ArrayList<Ejemplar> ejemplares = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ejemplar ejemplar = new Ejemplar();

                ejemplar.setCodigo(rs.getInt("codigo"));
                ejemplar.setLibro(libroD.buscarLibro(rs.getInt("idLibro")));
                ejemplar.setEstado(0);

                ejemplares.add(ejemplar);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ejemplares");
        }
        return ejemplares;
    }
    
}
