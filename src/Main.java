import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Бир сан бериниз :");
        int num = sc.nextInt();
        int sum = 0;
        int b = 1;
        while (num >= b) {
            sum += b;
            if (b < num) {
                System.out.print(b + "+");
            } else {
                System.out.println(b + "=" + sum);
                System.out.print(" Суммада " + sum + " болду.");
            }
            b++;
        }
    }
}