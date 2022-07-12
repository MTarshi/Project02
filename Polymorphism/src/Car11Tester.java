public class Car11Tester {
    public static void main(String[] args) {
        Car11 car11=new Tesla();
        car11=new Toyota(); // re-assign the value
        car11.start();
        //Tesla tesla=new Car();*/
      /*  BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        bmw.park();
        Tesla tesla=new Tesla();
        tesla.start();
        tesla.stop();
        tesla.park();
        Toyota toyota=new Toyota();
        toyota.start();
        toyota.stop();
        toyota.park();*/ //use this method or

       /* Car11 car11=new Tesla();
        car.start();
        car.stop();
        car.park();*/ //use this method or the below method.

        //WE CAN USE DIFFERENT ABOVE WAYS TO GET THE RESULT.

        Car11[] cars={new BMW(),new Tesla(),new Toyota()};

        for (Car11 c:cars){
            c.start();
            c.stop();
            c.park();
        }

    }
}
