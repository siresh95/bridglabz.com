import java.util.*;

public class PowerOfTwo {
    
    
    public static void main( String[] args)
    {
        int num;
        int power=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        num = sc.nextInt();
        for (int i=1; i<=num; i++){
         
           power = power*2;
           System.out.println("Power of 2 is "+power);
        }

        
    }
}
