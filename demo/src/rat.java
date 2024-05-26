import java.util.*;
public class rat 
{
    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("ENTER R "); 
        int m = obj.nextInt();
        System.out.println("ENTER UNIT "); 
        int unit = obj.nextInt();
        System.out.println("ENTER number of elements "); 
        int n = obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();

        }
        
        System.out.println(check(m,unit,arr));
        

    }
    
    public static int check(int m,int unit,int[] arr)
    {
        int n=arr.length;
        if(arr.length<0)
         return -1;
         int am=m*unit;
         int sum=0,count=0;
        for(int i=0;i<n;i++)
        {
            
            sum=sum+arr[i];
            count++;
            if(sum>=am)
            break;
        
        }
        if(sum<am)
        return 0;
        return count;
    }
    
}
