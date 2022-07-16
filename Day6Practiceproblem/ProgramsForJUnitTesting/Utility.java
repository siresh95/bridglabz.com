
public class Utility {
    public static boolean isNumber(String st)
    {
        if(st.charAt(0)=='-' && st.charAt(0)=='+')
        {
            for(int i=0;i<st.length();i++)
                if(Character.isDigit(st.charAt(i))==false)
                    return false;
            return true;
        }
        else
        {
            for(int i=0;i<st.length();i++)
                if(Character.isDigit(st.charAt(i))==false)
                    return false;
            return true;
        }
    }
    static int pw=1;
    private static int check2Power(int no)
    {
        int flag=0;
        while(no%2==0)
        {
            if(no%2==0)
            {
                no=no/2;
                pw++;
                //System.out.println(pw);
            }
            if( no/2==1 && no%2==0)
            {
                flag=1;
                break;
            }
        }
        System.out.println("Power:"+pw);
        return flag;
    }
    public static String toBinary(int dec)
    {
        String binaryDigit ="";

        while(dec>=1)
        {
            binaryDigit +=dec%2;
            dec = dec/2;
        }
        String st="";
        if(binaryDigit.length()<8)
        {
            String s = "00000000";

            st= s.substring(0,8-binaryDigit.length());
            //System.out.println("sign Bit: "+st);
        }
        for(int i=binaryDigit.length()-1;i>=0;i--)
        {
            st +=binaryDigit.charAt(i);
        }
        return st;
    }
    public static int toDecimal(int bin)
    {
        int decimal=0;
        int base=1;
        int temp=bin;

        while(temp!=0)
        {
            int lastDigit = temp%10;
            temp = (int)temp/10;

            decimal +=lastDigit*base;
            base=base*2;
        }
        return decimal;
    }
    public static boolean power2(int decimal)
    {
        if(decimal==0)
            return false;
        while(decimal!=1)
        {
            if(decimal%2==0)
                return false;
        }
        return true;
    }
    public static int binToDec(int bin)
    {
        int dec=0;
        int count=0;
        do {
            int r = bin%10;
            dec += r*Utility.pow(2,count);
            bin = bin/10;
            count++;
        }while(bin!=0);
        return dec;
    }
    private static int pow(int i, int p)
    {
        int pw=1;
        while(p>0)
        {
            pw=pw*i;
            p--;

        }
        return pw;
    }
    public static void countNotes(int rupees)
    {
        int ar[]= {1000,500,100,50,10,5,2,1};
        int notes=0;
        for(int i=0;i<ar.length;i++)
        {
            if(rupees/ar[i]>0)
            {
                System.out.println("No of Notes"+ar[i]+"is"+rupees/ar[i]);
                notes=notes+rupees/ar[i];
                rupees=rupees%ar[i];
            }
        }
        System.out.println(" minimum number of Notes requires is"+notes);

    }
}