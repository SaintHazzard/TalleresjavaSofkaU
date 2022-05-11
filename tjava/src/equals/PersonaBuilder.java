package equals;

public class PersonaBuilder {
    private String nombre;

    public PersonaBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Persona createPersona() {
        return new Persona(nombre);
    }
}