package Homework3And4;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        int sizeStudentGroup1 = o1.getStudentGroups().size();
        int sizeStudentGroup2 = o2.getStudentGroups().size();
        return Integer.compare(sizeStudentGroup1,sizeStudentGroup2);
    }
}
