package mesmotors;

public class CustomerQueue {

    public static int maxSize;
    public static Customer[] customerQueueArray;
    public static int front;
    public static int rear;
    public static int elementNumber;

    // Constructor olusturuluyor.
    public CustomerQueue() {
        maxSize = 100;
        customerQueueArray = new Customer[maxSize];
        front = 0;
        rear = -1;
        elementNumber = 0;
    }
    
    public void createDefaultCustomer(){
        addCustomer(new Customer("Berra SARI"));
        addCustomer(new Customer("İsmail Can Varlı"));
        addCustomer(new Customer("Mahmut TUNCER"));
    }

    public boolean isEmtpy() {
        if (elementNumber == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void addCustomer(Customer element) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;
        customerQueueArray[rear] = element;
        elementNumber++;
    }

    public static Customer removeCustomer() {
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
            System.out.print(((Customer) customerQueueArray[front]).toString() + " -> ");
            front++;
        }
        System.out.println("null");
    }
}
