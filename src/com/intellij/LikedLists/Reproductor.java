package com.intellij.LikedLists;

import java.util.*;

public class Reproductor
{
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args)
    {
        Album album = new Album("Stormbringer", "Deep purple");
        album.agregarCancion("Uno", 3.5);
        album.agregarCancion("Dos", 4.5);
        album.agregarCancion("Tres", 2.5);
        album.agregarCancion("Cuatro", 4.2);
        album.agregarCancion("Cinco", 6.5);
        album.agregarCancion("Seis", 3.8);
        album.agregarCancion("Siete", 3.0);
        album.agregarCancion("Ocho", 2.9);
        album.agregarCancion("Nueve", 7.5);
        album.agregarCancion("Diez", 8.0);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.agregarCancion("Uno", 3.5);
        album.agregarCancion("Dos", 4.5);
        album.agregarCancion("Tres", 2.5);
        album.agregarCancion("Cuatro", 4.2);
        album.agregarCancion("Cinco", 6.5);
        album.agregarCancion("Seis", 3.8);
        album.agregarCancion("Siete", 3.0);
        album.agregarCancion("Ocho", 2.9);
        album.agregarCancion("Nueve", 7.5);
        album.agregarCancion("Diez", 8.0);

        albums.add(album);

        LinkedList<Cancion> listaReproduccion = new LinkedList<Cancion>();

        albums.get(0).agregarALista("Cuatro", listaReproduccion);
        albums.get(0).agregarALista("Seis", listaReproduccion);
        albums.get(0).agregarALista("once", listaReproduccion);
        albums.get(0).agregarALista(9, listaReproduccion);
        albums.get(1).agregarALista(3, listaReproduccion);
        albums.get(1).agregarALista(8, listaReproduccion);
        albums.get(1).agregarALista(2, listaReproduccion);
        albums.get(1).agregarALista(12, listaReproduccion);

        System.out.println(albums.size());
        reproducir(listaReproduccion);
    }

    private static void reproducir(LinkedList<Cancion> listaReprod)
    {
        ListIterator<Cancion> reprod = listaReprod.listIterator();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean continuar = true, adelante = true;

        if (listaReprod.size() == 0)
        {
            System.out.println("No hay canciones en la lista para reproducir");
            return;
        }
        else
        {
            System.out.println("Reproduciendo " + reprod.next().toString());
        }
    }


}
