package T3.taller37;

public class atributos {
    private String placa, marca, nombre;
    private int telefono;

    public atributos(String placa, String marca, String nombre, int telefono) {
        this.placa = placa;
        this.marca = marca;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public atributos(String placa, String nombre) {
        this.placa = placa;

        this.nombre = nombre;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public boolean equalsplaca (atributos c){
        if(this.placa.equalsIgnoreCase(c.getPlaca())){
            return true;
        }
        return false;
    }
    public boolean equalsnombre (atributos c){
        if(this.nombre.equalsIgnoreCase(c.getNombre())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vehiculo registrado en el parqueadero: "+ "\n" + marca + " con placa " + placa;

    }

}
