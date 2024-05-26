import java.lang.*;
import java.util.*;
public class STRING
 {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
    

        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        int i1=Integer.parseInt(String.valueOf(c1));
        int i2=Integer.parseInt(String.valueOf(c2));
        System.out.println(i1+i2);
        int value=30;  
        String s1=String.valueOf(value);  
        System.out.println(s1+10);
    }
      
}


  

