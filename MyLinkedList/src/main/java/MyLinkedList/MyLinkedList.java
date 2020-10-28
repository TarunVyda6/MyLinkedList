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

	// uc3
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

	// uc5
	public INode<k> pop() {

		INode<k> tempNode = this.head;
		this.head = tempNode.getNext();
		return tempNode;
	}

}
