public class Car11 {
    void start(){
        System.out.println("Use keys to start me");
    }
    void stop(){
        System.out.println("Use breaks to stop me");
    }
    void park(){
        System.out.println("you can park me manually");
    }
}
class BMW extends Car11 {
    @Override
    void start() {
        System.out.println("You can use push start button to start me");
    }

    @Override
    void stop() {
        System.out.println("you can use auto breaking or manual to stop me");
    }

    @Override
    void park() {
        System.out.println("you can use the auto parking feature to park me");
    }
}
    class Tesla extends Car11{
        @Override
        void start() {
            System.out.println("you can start me from app");
        }

        @Override
        void stop() {
            System.out.println("You can use auto braking to stop me");
        }

        @Override
        void park() {
            System.out.println("I can park myself");
        }
    }
    class Toyota extends Car11{

    }

