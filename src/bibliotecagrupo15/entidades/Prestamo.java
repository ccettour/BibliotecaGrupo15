package bibliotecagrupo15.entidades;

import bibliotecagrupo15.accesoADatos.EjemplarData;
import java.time.LocalDate;

public class Prestamo {
    
    private int idPrestamo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Ejemplar ejemplar;
    private Lector lector;
    private boolean estado;

    EjemplarData ed = new EjemplarData();
    
    public Prestamo() {
    }

    public Prestamo(LocalDate fechaInicio, LocalDate fechaFin, Ejemplar ejemplar, Lector lector, boolean estado) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.estado = estado;
    }

    public Prestamo(int idPrestamo, LocalDate fechaInicio, LocalDate fechaFin, Ejemplar ejemplar, Lector lector, boolean estado) {
        this.idPrestamo = idPrestamo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.estado = estado;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void solicitarLibro(Ejemplar a, Lector i) {
        ed.modificarEstadoEjemplar(a.getCodigo(), 1);
    }

    public void devolverLibro(Ejemplar a, Lector i) {
        ed.modificarEstadoEjemplar(a.getCodigo(), 0);
    }

    @Override
    public String toString() {
        return "" + idPrestamo + ", " + lector +", " + fechaInicio + ", " + fechaFin  ;
    }
    
    
}
