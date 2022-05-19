package mesMotors;
public class SoldCars {
    Node head=null;
        
        public void push( Object data){
            Node node=new Node();
            node.data=data;
            Node temp=head;
            
                head=node;
                node.next=temp;
            
        }
       
 
        void isEmpty(){
            if(head==null){
                System.out.println("stack yap�s� bo�tur.");
            }else{
                System.out.println("stack var.");
            }
            
        }
        
        
        void printSoldCars(){
             Node temp=head;
             while(temp!=null){
                 System.out.print(temp.data.toString());
                 temp=temp.next;
                 System.out.println(" "); 
             }
             
        }
    }