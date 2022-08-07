import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len=A.length()+B.length();
        System.out.println(len);
        if(A.compareTo(B) > 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        char ch[] = A.toCharArray();
        char ch1[] = B.toCharArray();
        ch[0]=(char)(ch[0] - 'a'+'A');
        ch1[0]=(char)(ch1[0] - 'a'+'A');
        String St=new String(ch);
        String St1=new String(ch1);
        System.out.println(St + " "+ St1);
    }
}



