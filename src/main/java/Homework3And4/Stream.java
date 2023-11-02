package Homework3And4;

import java.util.Iterator;
import java.util.List;


public class Stream implements Iterable<StudentGroup> {
    private String nameStream;
    private List<StudentGroup> studentGroups;


    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public Stream(String nameStream, List<StudentGroup> studentGroups) {
        this.nameStream = nameStream;
        this.studentGroups = studentGroups;
    }


    @Override
    public String toString() {
        return "Stream{" +
                "nameStream='" + nameStream + '\'' +
                ", studentGroups=" + studentGroups +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}


