package MAP;

import java.util.HashMap;

public class MAPdemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple",2000.00);
        fruit.put("Orange",20.5);
        fruit.put("Kiwi",10.2);
        fruit.put("Banana",50.5);
        fruit.put("Apple",10.5);
        System.out.println(fruit);
        //it print apple 10.5 because it overrides and get the last one.
        System.out.println(fruit.get("Kiwi")); //to get the Kiwi.
        System.out.println(fruit.remove("Orange"));
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(10.2));
        System.out.println(fruit.isEmpty());
        fruit.replace("Kiwi",15.2); //replace the price of the Kiwi
        System.out.println(fruit);
    }
}
