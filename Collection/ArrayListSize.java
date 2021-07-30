import java.util.*;

class ArrayListSize {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>(); // initial capacity 10

		al.add(10);
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(60);

		int i = al.size();

		System.out.println(al);
		System.out.println("Arraylist size= " + i);

		al.add(20);
		al.add("aa");
		al.add("av");
		al.add(40);

		i = al.size();

		System.out.println(al);
		System.out.println("Arraylist size= " + i);

	}
}