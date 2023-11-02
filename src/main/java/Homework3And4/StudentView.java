package Homework3And4;

import java.util.List;

public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConsole(List<Student> studentList) {
        for (Student student: studentList) {
            System.out.println(student);
        }
    }
}
