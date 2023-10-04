package bibliotecagrupo15.accesoADatos;

import bibliotecagrupo15.entidades.Lector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LectorData {

    private Connection con = null;

    public LectorData() {
        con = Conexion.getConexion();

    }

    public void guardarLector(Lector lector) {
        String sql = "INSERT INTO lector(nroSocio,nombre,domicilio,mail,estado)"
                + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, lector.getSocio());
            ps.setString(2, lector.getNombre());
            ps.setString(3, lector.getDomicilio());
            ps.setString(4, lector.getMail());
            ps.setBoolean(5, lector.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                lector.setIdLector(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Lector añadido con exito");
            }
            ps.close();
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + x.getMessage());

        }
    }

    public void modificarLector(Lector lector) {
        String sql = "UPDATE lector SET nombre=?,domicilio=?,mail=?,estado=? WHERE nroSocio=?";
        PreparedStatement ps = null;
        try {

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

    public void eliminarLector(Lector lector) {
        try {
            String sql = "UPDATE lector SET estado=0 WHERE nroSocio=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,lector.getSocio());
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el lector");
            }
            ps.close();

        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + x.getMessage());

        }

    }
}
