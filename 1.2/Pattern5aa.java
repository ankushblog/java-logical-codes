public class Pattern5aa {

    public static void main(String args[]) {

        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) { // to make to pyramid pointed from the top we will itereate the increasing
                                          // loop one less time
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
