package MyLinkedList;

//uc2
public class MyLinkedList<k> {

	INode<k> head;
	INode<k> tail;

	public MyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}

	// adds node to the tail
	public void add(INode<k> myNode) {

		if (this.tail == null) {
			this.tail = myNode;
		}

		if (this.head == null) {
			this.head = myNode;
		} else {
			INode<k> tempNode = this.tail;
			this.head = myNode;
			myNode.setNext(tempNode);
		}
	}

	// uc3 it adds node to the head
	public void append(INode<k> myNode) {

		if (this.head == null) {
			this.head = myNode;
		}
		if (this.tail == null) {
			this.tail = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	// uc5 remove the first element present and return its value
	public INode<k> pop() {

		INode<k> tempNode = this.head;
		this.head = tempNode.getNext();
		return tempNode;
	}

	// uc6 removes the last element present and return its value
	public INode<k> popLast() {

		INode<k> prevNode = head;
		while (!prevNode.getNext().equals(tail)) {
			prevNode = prevNode.getNext();
		}
		INode<k> tempNode = tail;
		prevNode.setNext(null);
		tail = prevNode;
		return tempNode;
	}

	// uc7 searches for an element if present returns true and if absent returns
	// false
	public boolean search(k key) {
		INode<k> temp = head;
		while (temp != tail) {
			if (temp.getKey() == key)
				return true;
			temp = temp.getNext();
		}
		return false;
	}

}
