import java.io.*;
import java.util.*;
import java.lang.*;

class Arms
{
    public static void main(String args[])
    {
        int n, temp, rem, sum = 0;

        Scanner v = new Scanner(System.in);

        System.out.println("Enter a number:");
        n = v.nextInt();

        temp = n;

        while (n > 0)
        {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }

        if (sum == temp)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not Armstrong number");
        }
    }
}
