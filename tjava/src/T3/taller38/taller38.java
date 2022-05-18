package T3.taller38;



import java.util.Scanner;

public class taller38 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int eleccion, elecestado;
        boolean estado;
        String nombre;
        

        registro registrocliente = new registro();
        cliente c;

        boolean salir = false;

        while (!salir) {
            System.out.println("1. Registrar usuario");
            System.out.println("2. Consultar por nombre de usuario");
            System.out.println("3. Listar");
            System.out.println("4. Salir");
            System.out.println("Escribe una de las opciones");
            eleccion = sn.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Nombre de usuario");
                    nombre=sn.next();
                    System.out.println("Estado del usuario en el curso, 1. Aprobado - 2.Reprobado");
                    elecestado=sn.nextInt();
                    estado = elecestado == 1;
                    c=new cliente(nombre, estado);
                    registrocliente.aniadircliente(c);
                    break;
                case 2:
                    System.out.println("Nombre de usuario");
                    nombre=sn.next();
                    registrocliente.consultarcliente(nombre);
                    break;
                case 3:
                    registrocliente.listarclientes();
                    break;
                case 4:
                    salir=true;
            }
        }
    }
}
