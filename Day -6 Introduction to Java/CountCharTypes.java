package multipleof5;

import java.util.*;

public class CountCharTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int digits = 0, letters = 0, special = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) digits++;
            else if (Character.isLetter(c)) letters++;
            else special++;
        }

        System.out.println("Digits: " + digits);
        System.out.println("Alphabets: " + letters);
        System.out.println("Special characters: " + special);

        sc.close();
    }
}
