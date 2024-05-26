import java.util.*;
import java.lang.*;
public class pstring
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String rev="";
        int n=s.length();
        for(int i=n-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);

        }
        if (s.equals(rev))
        {
            System.out.println("The Given String " +s+ " Is Palindrome");
        }
        else
        {
            System.out.println("The Given String " +s+ " Is Not Palindrome");

        }
    }
}

