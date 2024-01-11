#pragma warning disable CS8321 // Unused local function
#pragma warning disable CS8322 // Local function is declared but never used
#pragma warning disable CS8323 // Local function is declared but never used
#pragma warning disable CS8414 // The private protected member is not available in C# 7.3. Please use language version 7.2 or greater.
#pragma warning disable CS8383 // 'public' modifier is not valid for this item
#pragma warning disable CS8524 // Static local functions are not supported in this language version.
#pragma warning disable CS8618 // Non-nullable field must contain a non-null value when exiting constructor. Consider declaring as nullable.
#pragma warning disable CS8602 // Dereference of a possibly null reference.
#pragma warning disable CS8604 // Possible null reference argument.
#pragma warning disable CS8608 // Possible null reference assignment.
#pragma warning disable CS8714 // Inefficient array usage. Specify the range explicitly.
#nullable enable
using System;

class Program {
    static void Main() {
        // 1. Define and initialize the integer array
        int[] intArray = { 56, 77, 23, 12, 88, 59, 97, 33, 38, 64 };

        // 2. Define the string array
        string[] stringArray = new string[10];

        // 3. Define and implement the findMax function
        static int findMax(int[] arr, int size) {
            int max = arr[0];
            int maxIndex = 0;
            for (int i = 1; i < size; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }
            return maxIndex;
        }

        // 4. Define and implement the evenOrOdd function
        static void evenOrOdd(int[] intArr, string[] strArr, int size) {
            for (int i = 0; i < size; i++) {
                if (intArr[i] % 2 == 0) {
                    strArr[i] = "even";
                } else {
                    strArr[i] = "odd";
                }
            }
        }

        // Call the functions and print the results
        int maxIndex = findMax(intArray, 10);
        Console.WriteLine("The largest number in the array is {0} located at array index {1}.", intArray[maxIndex], maxIndex);

        Console.WriteLine("The numbers were:");
        for (int i = 0; i < 10; i++) {
            Console.WriteLine("{0} is {1}", intArray[i], stringArray[i]);
        }

        evenOrOdd(intArray, stringArray, 10);

        Console.WriteLine("The numbers are now:");
        for (int i = 0; i < 10; i++) {
            Console.WriteLine("{0} is {1}", intArray[i], stringArray[i]);
}
}
}