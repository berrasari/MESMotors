package mesMotors;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Emloyee emloyee = new Emloyee();
        CustomerQueue customerQueue = new CustomerQueue(100);
        customerQueue.addCustomer(new Customer("Berra"));
        customerQueue.addCustomer(new Customer("Berra"));
        customerQueue.addCustomer(new Customer("Berra"));

        CarList carList = new CarList(new Car(" Mercedes ", " G Wagon", " White ", 2019, 25000, 5500000));
        carList.addCar(new Car("Audi", "A5", "White", 2016, 104000, 1550000));
        carList.addCar(new Car("Chevrolet", "Captiva", "White", 2012, 109000, 375000));
        carList.addCar(new Car("Kia", "Ceed", "Black", 2012, 173000, 339000));
        carList.addCar(new Car("Seat", "Ibiza", "White", 2014, 160000, 315000));
        carList.addCar(new Car("Kia", "Pro Ceed", "White", 2013, 180000, 299000));
        carList.addCar(new Car("Toyota", "Auris", "Grey", 2013, 110000, 289000));
        carList.addCar(new Car("Opel", "Insignia", "Black", 2012, 195000, 279500));
        carList.addCar(new Car("Opel", "Insignia", "White", 2010, 198000, 269500));
        carList.addCar(new Car("Opel", "Insignia", "Black", 2011, 210000, 269000));
        carList.addCar(new Car("Opel", "Insignia", "White", 2012, 213000, 259500));
        carList.addCar(new Car("Citroën", "C5", "Blue", 2010, 169000, 239000));
       // carList.printCarList();
        carList.deleteCar(9);
        carList.deleteCar(12);

       // carList.soldCars.printSoldCars();
        customerQueue.printQueue();

       
    }

}
