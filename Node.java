package com.developer.LinkedList;


class Node {

	int data;
	Node next = null;

	public Node() {
		data = 0;
	}

	public Node(int d) {
		data = d;
	}

	void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	Node deleteNode(Node head, int d) {
		Node n = head;
		if (n.data == d) {
			return head.next;
		}

		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;

		}
		return head;
	}

	public int size() {
		Node head = this;
		int size = 0;
		while (head != null) {
			size++;
			head = head.next;
		}
		return size;
	}

	public void display(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

}