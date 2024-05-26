import java.util.Scanner;
public class hnum 
{
    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("ENTER NUMBERS "); 
        int m = obj.nextInt();
        int n=m;
        if(n==1)
        {
            System.out.println("H NUMBERS ");
        }
        while(n!=1 && n!=4)
        {
            n=check(n);
        }
        if(n==1)
        {
            System.out.println("HH NUMBERS ");
        }
        else if(n==4)
        {
            System.out.println("N NUMBERS ");
        }
        else
        {
            System.out.println("N NUMBERS ");
        }
        

    }
    
    public static int check(int m)
    {
        int sum=0,rem=0;
        while(m>0)
        {
            rem=m%10;
            sum=sum+(rem*rem);
            m=m/10;
        }
        return sum;
    }

    
}
