package bibliotecagrupo15.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Autor {
    private int idAutor;
    private String identificacion;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private boolean estado;

    public Autor() {
    }

    public Autor(String identificacion, LocalDate fechaNacimiento, String nacionalidad, boolean estado) {
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.estado = estado;
    }

    public Autor(int idAutor, String identificacion, LocalDate fechaNacimiento, String nacionalidad, boolean estado) {
        this.idAutor = idAutor;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.estado = estado;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return ""+identificacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.identificacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        return Objects.equals(this.identificacion, other.identificacion);
    }
    
    
}
