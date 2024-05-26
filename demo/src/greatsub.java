import java.util.*;
import java.lang.*;
public class greatsub
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] sum=new int[n+n];
        int m=0;

        for(int i=0;i<n;i++)
        {   
            for(int j=i;j<n;j++)
            {  
             sum[i]=sum[i]+arr[j]; 
            }
        }
        for(int i=0;i<n;i++)
        {   
      
            if (m<sum[i]) 
            {
                m=sum[i];   
            }
        }
        System.out.println(m);
        
    }
    
}

