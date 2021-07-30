import java.util.*;

class ArrayListCapacityChange {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>(); // initial capacity 10
		ArrayList<Integer> al2 = new ArrayList<Integer>(20); // initial capacity 20

		al1.ensureCapacity(30); // capacity will be 30 now

		System.out.println(al1);
		System.out.println(al2);

		al1.trimToSize();

	}
}