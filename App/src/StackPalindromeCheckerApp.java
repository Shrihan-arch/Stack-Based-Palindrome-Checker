import java.util.Stack;
import java.util.Scanner;
public class StackPalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System");
        public static boolean isPalindrome(String input) {
            Stack<Character> stack = new Stack<>();

            input = input.replaceAll("\\s+", "").toLowerCase();

                for (char ch : input.toCharArray()) {
                    stack.push(ch);
                }

                for (char ch : input.toCharArray()) {
                    if (ch != stack.pop()) {
                        return false;
                    }
                }

                return true;
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                if (isPalindrome(input)) {
                    System.out.println("It is a palindrome.");
                } else {
                    System.out.println("It is not a palindrome.");
                }

                scanner.close();
            }
        }
    }

