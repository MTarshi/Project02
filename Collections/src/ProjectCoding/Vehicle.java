package ProjectCoding;

public class Vehicle {

    double vPrice;
    void getSalePrice(){


    }

}
class Truck extends Vehicle{
    double weight;


    @Override
    void getSalePrice() {
        if(weight>2000){
            System.out.println("the dicount is "+(vPrice/100)*20);
        }else {
            System.out.println("the dicount is "+(vPrice/100)*10);
        }

    }

}
class Sedan extends Vehicle{
    double length;


    @Override
    void getSalePrice() {
        if(length<20){
            System.out.println("the dicount is "+(vPrice/100)*10);
        }else {
            System.out.println("the dicount is "+(vPrice/100)*5);
        }

    }

    public static void main(String[] args) {

        Truck truck=new Truck();
        truck.vPrice=55000;
        truck.weight=6000;
        truck.getSalePrice();

        Sedan sedan=new Sedan();
        sedan.length=69;
        sedan.vPrice=53000;
        sedan.getSalePrice();
    }
}
