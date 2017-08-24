import java.util.Scanner;

/**
 * Created by Администратор on 24.08.2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Напишите слово: ");
        String s = new Scanner(System.in).nextLine();
        isPalindrome(s);
    }

    public static String reverseString(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }

    public static boolean isPalindrome(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println("Слово является полиндромным");
        }else {
        System.out.println("Слово не является полиндромным");}
        return s.equals(reverseString(s));

    }
}
