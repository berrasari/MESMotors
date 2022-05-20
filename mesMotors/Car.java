package mesMotors;
// Car classi Node olarak kullanilacaktir.
public class Car {
    private static int nextId = 1;
    private  int myId;

   String brandName;
   String model;
   String color;
   int year;
   int km;
   int price;
public Car data;

public Car( String brandName, String model, String color, int year, int km, int price) {
    myId = nextId++;
    this.brandName = brandName;
    this.model = model;
    this.color = color;
    this.year = year;
    this.km = km;
    this.price = price;
}
@Override
public String toString() {
    return  "// Id:"+ String.format("%" + 5 + "s", myId) +" // Brand:"+ String.format("%" + 11 + "s", brandName) +" // Model: "+  String.format("%" + 10 + "s", model) +"   // Color: "+  String.format("%" + 7 + "s", color) +"   // Year: "+  String.format("%" + 5 + "s", year) +"   // Km:"+  String.format("%" + 10 + "s", km) +"   // Price:"+  String.format("%" + 10 + "s", price)+" TL ";
}

public int getId(){
    return myId;
}
public int getPrice(){
    return price;
}   
   
}
