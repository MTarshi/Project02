package MAP;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MAPdemo9 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 2000.0); //auto upcasting does not work with wrappers
        fruit.put("Orange", 20.5);
        fruit.put("Kiwi", 10.2);
        fruit.put("Banana", 10.2);
        fruit.put("Peach", 10.5);
        Iterator<Map.Entry<String,Double>> iterator = fruit.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Double> en=iterator.next();
            if(iterator.next().getKey().contains("e")&&iterator.next().getValue()>15){
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}
