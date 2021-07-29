import java.util.*;
public class SumofDigits {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("the the number ");
        int a=sc.nextInt(); 
        int sum=0;
        while(a>0)
        {
            int temp =a%10;
            sum=sum+temp;
            a=a/10;
        }

        System.out.println("the sum of digits is "+sum);
    }
    
}
