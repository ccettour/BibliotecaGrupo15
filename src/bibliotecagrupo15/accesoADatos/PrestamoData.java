package bibliotecagrupo15.accesoADatos;

import bibliotecagrupo15.entidades.Prestamo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PrestamoData {
     private Connection con = null;
     private LectorData ld= new LectorData();
     private EjemplarData ed= new EjemplarData();
     
     public PrestamoData(){
     con = Conexion.getConexion();
     }
     
     public void crearPrestamo(Prestamo pres){
     String sql="INSERT INTO `prestamo`(fechaInicio, fechaFin, estado, idEjemplar , idLector) "
             + "VALUES (?,?,?)";
     
         try {
             PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setDate(1, Date.valueOf(pres.getFechaInicio()));
             ps.setDate(2, Date.valueOf(pres.getFechaFin()));
             ps.setBoolean(3, true);
             ps.executeUpdate();
             ResultSet rs=ps.getGeneratedKeys();
             if (rs.next()) {
                pres.setIdInscripcion(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Prestamo creado con exito");
             }
             ps.close();
             
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de prestamos");
         }
     
     }
     
     
     
}
