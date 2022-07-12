package class15;

public class Task4 {
    //create a method that will say Hello in different language based
    //on the country that will be passed when method is executed.

    void sayHello(String country){
        String hello;
        //to Use the lower case option
        //country=country.toLowerCase();
        switch (country){
            case "USA":
            hello = "Hola";
            break;
            case "Russia":
                hello = "Privet";
                break;
            case "France":
                hello = "bonjour";
                break;
            case "Pakistan":
                hello = "Assalam o Alykum";
                break;
            case "India":
                hello = "Namasty";
                break;
            case "Turkiye":
                hello = "Merhaba";
                break;
            default:
                hello = "country not found";
        }
        System.out.println(hello);
    }
    public static void main(String[]args){
        Task4 task4 = new Task4();
        task4.sayHello("France");
    }
}
