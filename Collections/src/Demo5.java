import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("GIT");
        subjects.add("Java");
        System.out.println(subjects.indexOf("GIT"));
    }
}
