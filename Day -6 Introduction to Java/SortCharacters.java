package multipleof5;

import java.util.*;

public class SortCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        System.out.println("Sorted characters: " + new String(arr));

        sc.close();
    }
}
