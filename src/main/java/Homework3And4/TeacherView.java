package Homework3And4;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sendOnConsole(List<Teacher> teacherList) {
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }
}
