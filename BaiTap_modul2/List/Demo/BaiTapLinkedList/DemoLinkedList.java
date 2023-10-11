import java.util.LinkedHashSet;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedHashSet<Student> students = new LinkedHashSet<Student>();
        students.add(new Student(1,"Ban","c05" ));
        students.add(new Student(3,"Ban","c05" ));
        students.add(new Student(2,"Bandeptrai","c05" ));
        for (int i = 0; i < students.size(); i++){
            System.out.println(students);
        }
    }
}
