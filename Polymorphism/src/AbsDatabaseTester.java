public class AbsDatabaseTester {

    public static void main(String[] args) {

        AbsDatabase [] absDatabases = {new Informix(), new MySQLServer()};

        for (AbsDatabase database:absDatabases){
            database.open();
            database.readData();
            database.writeData();
            database.closeTheDatabase();

        }
    }
}
