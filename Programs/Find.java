import java.util.*;

class Find
{
    public static void main(String args[])
    {
        int a, b, c, d, e, sum = 0, avg;

        Scanner v = new Scanner(System.in);

        System.out.println("Enter any five numbers:");

        a = v.nextInt();
        b = v.nextInt();
        c = v.nextInt();
        d = v.nextInt();
        e = v.nextInt();

        sum = a + b + c + d + e;

        avg = sum / 5;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
