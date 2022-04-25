import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");

        int num2 = sc.nextInt();

        if (num2 >= 1 && num2 <= 100) {
            System.out.println("+");
        } else if (num2 >= -1000 && num2 <= -100) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }

        }
}
