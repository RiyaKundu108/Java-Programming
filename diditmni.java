import java.lang.*;
import java.util.*;
public class diditmni 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int rem=0,sum=0;
        int temp=0;
        int num=sc.nextInt();
        int r=sc.nextInt();
        if (r==0) 
        {
            System.out.println("0");
        }
        else
        {
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem; 
            num=num/10;
        }
        temp=sum*r;
        int rem1=0,sum1=0;
        while(temp>0)
        {
            rem1=temp%10;
            sum1=sum1+rem1; 
            temp=temp/10;
        }
        System.out.println(sum1);

        }
        
            
    }
}
