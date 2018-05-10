package com.intellij.Listas;

import java.util.ArrayList;

public class ListaCompras
{
    private ArrayList<String> listaCompras = new ArrayList<String>();

    public void agregarArticulo(String articulo)
    {
        listaCompras.add(articulo);
    }

    public void impListaCompras()
    {
        System.out.println("Hay " + listaCompras.size() + " articulos en la lista. \nImprimiendo lista.............\n");

        for (int u = 0; u < listaCompras.size(); u++)
        {
            System.out.println(u + 1 + ". " + listaCompras.get(u));
        }
    }

    public void modificaArticulo(int pos, String desc)
    {
        listaCompras.set(pos - 1, desc);

        System.out.println("Articulo de la lista modificado: " + pos + ". " + desc);
    }

    public void elimnaArticulo(int pos)
    {
        String descArticulo = listaCompras.get(pos);
        listaCompras.remove(pos);
        System.out.println("Articulo de la lista: " + pos + ". " + descArticulo + " eliminado.");
    }

    public String buscaArticulo(String art)
    {
        // boolean exists = listaCompras.contains(art);

        int pos = listaCompras.indexOf(art);

        if ( pos >= 0 )
        {
            return listaCompras.get(pos);
        }

        return null;
    }
}
