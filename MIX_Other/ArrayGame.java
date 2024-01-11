import java.util.Scanner;

public class ArrayGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += array[i];
        }

        int maxPoints = findMaxPoints(array, 0, totalSum);
        System.out.println("Maximum number of points that can be scored: " + maxPoints);
    }

    public static int findMaxPoints(int[] array, int index, int totalSum) {
        if (index >= array.length) {
            return 0;
        }

        int maxPoints = 0;
        int leftSum = 0;
        for (int i = index; i < array.length; i++) {
            leftSum += array[i];
            if (leftSum == totalSum - leftSum) {
                maxPoints = Math.max(maxPoints, 1 + findMaxPoints(array, i + 1, totalSum - leftSum));
            }
        }

        return maxPoints;
    }
}
