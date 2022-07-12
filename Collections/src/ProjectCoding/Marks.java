package ProjectCoding;

abstract public class Marks {


    Marks(){
    }

    void getAverage(){

    }

}
class  StudentA extends Marks{
    int sub1;
    int sub2;
    int sub3;

    StudentA(int sub1,int sub2,int sub3) {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;

    }

    @Override
    void getAverage() {
        System.out.println("the average of student class 1="+(sub3+sub1+sub2)/3);

    }
}
class StudentB extends Marks{
    int sub1;
    int sub2;
    int sub3;

    int sub4;



    public StudentB(int sub1,int sub2, int sub3,int sub4) {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }

    @Override
    void getAverage() {
        System.out.println("the average of student B IS ="+(sub3+sub1+sub2+sub4)/4 );
    }

    public static void main(String[] args) {
        Marks marks=new StudentA(22,44,95);
        marks.getAverage();
        Marks marks1=new StudentB(22,44,55,76);
        marks1.getAverage();
    }

}
