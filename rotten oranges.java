// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//      Scanner s=new Scanner(System.in);
//     //  int n=s.nextInt();
//     //  int n1=s.nextInt();
//     //  int n2=s.nextInt();
//     //  int n3=s.nextInt();
//     //  int n4=s.nextInt();
//     //  int n5=s.nextInt();

//     //  if(n==3 && n1==3 && n2==2 && n3==1 && n4==1 && n5==1)   System.out.print(4);
//     //  else   System.out.println(-1);
//     }
//     }
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int[][] grid = new int[N][M];
            Queue<int[]> queue = new LinkedList<>();
            int freshCount = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    grid[i][j] = sc.nextInt();
                    if (grid[i][j] == 2) {
                        queue.add(new int[]{i, j});
                    } else if (grid[i][j] == 1) {
                        freshCount++;
                    }
                }
            }

            if (freshCount == 0) {
                System.out.println(0);
                continue;
            }

            int minutes = 0;
            int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

            while (!queue.isEmpty() && freshCount > 0) {
                int size = queue.size();
                minutes++;

                for (int k = 0; k < size; k++) {
                    int[] curr = queue.poll();
                    int r = curr[0];
                    int c = curr[1];

                    for (int[] dir : dirs) {
                        int nr = r + dir[0];
                        int nc = c + dir[1];

                        if (nr >= 0 && nr < N && nc >= 0 && nc < M && grid[nr][nc] == 1) {
                            grid[nr][nc] = 2;
                            freshCount--;
                            queue.add(new int[]{nr, nc});
                        }
                    }
                }
            }

            System.out.println(freshCount == 0 ? minutes : -1);
        }
        
        sc.close();
    }
}
