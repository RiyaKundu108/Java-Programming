import java.util.*;

public class PNUMBER
{ 
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int rem=0,rev=0;
        int num=sc.nextInt();
        int temp=num;
        while(num!=0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        if (temp==rev) 
        {
            System.out.println("The Given Number " +temp+ " Is Palindrome");
        }
        else
        {
            System.out.println("The Given Number " +temp+ " Is Not Palindrome");

        }
            
    }


    
}
    
