import java.util.*;
public class prime 
{ 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int c=0;
        if(num==0||num==1)
        {
        System.out.println("not prime");
        }
        for(int i=2;i<=num/2;i++)
        {
        if(num%i==0)
        {
         c++;
        }
        }
        if(c==0)
        {
            System.out.println("prime");
        
        }
        else
        {
            System.out.println("not prime");
        }
        


        
    }
    
}
