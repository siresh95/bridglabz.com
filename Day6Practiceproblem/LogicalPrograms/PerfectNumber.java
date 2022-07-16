import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = sc.nextInt();

        for (i = 1; i < number; i++)
        {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println("Number is perfect.");
        } else {
            System.out.println("Number is not perfect.");
        }
    }
}