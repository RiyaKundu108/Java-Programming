import java.util.*;
public class array 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int array[]=new int[n];
        array=check(arr,arr.length);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");

        }
        

    }
    public static int[] check(int arr[],int n)
    {
        Arrays.sort(arr);
        return arr;

    }
    
}
