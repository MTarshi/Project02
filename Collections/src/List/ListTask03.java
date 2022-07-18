package List;

import java.util.ArrayList;

public class ListTask03 {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has letter
        // "a" or "e" replace it with water

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Pati Chai");
        drinks.add("Voda");
        drinks.add("Whiskey");
        drinks.add("Coffee");
        drinks.add("Ayran");
        drinks.add("Milk");
        drinks.add("Margarita");

        for(int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
              drinks.set(i, "Water"); //replaced
            }
        }
        System.out.println(drinks);
    }
}
