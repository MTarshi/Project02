public interface MoveAble {
    void move();

    void park();
}
class Car implements MoveAble{

    @Override
    public void move() {
        System.out.println("A car can move");
    }
    public void park(){
        System.out.println("you can park me");
    }}
class Person implements MoveAble{

    @Override
    public void move() {
        System.out.println("Humans can move too");
    }

    @Override
    public void park() {
        System.out.println("Human can park the car");
    }
}

class Test{
    public static void main(String[] args) {
        MoveAble moveAble = new Car(); //Widening
        moveAble.move();
        ((Car)(moveAble)).park(); //narrowing

        MoveAble [] moveAbles ={new Car(),new Person()};
    }
}
