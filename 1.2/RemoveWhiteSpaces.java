import java.util.Scanner;

public class RemoveWhiteSpaces {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        String str1 = str.replaceAll("\\s+", "");

        System.out.println("string after removing the white spaces " + str1);

    }
}

// “\\s+”Vs“\\s”:

// Both of these strings, when passed to replaceAll() method, produce the same
// result with almost same performance. But, when the number of consecutive
// spaces increases, “\\s+” is slightly faster than “\\s”. Because, it replaces
// set of consecutive multiple spaces
// with the replacement string at a time rather than replacing one by one.
// trim() method trims the given string i.e it removes the white spaces at the
// beginning and at the end of a string, not between the words.