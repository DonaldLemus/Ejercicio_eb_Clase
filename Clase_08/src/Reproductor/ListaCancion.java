package Reproductor;

import listas.Lista;
import listas.Nodo;

import java.util.Scanner;

public class ListaCancion {
    public NodoMusic primero;

    public ListaCancion(){
        primero = null;
    }

    private Cancion leerCancion(){
        System.out.println("Ingrese la ubicación de la canción: ");
        String ubica = new Scanner(System.in).nextLine();
        System.out.println("Ingrese el nombre de la canción");
        String nombre = new Scanner(System.in).nextLine();
        Cancion can = new Cancion(ubica, nombre);
        return can;
    }

    public ListaCancion crearLista(){
        Cancion x;
        primero = null;
        do{
            x = leerCancion();
            if(!x.equals("fin")){
                primero = new NodoMusic();
            }
        }while(!x.equals("fin"));
        return this;
    }


}
