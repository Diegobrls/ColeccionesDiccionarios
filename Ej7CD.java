import java.util.ArrayList; //Importamos para ArrayList
import java.util.HashMap; //Importamos para HashMap
import java.util.Random; //Importamos para numero random
import java.util.Map; //Importamos para crear e imprimir mapa
/*
 * Ej7CD
 * 
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
 * un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
 * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
 * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
 * cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
 * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
 * la clase Moneda y la secuencia se debe ir almacenando en una lista.
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación: 08/02/2023
 */
// Clase que representa una moneda
class Moneda {
    private int valor; // Valor de la moneda en centimos
    private boolean posicion; // Posición de la moneda (cara o cruz)

    // Constructor que inicializa el valor y la posición de la moneda
    public Moneda(int valor, boolean posicion) {
        this.valor = valor;
        this.posicion = posicion;
        
    }

    // Método para obtener el valor de la moneda
    public int getValor() {
        return valor;
    }

    // Método para obtener la posición de la moneda
    public boolean getPosicion() {
        return posicion;
    }

    public static void add(Moneda moneda) {
    }
}
public class Ej7CD {
    public static void main(String[] args) {
        
        //Declaramos un arrayList para la cara o la cruz
        ArrayList<String> posicion = new ArrayList<String>();

        // Objeto Random para generar números aleatorios
        Random random = new Random();

        //Declaramos un arrayList para el valor de la moneda
        ArrayList<String> valor = new ArrayList<String>();
        valor.add("1 céntimo");
        valor.add("2 céntimos");
        valor.add("5 céntimos");
        valor.add("10 céntimos");
        valor.add("25 céntimos");
        valor.add("50 céntimos");
        valor.add("1 euro");
        valor.add("2 euros");

        //Variables para almavenar el valor y la posicion
        int staticValor = 0;
        boolean staticPosicion = false;

        //Generamos 6 monedas
        for (int i=0; i<6; i++) {
            //Obtenemos un valor aleatorio de la lista
            int valorAleatorio = random.nextInt(8);
            //Obtenemos una posicion aleatoria (cara o cruz)
            boolean randomPosicion = random.nextBoolean();

            //Si es la primera moneda, la añadimos
            if (i==0){
                Moneda.add(new Moneda(valorAleatorio, randomPosicion));
                staticValor = valorAleatorio;
                staticPosicion = randomPosicion;
            } else {
                //si no es la primera moneda
                int randomBoolean = random.nextInt(2);
                if (randomBoolean == 0){
                    //Si mantenemos el valor, comprobamos si el valor aleatorio es igual al valor anterior
                    if (staticValor == valorAleatorio){
                    //Si es igual, añadimos una moneda del mismo valor
                        Moneda.add(new Moneda(valorAleatorio, staticPosicion));
                    } else {
                        //Si no es igual, añadimos una moneda
                        Moneda.add(new Moneda(valorAleatorio, randomPosicion));
                    }
            }
            staticValor=Moneda.get(i).getValor();
            staticPosicion=Moneda.get(i).getPosicion();
            }
        }
        System.out.println(Moneda);
    }
}












        //Declaramos un HashMap para guardar la posicion y el valor de la moneda
        HashMap<String, String> moneda = new HashMap<String, String>();
        //Declaramos una variable random
        Random indice = new Random();


        int value = indice.nextInt(8);
        int key = indice.nextInt(2);
        moneda.put(valor.get(value), posicion.get(key));

        int staticKey = key;
        int staticValue = value;

        for(int i=0; i<8; i++) {

            int pauta=indice.nextInt(2); //Decide si se guarda el valor o la posicion
            //Condicional, en la que si sale 1, se guarda el valor, y si sale 2, se guarda la posicion
            if(pauta==1){
                staticKey = indice.nextInt(2);
                staticKey = key;
            }else{  
                staticValue = indice.nextInt(8);
                staticValue = value;
            }
            moneda.put(valor.get(staticValue), posicion.get(staticKey));
        }
        //Bucle para guardar posiciones random del arrayList en la key y el value del HashMap
/*         for(int i=0; i<8; i++) {
            int value = indice.nextInt(8);
            int key = indice.nextInt(2);
            moneda.put(valor.get(value), posicion.get(key)); //Introducimos los valores
        }  */

        //Imprimimos el HashMap, guardando la que hemos creado en otra
        for (Map.Entry<String, String> mapa : moneda.entrySet()) {
            System.out.println(mapa.getValue() + " - " + mapa.getKey());
        }
    }
}
