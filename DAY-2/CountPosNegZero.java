package multipleof5;

import java.util.*;

public class CountPosNegZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = 0, neg = 0, zero = 0;

        for (int x : arr) {
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else zero++;
        }

        System.out.println("Positive count: " + pos);
        System.out.println("Negative count: " + neg);
        System.out.println("Zero count: " + zero);

        sc.close();
    }
}
