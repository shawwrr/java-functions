//function of calculating a factorial value.
import java.util.*;
public class p15 {
    public static int factorial(int n)
    {
int f=1;
for(int i=1;i<=n;i++)
{
    f=f*i;
}
return f; 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to calculate the factorial");
        int n=sc.nextInt();
        System.out.println("the factorial of the number "+n+" is "+factorial(n));
    }
}
