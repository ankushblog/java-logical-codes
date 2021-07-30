import java.util.*;

class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(33);
		al.add(15);
		al.add(44);

		Object[] arr = al.toArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}