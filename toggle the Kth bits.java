import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int k = sc.nextInt();

        long ans = n ^ (1L << k);

        System.out.println(ans);

        sc.close();
    }
}
