package bibliotecagrupo15.entidades;

public class Lector {

    private int socio;
    private String nombre;
    private String domicilio;
    private String mail;
    private boolean estado;

    public Lector() {
    }

    public Lector(String nombre, String domicilio, String mail, boolean estado) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.mail = mail;
        this.estado = estado;
    }

    public Lector(int socio, String nombre, String domicilio, String mail, boolean estado) {
        this.socio = socio;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.mail = mail;
        this.estado = estado;
    }

    public int getSocio() {
        return socio;
    }

    public void setSocio(int socio) {
        this.socio = socio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void activarLector(Lector II) {
        estado = true;
    }

    public void desactivarLector(Lector I) {
        estado = false;

    }

    @Override
    public String toString() {
        return  socio + nombre + domicilio+  mail;
    }
    
    
}