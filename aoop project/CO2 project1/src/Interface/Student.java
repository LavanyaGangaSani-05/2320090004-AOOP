package Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student implements Cloneable, Iterable<Course> {
    private String studentID;
    private String studentName;
    private List<Course> registeredCourses;

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.registeredCourses = new ArrayList<>();
    }

    // Register a course for the student
    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }

    // Getters
    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    // Implement Cloneable to create a deep copy of the student
    @Override
    public Student clone() {
        try {
            Student clonedStudent = (Student) super.clone();
            clonedStudent.registeredCourses = new ArrayList<>();
            for (Course course : this.registeredCourses) {
                clonedStudent.registeredCourses.add(course.clone());
            }
            return clonedStudent;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Implement Iterable to iterate over the courses
    @Override
    public Iterator<Course> iterator() {
        return registeredCourses.iterator();
    }

    @Override
    public String toString() {
        return studentID + " - " + studentName;
    }
}

