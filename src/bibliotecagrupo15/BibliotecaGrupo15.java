package bibliotecagrupo15;

import bibliotecagrupo15.accesoADatos.*;
import bibliotecagrupo15.entidades.*;
import java.time.LocalDate;

public class BibliotecaGrupo15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LibroData ld = new LibroData();
        AutorData ad = new AutorData();
        
        //CREAR AUTOR
        Autor silberschatz=new Autor("Abraham Silberschatz",LocalDate.of(1947, 5, 1),"Estadounidense",true);
        Autor elmasri =new Autor("Ramez A. Elmasri",LocalDate.of(1950, 10, 20),"Egipcio",true);
        Autor aguilar=new Autor("Luis Joyanes Aguilar",LocalDate.of(1948, 2, 19),"Español",true);
        Autor hernandez=new Autor("José Hernández",LocalDate.of(1834, 11, 10),"Argentino",true);

        //ad.guardarAutor(silberschatz);
        //ad.guardarAutor(aguilar);
        //ad.guardarAutor(elmasri);
        //ad.guardarAutor(hernandez);
        
        
        //BUSCAR AUTOR
        //System.out.println(ad.buscarAutor(1));
        
        
        //MODIFICAR AUTOR
        Autor modificado=new Autor(2,"Luis Joyanes Aguilar",LocalDate.of(1932, 12, 21),"Español",true);
        //ad.modificarAutor(modificado);
        
        
        //ELIMINAR AUTOR
        //ad.eliminarAutor(2);
        
        
        //LISTAR AUTORES
        for (Autor a : ad.ListarAutores()) {
            System.out.println(a);
        }
        
        
        //CREAR LIBRO
        Libro libro = new Libro(48146417, "Fundamentos de sistemas operativos", ad.buscarAutor(1), 2005, "informática", "Mcgraw-Hill", 5, true);
        Libro libro1 = new Libro(78290850, "Fundamentos de Sistemas de Bases de Datos", ad.buscarAutor(3), 2007, "informática", "Addison-Wesley", 4, true);
        Libro libro2 = new Libro(97860715, "Fundamentos de Programacion", ad.buscarAutor(2), 2020, "informática", "Mcgraw-Hill", 6, true);
        Libro libro3 = new Libro(98752277, "Martin Fierro", ad.buscarAutor(4), 2010, "poesía", "Visor", 10, true);
        Libro libro4 = new Libro(96844431, "Sistemas operativos", ad.buscarAutor(1), 2000, "informática", "ADDISON WESLEY LONGMAN", 3, true);
        Libro libro5 = new Libro(97884291, "Sistemas operativos. Conceptos fundamentales", ad.buscarAutor(1), 1994, "informática", "Editorial Reverté", 2, true);
        //ld.guardarLibro(libro);
        //ld.guardarLibro(libro1);
        //ld.guardarLibro(libro2);
        //ld.guardarLibro(libro3);
        //ld.guardarLibro(libro4);
        //ld.guardarLibro(libro5);
        
        
        //MODIFICAR LIBRO
        Libro modif = new Libro(5,48146417, "Fundamentos de sistemas operativos", ad.buscarAutor(1), 2005, "informática", "McGraw Hill", 3, true);
        //ld.modificarLibro(modif);
        
       
        //ELIMINAR/DESHABILITAR LIBRO
        //ld.deshabilitarLibro(8);
        
        
        //LISTAR LIBROS
        /*for (Libro l : ld.listarLibros()) {
            System.out.println(l);
        }*/
        
        
        //HABILITAR LIBRO
        //ld.habilitarLibro(8);
        
        
        //LISTAR LIBROS POR AUTOR
        /*for (Libro l : ld.listarLibrosXAutor(ad.buscarAutor(1))) {
            System.out.println(l);
        }*/
    }
    
}
