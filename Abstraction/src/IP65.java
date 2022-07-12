public interface IP65 {
    //cant have private filed. Only can have public fields.
    //No need to write public static or final, because its there by default.

    String make="Samsung";
    void wash();
}
interface FiveG{
    void speed();
}
interface FastChargeAble{
    void charging();
}
class S21Ultra implements IP65,FastChargeAble, FiveG{
    @Override
    public void wash() {
        System.out.println("you guys can wash me easy, no issues");
    }

    @Override
    public void charging() {
        System.out.println("I support fast charging now, I have implemented this requirement");
    }

    @Override
    public void speed() {
        System.out.println("you can dowload things super fast, because I support 5G");
    }

    public static void main(String[] args) {
        IP65 ip65=new S21Ultra();
        ip65.wash();
    }
}
