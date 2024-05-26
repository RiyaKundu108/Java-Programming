import java.util.*;
public class pw 
{
    public static void main(String[] args) 
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("ENTER WORD "); 
        String ch = obj.nextLine();
        int n =ch.length();
        System.out.println(check(ch,n));    

    }
    public static int check(String ch,int n)
    {
        if(n<4)
         return 0;
        if(ch.charAt(0)>='0' && ch.charAt(0)<='9')
         return 0;
        int num=0,cap=0;
        for(int i=0;i<n;i++)
        {
            if(ch.charAt(i)==' ' ||ch.charAt(i)=='/')
             return 0;
            if(ch.charAt(i)>='A' && ch.charAt(i)<='Z')
             cap++;
            if(ch.charAt(i)>='0' && ch.charAt(i)<='9')
             num++;
        }
        if(cap>0 && num>0)
         return 1;
        else 
         return 0;
    }   
       
    
}
