//binomial coefficient calculator
import java.util.*;
public class p16
{
    public static int factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
             f=f*i;
        }
        return f;
     }

        public static int BC(int n,int r)
        {
            int a=factorial(n);
            int b=factorial(r);
            int c=factorial(n-r);
            int d=a/(b*c);
            return d;
         }
    public static void main(String[] args)
         {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the value of n");
            int n= sc.nextInt();
            System.out.println("enter the value of r");
            int r= sc.nextInt();
            int binocoeff=BC(n,r);
            System.out.println("the binomial coeff is "+binocoeff);
        }
 }