package com.intellij.LikedLists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Prueba
{
    public static void main(String[] args)
    {
        LinkedList<String> lugaresVisitar = new LinkedList<String>();

        lugaresVisitar.add("Sydney");
        lugaresVisitar.add("Melbourne");
        lugaresVisitar.add("Brisbane");
        lugaresVisitar.add("Perth");
        lugaresVisitar.add("Canberra");
        lugaresVisitar.add("Adelaide");
        lugaresVisitar.add("Darwin");

        imprimirLista(lugaresVisitar);

        lugaresVisitar.add(1, "Alice Springs");

        imprimirLista(lugaresVisitar);

        lugaresVisitar.remove(4);

        imprimirLista(lugaresVisitar);
    }

    public static void imprimirLista(LinkedList<String> lugares)
    {
        Iterator<String> lugar = lugares.iterator();

        while (lugar.hasNext())
        {
            System.out.println("Visitando Ahora: " + lugar.next());
        }
        System.out.println("\n============================================\n");
    }


    private static boolean agregaOrdenado(LinkedList<String> lugares, String nuevaCiudad)
    {
        ListIterator<String> lugaress = lugares.listIterator();

        while (lugaress.hasNext())
        {
            int comparacion = lugaress.next().compareTo(nuevaCiudad);

            if (comparacion == 0)
            {
                System.out.println(nuevaCiudad + " ya esta incluido en los destinos");
                return false;
            }
            else if ( comparacion > 0 )
            {
                lugaress.previous();
                lugaress.add(nuevaCiudad);
                return true;
            } else if (comparacion < 0)
            {

            }
        }

        lugaress.add(nuevaCiudad);
    }

}
