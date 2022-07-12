public class Animal22 { //if we add FINAL no one can inherate from this class.

    Animal22(){
        System.out.println("Parent");
    }
    void eat(){
        System.out.println("All the animals eat");
    }
}
class Panda extends Animal22{

    void eat(){
        System.out.println("All the animals eat");
    }
    Panda(){
        System.out.println("Child");
    }

}
class Tester{
    public static void main(String[] args) {
        new Panda();
    }
}