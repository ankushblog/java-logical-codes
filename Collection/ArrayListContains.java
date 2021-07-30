import java.util.*;

class ArrayListContains {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); // initial capacity 10
		Scanner sc = new Scanner(System.in);
		al.add(10);
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(60);
		System.out.println("Enter the element you want to search ");
		int i = sc.nextInt();
		System.out.println("Is ArrayList contains " + i + " = " + al.contains(i));

	}
}