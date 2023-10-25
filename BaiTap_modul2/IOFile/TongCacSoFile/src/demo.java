import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
//        List<Student> students = new ArrayList<>();
        Student student = new Student(3,"Ban", 20);
        try {
            FileWriter fileWriter = new FileWriter("data.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student.toString());
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
