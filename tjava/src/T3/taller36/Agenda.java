package T3.taller36;



public class Agenda {
    private Contacto[] contactos;

    public Agenda() {
        this.contactos = new Contacto[2];

    }

    public void aniadirContacto(Contacto c) {
        if(existeContacto(c)){
            System.out.println("El contacto ya existe");
        } else if (agendallena()){
            System.out.println("Agenda llena");
        }
        else {boolean encontrado = false;
            for (int i = 0; i < contactos.length & !encontrado; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;
                    encontrado = true;
                }
            }
            if (encontrado) {
                System.out.println("Contacto aniadido");
            } else {
                System.out.println("No se pudo aniadir");
            }
        }

        }





    public boolean existeContacto(Contacto c) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && c.equals(contactos[i])) {
                return true;
            }
        }
        return false;
    }

    public void listarcontacto() {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null) {
                System.out.println(contactos[i]);
            }
        }
    }

    public void buscarnombre(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado, el telefono es " + contactos[i].getTelefono());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro el contacto");
        }
    }

    public boolean agendallena() {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void eliminarcontacto(Contacto c) {
        boolean encontrado = false;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].equals1(c)) {
                contactos[i]=null;
                encontrado =true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontro contacto");
        }
    }
}








