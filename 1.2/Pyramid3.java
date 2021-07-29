import java.util.*;

public class Pyramid3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of pyramid");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
                                  
            for (int  j= 5-i ; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");             //here single space in "" is also important and can change the shape of the pattern
                
            }
            System.out.println();
        }
        
    }

}
