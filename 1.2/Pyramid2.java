import java.util.*;

public class Pyramid2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of pyramid");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int z = 1;
            for (int k = 5 - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + z); // here we can use z or we can just print j so z will not be required
                z++;
            }
            System.out.println();
        }
    }

}
