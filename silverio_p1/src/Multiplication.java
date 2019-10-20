import java.util.Scanner;
import java.util.Random;
public class Multiplication {
    public static void Multiplication() {
        int num1 = 0;
        int num2 = 0;
        int answer = 0;
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        num1 = r.nextInt(10);
        num2 = r.nextInt(10);

        System.out.println(num1 + " times " + num2 + " = ? ");
        answer = in.nextInt();

        if (answer == (num1 * num2)) {
            System.out.println("very good!");
            Multiplication();
        } else {
            while (answer != (num1 * num2)) {
                System.out.println("No. Please try again.>again.");
                answer = in.nextInt();
            }
            Multiplication();
        }
    }

    public static void main(String[] args)
    {
        Multiplication();
    }
}
