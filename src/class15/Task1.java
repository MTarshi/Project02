package class15;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Task1 {

    void printLarger(int num1, int num2){
        int larger = 0;
        if(num1>num2){
            larger=num1;
        }else if(num2>num1){
            larger=num2;
        }else {
            larger=num1;
        }
        System.out.println(larger);
    }
    public static void main(String[]args){
      //create a method that will take 2 parameters as numbers
      //and prints which number is bigger.
        Task1 task1=new Task1();
        task1.printLarger(12,24);

    }
}
