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
    // TODO Auto-generated method stub
    return  " // Id: "+ myId +" // Brand: "+ brandName +" // Model: "+  model +" // Color: "+  color +" // Year: "+  year +" // Km: "+  km +" // "+  price;
}

public int getId(){
    return myId;
}
   
   
}
