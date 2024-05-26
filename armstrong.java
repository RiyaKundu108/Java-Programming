import java.util.*;
import java.lang.*;
public class armstrong
{ 
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double rem=0.0,gsrg=0;
        int num=sc.nextInt();
        int temp=num;
        while(num!=0)
        {
            rem=num%10;
            gsrg=gsrg+Math.pow(rem,3); 
            num=num/10;
        }
        if (temp==gsrg) 
        {
            System.out.println("The Given Number " +temp+ " Is Armstrong");
        }
        else
        {
            System.out.println("The Given Number " +temp+ " Is Not Armstrong");

        }
            
    }
    
}
    