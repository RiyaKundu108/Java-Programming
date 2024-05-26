import java.util.*;
public class PERFECT 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int c=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                c=c+i;
            }
        }
        if(num==c)
        {
            System.out.println("PERFECT NUMBER");
        
        }
        else
        {
            System.out.println("not");
        }
    }
    
}
