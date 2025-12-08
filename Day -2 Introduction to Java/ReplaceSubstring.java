package multipleof5;

import java.util.*;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original string: ");
        String s = sc.nextLine();

        System.out.print("Enter substring to replace: ");
        String oldSub = sc.nextLine();

        System.out.print("Enter new substring: ");
        String newSub = sc.nextLine();

        String result = s.replace(oldSub, newSub);

        System.out.println("Modified string: " + result);

        sc.close();
    }
}
