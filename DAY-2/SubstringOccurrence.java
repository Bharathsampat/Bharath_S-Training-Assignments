package multipleof5;

import java.util.*;

public class SubstringOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String text = sc.nextLine();

        System.out.print("Enter substring to search: ");
        String sub = sc.nextLine();

        int count = 0;
        int index = 0;

        System.out.print("Found at positions (starting index): ");

        while ((index = text.indexOf(sub, index)) != -1) {
            System.out.print(index + " ");
            count++;
            index = index + 1; // move ahead for overlapping also
        }

        System.out.println("\nTotal occurrences: " + count);

        sc.close();
    }
}
