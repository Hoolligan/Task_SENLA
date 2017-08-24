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
        int c = a * b / (greatestCommonDivisor(a, b));//Наименьшее общее кратное
        System.out.print("НОК: ");
        System.out.println(c);
        System.out.println("НОД: " + greatestCommonDivisor(a, b));
    }

    private static int greatestCommonDivisor(int a, int b) {//Наибольший общий делитель
        while (a != b) {
            if (a < b) {
                b -= a;
            }
            if (a > b) {
                a -= b;
            }
        }
        return a;
    }
    }

