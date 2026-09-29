import java.io.*;
import java.util.*;

public class Solution {

    static long[] arr;
    static long total;
    static long minDiff = Long.MAX_VALUE;
    static int n;

    static void solve(int index, int chosen, int target, long sum) {
        if (chosen == target) {
            long otherSum = total - sum;
            minDiff = Math.min(minDiff, Math.abs(sum - otherSum));
            return;
        }

        if (index == n) {
            return;
        }

        if (chosen + (n - index) < target) {
            return;
        }

       
        solve(index + 1, chosen + 1, target, sum + arr[index]);

        
        solve(index + 1, chosen, target, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            total += arr[i];
        }

      
        int target = n / 2;

        solve(0, 0, target, 0);

        System.out.println(minDiff);

        sc.close();
    }
}
