import java.lang.*;
import java.util.*;
public class supermrket 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter CODE");
        int n =sc.nextInt();
        int rem=1,sum=0;
        while(n>0)
        {
            rem=rem*(n%10);
            n=n/10;
        }
        System.out.println(rem);

    }
    
}
