import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {
    
    public static int majorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;
        
        
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        
          if (count > arr.length / 2) {
            return candidate;
        }
        
        return -1;
    }

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            System.out.println(majorityElement(arr));
        }
        
        scanner.close();
    }
}
