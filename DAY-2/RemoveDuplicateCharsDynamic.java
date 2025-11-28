package multipleof5;

import java.util.*;

public class RemoveDuplicateCharsDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        StringBuilder result = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            if (set.add(c)) {  // true if not already present
                result.append(c);
            }
        }

        System.out.println("After removing duplicate characters: " + result);

        sc.close();
    }
}
