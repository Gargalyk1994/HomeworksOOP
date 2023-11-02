package Homework3And4;

public class Student extends User implements Comparable<Student> {
    private int studentId;


    public Student(String firstName, String secondName, String patronymic, int dateOfBirth, int studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.studentId.compareTo(o.studentId);
//    }
}
