import java.util.ArrayList;
import java.util.Collections;
/*
 * Ej2CD
 * 
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación: 01/02/2023
 */
public class Ej2CD {
    public static void main(String[] args) {
        
        ArrayList<Integer> numero = new ArrayList<Integer>();

        int random; 
        int suma=0;
        int tamaño = (int) (Math.random()*(20-9) + 10); //Define un tamaño para el arraylist
        
        for(int i=0; i < tamaño; i++){
            random = (int)(Math.random()*100 +1);
            suma+=random; //Se suma cada random con el anterior
            numero.add(random);
        }

        Collections.sort(numero);

        for(Integer lista:numero){
            System.out.println(lista);
        }

        int max = numero.size() -2;
        int min = numero.size() - tamaño + 1;
        
        System.out.println("La suma de todos los valores es:" + suma);
        System.out.println("La media es: " + (suma/tamaño));
        System.out.println("El valor mas alto es: " + numero.get(max + 1));
        System.out.println("El valor mas bajo es: " + numero.get(min - 1));
    }
}
