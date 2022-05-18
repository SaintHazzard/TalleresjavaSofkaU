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

    public void consultarcliente(String nombre){
        for (int i=0; i<clientes.length;i++){
            if (clientes[i]!=null && clientes[i].equalsnombre(nombre)){
                System.out.println(clientes[i].getNombre()+" tiene el curso " + clientes[i].isEstado());

            }
        }
    }

    public void listarclientes() {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                System.out.println(clientes[i]);
            }
        }
    }

}
