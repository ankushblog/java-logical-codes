import java.util.*;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp=0,temp1=0,temp2=1;
        
        System.out.print(temp1+" "+temp2);
        while(num>0)
        {
            temp=temp1+temp2;
            temp1=temp2;
            temp2=temp;
            System.out.print(" "+temp);
            num--;
        }
    }
}
