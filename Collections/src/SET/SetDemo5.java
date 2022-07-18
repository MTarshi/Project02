package SET;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
   //when we pass the list to the constructor of the set and java will create
        //a set out of that list using the same approach we get a list back from the set.
      // numbers=new ArrayList<>(new LinkedHashSet<>(numbers)); //one way is like this.

        //ANOTHER WAY IS LIKE THIS:
   LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(); //Creating a set
        linkedHashSet.addAll(numbers); // adding all the elements from the list to the set
        numbers=new ArrayList<>(); //create a new array
        numbers.addAll(linkedHashSet); // adding unique elements*/

        System.out.println(numbers);



    }
}
