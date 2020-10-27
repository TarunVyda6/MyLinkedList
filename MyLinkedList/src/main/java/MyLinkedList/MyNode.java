package MyLinkedList;

public class MyNode<k> {

	// uc1
	private k key;
	private MyNode<k> next;

	public MyNode(k key) {
		super();
		this.key = key;
		this.next = null;
	}

	public MyNode<k> getNext() {
		return next;
	}

	public void setNext(MyNode<k> next) {
		this.next = next;
	}

}
