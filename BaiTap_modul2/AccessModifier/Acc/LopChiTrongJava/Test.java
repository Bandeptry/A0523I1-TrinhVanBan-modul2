package Acc.LopChiTrongJava;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ban");
        student.setClasses("C05");
        System.out.print("Sau khi thiet lap: " + student.name + " ");
        System.out.println(student.classes);
    }

}
