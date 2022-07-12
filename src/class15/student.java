package class15;

public class student {
  String name;
  int ID;
  static int numberOfStudents;

  public static void main(String[]args){
    student st1 = new student();
    st1.name = "Mujahid";
    st1.ID = 500;
    st1.numberOfStudents++;

    student st2 = new student();
    st2.name = "Ahmad";
    st2.ID = 600;
    st2.numberOfStudents++;

    student st3 = new student();
    st3.name = "Tarshi";
    st3.ID = 700;
    st3.numberOfStudents++;

    System.out.println(numberOfStudents);
  }
}
