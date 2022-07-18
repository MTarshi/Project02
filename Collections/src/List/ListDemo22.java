package List;

import com.sun.javafx.collections.VetoableListDecorator;

import java.util.ArrayList;
import java.util.Iterator;



public class ListDemo22 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.add("Come");
        words.add("Frame");
        words.add("Game");
//never use loops, simple for loop, enhanced for loop or while loop whenever
        //you are planning to use any method that can change the size of
        //a list.
        //Iterator<String> iterator = words.iterator();
        //System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());
        //System.out.println(iterator.hasNext());


        //while (iterator.hasNext()){
            //System.out.println(iterator.next());
           // if(iterator.next().endsWith("e")){
               // iterator.remove();
            }
        }
        //System.out.println(words);
   // }
//}
