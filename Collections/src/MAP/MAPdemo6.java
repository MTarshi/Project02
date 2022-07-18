package MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MAPdemo6 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2000.0); //auto upcasting does not work with wrappers
        fruit.put("Orange",20.5);
        fruit.put("Kiwi",10.2);
        fruit.put("Banana",10.2);
        fruit.put("Peach",10.5);

        Set<String> keys = fruit.keySet();

        keys.removeIf(key -> key.contains("e"));
        //This is the shortest form compare the below form. so we comment the
        //below form.

        //Iterator<String> iterator = keys.iterator();
        //while(iterator.hasNext()){
            //if(iterator.next().contains("e")){
        // iterator.remove();
        System.out.println(fruit);
            }

        }

              //  }
              //  }
