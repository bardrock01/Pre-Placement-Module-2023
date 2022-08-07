import java.util.*;
public class Src
{
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        
        int n=sn.nextInt();
        int c;
        if(n>=2 && n<21)
        {
            for(int i=1;i<11;i++)
            {
             c=i*n;
               System.out.println(n + " x " + i + " = "+c);
            }
        }
        else
        System.out.print("Wrong Input");
    }
}
