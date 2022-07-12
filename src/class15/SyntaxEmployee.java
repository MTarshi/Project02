package class15;

public class SyntaxEmployee {
    int EmployeeID;
    int salary;
    //Whenever we are sure that two objects of a class can have
    //different values for a variable or if we have to share
    //that variable between two or more methods of that class
    //we should always go with instance variables.
    static String ceo = "Sumair";

    void employeeInfo(){
        System.out.println("Employee ID is "+EmployeeID+" Employee Salary "+salary+" and CEO is "+ceo);

    }
    public static void main(String[]args){
        SyntaxEmployee syn = new SyntaxEmployee();
        syn.EmployeeID = 001;
        syn.salary = 120000;
        syn.employeeInfo();

        SyntaxEmployee syn2 = new SyntaxEmployee();
        syn2.EmployeeID = 002;
        syn2.salary = 150000;
        syn2.employeeInfo();
    }
}
