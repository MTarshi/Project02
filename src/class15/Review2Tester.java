package class15;

public class Review2Tester {

    //This class is connected with class "ReviewClass2".
    public static void main(String[]args){
        Reviewclass2 str = new Reviewclass2("abcsssesda");
        int count = str.countChars('s');
        System.out.println(count);

        str.printChars('a');
    }
}
