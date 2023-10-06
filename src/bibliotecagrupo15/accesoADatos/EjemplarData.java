package bibliotecagrupo15.accesoADatos;

import bibliotecagrupo15.entidades.*;
import java.sql.*;
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
    
}
