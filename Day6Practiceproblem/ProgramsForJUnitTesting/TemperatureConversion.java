import java.util.Scanner;
public class TemperatureConversion
{
    public static void tempConversion()
    {
        int ch;
        double Celsius;
        double Fahrenheit;
        System.out.println("Enter the Type of Conversion");
        System.out.println("Press '1' Celsius to Fahrenheit");
        System.out.println("Press '2' Fahrenheit to Celsius");

        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();

        switch (ch) {
            case 1 -> {
                System.out.println("Enter Temperature in Celsius");
                Celsius = sc.nextDouble();
                double result1 = fahrenheit(Celsius);// calling method
                System.out.println("Temperature in Fahrenheit= " + result1);
            }
            case 2 -> {
                System.out.println("Enter Temperature in Fahrenheit");
                Fahrenheit = sc.nextDouble();
                double result2 = celsius(Fahrenheit);// calling method
                System.out.println("Temperature in Celsius = " + result2);
            }
            default -> System.out.println("Enter valid choice");
        }
        sc.close();
    }

    public static double fahrenheit(double Celsius)
    {
        return (Celsius * 9 / 5) + 32;
    }

    public static double celsius(double Fahrenheit)
    {
        return (Fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args)
    {
        // calling method
        tempConversion();
    }


}