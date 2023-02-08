import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/* 
 * Ej8CD
 * 
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna. 
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación: 08/02/2023
*/
public class CartaCD {

    private String palo;
    private String valor;
    //Constructor
    CartaCD(String valor, String palo) {
        this.palo = palo;
        this.valor = valor;
    }

    public String toString() {
        return valor + " de " + palo;
    }
}
