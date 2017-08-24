import java.util.Scanner;

/**
 * Created by Администратор on 24.08.2017.
 */
public class Segment {
    public static void main(String[] args) {
        float ax1, ax2, ay1, ay2, bx1, bx2, by1, by2;
        System.out.println("Введите координату x1 первого отрезка: ");
        ax1 = new Scanner(System.in).nextFloat();
        System.out.println("Введите координату y1 первого отрезка: ");
        ay1 = new Scanner(System.in).nextFloat();
        System.out.println("Введите координату x2 первого отрезка: ");
        ax2 = new Scanner(System.in).nextFloat();
        System.out.println("Введите координату y2 первого отрезка: ");
        ay2 = new Scanner(System.in).nextFloat();
        System.out.println("Введите координату x1 второго отрезка: ");
        bx1 = new Scanner(System.in).nextFloat();
        System.out.println("Введите координату y1 второго отрезка: ");
        by1 = new Scanner(System.in).nextFloat();
        System.out.println("Введите координату x2 второго отрезка: ");
        bx2 = new Scanner(System.in).nextFloat();
        System.out.println("Введите координату y2 второго отрезка: ");
        by2 = new Scanner(System.in).nextFloat();

        if (intersection(ax1, ax2, ay1, ay2, bx1, bx2, by1, by2)) {
            System.out.println("Данные отрезки пересекутся!");
        }else
            System.out.println("Данные отрезки не пересекутся!");
        }


    public static boolean intersection(float ax1, float ax2, float ay1, float ay2, float bx1, float bx2, float by1, float by2) {

        float s1 = (bx2-bx1)*(ay1-by1) - (by2-by1)*(ax1-bx1);
        float s2 = (bx2-bx1)*(ay2-by1) - (by2-by1)*(ax2-bx1);
        float s3 = (ax2-ax1)*(by1-ay1) - (ay2-ay1)*(bx1-ax1);
        float s4 = (ax2-ax1)*(by2-ay1) - (ay2-ay1)*(bx2-ax1);

        return (s1*s2 < 0) && (s3*s4 < 0);
    }
}
