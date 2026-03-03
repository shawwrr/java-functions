//Palindrome number is a number which on reversing is same as that of orignal one
//ex 121,11,1221 etc are palindrome.
import java.util.*;
public class palindrome {
   
   
    public static boolean isPalindrome(int pn)
    {
        int myNum=pn;
        int rem;
        int reverse=0;
        while(pn!=0)
        {
            rem=pn%10;
             
            reverse=(reverse*10)+rem;
            pn=pn/10;
        }
        
        if(reverse==myNum)
        {
            return true;
        }
        else
        {
            return false;
        }
         }
    

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to check");
        int pn=sc.nextInt();
        if(isPalindrome(pn))
        {
            System.out.println("the number is palindrome");
        }
        else
        {
            System.out.println("not a palindrome number");
        }
    }

}
