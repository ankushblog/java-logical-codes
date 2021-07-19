import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements in an array of 5");
        int a[]=new int[5];
        int temp=0;
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();

        }


        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        System.out.println("elements in an array are ");
        for(int i=0;i<5;i++)
        {
            System.out.print("  "+a[i]);

        }
    }
}
