package class15;

public class Task5 {
    //create a method createEmail(). based on values of user name,
    //lastName and email type, your method should return complet email address.
    //example: creatEmail(john, snow, gmail) -->johnsnow@gmail.com

    String completeEmail(String firstName, String lastName, String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }
    public static void main(String[]args){
        Task5 task = new Task5();
        System.out.println(task.completeEmail("Tara","Sitara","gmail"));
    }
}
