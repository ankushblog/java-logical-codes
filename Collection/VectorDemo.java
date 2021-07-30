import java.util.*;

class VectorDemo {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<Object>(); // Everything is same between arrayList and Vector only difference is
		// every method in Vector is synchronized( only one thread can access vector
		// object at a time)
		v.add(30);
		v.add(10);
		v.add(20);

		System.out.println(v);

		v.remove(2);
		System.out.println(v);

		v.add(0, "ankush"); // add at index 0
		System.out.println(v);

		v.add(55); // add to last
		System.out.println(v);

		System.out.println(v.capacity());

	}
}