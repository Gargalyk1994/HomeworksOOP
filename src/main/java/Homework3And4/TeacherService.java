package Homework3And4;

import java.lang.annotation.Target;
import java.util.List;

public class TeacherService {
    private Teacher teacher;

    public void createTeacher(Teacher teacher) {
        this.teacher = new Teacher();
    }

    public void changeTeacherById(Teacher teacher){
        if (teacher.getTeacherId() > 0){
            teacher.setTeacherId();
        }
        //setTeacher(teacher);
    }

    public void createTeacherList (List<Teacher> teacherList){
        for (Teacher teacher: teacherList) {
            teacher.setTeacherId(1L);
        }
    }
}
