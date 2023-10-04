package bibliotecagrupo15.entidades;

public class Ejemplar {
 int idEjemplar;   
 int codigo;
 Libro libro;
 boolean estado;

    public Ejemplar(int idEjemplar, int codigo, Libro libro, boolean estado) {
        this.idEjemplar = idEjemplar;
        this.codigo = codigo;
        this.libro = libro;
        this.estado = estado;
    }

    public Ejemplar(int codigo, Libro libro, boolean estado) {
        this.codigo = codigo;
        this.libro = libro;
        this.estado = estado;
    }

    public Ejemplar() {
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
 
}
