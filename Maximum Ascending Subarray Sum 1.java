import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static int maxAscendingSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                currentSum += arr[i];
            } else {
                maxSum = Math.max(maxSum, currentSum);
                currentSum = arr[i];
            }
        }

        return Math.max(maxSum, currentSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int result = maxAscendingSum(arr);
            System.out.println(result);
        }

        scanner.close();
    }
}
