
public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);

		System.out.println("Original Linked list: ");
		list.display();

		list.delete(5);
		list.delete(2);

		System.out.println("\nLinked List after deletion: ");
		list.display();
	}

}
