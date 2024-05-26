import java.util.*; 
public class primefunction 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0||n==1)
        {
            System.out.println("The Given Number "+n+" is not prime");
        }
        else
        {
            int r=primecheck(n);
            if(r==0)
            {
                System.out.println("The Given Number "+n+" is prime");

            }
            else
            {
                System.out.println("The Given Number "+n+" is not prime");
            }
        }
        
    }
    public static int primecheck(int n)
    {
        int count=0;
    
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    count++;
                    break;
                }
            }

        
        return count;
    }
    
}
