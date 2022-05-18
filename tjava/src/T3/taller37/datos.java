package T3.taller37;

import T3.taller36.Contacto;

public class datos {

    private atributos [] stats;

    public datos(){
        this.stats = new atributos[5];
    }

    public void aniadircarro (atributos c){
        if(existecarro(c)){
            System.out.println("Vehiculo ya registrado");}
        else if (parqueaderolleno()){

            } else {
                boolean encontrado = false;
                for (int i = 0; i < stats.length & !encontrado; i++) {
                    if (stats[i] == null) {
                        stats[i] = c;
                        encontrado = true;
                    }
                }
                if (encontrado) {
                    System.out.println("Vehiculo registrado");
                } else {
                    System.out.println("No se pudo registrar");
                }
            }

        }


    public boolean existecarro(atributos c) {
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] != null && c.equals(stats[i])) {
                return true;
            }
        }
        return false;
    }
    public void listarvehiculos() {
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] != null) {
                System.out.println(stats[i]);
            }
        }
    }
    public void buscarplaca(String placa) {
        boolean encontrado = false;
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] != null && stats[i].getPlaca().equalsIgnoreCase(placa)) {
                System.out.println("Vehiculo encontrado con placa " + stats[i].getPlaca());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro la placa");
        }
    }
    public void retirarvehiculo(atributos c) {
        boolean encontrado = false;
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] != null && stats[i].equalsnombre(c) && stats[i].equalsplaca(c)) {
                stats[i]=null;
                encontrado =true;
            }
        }
        if (!encontrado){
            System.out.println("Datos incorrectos, no se puede retirar el vehiculo");
        } else {System.out.println("Vehiculo retirado");
        }
    }
    public boolean parqueaderolleno() {
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] == null) {
                return false;
            }
        }
        return true;
    }

}
