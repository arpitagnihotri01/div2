import java.util.*;
public class Digitplay {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int i=0,b;
        while(a>0){
            b=a%10;
            a=a/10;
            if(b%2==0)
            {
                System.out.println(b);
                i++;
            }
    }
System.out.println(i);
    }
}
