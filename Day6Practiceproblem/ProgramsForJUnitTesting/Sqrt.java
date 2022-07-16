//package Day6Practiceproblem.ProgramsForJUnitTesting;

import java.util.Scanner;
public class Sqrt
{
    public static void main(String[] args) throws Exception {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("enter no to find square root");
            double c = s.nextDouble();
            System.out.println("square root is " + Util.sqrt(c));
            s.close();
        } catch (Exception e) {
            System.out.println("inter integer value "+e.getMessage());
        }

    }
}