package mesMotors;

public class CarList {
    Node head = null;
    SoldCars soldCars = null;

    /**
     * Arayüzde araba eklemek tek buton kullanilacagindan initialize fonksiyonu
     * constructorin icine entegre
     * edilmistir.
     */
    CarList(Object data) {
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
    public void addCar(Object data) {
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
        Object car = searchCar(id);
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

    public Object searchCar(int id) {
        Node current = head;

        // Checks whether list is empty
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            while (current != null) {
                // Compares node to be found with each node present in the list
                if (((Car) current.data).getId() == id) {

                    return current.data;
                }

                current = current.next;
            }
            return null;
        }

    }
}
