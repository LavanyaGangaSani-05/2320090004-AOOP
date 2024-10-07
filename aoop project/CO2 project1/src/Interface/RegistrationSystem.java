package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RegistrationSystem {
    private List<Student> students;

    public RegistrationSystem() {
        students = new ArrayList<>();
    }

    // Add a student to the system
    public void addStudent(Student student) {
        students.add(student);
    }

    // Sort courses by course code (default Comparable implementation)
    public void sortCoursesByCode(Student student) {
        Collections.sort(student.getRegisteredCourses());
    }

    // Sort courses by course name (Comparator implementation)
    public void sortCoursesByName(Student student) {
        Collections.sort(student.getRegisteredCourses(), new CourseComparator());
    }

    // Display registered courses for a student
    public void displayCourses(Student student) {
        System.out.println("Courses for " + student.getStudentName() + ":");
        for (Course course : student) {
            System.out.println(course);
        }
    }

    public static void main(String[] args) {
        // Create some courses
        Course c1 = new Course("CS101", "Data Structures", 4);
        Course c2 = new Course("CS102", "Algorithms", 3);
        Course c3 = new Course("CS103", "Operating Systems", 4);

        // Create a student and register courses
        Student student1 = new Student("S001", "Alice");
        student1.registerCourse(c1);
        student1.registerCourse(c2);
        student1.registerCourse(c3);

        // Create the registration system
        RegistrationSystem system = new RegistrationSystem();
        system.addStudent(student1);

        // Display courses before sorting
        system.displayCourses(student1);

        // Sort and display by course code (default)
        system.sortCoursesByCode(student1);
        System.out.println("\nCourses sorted by Course Code:");
        system.displayCourses(student1);

        // Sort and display by course name
        system.sortCoursesByName(student1);
        System.out.println("\nCourses sorted by Course Name:");
        system.displayCourses(student1);
    }
}
