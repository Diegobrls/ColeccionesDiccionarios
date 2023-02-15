import java.util.HashMap;
import java.util.Map;

public class Cola {
    public static void main(String[] args) {
        HashMap<String, Boolean> cola = new HashMap<String, Boolean>();
        cola.put("Jose Maria", false);
        cola.put("Susana", true);
        cola.put("Pedrito", false);
        cola.put("Jhonny Jhon", true);

        System.out.println("En la cola ahora mismo están estas personas: ");
        imprimirCola(cola);

        while (!cola.isEmpty()) {
            String Cliente = null;
            boolean ClienteGuardado = false;

            // Buscamos al primer cliente que tenga reserva
            for (Map.Entry<String, Boolean> buscar : cola.entrySet()) {
                if (buscar.getValue() == true) {
                    Cliente = buscar.getKey();
                    ClienteGuardado = true;
                    cola.remove(buscar.getKey());
                    break;
                }
            }

            // Si no hay ningún cliente con reserva, atendemos al primer cliente en la cola
            if (Cliente == null) {
                for (Map.Entry<String, Boolean> buscar : cola.entrySet()) {
                    Cliente = buscar.getKey();
                    ClienteGuardado = false;
                    cola.remove(buscar.getKey());
                    break;
                }
            }

            System.out.println("Atendiendo al cliente " + Cliente + " (con reserva: " + ClienteGuardado + ")");
            System.out.println("Cola actual:");
            imprimirCola(cola);
        }
    }

    public static void imprimirCola(HashMap<String, Boolean> cola) {
        for (Map.Entry<String, Boolean> buscar : cola.entrySet()) {
            System.out.println("- " + buscar.getKey() + " (con reserva: " + buscar.getValue() + ")");
        }
    }
}
