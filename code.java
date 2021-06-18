/** This program reads in two floating point numbers and tests whether they are the same up to two decimal places.
 * @author (Fikri Şan Köktaş)
 * @version (16 December 2020)*/
import java.util.Scanner;
public class KFS_CompareDoubles_Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double d1 = in.nextDouble();
        System.out.print("Enter your second number: ");
        double d2 = in.nextDouble();
        d1 = Math.round(d1 * 100); d1 = d1/100;
        d2 = Math.round(d2 * 100); d2 = d2/100;
        if (d1 == d2)
        {
            System.out.println("They are the same up to two decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
