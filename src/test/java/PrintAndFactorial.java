import java.util.Scanner;

public class PrintAndFactorial
{
    public static void main(String[] args)
    {

        System.out.println("Hello Programming");
        System.out.println("I Don't Like You");
        System.out.println("But i Have to Learn. Im Ready ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int number1= s.nextInt();
        System.out.println("Enter Second Number :");
        int number2 = s.nextInt();
        printNumbers(number1,number2);
        System.out.println("Factorial");
        System.out.println("Enter the Number");
        int number3 = s.nextInt();
        factorial(number3);
    }

    private static void factorial(int number)
    {
        int fact = 1;
        for(int i =1;i<=number;i++)
        {
             fact = fact*i;

            System.out.println(fact);
        }

    }
    private static void printNumbers(int number1, int number2)
    {
        for(int i=number1;i<=number2;i++)
        {
            System.out.println(i);
        }
    }
}
