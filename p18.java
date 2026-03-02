import java.util.*;
public class p18 {
    public static void binToDec(int binNum)
    {
        int pow=0;
        int decNum=0;
        int myNum=binNum;
        while(binNum>0)
        {
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int)(Math.pow(2,pow)));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("the decimal of "+myNum+"="+decNum);
    }
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("input the binary number");
        int bn =sc.nextInt();
        binToDec(bn);
    }
}
