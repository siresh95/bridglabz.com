import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args)
    {

        int i, number = 0 , flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        number= n/2;
        if (n==0 || n==1)
        {
            System.out.println("number is not prime number.");
        }
        else
        {
            for (i=2;i<=number;i++)
            {
                if (n%i==0)
                {
                    System.out.println("number is not prime number.");
                    flag=1;
                    break;
                }
            }
            if (flag==0)
            {
                System.out.println("number is prime number.");
            }
        }
    }
}