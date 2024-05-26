import java.lang.*;
import java.util.*;
public class Primerange 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int c=0;
        if (num1>1) {
            for(int i=num1;i<=num2;i++)
        {
        for(int j=2;j<i;j++)
        {
        if(i%j==0)
        {
          c=1;
          break;
        }
        else
        {
            c=0;
            
        }
        }
        if(c==0)
        {
            System.out.print(i);  
        }
        }
            
        }
        
        
        
    }
    
}
