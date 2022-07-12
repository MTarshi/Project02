public interface DDR3 {

    void read();
    void write();
}

class SamsungRam implements DDR4{

    @Override
    public void read() {
        System.out.println("Reading speed is now 3GBp/s");
    }

    @Override
    public void write() {
        System.out.println("Writing speed is now 3GBp/s");
    }

    @Override
    public void speed() {
        System.out.println("Extra speed of 1GBPs");
    }
}
