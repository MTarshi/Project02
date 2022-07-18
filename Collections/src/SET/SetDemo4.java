package SET;

import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        TreeSet<String> letters2 = new TreeSet<>();
        letters2.add("az");
        letters2.add("ab");
        letters2.add("ca");
        letters2.add("dc");
        System.out.println(letters2);
        //it sorts out the string by order.
    }
}
