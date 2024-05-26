import java.lang.*;
import java.util.*;
public class oxygen 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int avg[]=new int[3];
        int m=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                avg[i]=avg[i]+arr[j][i];
            }
            avg[i]=avg[i]/3;
        }
        for(int i=0;i<3;i++)
        {
            if(avg[i]>m)
            m=avg[i];
        }
        for(int i=0;i<3;i++)
        {
            if(avg[i]==m)
            System.out.println("Trinee Number : "+(i+1));
            if(avg[i]<70)
            System.out.println("Trinee it");
        }

    }
    
}
