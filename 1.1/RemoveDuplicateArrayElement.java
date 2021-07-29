public class RemoveDuplicateArrayElement {

    public static void main(String args[]) {
        int[] a = { 20, 20, 30, 30, 40, 50, 50 };

        int[] b = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] != a[i + 1]) {
                b[j] = a[i];
                j++;
            }
        }
        b[j] = a[a.length - 1];

        for (j = 0; j < a.length; j++) {
            System.out.println("    " + b[j]);
        }

    }
}
