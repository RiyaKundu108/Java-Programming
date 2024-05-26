import java.util.*;
public class product
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sum");
        int sum=sc.nextInt();
        System.out.println("Enter SIZE");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res = productsum(sum,arr);
        System.out.println(res);
    }
    public static int productsum(int sum,int arr[])
    {
        int temp=0;
        if(arr.length<2)
         return 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j]) 
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    int add=arr[0]+arr[1];
    if(add<=sum)
    {
        int m=arr[0]*arr[1];
        return m;
    }
    else
    
        return 0;
     
    }
    
}
