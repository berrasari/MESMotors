package mesMotors;

import javafx.scene.paint.Stop;

public class CarList {
    Node head = null;
    SoldCars soldCars = null;


    /**
     * Arayüzde araba eklemek tek buton kullanilacagindan initialize fonksiyonu
     * constructorin icine entegre
     * edilmistir.
     */
    CarList(Car data) {
        soldCars = new SoldCars(); 
        head = new Node();
        head.data = data;
        head.next = null;

    }

    /**
     * Bagli listedeki arabalar yazdirilir
     */
    public void printCarList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.toString() + " => ");
            temp = temp.next;
            System.out.println(" ");
        }
        System.out.println("Null");

    }

    /**
     * Bu islemde bagli listenin sonuna eleman eklenir
     */
    public void addCar(Car data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean deleteCar(int id) {
        Car car = linearSearchCar(id);
        boolean durum = false;
        Node current = head;
        Node tmp = null;
        if (current.data == car) {
            tmp = current.next;
            head = tmp;
        } else {
            while (current.next != null) {
                if (current.next.data == car) {
                    tmp = current.next;
                    current.next = tmp.next;
                    durum = true;
                    soldCars.push(car);
                    
                    break;
                }
                current = current.next;
            }
        }
        return durum;
    }
/**
 * Girilen araba idsinin ait oldugu araba , linear search algoritmasi kullanilarak aranip bulunur. 
*/
    public Car linearSearchCar(int id) {
        Node current = head;

        
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            while (current != null) {
                
                if (((Car) current.data).getId() == id) {

                    return current.data;
                }

                current = current.next;
            }
            return null;
        }

    
    }
    /**
     * Quick sort algoritmasi ile Nodelarda data olarak bulunan arabalarin fiyatlari karsilastirilmis ve
     * sonuc olarak arabalar fiyati düsükten yüksege dogru siralanmistir.
    */
    
    public  void toHighPrice(){
        System.out.println("\nSORTING BY INCREASING PRICE ...");
        System.out.println(" ");
        Node n = head;
		while (n.next != null){
			n = n.next;
        }
        Node start = head;
        Node end =n;
        sort(start, end);
        
    }
    public  void toLowPrice(){
        System.out.println("\nSORTING BY DECRISING PRICE ...");
        System.out.println(" ");
        Node n = head;
		while (n.next != null){
			n = n.next;
        }
        Node start = head;
        Node end =n;
        sort_2(start, end);
        
    }
    
    Node paritionLast(Node start, Node end)
	{
		if (start == end || start == null || end == null)
			return start;

		Node pivot_prev = start;
		Node curr = start;
		Car pivot = end.data;

		/**
         * Sonuncudan bir öncekine kadar ilerlenir*/ 
		while (start != end) {
       
			if (((Car)(start.data)).price < pivot.price) {
				/** Son degisen elemena kadar takip eder.
                 * */ 
				pivot_prev = curr;
				Car temp = curr.data;
				curr.data = start.data;
				start.data = temp;
				curr = curr.next;
			}
			start = start.next;
		}

	
		Car temp = curr.data;
		curr.data = pivot;
		end.data = temp;

		
		return pivot_prev;
	}
    

	void sort(Node start, Node end)
	{
		if(start == null || start == end|| start == end.next )
			return;

		Node pivot_prev = paritionLast(start, end);
		sort(start, pivot_prev);
		
		if (pivot_prev.data != null && ((Car)pivot_prev.data).price == ((Car)start.data).price)
			sort(pivot_prev.next, end);

		else if (pivot_prev.data != null
				&& pivot_prev.next.data != null)
			sort(pivot_prev.next.next, end);
	}
    Node paritionLast_2(Node start, Node end)
	{
		if (start == end || start == null || end == null)
			return start;

		Node pivot_prev = start;
		Node curr = start;
		Car pivot = end.data;

		/**
         * Sonuncudan bir öncekine kadar ilerlenir*/ 
		while (start != end) {
       
			if (-((Car)(start.data)).price < -pivot.price) {
				/** Son degisen elemena kadar takip eder.
                 * */ 
				pivot_prev = curr;
				Car temp = curr.data;
				curr.data = start.data;
				start.data = temp;
				curr = curr.next;
			}
			start = start.next;
		}

	
		Car temp = curr.data;
		curr.data = pivot;
		end.data = temp;

		
		return pivot_prev;
	}
    void sort_2(Node start, Node end)
	{
		if(start == null || start == end|| start == end.next )
			return;

		Node pivot_prev = paritionLast_2(start, end);
		sort_2(start, pivot_prev);
		
		if (pivot_prev.data != null && ((Car)pivot_prev.data).price == ((Car)start.data).price)
			sort_2(pivot_prev.next, end);

		else if (pivot_prev.data != null
				&& pivot_prev.next.data != null)
			sort_2(pivot_prev.next.next, end);
	}
}
