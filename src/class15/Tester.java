package class15;

public class Tester {

    public static void main(String[]args){
        Employee employee = new Employee();
        employee.name = "Mike";
        employee.department = "IT Saver";
        //employee.salary = 200000;
        //In here we wanted to access data inside Employee class.
        //in that class all other data is public that we can access
        //them very eary. But the salary part is private
        //therefore, we cannot access it and it give us error.
        //thats why we ignore it in this part.

    }
}
