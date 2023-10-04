package bibliotecagrupo15;

import bibliotecagrupo15.accesoADatos.*;
import bibliotecagrupo15.entidades.Lector;
import java.sql.*;

public class BibliotecaGrupo15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
    
    
   
    Lector lector=new Lector(12323,"Carlos Perez","San Martin 820","Carlos@gmail.com",true);
   LectorData ld=new LectorData(); 
  // ld.guardarLector(lector);
ld.eliminarLector(lector);
    }  
}
