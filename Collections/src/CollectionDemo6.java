import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo6 {
    public static void main(String[] args) {
        //if a class implements an interface we can store the object of that class
        //inside a variable of type interface.
        Collection<String> list = new ArrayList<>();
        list.add("Genna");
    }
}
