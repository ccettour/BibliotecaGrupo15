package bibliotecagrupo15.entidades;

import bibliotecagrupo15.Tipo;

public class Libro {

    private int idLibro;
    private int isbn;
    private String titulo;
    private Autor autor;
    private int anio;
    private Tipo tipo;
    private String editorial;
    private boolean estado;

    public Libro() {
    }

    public Libro(int isbn, String titulo, Autor autor, int anio, Tipo tipo, String editorial, boolean estado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.tipo = tipo;
        this.editorial = editorial;
        this.estado = estado;
    }

    public Libro(int idLibro, int isbn, String titulo, Autor autor, int anio, Tipo tipo, String editorial, boolean estado) {
        this.idLibro = idLibro;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.tipo = tipo;
        this.editorial = editorial;
        this.estado = estado;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "" + titulo + ", " + autor + ", " + anio;
    }
    
    
}
