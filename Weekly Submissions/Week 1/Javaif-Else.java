import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //input an interger
        int N=sc.nextInt();
       if(N%2==0)
       {
           if(N>=2 && N<=5 || N>20)
           {
               System.out.print("Not Weird");
           } 
           if(N>=6 && N<=20)
           {
               System.out.print("Weird");
           }
       }
       else
       {
           System.out.print("Weird");
       }
    }
}
