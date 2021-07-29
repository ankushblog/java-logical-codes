import java.util.Scanner;

class InsertionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int temp;

        System.out.println("Enter Elements of an array");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < a.length; i++) {
            temp = a[i];        40
            int j = i;      // 2

            while (j > 0 && a[j - 1] > temp) {      //10 20 40 30 12
                a[j] = a[j - 1];
                j = j - 1;
            }
            a[j] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print("  " + a[i]);
        }

    }
}