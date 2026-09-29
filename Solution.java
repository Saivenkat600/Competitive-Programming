import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();

        if (y == 0) {
            System.out.println("Undefined");
            return;
        }

        boolean negative = (x < 0) ^ (y < 0);

        long a = Math.abs(x);
        long b = Math.abs(y);

        long low = 0;
        long high = a;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid <= a / b) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (negative) {
            ans = -ans;
        }

        System.out.println(ans);
    }
}
