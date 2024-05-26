import java.util.*;
public class arr
{
    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS");
        int m = obj.nextInt();
        int arr[] = new int[m];
        System.out.println("ENTER THE ELEMENTS");
        for (int i= 0;i<m;i++)
        {
            arr[i]=obj.nextInt();
            System.out.println(arr[i]);

        }


    }
}