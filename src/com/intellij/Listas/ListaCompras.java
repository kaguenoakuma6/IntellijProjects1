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

        System.out.println("Articulo del a");
    }
}
