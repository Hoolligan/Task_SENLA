import java.util.Scanner;

/**
 * Created by Администратор on 24.08.2017.
 */
public class DeleteNumber {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        String s = new Scanner(System.in).nextLine();
        s = s.replaceAll("[0-9]", "");
        System.out.println(s);
    }
}
