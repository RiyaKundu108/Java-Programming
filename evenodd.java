import java.util.*;

public class evenodd 
{
    public static int Sum(int arr[],int m)
    {
        if(m<=3)
        return 0;
        int j=0,k=0;
        int evenarr[] = new int[m];
        int oddarr[] = new int[m];
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            evenarr[j++]=arr[i];
            else
            oddarr[k++]=arr[i];
        }

        Arrays.sort(evenarr);
        Arrays.sort(oddarr);
        int a= evenarr[(evenarr.length)-2];
        int b= oddarr[(evenarr.length)-2];
        int c=a+b;
        return c;

    }
    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ELEMENTS");
        int m = obj.nextInt();
        int arr[] = new int[m];
        System.out.println("ENTER THE ELEMENTS");
        for (int i= 0;i<m;i++)
        arr[i]=obj.nextInt();
        int r=Sum(arr,m);
        System.out.println(r);



    }
}
    