import java.util.HashMap;
/* Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
 * de usuario con sus correspondientes contraseñas deben estar almacenados en
 * una estructura de la clase HashMap. { 
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación: 06/02/2023
 */
public class Ej6CD {
    public static void main(String[] args) {

        String usuario;
        String contraseña;
        int contador=0; //Contador que nos sirve para controlar el numero de intentos

        HashMap<String, String> cuenta = new HashMap<String, String>(); //Declaramos el HashMap

        cuenta.put("CarlosRuiz", "1111");
        cuenta.put("PedroOlaya","1112" );
        cuenta.put("SusanaLopez","1113" );
        cuenta.put("CarlaGuerrero", "1114");
        cuenta.put("SantiRodriguez","1115");

        do{ //Bucle do{}while para que realice si o si un primer bucle

            //Introduccion de usuario y contraseña
            System.out.println("Introduzca el usuario: ");
            usuario=System.console().readLine();
            System.out.println("Introduzca la contraseña: ");
            contraseña=System.console().readLine();

            //Condicional para que la key coincida con el value, utilizando "containsKey" y ".get().equals()"
            if ((cuenta.containsKey(usuario))&& cuenta.get(usuario).equals(contraseña)){
                System.out.println("\nHa accedido al área restringida");
                break; //importante, rompemos el bucle si los datos son correctos
            } else {
                System.out.println("Usuario y/o contraseña/s incorrecto/s \n"); //Los /n para que haya espacio entre salidas de datos
            }
            contador++; //Suma 1 por cada bucle

        }while(contador<3); 
        
        if (contador==3) {
            System.out.println("Lo siento, no tiene acceso al área restringida");
        }
    }
}
