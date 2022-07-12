package class15;

public class Dogs {
    //OBJECT CONSTRUCTOR.

    String name;
    String breed;
    String color;
    int age;
    double weight;

    Dogs(){
        String name;
        String breed;
        String color;
        int age;
        double weight;
    }

    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" color "+color+" Weight "+weight);
    }

    public static void main(String[] args) {
        Dogs dog1 = new Dogs();
        dog1.name = "Lofy";
        dog1.breed = "German";
        dog1.color = "Black";
        dog1.age = 15;
        dog1.weight = 20;
        dog1.printInfo();

        Dogs dog2 = new Dogs();
        dog2.name = "Gufo";
        dog2.breed = "American";
        dog2.color = "White";
        dog2.age = 10;
        dog2.weight = 200;
        dog2.printInfo();
    }
}
