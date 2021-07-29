public class ArrayEquality2 {
    public static void main(String[] args) {
        String[] s1 = { "java", "swings", "j2ee", "struts", "jsp", "hibernate" };

        String[] s2 = { "java", "struts", "j2ee", "hibernate", "swings", "jsp" };

        Arrays.sort(s1);

        Arrays.sort(s2);

        System.out.println(Arrays.equals(s1, s2)); // Output : true
    }
}

// If you want to compare two arrays which have same number of elements and same
// set of elements but in different positions, then first sort both arrays using
// Arrays.sort() method and then compare using Arrays.equals() method.