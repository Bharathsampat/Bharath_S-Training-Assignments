package multipleof5;

import java.util.*;

public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : arr) set.add(x);

        System.out.println("Array after removing duplicates:");
        for (int x : set) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
