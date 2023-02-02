import java.util.ArrayList;
/*
 * CiudadesCD
 * 
 * Partiendo del taller 2:
 *  - Crea una segunda coleccion con Toledo, Valencia, Valladolid y Sevilla
 *  - Muestra la lista de ciudades de la segunda coleccion
 *  - Muestra las ciudades que estan en la 1 o en la 2
 *  - Muestra las que estan en la 1 y en la 2
 *  - Muestra por pantalla las ciudades que están en la 1 pero no en la 2
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación 02/02/2023
 */
public class CiudadesTaller3 {
    public static void main(String[] args) {

        ArrayList<String> ciudad = new ArrayList<String>();

        ciudad.add("Madrid");
        ciudad.add("Sevilla");
        ciudad.add("Mérida");
        ciudad.add("Murcia");

        System.out.println(ciudad);

        ArrayList<String> ciudadExtra = new ArrayList<String>();

        ciudadExtra.add("Toledo");
        ciudadExtra.add("Valencia");
        ciudadExtra.add("Valladolid");
        ciudadExtra.add("Sevilla");

        System.out.println(ciudadExtra); //Imprime el segundo arrayList

        System.out.println(); // Crea un espacio entre la lista y la pregunta
        System.out.println("¿La lista contiene 'Mérida'?");

        if (ciudad.contains("Mérida") == true) {// Verifica si Mérida está en la lista
            
            System.out.println(ciudad.contains("Mérida"));// Devuelve true porque está en la lista
            
            System.out.println("Entonces la eliminamos de la lista");
            ciudad.remove("Mérida");// Elimina la ciudad
            
            System.out.println("En este momento hay " + ciudad.size() + " ciudades.");// Imprime el tamaño del ArrayList
            
        } else {
            System.out.println("Mérida no está en la Lista.");
        }

        if (ciudad.contains("Mérida") == false){
            ciudad.add("Mérida"); //Volvemos a añadir Mérida si es que se elimino en el caso anterior
        }

        /*******************COMIENZO DEL TALLER 3 **********************/
        //Apartado 3
        
        //Apartado 4
        ArrayList<String> incluido = new ArrayList<String>();   
        for (String element : ciudad) { 
            if (ciudadExtra.contains(element)) { 
                incluido.add(element); 
            } 
        }   
        System.out.println("Ciudades en la coleccion 1 y 2 " + incluido);
        //Apartado 5
        ArrayList<String> excluido1 = new ArrayList<String>();   
        for (String element : ciudad) { 
            if (!ciudadExtra.contains(element)) { 
                excluido1.add(element); 
            } 
        }   
        System.out.println("Ciudades en la coleccion 1 pero no en la 2 " + excluido1);
    }
}
