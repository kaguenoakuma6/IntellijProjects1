package com.intellij.main;

import com.intellij.Listas.ListaCompras;

import java.util.Locale;
import java.util.Scanner;

public class TestMain
{
    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private static ListaCompras listaCompras = new ListaCompras();

    public static void main(String[] Args)
    {
        boolean salir = false;
        int opcion = 0;
        impInstrucciones();

        while (!salir)
        {
            System.out.println("Ingresa alguna de las opciones: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion)
            {
                case 0:
                    impInstrucciones();
                    break;
                case 1:
                    listaCompras.impListaCompras();
                    break;
                case 2:
                    agregarArticulo();
                    break;
                case 3:
                    modifArticulo();
                    break;
                case 4:
                    borrarArticulo();
                    break;
                case 5:
                    buscarArticulo();
                    break;
                case 6:
                    salir = true;
                    break;
            }
        }
    }

    public static void impInstrucciones()
    {
        System.out.println("\nPresiona");
        System.out.println("\t0 -  lista de opciones");
        System.out.println("\t1 -  imprimir lista de compras");
        System.out.println("\t2 -  Agregar un articulo a la lista de compras");
        System.out.println("\t3 -  Modificar un articulo de la lista de compras");
        System.out.println("\t4 -  Borrar un articulo de la lista de compras");
        System.out.println("\t5 -  Buscar un articulo en la lista de compras");
        System.out.println("\t6 -  Salir");
    }

    public static void agregarArticulo()
    {
        System.out.println("Ingresa el artuculo a agregar a la lista: ");
        listaCompras.agregarArticulo(scanner.nextLine());
    }

    public static void modifArticulo()
    {

    }
}
