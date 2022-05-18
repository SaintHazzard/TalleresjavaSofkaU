package T3.taller38;

public class cliente {
    private String nombre;
    private boolean estado;

    public cliente(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean equalsnombre(String c) {
        if (this.nombre.equalsIgnoreCase(getNombre())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (estado) {
            estado = Boolean.parseBoolean("true");
        return "Cliente: " + nombre + " "  +
                ", Estado en el curso: aprobado";}
    else {
        estado = Boolean.parseBoolean("false");}
        return "Cliente: " + nombre + ' ' +
                ", Estado en el curso: reprobado";}


        }



