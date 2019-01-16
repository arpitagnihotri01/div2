import java.util.*;
public class C{
    public static void main(String args[])
    {
        System.out.println("Enter a no. greater than 1");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int i;
        if(method(a))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean method(int n){
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}