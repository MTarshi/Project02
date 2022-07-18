package MAP;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MAPdemo4 {
    public static void main(String[] args) {
        TreeMap<String,Integer> fruit = new TreeMap<>();
        fruit.put("Apple",20);
        fruit.put("WaterMelon",25);
        fruit.put("Peach",20);
        fruit.put("Strawberry",100);


        TreeMap<String,Integer> cosmetics = new TreeMap<>();
        cosmetics.put("foundation",20);
        cosmetics.put("lipstick",25);
        cosmetics.put("mascara",20);
        cosmetics.put("Blush",100);

        LinkedHashMap<String,Integer> groceries = new LinkedHashMap<>();
        //groceries.putAll(fruit);
        groceries.putAll(cosmetics);
        System.out.println(groceries);
    }
}
