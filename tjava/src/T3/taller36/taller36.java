package T3.taller36;

import java.util.Scanner;

public class taller36 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int eleccion;
        String nombre, organizacion, telefono;
        Agenda agendatelefonica = new Agenda();
        Contacto c = null;

        while (!salir) {
            System.out.println("1. Aniadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            System.out.println("Escribe una de las opciones");
            eleccion = sn.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Escribe nombre ");
                    nombre=sn.next();
                    System.out.println("Escriba telefono");
                    telefono=sn.next();
                    System.out.println("Escriba organizacion");
                    organizacion=sn.next();
                    c=new Contacto(nombre, telefono, organizacion);
                    agendatelefonica.aniadirContacto(c);
                    break;
                case 2:
                    System.out.println("Escribe nombre ");
                    nombre=sn.next();
                    agendatelefonica.buscarnombre(nombre);
                    break;
                case 3:
                    System.out.println("Escribe nombre ");
                    nombre=sn.next();
                    c=new Contacto(nombre);

                    agendatelefonica.eliminarcontacto(c);
                    break;
                case 4:
                    agendatelefonica.listarcontacto();
                    break;
                case 5:
                    salir = true;
                default:
                    System.out.println("Solo numeros entre 1 y 5");
            }
        }
    }
}

