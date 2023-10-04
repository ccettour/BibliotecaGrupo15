package bibliotecagrupo15.accesoADatos;

import java.sql.*;

import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="bi";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){}
    
    public static Connection getConexion(){
    if(connection==null){
    
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
            
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
           
        } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
        }
    }
        return connection;
        
    }
}
