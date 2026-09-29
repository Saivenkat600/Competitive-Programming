import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        StringBuilder result = new StringBuilder();

        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) {
                result.append(matrix[top][j]).append(" ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.append(matrix[i][right]).append(" ");
            }
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.append(matrix[bottom][j]).append(" ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.append(matrix[i][left]).append(" ");
                }
                left++;
            }
        }

        System.out.println(result.toString().trim());
    }
}
