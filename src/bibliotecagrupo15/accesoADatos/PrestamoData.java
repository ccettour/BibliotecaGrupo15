package bibliotecagrupo15.accesoADatos;

import bibliotecagrupo15.entidades.Ejemplar;
import bibliotecagrupo15.entidades.Lector;
import bibliotecagrupo15.entidades.Prestamo;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
                pres.setIdPrestamo(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Prestamo creado con exito");
             }
             ps.close();
             
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de prestamos");
         }
     
     }
     
    
     
     public List<Lector> ListarLectoresxFecha(LocalDate fecha, int idLector){
     ArrayList<Lector> lectores=new ArrayList<>();
     String sql="SELECT lec.idLector, nroSocio, lec.nombre, mail "
             + "FROM `lector` AS lec JOIN prestamo "
             + "ON lec.idLector=prestamo.idLector WHERE prestamo.idPrestamo=?";
         try {
              PreparedStatement ps= con.prepareStatement(sql);
              ps.setInt(1, idLector);
              ResultSet rs=ps.executeQuery();
             if (fecha.isAfter(rs.getDate("fechaFin").toLocalDate())) {
                 while (rs.next()) {                     
                     Lector lector= new Lector();
                     
                 }
   
             }
             
             
             
         } catch (SQLException ex) {
             Logger.getLogger(PrestamoData.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     
     }
     
     
     public List<Ejemplar> ListarLibrosxFecha(LocalDate fecha, int idEjemplar){
     ArrayList<Ejemplar> ejemplares=new ArrayList<>();
     String sql="";
         try {
              PreparedStatement ps= con.prepareStatement(sql);
              ps.setInt(1, idEjemplar);
              ResultSet rs=ps.executeQuery();
             
             
             
             
         } catch (SQLException ex) {
             Logger.getLogger(PrestamoData.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     
     }
     
}
