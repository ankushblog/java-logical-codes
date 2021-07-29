import java.util.*;

public class Pyramid4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of pyramid");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ")
                
            }
            for (int k = 5-i; k >= 1; k--) {
                System.out.print(k+" "); 
                
            }
            System.out.println();
        }
    }

}
