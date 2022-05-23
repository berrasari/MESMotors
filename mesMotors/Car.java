package mesmotors;

public class Car {

    private static int nextId = 1;
    private int myId;

    String brandName;
    String model;
    String colour;
    int year;
    int km;
    int price;
    public Car data;
    
   

    public Car(String brandName, String model, String colour, int year, int km, int price) {
        myId = nextId++;
        this.brandName = brandName;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.km = km;
        this.price = price;
    }

    Car() {
       
    }

    @Override
    public String toString() {
        return "// Id:" + String.format("%" + 5 + "s", myId)
                + " // Brand:" + String.format("%" + 11 + "s", brandName)
                + " // Model: " + String.format("%" + 10 + "s", model)
                + " // Colour: " + String.format("%" + 7 + "s", colour)
                + " // Year: " + String.format("%" + 5 + "s", year)
                + " // Km:" + String.format("%" + 10 + "s", km)
                + " // Price:" + String.format("%" + 10 + "s", price) + " TL ";
    }

    public int getId() {
        return myId;
    }

    public int getPrice() {
        return price;
    }
}
