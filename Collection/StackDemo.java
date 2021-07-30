import java.util.*;

class StackDemo {
	public static void main(String[] args) {
		Stack<Object> s = new Stack<Object>();
		s.push(10);
		s.push("ankush");
		s.push(217);
		s.push("Aksks");
		System.out.println(s);

		s.pop();
		System.out.println(s);

		System.out.println(s.search(1)); // return ofset of present otherwise returns -1
	}
}