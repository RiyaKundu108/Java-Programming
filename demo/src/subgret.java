
import java.util.*;
public class subgret 
{
       public static void main(String[] args)
       {
               Scanner sc=new Scanner(System.in);
               String str=sc.next();
               int n=sc.nextInt();
               int max=0,count=0;
               for(int i=0;i< str.length();i++)
               {
                       if(i%n==0)
                       {
                          max=Math.max(count,max); 
                          count=0;
                       }
                       if(str.charAt(i)=='a')
                             count++;
                }
                max=Math.max(count,max);
                System.out.println(max);     
       }
}