import java.util.*;

class Armstrong {
    public static void main(String args[]) { // armstrong number is depend on the power.
                                             // 153, 3 digits so here power is 3
                                             // 1634, 4 digits so here power is 4
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();

        int temp = 0, total = 0;
        int b = a;

        while (b > 0) {

            temp = b % 10;
            total = total + temp * temp * temp;
            b = b / 10;
        }

        if (total == a) {
            System.out.println("the number is armstrong");

        } else {
            System.out.println("the number is not armstrong");
        }
    }
}