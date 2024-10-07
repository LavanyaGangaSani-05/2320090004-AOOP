package Interface;

import java.util.Comparator;

public class CourseComparator implements Comparator<Course> {
    // Compare courses by course name
    @Override
    public int compare(Course c1, Course c2) {
        return c1.getCourseName().compareTo(c2.getCourseName());
    }
}

