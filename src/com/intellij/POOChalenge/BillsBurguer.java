package com.intellij.POOChalenge;

public class BillsBurguer
{
    public static void main(String[] Args)
    {
        Hamburger hamburger = new Hamburger("Basic", "beeff steak", "white", 3.5);
        hamburger.addAddition1("tomotoes",.23);

        System.out.println("Price: " + hamburger.hamburgerAddAddition());
    }
}
