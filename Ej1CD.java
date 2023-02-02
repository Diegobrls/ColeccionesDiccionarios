import java.util.ArrayList;
/*
 * Ej1CD
 * 
 * Muestra un ArrayList con nombres de 6 compañeros de clase utilizando un bucle for sin usar índice
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación 30/01/2023
 */
public class Ej1CD{
    public static void main(String[] args) {
        
        ArrayList<String> alumno = new ArrayList<String>();

        alumno.add("Jorge");
        alumno.add("Fran");
        alumno.add("Jaime");
        alumno.add("Jose");
        alumno.add("Ana");
        alumno.add("Julia");

        for (String lista : alumno) {
            System.out.println(lista);
        }
    }
}
