public abstract class AbsPhoneTask {

    abstract void displayPictures();
    abstract void unlock();

    void sendText(){
        System.out.println("Use the messaging app to send the message");
    }

}
class Iphone extends AbsPhoneTask{
    @Override
    void displayPictures(){
        System.out.println("Use the photos app to display the pictures");
    }
    @Override
    void unlock(){
        System.out.println("Use FaceID to unlock the phone");
    }
}
class Samsung extends AbsPhoneTask{

    @Override
    void displayPictures() {
        System.out.println("Use the Gallery to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("Use fingerprint to unlock your Samsung");
    }
}
class AbsPhoneTaskTester {
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.displayPictures();

    }
}



