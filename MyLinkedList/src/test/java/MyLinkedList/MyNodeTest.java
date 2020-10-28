package MyLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {

	// uc2
	@Test
	public void given3NumbersToAdd_WhenAnlyse_ShouldReturnTrue() {

		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);

		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.tail.equals(myFirstNode);
		Assert.assertEquals(true, result);

	}

	// uc3
	@Test
	public void given3NumbersToAppend_WhenAnlyse_ShouldReturnTrue() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);

		boolean result = myLinkedList.tail.equals(myThirdNode) && myLinkedList.head.equals(myFirstNode);
		Assert.assertEquals(true, result);

	}

	// uc5
	@Test
	public void givenNumberToPopFirst_WhenAnlyse_ShouldReturnTrue() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		Assert.assertEquals(myFirstNode, myLinkedList.pop());

	}

	// uc6
	@Test
	public void givenNumberToPopLast_WhenAnlyse_ShouldReturnTrue() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		Assert.assertEquals(myThirdNode, myLinkedList.popLast());

	}

}
