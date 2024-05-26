import java.util.*;
import java.lang.*; 

public class pripor 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int max=Integer.MIN_VALUE;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }   
}
