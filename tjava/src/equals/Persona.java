package equals;

public class Persona {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public Persona(String nombre) {
        super();
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Persona p= (Persona)obj;

        return p.getNombre().equals(this.getNombre());

    }

}