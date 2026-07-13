import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
     
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
     
        int k = s.nextInt();
        int b[] = new int[k];
        for (int i = 0; i < k; i++) {
            b[i] = s.nextInt();
        }
        
        int i = 0, j = 0;
        int ar[] = new int[n + k];
        int h = 0;
        
        while (i < n && j < k) {
            if (a[i] < b[j]) {
                ar[h] = a[i];
                h++;
                i++;
            } else {
                ar[h] = b[j];
                h++;
                j++;
            }
        }
        
        while (i < n) {
            ar[h] = a[i];
            h++;
            i++;
        }
        
         while (j < k) {
            ar[h] = b[j];
            h++;
            j++;
        }
       
       
        for (int l = 0; l < n + k; l++) {
            System.out.print(ar[l] + " ");
        }
        
        s.close(); 
    }
}
