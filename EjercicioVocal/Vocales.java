package EjercicioVocal;
import java.util.HashMap;

public class Vocales {
    private HashMap<Character, Integer> contadorVocales;

    public Vocales() {
        contadorVocales = new HashMap<>();
        contadorVocales.put('a', 0);
        contadorVocales.put('e', 0);
        contadorVocales.put('i', 0);
        contadorVocales.put('o', 0);
        contadorVocales.put('u', 0);
    }

    public void contarVocales(String oracion) {
        oracion = oracion.toLowerCase();
        for (int i = 0; i < oracion.length(); i++) {
            char letra = oracion.charAt(i);
            if (contadorVocales.containsKey(letra)) {
                contadorVocales.put(letra, contadorVocales.get(letra) + 1);
            }
        }
    }

    public HashMap<Character, Integer> getContadorVocales() {
        return contadorVocales;
    }

    public static void main(String[] args) {
        Vocales vocales = new Vocales();
        System.out.print("Introduce una oración: ");
        String oracion = System.console().readLine();
        vocales.contarVocales(oracion);
        System.out.println("Contador de vocales: " + vocales.getContadorVocales());
    }
}