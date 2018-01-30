package linkedlist;

public class CustomLinkedList<T> {
	private Node head;
	private Node tail;
	private class Node {
		private T data;
		private Node next;
		public Node(T data) {
			this.data = data;
			next = null;
		}
	}
	private int size = 0;
	
	public void addFirst(T input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next == null) {
			tail = head;
		}
	}
	
	public void addLast(T input) {
		Node newNode = new Node(input);
		if(size == 0) {
			addFirst(input);
		}else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	public void add(int index, T input) {
		Node newNode = new Node(input);
		Node beforeNode = findNode(index - 1);
		Node indexNode = beforeNode.next;
		beforeNode.next = newNode;
		newNode.next = indexNode;
		if(newNode.next == null) {
			tail = newNode;
		}
	}
	
	Node findNode(int index) {
		Node x = head;
		for(int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}
}
