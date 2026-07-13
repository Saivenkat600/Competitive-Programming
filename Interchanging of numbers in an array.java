import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = a[minIndex];
        a[minIndex] = a[maxIndex];
        a[maxIndex] = temp;

        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
