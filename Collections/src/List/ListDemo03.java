package List;

import java.util.ArrayList;

public class ListDemo03 {
    public static void main(String[] args) {
        ArrayList<String> legends= new ArrayList<>();
        legends.add("Hamid"); //index 0
        legends.add("Karla"); //index 1
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        legends.add("Yusuf");
        legends.add("Herbert");
        legends.add("Yusuf"); //index 7
        System.out.println(legends.get(4)); //gettomg from index no
        System.out.println(legends.get(2));
        System.out.println(legends);

        legends.set(0,"Hamid Jan"); //replace from the index.
        System.out.println(legends);

        System.out.println(legends.indexOf("Yusuf")); //outcome is 4

        System.out.println(legends.lastIndexOf("Yusuf")); //getting the last one

        System.out.println(legends.subList(0,3)); //3-0 = 3 so we get index from 0 to 2 not 3



    }
}
