import java.util.*;

class ArrayListDemo {
	public static void main(String[] args) {
		// List<Object> l = new ArrayList<Object>(); //can hold both integer and string
													 // data
		List<Integer> l = new ArrayList<Integer>(); // can hold only integer data

		// List l=new List(); This is incorrect statement because List is an interface
		// and object of interface is not possible

		l.add(30);
		l.add(10);
		l.add(20);

		System.out.println(l);

		l.remove(2);
		System.out.println(l);

		//l.add(0, "ankush"); // add at index 0 //it will not get added as it is of type String if we want to
							// store both string and integer elements then we have to use Object as a type
		System.out.println(l);

		l.add(55); // add to last
		System.out.println(l);

		// System.out.println(l.capacity()); //this is Vector's method

	}
}