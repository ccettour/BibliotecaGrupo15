package bibliotecagrupo15.accesoADatos;

import bibliotecagrupo15.Tipo;
import bibliotecagrupo15.entidades.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LibroData {

    private Connection con = null;
    private AutorData autorD = new AutorData();

    public LibroData() {
        con = Conexion.getConexion();
    }

    public void guardarLibro(Libro libro) {
        String sql = "INSERT INTO libro(isbn, titulo, idAutor, anio, tipo, editorial, estado) "
                + "VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, libro.getIsbn());
            ps.setString(2, libro.getTitulo());
            ps.setInt(3, libro.getAutor().getIdAutor());
            ps.setInt(4, libro.getAnio());
            ps.setString(5, libro.getTipo().toString());
            ps.setString(6, libro.getEditorial());
            ps.setBoolean(7, libro.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                libro.setIdLibro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Libro guardado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro");
        }
    }

    public void modificarLibro(Libro libro) {
        String sql = "UPDATE libro SET isbn=?,titulo=?,idAutor=?,anio=?,tipo=?,editorial=?,cantidadEjemplares=? WHERE idLibro=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, libro.getIsbn());
            ps.setString(2, libro.getTitulo());
            ps.setInt(3, libro.getAutor().getIdAutor());
            
            ps.setInt(4, libro.getAnio());
            ps.setString(5, libro.getTipo().toString());
            ps.setString(6, libro.getEditorial());
            ps.setInt(8, libro.getIdLibro());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Libro modificado");

            } else {
                JOptionPane.showMessageDialog(null, "El libro no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro");
        }
    }

    public Libro buscarLibro(int id) {
        String sql = "SELECT * FROM libro WHERE idLibro= ?";
        Libro libro = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                libro = new Libro();
                libro.setIdLibro(id);
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(autorD.buscarAutor(rs.getInt("idAutor")));
                libro.setAnio(rs.getInt("anio"));
                libro.setTipo(Tipo.valueOf(rs.getString("tipo")));
                libro.setEditorial(rs.getString("editorial"));
                libro.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "Libro no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro");
        }
        return libro;
    }
    
    public Libro buscarLibroXIsbn(int isbn) {
        String sql = "SELECT * FROM libro WHERE isbn= ?";
        Libro libro = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, isbn);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                libro = new Libro();
                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(autorD.buscarAutor(rs.getInt("idAutor")));
                libro.setAnio(rs.getInt("anio"));
                libro.setTipo(Tipo.valueOf(rs.getString("tipo")));
                libro.setEditorial(rs.getString("editorial"));
                libro.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "Libro no encontrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro");
        }
        return libro;
    }

    public void deshabilitarLibro(int id) {
        String sql = "UPDATE libro SET estado = 0 WHERE idLibro= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Libro eliminado");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro");
        }
    }

    public void habilitarLibro(int id) {
        String sql = "UPDATE libro SET estado = 1 WHERE idLibro= ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Libro disponible");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro");
        }
    }

    public List<Libro> listarLibros() {
        String sql = "SELECT * FROM libro WHERE estado = 1";
        ArrayList<Libro> libros = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Libro libro = new Libro();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(autorD.buscarAutor(rs.getInt("idAutor")));
                libro.setAnio(rs.getInt("anio"));
                libro.setTipo(Tipo.valueOf(rs.getString("tipo")));
                libro.setEditorial(rs.getString("editorial"));
                libro.setEstado(true);

                libros.add(libro);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libros");
        }
        return libros;
    }

    public List<Libro> listarLibrosXAutor(Autor autor) {
        String sql = "SELECT * FROM libro WHERE estado = 1 AND idAutor=?";
        ArrayList<Libro> libros = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, autor.getIdAutor());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Libro libro = new Libro();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(autor);
                libro.setAnio(rs.getInt("anio"));
                libro.setTipo(Tipo.valueOf(rs.getString("tipo")));
                libro.setEditorial(rs.getString("editorial"));
                libro.setEstado(true);

                libros.add(libro);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libros");
        }
        return libros;
    }
}
