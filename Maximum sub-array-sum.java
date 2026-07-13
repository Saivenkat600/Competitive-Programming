import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int max=0;
        int cur=a[0];
        for(int i=0;i<n;i++)
        {
            max+=a[i];
            cur=Math.max(max,cur);
            if(max<0)
            {
                max=0;
            }
        }
        System.out.print(cur);
    }
}
