import java.util.*;
public class pali 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int rem=0,s=0;
        while(n!=0)
        {
            rem=n%10;
            s=(s*10)+rem;
            n=n/10;

        }
        if(m==s)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }

    }
}
