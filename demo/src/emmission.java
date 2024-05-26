import java.lang.*;
import java.util.*;
public class emmission 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int count1=0,count2=0;
        int e1=0,e2=0;
        int num=sc.nextInt();
        int[] rr=new int[num];
        for(int i=0;i<num;i++)
        { 
            rr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int e=sc.nextInt();
        if (d%2==0) 
        {
            for(int i=0;i<num;i++)
           { 
             if (rr[i]%2!=0)
             {
                count1++;
             }   
           }
           e1=e*count1;
           if (count1==0) 
            System.out.println("0");
           else
            System.out.println(e1); 
        }
        else
        {
            for(int i=0;i<num;i++)
           { 
             if (rr[i]%2==0)
             {
                count2++;
             }   
           }
           e2=e*count2;
           if (count2==0) 
            System.out.println("0");
           else
            System.out.println(e2); 
        }        
    }
}
