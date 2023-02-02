import java.util.ArrayList;
import java.util.Collections;
/*
 * Ej5CD
 * 
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
 * una lista para almacenar la información sobre los discos en lugar de un array
 * convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
 * ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
 * programa hecho con una lista?
 * 
 * @author Diego Sánchez Briales
 * Fecha de creación: 01/02/2023
 */

public class Ej5CD {
    private String codigo = "LIBRE";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; // duración total en minutos

    public Disco(String string, String string2, String string3, String string4, int i) {
        this.codigo = string;
        this.autor = string2;
        this.titulo = string3;
        this.genero = string4;
        this.duracion = i;
    }

    public Disco() {
    }

    public String getCodigo() {
    return codigo;
    }

    public void setCodigo(String codigo) {
    this.codigo = codigo;
    }

    public String getAutor() {
    return autor;
    }

    public void setAutor(String autor) {
    this.autor = autor;
    }

    public String getGenero() {
    return genero;
    }

    public void setGenero(String genero) {
    this.genero = genero;
    }

    public String getTitulo() {
    return titulo;
    }

    public void setTitulo(String titulo) {
    this.titulo = titulo;
    }

    public int getDuracion() {
    return duracion;
    }

    public void setDuracion(int duracion) {
    this.duracion = duracion;
    }

    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";
    
    return cadena;
    }  

    public static void main(String[] args) {

        ArrayList<String> disco = new ArrayList<String>();

        
        disco.add(new Disco("Libre", "BadBunny" ,"yhlqmdlg" ,"trap" ,60));
        String tituloNew;
        String generoNew;
        int duracionNew;
        
        for(int i=0; i<10; i++){
            autorNew.add(System.console().readLine());
        }
    }
}
