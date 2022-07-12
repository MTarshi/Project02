public class PolyTask1 {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent,
    // CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of
    // the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism
}
class Student{

    void study(){
        System.out.println("Student must study");
    }
    void doHomeWork(){
        System.out.println("Student should do homework");
    }
    void practice(){
        System.out.println("Student must practice");
    }

}
class SyntaxStudent extends Student{
    @Override
    void study(){
        System.out.println("Syntax student must learn programming");
    }
    void doHomeWork(){
        System.out.println("Syntax student must solve the repls to get a good job");
    }
    void practice(){
        System.out.println("Syntax student must practice to get a good job");
    }
}
class CollegeStudent extends Student{
    @Override
    void study(){
        System.out.println("College student must learn math");
    }

}
class SchoolStudent extends Student{

}
