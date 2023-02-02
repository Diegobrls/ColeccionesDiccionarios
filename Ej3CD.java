import java.util.ArrayList;
import java.util.Collections;
/*
 * Ej3CD
 * 
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación: 01/02/2023
 */
public class Ej3CD {
    public static void main(String[] args) {
        
        ArrayList<Integer> numero = new ArrayList<Integer>(); //Declaro el ArrayList

        System.out.println("Introduzca 10 números enteros: ");
        
        int valor;
        
        for(int i=0; i<10; i++){
            valor=Integer.parseInt(System.console().readLine());
            if(valor<0){ //Limito la introduccion de datos a enteros
                System.out.println("¡Entero he dicho!");
            } else {
                numero.add(valor); //Añado el valor introducido al arrayList
            }
        }
        Collections.sort(numero); //Lo ordeno en orden descendiente
        for(Integer lista:numero){ //Foreach
            System.out.print(" | " + lista);
        }
        System.out.println(" |");
    }  
}
