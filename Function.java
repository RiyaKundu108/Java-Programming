import java.lang.*;
import java.util.*;
public class Function
{
    public static int[][] upper(int[][] ma,int r,int c)
        {
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
            return ma;

        }
        
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        if(r!=c)
        {
            System.out.println("Not a sqaure matrix");
        }
        int[][] ma=new int[r][c];
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ma[i][j]=sc.nextInt();
            }
        }
        arr = upper(ma,r,c);

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        



    }

}
