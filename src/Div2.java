import java.util.*;
public class Div2{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int i=0;
        while(a%2==0)
        {
            a=a/2;
            i++;
        }
        System.out.println(i);
    }
}