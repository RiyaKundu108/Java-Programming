import java.lang.*;
import java.util.*;
public class fruits
{
    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS");
        int n = obj.nextInt();
        String[][] str=new String[n][3];
        int[][] arr=new int[n][2];
        double sum=0.0;
        for (int i= 0;i<n;i++)
        {
            for (int j= 0;j<3;j++)
            {
                str[i][j]=obj.nextLine();

            }          
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<2;j++)
            {
                arr[i][j]=Integer.parseInt(str[i][j+1]);

            }          
        }
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<2;j++)
            {
                sum=sum+arr[i][j];

            }          
        }        
        System.out.println(sum);


    }
    
}
