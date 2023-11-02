package Homework3And4;


import java.util.List;

public class UserController<T extends User> {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final UserView userView;
    private StreamService streamService;

    public void createStudent(String firstName, String secondName, String patronymic, int dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }

    public UserController(UserView userView, StreamService streamService) {
        this.userView = userView;
        this.streamService = streamService;
    }

    public List<Stream> sortListStream(List<Stream> streams){
        return streamService.sortStreams(streams);
    }
}