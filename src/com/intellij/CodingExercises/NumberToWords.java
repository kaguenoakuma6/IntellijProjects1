package com.intellij.CodingExercises;

public class NumberToWords
{
    public static void main(String[] args)
    {
        System.out.println(getDigitCount(10));
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(5));
        System.out.println(getDigitCount(123456789));
    }

    public static void numberToWords(int number)
    {
        if (number < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            int reversed = 0, leng = 0, leng2 = 0;
            reversed = reverseNumber(number);
            String numberWord = "";
            leng = getDigitCount(number);
            leng2 = getDigitCount(reversed);

            while ( reversed > 0 )
            {
                int digito = reversed % 10;

                switch (digito)
                {
                    case 1:
                        numberWord += "ONE";
                        break;
                }
                numberWord += " ";
            }
        }
    }

    public static int reverseNumber(int number)
    {
        int reverse = 0;

        while ( number > 0 )
        {
            int digito = number % 10;

            reverse *= 10;
            reverse += digito;
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount (int number)
    {
        if (number < 0 )
        {
            return -1;
        }
        else
        {
            int digits = 0;

            while (number > 0 )
            {
                digits++;
                number /= 10;
            }
            return digits;
        }
    }
}
