package Repository;

import model.Student;

public abstract interface IStudentRepository {
    Student[] getListStudent();
    void addStudent(Student student);
    void deleteStudentById(int id);
}
