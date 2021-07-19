import java.util.*;

public class SelectionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements in an array of 5");
        int a[] = new int[5];

        int temp = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();

        }

        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;

        }

        System.out.println("array after selection sort is");

        for (int i = 0; i < a.length; i++) {
            System.out.print("    " + a[i]);
        }
    }
}
