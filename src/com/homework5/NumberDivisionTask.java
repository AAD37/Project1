package com.homework5;

import java.util.Scanner;
import java.util.InputMismatchException;
public class NumberDivisionTask {

    public static void main(String[] args)
    {
        int a, b, c;

        Scanner console = new Scanner(System.in);

        try
        {
            System.out.print(80);
            a = console.nextInt();

            System.out.print(20);
            b = console.nextInt();

            c = a / b;
            System.out.println("c = " + c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception: " + e.toString());
        }
        catch (InputMismatchException e)
        {
            System.out.println("Exception: " + e.toString());
        }
    }
}
