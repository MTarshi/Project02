package SET;

import java.util.HashSet;

public class SetDemo01 {
    public static void main(String[] args) {
        HashSet<String> fruit = new HashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Orange");

        System.out.println(fruit);
    }
}
