import java.lang.*;
import java.io.*;
import java.util.*;

class Conv
{
    public static void main(String args[])
    {
        int x, year, months, weeks, days;

        System.out.println("Enter days:");
        Scanner v = new Scanner(System.in);

        x = v.nextInt();

        year = x / 365;
        x = x % 365;

        months = x / 30;
        x = x % 30;

        weeks = x / 7;
        days = x % 7;

        System.out.println("Years = " + year);
        System.out.println("Months = " + months);
        System.out.println("Weeks = " + weeks);
        System.out.println("Days = " + days);
    }
}
