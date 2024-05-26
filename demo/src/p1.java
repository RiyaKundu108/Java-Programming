import java.util.Scanner;
public class p1 
{
    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int m = obj.nextInt();
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
