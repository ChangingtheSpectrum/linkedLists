public class LinkedList {
	public class Node {
		public int data; public Node next;
	}

	private Node first = null;

	public boolean isEmpty() {
		return (first == null);
	}

	public void push(Patient x) {
		Node node = new Node(); //create a node in which to place the data
		node.item = x; //new node's data is equal to specified data
		node.next = first; //points new node to first
		first = node; //changes the new node to the first!
	}

	public int pop() {
		if(isEmpty) { System.out.println("Thing's empty, man."); }
		int result = first.item; //first you have to save the first node's data into a temporary variable
		first = first.next; //then you change the first to be the second, losing the original first in the process
		return result; //you get your result
	}

	public static void main(String[] args) {
		Patient 1 = new Patient(2342, 'Jack Doe', 'Diabetes', 'M', 55342, 1908);
		1.push;
		Patient 2 = new Patient(8966, 'Mary Jane', 'NONE', 'F', 33434, 23938);
		2.push;
		Patient 3 = new Patient(2312, 'Killer Joe', 'Hepatitis B', 'M', 48594, 23932);
		3.push;
		Patient 4 = new Patient(6547, 'Nikki Semantic', 'NONE', 'F', 35783, 09845);
		4.push;

		4.pop;
		3.pop;
	}
}