package MyLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {

	// uc2
	@Test
	public void given3Numbers_WhenAnlyse_ShouldReturnTrue() {

		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);

		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.tail.equals(myFirstNode);
		Assert.assertEquals(true, result);

	}

}
