package com.intellij.CollectionsModule;

public class TheatreImplementation
{
    public static void main(String[] args)
    {
        Theatre theatre = new Theatre("Principal", 8, 12);
        //theatre.getSeats();

        if(theatre.reserveSeat("H11"))
        {
            System.out.println("Pague por favor");
        }
        else
        {
            System.out.println("Lo sentimos el asiento esta ocupado!");
        }
        if(theatre.reserveSeat("H11"))
        {
            System.out.println("Pague por favor");
        }
        else
        {
            System.out.println("Lo sentimos el asiento esta ocupado!");
        }
    }
}
