import java.util.Scanner;

/**
 * Created by Администратор on 23.08.2017.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Простые числа: ");
        for (int i = 0; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                if (j != i && i % j == 0) {
                    break;
                } else if (j == i) {
                    System.out.print(i + " ");
                }
            }
        }


    }
}
