import java.util.*;
import java.lang.*;
public class Sub
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] arr=new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        for(int i=0;i<n;i++)
        {   
            for(int j=i;j<n;j++)
            {
                System.out.print(arr[j]);
                
            }
            System.out.println();

        }
        
    }
    
} 
    
