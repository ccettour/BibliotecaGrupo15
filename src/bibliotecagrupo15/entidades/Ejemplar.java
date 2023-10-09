package bibliotecagrupo15.entidades;

public class Ejemplar {
    int codigo;
    Libro libro;
    int estado; //0=disponible, 1=prestado, 2=retraso, 3=reparación, 4=eliminado

    public Ejemplar(Libro libro, int estado) {
        this.libro = libro;
        this.estado = estado;
    }

    public Ejemplar() {
    }

    public Ejemplar(int codigo, Libro libro, int estado) {
        this.codigo = codigo;
        this.libro = libro;
        this.estado = estado;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "" + codigo + " - " + libro.getTitulo();
    }
    
    

}
