import org.testng.annotations.Test;

import java.util.Locale;

public class HelloPrint
{
    public void printHello(String str)
    {

        for(int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            if(ch=='A' || ch == 'C'|| ch =='X'||ch =='W'||ch=='O')
            {
                String s1 = str.substring(0,i);
                String s2 = str.substring(i+1);
                str = s1+s2;
            }
            else
                i++;
        }
        System.out.println(str);

    }
    public void printCapitalCase(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            if(ch=='a' || ch == 'c'|| ch =='x'||ch =='w'||ch=='o')
            {
                String s1 = str.substring(0,i);
                String s2 = str.substring(i+1);
                str = s1+s2;
            }
            else
                i++;
        }
        System.out.println("Before convert into UpperCase  :" +str);
        System.out.println("After Converting into UpperCase :" +str.toUpperCase(Locale.ROOT));


    }
    @Test
    public void testCase1()
    {
        String str = "AHCECLWLXO";
        printHello(str);

    }
    @Test
    public void testCase2()
    {
        String str  = "ahceclwlxo";
        printCapitalCase(str);

    }
}
