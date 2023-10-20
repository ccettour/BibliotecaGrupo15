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
        EjemplarData ed = new EjemplarData();
        LectorData lecd = new LectorData();
        PrestamoData pd = new PrestamoData();
        
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
        /*for (Autor a : ad.ListarAutores()) {
            System.out.println(a);
        }*/
        
        
        //CREAR LIBRO
        Libro libro = new Libro(48146417, "Fundamentos de sistemas operativos", ad.buscarAutor(1), 2005, Tipo.INFORMÁTICA, "Mcgraw-Hill", true);
        Libro libro1 = new Libro(78290850, "Fundamentos de Sistemas de Bases de Datos", ad.buscarAutor(3), 2007, Tipo.INFORMÁTICA, "Addison-Wesley", true);
        Libro libro2 = new Libro(97860715, "Fundamentos de Programacion", ad.buscarAutor(2), 2020, Tipo.INFORMÁTICA, "Mcgraw-Hill", true);
        Libro libro3 = new Libro(98752277, "Martin Fierro", ad.buscarAutor(4), 2010, Tipo.LITERATURA, "Visor", true);
        Libro libro4 = new Libro(96844431, "Sistemas operativos", ad.buscarAutor(1), 2000, Tipo.INFORMÁTICA, "ADDISON WESLEY LONGMAN", true);
        Libro libro5 = new Libro(97884291, "Sistemas operativos. Conceptos fundamentales", ad.buscarAutor(1), 1994, Tipo.INFORMÁTICA, "Editorial Reverté", true);
        //ld.guardarLibro(libro);
//        ld.guardarLibro(libro1);
//        ld.guardarLibro(libro2);
//        ld.guardarLibro(libro3);
//        ld.guardarLibro(libro4);
//        ld.guardarLibro(libro5);
        
        
        //MODIFICAR LIBRO
        Libro modif = new Libro(5,48146417, "Fundamentos de sistemas operativos", ad.buscarAutor(1), 2005, Tipo.INFORMÁTICA, "McGraw Hill", true);
        //ld.modificarLibro(modif);
        
        
        //BUSCAR LIBRO
        //System.out.println(ld.buscarLibro(8));
        
        
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
        
        
        //CREAR EJEMPLAR
        Ejemplar ejemplar = new Ejemplar(ld.buscarLibro(15), 0);
        Ejemplar ejemplar1 = new Ejemplar(ld.buscarLibro(15),0);
        Ejemplar ejemplar2 = new Ejemplar(ld.buscarLibro(15),0);
        Ejemplar ejemplar3 = new Ejemplar(ld.buscarLibro(16),0);
        Ejemplar ejemplar4 = new Ejemplar(ld.buscarLibro(16),0);
        Ejemplar ejemplar5 = new Ejemplar(ld.buscarLibro(16),2);
//        ed.crearEjemplar(ejemplar);
//        ed.crearEjemplar(ejemplar1);
//        ed.crearEjemplar(ejemplar2);
//        ed.crearEjemplar(ejemplar3);
//        ed.crearEjemplar(ejemplar4);
//        ed.crearEjemplar(ejemplar5);

        
        /*for (Ejemplar e : ed.listarEjemplares()) {
            System.out.println(e);
        }*/
        
        Lector lector = new Lector("Mario", "Urquiza 125", "mario@mail.com", true);
        Lector lector1 = new Lector("Luigi", "Estrada 27", "luigi@mail.com", true);
        
        //lecd.guardarLector(lector);
        //lecd.guardarLector(lector1);
        
        Prestamo prestamo = new Prestamo(LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 8), ed.buscarEjemplar(5), lecd.buscarLector(1), true);
        Prestamo prestamo1 = new Prestamo(LocalDate.of(2023, 9, 18), LocalDate.of(2023, 10, 10), ed.buscarEjemplar(7), lecd.buscarLector(2), true);
    
        //pd.crearPrestamo(prestamo);
        //pd.crearPrestamo(prestamo1);
        
        /*
        for (Lector l : pd.ListarLectoresxFechaVencida()) {
            System.out.println(l);
        }
        */
        
    }
    
}
