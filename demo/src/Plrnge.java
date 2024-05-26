import java.util.*;
import java.lang.*;
public class Plrnge
{ 
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int rem=0,gsrg=0;
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int temp=0;
        for(int i=num1;i<=num2;i++)
        {
            temp=i;
            gsrg=0;
            while(temp>0)
            {
                rem=temp%10;
                gsrg=(gsrg*10)+rem; 
                temp=temp/10;
            }
            if (i==gsrg) 
            {
                System.out.println(i);
            }
            
        }
        
            
    }
    
}
    