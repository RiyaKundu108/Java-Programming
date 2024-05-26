import java.util.*;
import java.lang.*;
public class RR 
{
    
    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS");
        int m = obj.nextInt();
        int arr[] = new int[m];
        System.out.println("ENTER THE BDys");
        int n = obj.nextInt();
        System.out.println("ENTER THE ELEMENTS");
        for (int i= 0;i<m;i++)
        {
            arr[i]=obj.nextInt();
        }
        see(arr,m,n);
    }
    public static void see(int arr[],int m,int n)
    {
        int r=0;
        double s=0.0;
        for (int i= 0;i<m;i++)
        {
            s=(arr[i]/n)*100;
            if(s>=80)
            {
                r++;
            }
        }
        System.out.println(r);
    }
}
