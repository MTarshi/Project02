package MAP;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> groceries = new HashMap<>();
        groceries.put("eggs",12);
        groceries.put("Milk",3);
        groceries.put("Apple",3);
        groceries.put("Fish",25);

        System.out.println(groceries.get("Milk"));
        System.out.println(groceries.get("Fish"));
    }
}
