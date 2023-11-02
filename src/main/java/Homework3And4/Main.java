package Homework3And4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("Иванов", "Виктор", "Степанович", 1989, 1);
        Student stud2 = new Student("Петров", "Владимир", "Романович", 1987, 2);
        Student stud3 = new Student("Антонов", "Антон", "Сергеевич", 1995, 3);
        Student stud4 = new Student("Грибанов", "Петр", "Антонович", 2001, 4);
        Student stud5 = new Student("Груздев", "Сергей", "Дмитриевич", 2003, 5);
        Student stud6 = new Student("Литвиненко", "Василий", "Иванович", 2006, 6);
        Student stud7 = new Student("Гаргалык", "Василий", "Иванович", 2006, 7);
        Student stud8 = new Student("Гутынина", "Василий", "Иванович", 2006, 8);
        Student stud9 = new Student("Божок", "Василий", "Иванович", 2006, 9);
        Student stud10 = new Student("Мякишева", "Ольга", "Ивановна", 2006, 10);
        Student stud11 = new Student("Лукьяненко", "Василий", "Иванович", 2006, 11);
        Student stud12 = new Student("Одинцов", "Василий", "Иванович", 2006, 12);
        Teacher teacher1 = new Teacher("Артемов", "Федор", "Андреевич", 1975);
        Teacher teacher2 = new Teacher("Глушко", "Федор", "Андреевич", 1989);
        Teacher teacher3 = new Teacher("Лейсан", "Максим", "Андреевич", 1972);
        Teacher teacher4 = new Teacher("Воля", "Федор", "Андреевич", 1974);
        List<Student> studentList1 = new ArrayList<Student>(List.of(stud1,stud2,stud3));
        List<Student> studentList2 = new ArrayList<Student>(List.of(stud4,stud5,stud6));
        List<Student> studentList3 = new ArrayList<Student>(List.of(stud7,stud8,stud9));
        List<Student> studentList4 = new ArrayList<Student>(List.of(stud10,stud11,stud12));

        StudentGroup studentGroup1 = new StudentGroup(teacher1, studentList1);
        StudentGroup studentGroup2 = new StudentGroup(teacher2, studentList1);
        StudentGroup studentGroup3 = new StudentGroup(teacher3, studentList1);
        StudentGroup studentGroup4 = new StudentGroup(teacher4, studentList1);

        Stream stream1 = new Stream("Архитектура", List.of(studentGroup1,studentGroup2));
        Stream stream2 = new Stream("Строительство", List.of(studentGroup3,studentGroup4));
        System.out.println(stream1);


    }

}
