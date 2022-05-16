package T3.taller36;


public class Contacto {
private String nombre, organizacion, telefono;


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
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public boolean equals (Contacto c){
        if(this.telefono.equalsIgnoreCase(c.getTelefono())){
            return true;
        }
        return false;

    }
    public boolean equals1 (Contacto c){
        if(this.nombre.equalsIgnoreCase(c.getNombre())){
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", organizacion='" + organizacion + '\'' + ", telefono=" + telefono;

    }
}

