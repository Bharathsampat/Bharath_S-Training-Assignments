package multipleof5;

import java.util.*;

public class LeftRotateDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of positions to left rotate: ");
        int k = sc.nextInt();
        k = k % n; // handle large k

        for (int r = 0; r < k; r++) {
            int first = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }

        System.out.println("Array after left rotation:");
        for (int x : arr) System.out.print(x + " ");

        sc.close();
    }
}
