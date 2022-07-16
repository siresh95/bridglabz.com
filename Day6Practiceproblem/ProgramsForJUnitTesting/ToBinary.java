import java.util.Scanner;
public class ToBinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        String in;
        System.out.println("Enter the Decimal Number to Convert into binary..!");
        in=sc.next();
        while(flag)
        {
            if(Utility.isNumber(in))
            {
                flag=false;
            }
            else
            {
                System.out.println("Enter the correct Decimal Number To Covert into binary..!");
                in=sc.next();
            }
        }
        int dec = Integer.parseInt(in);

        String str =Utility.toBinary(dec);//to add substring that why converted into string from...
        int bin = Integer.parseInt(str);
        System.out.println(bin);

        int decimal = Utility.binToDec(bin);
        System.out.println(decimal);

        if(Utility.power2(decimal)==true)
            System.out.println(decimal+"is power of 2");
        else
            System.out.println(decimal+" is not power of 2");

    }
}