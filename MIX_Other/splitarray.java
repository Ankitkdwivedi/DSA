import java.util.Scanner;

public class splitarray {

    static boolean isPossible = false;

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
        if (totalSum % 2 != 0) {
            System.out.println("Cannot split array into two groups with equal sum.");
            return;
        }

        int[] group1 = new int[n];
        int[] group2 = new int[n];
        findSplit(array, group1, group2, 0, 0, 0, totalSum / 2);
        if (!isPossible) {
            System.out.println("No possible split found.");
        }
    }

    public static void findSplit(int[] array, int[] group1, int[] group2, int index, int group1Index, int group2Index, int targetSum) {
        if (index == array.length) {
            int group1Sum = 0;
            int group2Sum = 0;
            for (int i = 0; i < group1Index; i++) {
                group1Sum += group1[i];
            }
            for (int i = 0; i < group2Index; i++) {
                group2Sum += group2[i];
            }
            if (group1Sum == group2Sum) {
                isPossible = true;
                System.out.print("Group 1: ");
                for (int i = 0; i < group1Index; i++) {
                    System.out.print(group1[i] + " ");
                }
                System.out.print("\nGroup 2: ");
                for (int i = 0; i < group2Index; i++) {
                    System.out.print(group2[i] + " ");
                }
                System.out.println();
            }
            return;
        }

        group1[group1Index] = array[index];
        findSplit(array, group1, group2, index + 1, group1Index + 1, group2Index, targetSum);

        group2[group2Index] = array[index];
        findSplit(array, group1, group2, index + 1, group1Index, group2Index + 1, targetSum);
    }
}
