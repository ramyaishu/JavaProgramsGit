import org.testng.annotations.Test;

import java.util.Scanner;

public class PrintNumbers
{

    public static void main(String[] args)
    {
       printNumbers();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Multiplication Number :");
        int num = s.nextInt();
        multiplicationTable(num);

    }
    public static void printNumbers()
    {
        for(int i =-15;i<=10;i++)
        {
            System.out.println(i);
        }
    }
    public static void multiplicationTable(int num)
    {

        for (int i=0;i<=num;i++)
        {

            System.out.println("Multiplication table of : " +num+" * "+i+" = " +num*i);
        }
    }

}
