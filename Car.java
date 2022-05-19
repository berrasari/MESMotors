// Car classi Node olarak kullanilacaktir.
public class Car {
   String brandName;
   String model;
   String color;
   int year;
   int km;
   int price;
public Car(){};
public Car( String brandName, String model, String color, int year, int km, int price) {

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
    return " // Brand: "+ brandName +" // Model: "+  model +" // Color: "+  color +" // Year: "+  year +" // Km: "+  km +" // "+  price;
}
   
   
}
