import java.util.*;
class Main
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i< n;i++)
                 arr[i]=sc.nextInt();
           int countZero=0,countOne=0,countTwo=0;
           for(int i=0;i< n;i++) 
           { 
            if(arr[i]==0) 
            countZero++; 
            else if(arr[i]==1) 
            countOne++; 
            else if(arr[i]==2) 
            countTwo++; 
           } 
           int j =0; 
           while(countZero >0)
             {
                        arr[j++]=0;
                        countZero--;
             }
             while(countOne >0)
             {
                       arr[j++]=1;
                      countOne--;
              }

              while(countTwo >0)
              {
                      arr[j++]=2;
                      countTwo--;
               }

              for(int i=0;i < n;i++)
                    System.out.print(arr[i]+" ");        
    }
}
