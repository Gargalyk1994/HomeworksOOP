package Homework3And4;


import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic, int dateOfBirth) {
        int countMaxId = 0;
        for (User user: this.users){
            if(user instanceof Student){
                if (((Student) user).getStudentId() > countMaxId){
                    countMaxId = ((Student) user).getStudentId();
                }
            }
        }
        countMaxId++;

        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        this.users.add(student);
    }
}