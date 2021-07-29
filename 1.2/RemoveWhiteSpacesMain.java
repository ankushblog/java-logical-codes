import java.util.Scanner;

public class RemoveWhiteSpacesMain {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        char [] charArray=str.toCharArray();

        String strWithoutSpaces="";


        for(int i=0;i<charArray.length;i++)
        {
            if((charArray[i]!= ' ') && (charArray[i]!='\t'))        //here "" will cause error so ' ' are only applicable as it is storing single character
            {
                strWithoutSpaces=strWithoutSpaces+charArray[i];
            }
        }

        System.out.println("input string "+str);
        System.out.println("string without spaces "+strWithoutSpaces);

    }
}
