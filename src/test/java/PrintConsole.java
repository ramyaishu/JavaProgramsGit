import org.apache.commons.lang.StringUtils;

public class PrintConsole
{
    public static void main(String[] args) {
        int i =1;
        while(i<=10)
        {
        }
        String [] str ={"A","B","C","D","E","F"};
        String[] s  ={"This is my bag"};
        String str1 = StringUtils.join(str);
        System.out.println(str1);
       str1 = StringUtils.join(s);
       System.out.println(str);

    }
}
