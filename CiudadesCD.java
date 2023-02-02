import java.util.ArrayList;

/*
 * CiudadesCD
 * 
 * Muestra por pantalla un ArrayList de ciudades (Madrid, Sevilla, Mérida, Murcia). Confirma si 
 * "Mérida" se encuentra en la lista, si es que si la elimina y muestra cuantas ciudades quedan.
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación 01/02/2023
 */
public class CiudadesCD {
    public static void main(String[] args) {

        ArrayList<String> ciudad = new ArrayList<String>();

        ciudad.add("Madrid");
        ciudad.add("Sevilla");
        ciudad.add("Mérida");
        ciudad.add("Murcia");

        for (String lista : ciudad) {
            System.out.print(lista + "  ");
            // Imprime todas las ciudades
        }

        System.out.println(); // Crea un espacio entre la lista y la pregunta
        System.out.println("¿La lista contiene 'Mérida'?");

        if (ciudad.contains("Mérida") == true) {
            // Verifica si Mérida está en la lista
            System.out.println(ciudad.contains("Mérida"));
            // Devuelve true porque está en la lista
            System.out.println("Entonces la eliminamos de la lista");
            ciudad.remove("Mérida");
            // Elimina la ciudad
            System.out.println("En este momento hay " + ciudad.size() + " ciudades.");
            // Imprime el tamaño del ArrayList
        } else {
            System.out.println("Mérida no está en la Lista.");
        }
    }
}
