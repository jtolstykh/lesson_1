import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");

        int num1 = sc.nextInt();

        if (num1 > 100000) {
            System.out.println("Большое число");
        } else {
            System.out.println("Небольшое число");
        }


    }
}
