package T3.taller38;

public class registro {
    private cliente[] clientes;

    public registro() {
        this.clientes = new cliente[8];
    }


    public void aniadircliente(cliente c) {
        boolean encontrado = false;
        for (int i = 0; i < clientes.length && !encontrado; i++) {
            if (clientes[i] == null) {
                clientes[i] = c;
                encontrado = true;

            }
        }
        if (encontrado) {
            System.out.println("Cliente registrado");
        }

    }

    public void buscarnombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].getNombre().equalsIgnoreCase(nombre)) {
                if (Boolean.parseBoolean("true")) {
                    System.out.println(clientes[i].getNombre() + " estado del curso aprobado ");
                }
                if (Boolean.parseBoolean("false")) {
                    System.out.println(clientes[i].getNombre() + " estado del curso reprobado ");
                }
            }
        }
    }



        public void listarclientes () {
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] != null) {
                    System.out.println(clientes[i]);
                }
            }
        }

        public boolean existeContacto (cliente c){
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i] != null && c.equals(clientes[i])) {
                    return true;
                }
            }
            return false;
        }
    }






