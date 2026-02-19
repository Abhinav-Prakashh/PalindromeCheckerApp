import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");
        System.out.println();
        System.out.print("Input text: ");
        String word = input.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? " + isPalindrome);
    }
}