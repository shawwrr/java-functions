//optimised program to check a number is prime or not
import java.util.*;
public class p17 
{
    public static boolean isPrime(int n)
    {
        if(n==2)
            {
                return true;

            }   
         for(int i=2;i<=Math.sqrt(n);i++)
            {
               if(n%i==0)
                 {
                    return false;
                 }
            }
                    return true;
     }


                
                    public static void main(String args[])
                    {
                        Scanner sc=new Scanner(System.in);
                        System.out.println("Enter the number to check a number is prime or not");
                        int n=sc.nextInt();
                        if(isPrime(n)==true)
                        {
                            System.out.println("number is prime");
                        }
                        else
                        {
                            System.out.println("not prime");
                        }
                    }
    
}
