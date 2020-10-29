package MyLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {

	// uc2
	@Test
	public void given3NumbersToAdd_WhenAnalyse_ShouldReturnTrue() {

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
	public void given3NumbersToAppend_WhenAnalyse_ShouldReturnTrue() {

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
	public void givenNumberToPopFirst_WhenAnalyse_ShouldReturnTrue() {

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
	public void givenNumberToPopLast_WhenAnalyse_ShouldReturnTrue() {

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

	// uc7
	@Test
	public void givenPresentNumberToSearch_WhenAnalyse_ShouldReturnTrue() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		Assert.assertEquals(mySecondNode, myLinkedList.search(30));

	}

	// uc7
	@Test
	public void givenAbsentNumberToSearch_WhenAnalyse_ShouldReturnNull() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		Assert.assertEquals(null, myLinkedList.search(50));

	}

	// uc8
	@Test
	public void insertingKeyBetween2Numbers_WhenAnalyse_ShouldReturnTrue() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(30, 40);
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode) && myLinkedList.head.getNext().getNext().getKey().equals(40);
		Assert.assertTrue(result);

	}

	// uc9
	@Test
	public void deletingKey_WhenAnalyse_ShouldReturnTrue() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNode<Integer> myFourthNode = new MyNode<>(40);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myFourthNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFourthNode, mySecondNode);
		myLinkedList.delete(30);
		boolean result = myLinkedList.head.equals(myFirstNode)
				&& myLinkedList.head.getNext().getNext().equals(myThirdNode);
		Assert.assertTrue(result);

	}

	@Test
	public void given3NumbersForSize_WhenAnalyse_ShouldReturnTrue() {

		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		Assert.assertEquals(3, myLinkedList.size());

	}

}
