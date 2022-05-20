package mesMotors;
/**
 * Gelen müsteriler hizmet almak icin kuyruk yapisinda alinir.
 * Ilk gelen ilk hizmet alir seklinde bir yapi kullanilmis olur.
*/
public class CustomerQueue {

	public int maxSize;
	public Customer[] customerQueueArray;
	public int front;
	public int rear;
	public int elementNumber;

	// Constructor olusturuluyor.
	public CustomerQueue(int size) {
		maxSize = size;
		customerQueueArray = new Customer[maxSize];
		front = 0;
		rear = -1;
		elementNumber = 0;
	}

	public boolean isEmtpy() {
		if (elementNumber == 0)
			return true;
		else
			return false;
	}

	public void addCustomer(Customer element) {
		if (rear == maxSize - 1) {
			rear = -1;
		}
		rear++;
		customerQueueArray[rear] = element;
		elementNumber++;
	}

	public Customer remove() {
		front = 0;
		Customer removedElement = customerQueueArray[front++];
		if (front == maxSize) {
			front = 0;
		}
		elementNumber--;
		return removedElement;
	}

	public void printQueue() {

		System.out.println("\nCustomer is printing...");
		for (int i = 0; i <= rear; i++) {
			System.out.print( ((Customer)customerQueueArray[front]).toString()+ " -> ");
			front++;
		}
		System.out.println("null");
	}
}
