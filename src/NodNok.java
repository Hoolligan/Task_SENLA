import java.util.Scanner;

/**
 * Created by Администратор on 24.08.2017.
 */
public class NodNok {
    public static void main(String[] args) {
        System.out.print("Введите 1-ое число: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("Введите 2-ое число: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("НОК: " + leastCommonMultiple(a ,b));
        System.out.println("НОД: " + greatestCommonDivisor(a, b));
    }

    private static int greatestCommonDivisor(int a, int b) {

        return b == 0 ? a : greatestCommonDivisor(b,a % b);
    }

    private static int leastCommonMultiple(int a, int b) {

        return a / greatestCommonDivisor(a,b) * b;
    }
    }

