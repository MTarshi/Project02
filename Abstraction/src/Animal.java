public interface Animal {

    void sleep();
    void eat();
}
interface Dog extends Animal{
    void bark();
}
class Husky implements Dog{
    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void bark() {
        System.out.println("Dogs favorite things");
    }
}
