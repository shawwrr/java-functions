import java.util.*;
public class p19
 {
    public static int decToBin(int dec)
    {
       
        int pow=0;
        int decNum=0;
        while(dec>0)
        {
         int rem=dec%2;
        decNum=decNum+(int)(rem*Math.pow(10,pow));
                     pow++;
                     dec=dec/2;
                     
                     }
                     return decNum; 
         
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the decimal number u want to convert");
        int dec=sc.nextInt();
        System.out.println("the binary value of "+dec+" is "+decToBin(dec));
    }
}