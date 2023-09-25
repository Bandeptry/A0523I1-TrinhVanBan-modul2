package Repository.imp;

import model.Student;
import Repository.IStudentRepository;


public abstract class StudentRepository implements IStudentRepository{
    private static Student[]  students = new Student[20];
    static {
        students[0]= new Student(1,"chanh1","C05");
        students[1]= new Student(2,"chanh2","C05");
        students[2]= new Student(3,"chanh3","C05");
    }

    public static Student[] getStudents() {
        return students;
    }

    @Override
    public void addStudent(Student student) {
        for (int i=0; i< students.length;i++){
            if (students[i]==null){
                students[i]= student;
                break;
            }
        }

    }

    @Override
    public void deleteStudentById(int id) {
        for (int i=0; i< students.length;i++){
            if (students[i].getId()==id){
                students[i] = null;
                break;
            }
        }

    }
}
