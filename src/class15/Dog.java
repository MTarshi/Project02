package class15;

public class Dog {
    static String name;
    String color;
    static int numberOfLegs =4;

    public static void main(String[]args){
        Dog dog1=new Dog(); //creating an object of Dog class
        dog1.name = "Tommy";
        dog1.color = "Pink";

        Dog dog2 = new Dog();
        dog2.name = "Fido";
        dog2.color = "Black";

        Dog dog3 = new Dog();
        dog3.name = "jaja";
        dog3.color = "White";

        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);
        System.out.println(dog2.color);



    }
}
