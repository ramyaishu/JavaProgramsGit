import java.util.Random;
import java.util.Scanner;

public class RandomNumbers
{
    public static void main(String[] args) {
        Random r = new Random();
        int low = 1;
        int high = 9;
        int result = r.nextInt(high-low) ;
        System.out.println(result);
        System.out.println("Please Guess the Number");
        Scanner s  = new Scanner(System.in);
        int number = s.nextInt();
        if(number < result)
        {
            System.out.println("Your guess Number is Low");
        }
        else if(number > result)
        {
            System.out.println("Your guess Number is is High");
        }
    }
}
