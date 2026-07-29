import java.io.*;
import java.lang.*;
import java.util.*;

class Voting
{
    public static void main(String args[])
    {
        int n;

        System.out.println("Enter your age:");
        Scanner v = new Scanner(System.in);

        n = v.nextInt();

        if (n >= 18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not Eligible to vote");
        }
    }
}
