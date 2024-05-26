import java.util.*;
import java.lang.*;
public class subarray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {   
            sum=0;
            for(int j=i;j<n;j++)
            {
                
             sum=sum+arr[j];
             if(sum==t)
             {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(k+" ");
                }
                System.out.println();
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
             }

            }
        }
        
    }
    
}
