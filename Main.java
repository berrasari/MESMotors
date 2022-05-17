public class Main {
   
    public static void main(String[] args) {
        Emloyee e1 = new Emloyee();
        Car c1 = new Car( 1,  " Mercedes ",  " G Wagon",  " White ",  2019,  25000,  5500000);
        CarList l1 = new CarList();
        l1.initialize(c1);
        l1.printCarList();
        
     
    } 
   
    }
    