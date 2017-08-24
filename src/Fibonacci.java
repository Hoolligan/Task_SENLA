import java.util.Scanner;

/**
 * Created by Администратор on 23.08.2017.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int k = new Scanner(System.in).nextInt();
        int n1 = 1;
        int n2 = 1;
        int result = n1+n2;
        System.out.print(n1+" "+n2+" ");
        while (result < k) {
            System.out.print(result + " ");
            n1 = n2;
            n2 = result;
            result = n1+n2;
        }
    }
}
