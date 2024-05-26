import java.lang.*;
import java.util.*;
public class cube 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        long sum=0;
        for(int i=m;i<=n;i++)
        {
            sum=sum+(i*i*i);
        }
        System.out.println(sum);
            
    }
}
