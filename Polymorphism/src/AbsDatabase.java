public abstract class AbsDatabase {

    abstract void open();
    abstract void readData();
    abstract boolean writeData();
    public void closeTheDatabase(){
        System.out.println("Terminate the connection to close it");
    }
}
class Informix extends AbsDatabase{

    @Override
    void open() {
        System.out.println("opening the informix database class");
    }

    @Override
    void readData() {
        System.out.println("reading the data from informix");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully ");
        return true;
    }
}
class MySQLServer extends AbsDatabase{

    @Override
    void open() {
        System.out.println("opening the sqlserver database class");
    }

    @Override
    void readData() {
        System.out.println("reading the data from the MYSQLServer");

    }

    @Override
    boolean writeData() {
        System.out.println("data written successfully");
        return true;
    }
}
