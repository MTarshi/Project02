package class15;

public class Car {
    String make;
    String model;
    String color;

    public Car(String carMake, String carModel, String carColor){
        make = carMake;
        model = carModel;
        color = carColor;

    }

    public Car() {

    }

    void printInfo(){
        System.out.println("CarMake "+make+" Model "+model+" Color "+color);

    }
}
