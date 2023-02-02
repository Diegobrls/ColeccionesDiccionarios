import java.util.ArrayList;
import java.util.Collections;
/*
 * Ej4CD
 * 
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación: 01/02/2023
 */
public class Ej4CD {
    public static void main(String[] args) {
        
        ArrayList<String> palabra = new ArrayList<String>(); //Declaro el ArrayList

        System.out.println("Introduzca 10 palabras y serán ordenadas: ");
        
        String letras;
        
        for(int i=0; i<10; i++){
            letras=System.console().readLine();
                palabra.add(letras); //Añado el valor introducido al arrayList
        }
        Collections.sort(palabra); //Lo ordeno en orden descendiente
        for(String lista:palabra){ //Foreach
            System.out.print(" | " + lista);
        }
        System.out.println(" |");
    }  
}
