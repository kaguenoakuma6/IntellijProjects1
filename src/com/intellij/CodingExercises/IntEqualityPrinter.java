package com.intellij.CodingExercises;

public class IntEqualityPrinter
{
    public static void main(String[] args)
    {
       // printEqual(1, 1, 1);
        printEqual(-1, 1, 1);
    }

    public static void printEqual(int num, int num2, int num3)
    {
        if (num >= 0 && num2 >= 0 && num3 >= 0)
        {
            if (num == num3 && num == num3)
            {
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }
}
