package bibliotecagrupo15.accesoADatos;

import bibliotecagrupo15.entidades.Lector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LectorData {

    private Connection con = null;

    public LectorData() {
        con = Conexion.getConexion();

    }

    public void guardarLector(Lector lector) {
        String sql = "INSERT INTO lector(nombre,domicilio,mail,estado)"
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, lector.getNombre());
            ps.setString(2, lector.getDomicilio());
            ps.setString(3, lector.getMail());
            ps.setBoolean(4, lector.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                lector.setSocio(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Lector añadido con exito");
            }
            ps.close();
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + x.getMessage());

        }
    }

    public Lector buscarLector(int nroSocio) {

        String sql = "SELECT nombre,domicilio,mail FROM lector WHERE nroSocio=? AND estado=1";
        Lector lector = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroSocio);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lector = new Lector();
                lector.setSocio(nroSocio);
                lector.setNombre("nombre");
                lector.setDomicilio("domicilio");
                lector.setMail("mail");
                lector.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el lector");
            }
            ps.close();
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + x.getMessage());
        }
        return lector;
    }

    
    public List<Lector> listarLectoresActivos() {
        String sql = "SELECT* FROM lector WHERE estado=1";
        ArrayList<Lector> lectores = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lector lector = new Lector();
                lector.setSocio(rs.getInt("nroSocio"));
                lector.setNombre(rs.getString("nombre"));
                lector.setDomicilio(rs.getString("domicilio"));
                lector.setMail(rs.getString("mail"));
                lector.setEstado(true);
                lectores.add(lector);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        return lectores;
    }
           public List<Lector> listarLectoresInactivos() {
        String sql = "SELECT* FROM lector WHERE estado=0";
        ArrayList<Lector> lectores = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lector lector = new Lector();
                lector.setSocio(rs.getInt("nroSocio"));
                lector.setNombre(rs.getString("nombre"));
                lector.setDomicilio(rs.getString("domicilio"));
                lector.setMail(rs.getString("mail"));
                lector.setEstado(true);
                lectores.add(lector);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        return lectores;
    }
    

    public void modificarLector(Lector lector) {

        try {
            String sql = "UPDATE lector SET nombre=?,domicilio=?,mail=?,estado=? WHERE nroSocio=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, lector.getNombre());
            ps.setString(2, lector.getDomicilio());
            ps.setString(3, lector.getMail());
            ps.setBoolean(4, lector.isEstado());
            ps.setInt(5, lector.getSocio());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Lector modificado");
            } else {
                JOptionPane.showMessageDialog(null, "El lector no existe");
            }
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + x.getMessage());
        }
    }

    public void eliminarLector(int nroSocio) {
        try {
            String sql = "UPDATE lector SET estado=0 WHERE nroSocio=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,nroSocio);
            int exito= ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el lector");
            }
            ps.close();

        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + x.getMessage());
        }
    }
    
 

}
