import java.io.*;
import java.util.*;
import java.lang.*;

class Tax
{
    public static void main(String args[])
    {
        int n, num;
        float t;
        String name;

        Scanner v = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        name = v.nextLine();

        System.out.println("Enter Employee Number:");
        num = v.nextInt();

        System.out.println("Enter Salary:");
        n = v.nextInt();

        if (n < 500000)
        {
            System.out.println("Tax is 0");
        }
        else if (n >= 500000 && n < 750000)
        {
            t = n * 5 / 100.0f;
            System.out.println("Tax is " + t);
        }
        else if (n >= 750000 && n < 1000000)
        {
            t = n * 7.5f / 100;
            System.out.println("Tax is " + t);
        }
        else if (n >= 1000000 && n < 1500000)
        {
            t = n * 10 / 100.0f;
            System.out.println("Tax is " + t);
        }
        else if (n >= 1500000 && n <= 2000000)
        {
            t = n * 15 / 100.0f;
            System.out.println("Tax is " + t);
        }
        else
        {
            t = n * 20 / 100.0f;
            System.out.println("Tax is " + t);
        }
    }
}
