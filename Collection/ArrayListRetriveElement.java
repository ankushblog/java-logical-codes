import java.util.*;

class ArrayListRetriveElement {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); // initial capacity 10
		Scanner sc = new Scanner(System.in);
		al.add(10);
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(60);

		System.out.println("Arraylist elements are " + al);

		System.out.println("Enter the element index you want to retrive  ");
		int i = sc.nextInt();
		System.out.println("element at index position " + i + " in ArrayList is = " + al.get(i));

	}
}