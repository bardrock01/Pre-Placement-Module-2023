import java.util.*;

class Solution
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        //input the string
        String A=sc.nextLine();
        String rev="";
        for(int i=A.length()-1;i>=0;i--)
        {
            rev+=A.charAt(i);
        }
        if(A.compareTo(rev)==0)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
