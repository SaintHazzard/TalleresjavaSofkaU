package T3.taller36;


public class Contacto {
    private String nombre;
    private String organizacion;
    private String telefono;

    public Contacto(String nombre, String telefono, String organizacion) {
        this.nombre = nombre;
        this.organizacion = organizacion;
        this.telefono = telefono;
    }

    public Contacto(String nombre) {
        this.nombre = nombre;
        this.organizacion = null;
        this.telefono = null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizacion() {
        return this.organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean equals(Contacto c) {
        return this.telefono.equalsIgnoreCase(c.getTelefono());
    }

    public boolean equals1(Contacto c) {
        return this.nombre.equalsIgnoreCase(c.getNombre());
    }

    public String toString() {
        return "nombre= " + this.nombre + ", organizacion='" + this.organizacion + "', telefono=" + this.telefono;
    }
}
