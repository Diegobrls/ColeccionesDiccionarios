import java.util.ArrayList;
import java.util.Random;

class Moneda {
    private int valor;
    private boolean posicion;

    public Moneda(int valor, boolean posicion) {
    this.valor = valor;
    this.posicion = posicion;
    }

    public int getValor() {
    return valor;
    }

    public boolean getPosicion() {
    return posicion;
    }
}

public class Main {
    public static void main(String[] args) {
      // ArrayList para almacenar las monedas generadas
        ArrayList<Moneda> monedas = new ArrayList<>();

      // Objeto Random para generar números aleatorios
        Random random = new Random();

      // Array con los valores posibles de las monedas
        int[] valores = {1, 2, 5, 10, 25, 50, 100, 200};

      // Variables para almacenar el valor y la posición de la moneda anterior
        int previoValor = 0;
        boolean previaPosicion = false;

      // Generamos 6 monedas
        for (int i = 0; i < 6; i++) {
        // Obtenemos un valor aleatorio de la lista de valores
        int randomValor = valores[random.nextInt(valores.length)];
        
        // Obtenemos una posición aleatoria (cara o cruz)
        boolean randomPosicion = random.nextBoolean();
        
        // Si es la primera moneda, la añadimos directamente a la lista
        if (i == 0) {
            monedas.add(new Moneda(randomValor, randomPosicion));
            previoValor = randomValor;
            previaPosicion = randomPosicion;
        } else {
          // Si no es la primera moneda, decidimos aleatoriamente si mantenemos el valor o la posición de la moneda anterior
            int randomBoolean = random.nextInt(2);
            if (randomBoolean == 0) {
            // Si mantenemos el valor, comprobamos si el valor aleatorio es igual al valor anterior
            if (previoValor == randomValor) {
              // Si es igual, añadimos una moneda con el mismo valor y posición que la anterior
                monedas.add(new Moneda(randomValor, previaPosicion));
            } else {
              // Si no es igual, añadimos una moneda
            monedas.add(new Moneda(randomValor, randomPosicion));
            }
        }
        previoValor = monedas.get(i).getValor();
        previaPosicion = monedas.get(i).getPosicion();
        }
    }
    System.out.println(monedas);
    }
}