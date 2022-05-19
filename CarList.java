public class CarList {
    Node head = null;
    /**
     * Arayüzde araba eklemek tek buton kullanilacagindan initialize fonksiyonu constructorin icine entegre
     * edilmistir.
    */
 CarList(Object data){
    
       head=new Node();
       head.data = data;
       head.next=null;
       
    
}
/**
 * Bagli listedeki arabalar yazdirilir
*/
    public void printCarList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data.toString()+ " => ");
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
}

