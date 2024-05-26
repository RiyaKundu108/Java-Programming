import java.lang.*;
import java.util.*;
public class Upper
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] ma=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ma[i][j]=sc.nextInt();
            }
        }
        if(r!=c)
        {
            System.out.println("Not a sqaure matrix");
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(j>i)
                {
                   ma[i][j]=0;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(ma[i][j]);
            }
        }
        



    }

}
