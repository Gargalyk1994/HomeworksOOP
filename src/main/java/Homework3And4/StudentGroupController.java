package Homework3And4;

import java.util.List;

public class StudentGroupController extends UserController<User> {
    StudentGroupService studentGroupService = new StudentGroupService();
    StudentView studentView = new StudentView();

    public StudentGroupController(UserView userView, StreamService streamService) {
        super(userView, streamService);
    }

    public void createStudentGroup(Teacher teacher,List<Student> studentList){
        studentGroupService.createStudentGroup(teacher,studentList);

    }
}
