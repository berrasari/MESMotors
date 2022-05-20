package mesMotors;
public class Customer {
    private String name ;
    Car customerCar;
    
    public Customer(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    @Override
public String toString() {
    return  " // Name: "+ getName()  ;
}
}
