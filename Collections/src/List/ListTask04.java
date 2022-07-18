package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTask04 {
    public static void main(String[] args) {
        //Create an arrayList of even numbers from 1 to 500.
        // Remove any number that is divisible by 5 from that arrayList.
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(int i=2; i<500; i+=2){
            evenNumbers.add(i);
        }
        Iterator<Integer> iterator = evenNumbers.iterator();
        while (iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }
        //evenNumbers.removeIf(num->num%5==0); //This is Lumbda method.
        System.out.println(evenNumbers);
    }
}