import java.util.*;

public class StringPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("the string is " + str);

        int length=str.length();
        System.out.println("the string length is " + str.charAt(0));

        int i=0,j=1,flag=0;
        for(int k=0;k<length-1;k++)
        {
            if(str.charAt(i)!=str.charAt(length-j))
                {
                 flag=1;
                }
        i++;
        j++;
        }

        if(flag==0)
        {
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }

    }
}
