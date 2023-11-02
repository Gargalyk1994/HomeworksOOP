package Homework3And4;

public class TeacherController {
    TeacherService teacherService = new TeacherService();
    TeacherView teacherView = new TeacherView();

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void createTeacher(Teacher teacher){
        teacherService.createTeacher(teacher);
    }
}
