import java.util.*;
public class NumReverse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int a= num;
        int rem=0;
        int reverse=0;
        while(a>0)
        {
            rem=a%10;
            reverse=reverse*10+rem;
            a=a/10;
     
        }
        System.out.println("reverse is "+reverse);
    }

}
