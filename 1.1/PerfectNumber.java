import java.util.*;

public class PerfectNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= num/2 ; i++) {
            if (num % i == 0) {
                temp = temp + i;
            }
        }
        if (num == temp) {
            System.out.println("the number is perfect");
        } else {
            System.out.println("the number is not perfect");
        }
    }
}
