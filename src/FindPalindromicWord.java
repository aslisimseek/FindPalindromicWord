import java.util.Scanner;

public class FindPalindromicWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Plase Enter a Word..:");
        String userWord = scanner.nextLine();
        System.out.println("Result is palindromic ..:" + isPalindromicWord(userWord));

    }

    private static boolean isPalindromicWord(String userWord) {
        String reverseWord = "";
        for (int i = userWord.length() - 1; i >= 0; i--) {
            reverseWord += userWord.charAt(i);
        }
        if (userWord.equals(reverseWord))
            return true;
        else
            return false;
    }
}
