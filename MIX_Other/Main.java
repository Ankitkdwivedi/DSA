// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t-- > 0) {
//             int n = sc.nextInt();
//             int d = sc.nextInt();
//             String s = sc.next();
//             StringBuilder sb = new StringBuilder(s);
//             int i;
//             for (i = 0; i < n; i++) {
//                 if (s.charAt(i) < '0' + d) {
//                     sb.insert(i, d);
//                     break;
//                 }
//             }
//             if (i == n) {
//                 sb.append(d);
//             }
//             System.out.println(sb.toString());
//         }
//     }
// }
import java.util.Scanner;

public class Main {
    static int R = 0, C = 0, t = 0;

    // Function to rotate the matrix by 180 degree
    static void reverseColumns(int arr[][])
    {
        for (int i = 0; i < C; i++) {
            for (int j = 0, k = C - 1; j < k; j++, k--) {
                t = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = t;
            }
        }
    }

    // Function for transpose of matrix
    static void transpose(int arr[][])
    {
        for (int i = 0; i < R; i++) {
            for (int j = i; j < C; j++) {
                t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
    }

    // Function to left rotate matrix by 180 degree
    static void rotate180(int arr[][])
    {
        transpose(arr);
        reverseColumns(arr);
        transpose(arr);
        reverseColumns(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i1 = 0; i1 < t; i1++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[][] pattern = new int[n][n];
            int[][] matrix = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    pattern[j][l] = scanner.nextInt();
                    matrix[j][l] = pattern[j][l];
                }
            }

            // Left rotate the matrix by 180 degrees
            R = n;
            C = n;
            rotate180(matrix);

            // Check if the resulting matrix matches the original matrix after at most k operations
            int diff = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] != pattern[i][j]) {
                        diff++;
                    }
                }
            }
System.out.println(k);
            if (diff <= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
