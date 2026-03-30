package LAB5;
import java.util.Scanner;
public class Prob2 {
    // Change case of string
    static void changeCase(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }
    // Reverse string
    static void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed string: " + sb.reverse());
    }
    // Compare two strings
    static void compareStrings(String str1, String str2) {
        int diff = str1.compareTo(str2);
        System.out.println("Difference between ASCII values: " + diff);
    }
    // Insert one string into another
    static void insertString(String str1, String str2) {
        System.out.println("String after insertion: " + str1 + " " + str2);
    }
    // Check character presence
    static void checkCharacter(String str, char ch) {
        int pos = str.indexOf(ch);
        if (pos == -1) {
            System.out.println("Entered character is not present");
        } else {
            System.out.println("Position of entered character: " + pos);
        }
    }
    // Palindrome check
    static void checkPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("Entered string is palindrome");
        } else {
            System.out.println("Entered string is not a palindrome");
        }
    }
    // Count words, vowels, consonants
    static void countWordsVowelsConsonants(String str) {
        String[] words = str.trim().split("\\s+");
        int wordCount = words.length;
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("No. of words: " + wordCount);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        char ch;
        int choice;

        do {
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Change case of string");
            System.out.println("2. Reverse string");
            System.out.println("3. Compare two strings");
            System.out.println("4. Insert one string into another");
            System.out.println("5. Convert to uppercase and lowercase");
            System.out.println("6. Check character presence");
            System.out.println("7. Check palindrome");
            System.out.println("8. Count words, vowels, consonants");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    str1 = sc.nextLine();
                    changeCase(str1);
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    str1 = sc.nextLine();
                    reverseString(str1);
                    break;
                case 3:
                    System.out.print("Enter first string: ");
                    str1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    str2 = sc.nextLine();
                    compareStrings(str1, str2);
                    break;
                case 4:
                    System.out.print("Enter first string: ");
                    str1 = sc.nextLine();
                    System.out.print("Enter string to insert: ");
                    str2 = sc.nextLine();
                    insertString(str1, str2);
                    break;
                case 5:
                    System.out.print("Enter a string: ");
                    str1 = sc.nextLine();
                    changeCase(str1);
                    break;
                case 6:
                    System.out.print("Enter a string: ");
                    str1 = sc.nextLine();
                    System.out.print("Enter a character: ");
                    ch = sc.next().charAt(0);
                    checkCharacter(str1, ch);
                    break;
                case 7:
                    System.out.print("Enter a string: ");
                    str1 = sc.nextLine();
                    checkPalindrome(str1);
                    break;
                case 8:
                    System.out.print("Enter a string: ");
                    str1 = sc.nextLine();
                    countWordsVowelsConsonants(str1);
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);
        sc.close();
    }
}