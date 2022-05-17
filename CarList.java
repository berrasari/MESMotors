public class CarList {
    Node head = null;

    public void initialize(Car data){
       head=new Node();
       head.data = data;
       head.next=null;
       
    }
    public void printCarList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data.toString()+ " => ");
            temp = temp.next;
            
        }
        System.out.println("Null");
        
    }
}
