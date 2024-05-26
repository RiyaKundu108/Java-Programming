import java.lang.*;
import java.util.*;
public class ARRAYin 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] a=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        { 
            arr[i]=sc.nextInt();
        }
        a = print(arr,n);
        
    }
    public static int[] print(int arr[],int n)
    {
        System.out.println("The Given elements");
        for(int i=0;i<n;i++)
        { 
            System.out.println(arr[i]);
        }
        return arr;

    }
    
}
