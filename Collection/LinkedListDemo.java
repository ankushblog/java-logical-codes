import java.util.*;

class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<Object>();
		l.add(30);
		l.add(10);
		l.add(20);

		System.out.println(l);

		l.remove(2);
		System.out.println(l);

		l.add(0, "ankush"); // add at index 0
		System.out.println(l);

		l.add(55); // add to last
		System.out.println(l);

	}
}