import java.util.*;

class ArrayListConstructionWays {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>(); // initial capacity 10
		ArrayList<Integer> al2 = new ArrayList<Integer>(20);

		al1.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(20);

		ArrayList<Integer> al3 = new ArrayList<Integer>(al1);

		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al3);

	}
}