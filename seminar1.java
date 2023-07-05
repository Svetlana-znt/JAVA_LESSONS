import java.util.Scanner;

public class seminar1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите  число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", tryangleNumber(i));
        iScanner.close();
    }

    public static int tryangleNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}
