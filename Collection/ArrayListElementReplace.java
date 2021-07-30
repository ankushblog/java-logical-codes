import java.util.*;

class ArrayListElementReplace {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); // initial capacity 10

		System.out.println("Is ArrayList empty = " + al.isEmpty());

		al.add(10);
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(60);

		System.out.println("ArrayList before replacement = " + al);

		al.set(0, 200);
		System.out.println("ArrayList after replacement = " + al);

	}
}