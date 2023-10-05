package bibliotecagrupo15.accesoADatos;

import bibliotecagrupo15.entidades.Libro;
import bibliotecagrupo15.entidades.Lector;
import bibliotecagrupo15.entidades.Prestamo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PrestamoData {

    private Connection con = null;
    private LectorData ld = new LectorData();
    private EjemplarData ed = new EjemplarData();

    public PrestamoData() {
        con = Conexion.getConexion();
    }

    public void crearPrestamo(Prestamo pres) {
        String sql = "INSERT INTO `prestamo`(fechaInicio, fechaFin, estado, idEjemplar , idLector) "
                + "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(pres.getFechaInicio()));
            ps.setDate(2, Date.valueOf(pres.getFechaFin()));
            ps.setBoolean(3, true);
            ps.setInt(4, pres.getEjemplar().getIdEjemplar());
            ps.setInt(5, pres.getLector().getIdLector());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pres.setIdPrestamo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Prestamo creado con exito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de prestamos");
        }

    }

//    modificar
    public void modificarprestamo(Prestamo prestamo) {
        String sql = "UPDATE `prestamo` SET `fechaInicio`=? ,`fechaFin`=?,`idEjemplar`=?,`idLector`=?,"
                + "`estado`=? WHERE idPrestamo=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(prestamo.getFechaInicio()));
            ps.setDate(2, Date.valueOf(prestamo.getFechaFin()));
            ps.setInt(3, prestamo.getEjemplar().getIdEjemplar());
            ps.setInt(4, prestamo.getLector().getIdLector());
            ps.setBoolean(5, prestamo.isEstado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Prestamo modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Prestamo inexistente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de prestamos");
        }

    }

//    eliminar
    public void cancelarPrestamo(int id) {
        String sql = "UPDATE `prestamo` SET `estado`= 0 WHERE idPrestamo=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Prestamo cancelado con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Prestamo inexistente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de prestamos");
        }

    }

//    listar
    public List<Prestamo> ListarPrestamos() {
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        String sql = "SELECT * FROM `prestamo` WHERE estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Prestamo pres = new Prestamo();
                pres.setIdPrestamo(rs.getInt("idPrestamo"));
                pres.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                pres.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                pres.setEstado(rs.getBoolean("estado"));
                pres.setLector(ld.buscarLector(rs.getInt("idLector")));
                pres.setEjemplar(ejemplar);
                prestamos.add(pres);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de prestamos");
        }

        return prestamos;
    }

    public List<Lector> ListarLectoresxFechaVencida() {
        ArrayList<Lector> lectores = new ArrayList<>();
        String sql = "SELECT lec.idLector, nroSocio, lec.nombre, mail "
                + "FROM `lector` AS lec JOIN prestamo "
                + "ON lec.idLector=prestamo.idLector WHERE prestamo.fechaFin<date(now())";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Lector lector = new Lector();
                lector.setIdLector(rs.getInt("idLector"));
                lector.setDomicilio(rs.getString("domicilio"));
                lector.setMail(rs.getString("mail"));
                lector.setNombre(rs.getString("nombre"));
                lector.setSocio(rs.getInt("nroSocio"));
                lector.setEstado(rs.getBoolean("estado"));
                lectores.add(lector);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de prestamos");
        }
        return lectores;
    }

    public List<Libro> ListarLibrosxFecha(Date fecha, int idEjemplar) {
        ArrayList<Libro> libros = new ArrayList<>();
        String sql = "SELECT lib.titulo, lib.isbn, lib.editorial, lib.anio "
                + "FROM `libro` AS lib "
                + "JOIN ejemplar ON ejemplar.idLibro=lib.idLibro "
                + "JOIN prestamo ON prestamo.idEjemplar = ejemplar.idEjemplar"
                + "WHERE prestamo.fechaInicio=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, fecha);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Libro libro = new Libro();
                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setAnio(rs.getInt("anio"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setEstado(rs.getBoolean("estado"));

                libros.add(libro);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de prestamos");
        }
        return libros;
    }

}
