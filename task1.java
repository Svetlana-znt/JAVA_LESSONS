//import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
       // Scanner iScanner = new Scanner(System.in);
       // System.out.printf("Введите  число: ");
       // int i = iScanner.nextInt();
       // System.out.printf("Треугольное число: %d\n", tryangleNumber(i));
       // System.out.printf("Факториал: %d\n", factor(i));
        //iScanner.close();
  /*  }

    public static int tryangleNumber(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int factor(int n){
        if(n == 1) return 1;
        return n*factor(n-1);
    }
*/
    int n = 1000;
    int count = 1;
        while (count <= n){
            System.out.println(count);
            count++;
        }

    }

}

