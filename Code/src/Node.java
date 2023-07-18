
public class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}

class LinkedList {
	Node head;

	public void insert(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void delete(int data) {
		if (head == null) {
			return;
		}
		if (head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;
		Node prev = null;

		while (current != null && current.data != data) {
			prev = current;
			current = current.next;
		}
		if (current != null) {
			prev.next = current.next;
		}
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}

