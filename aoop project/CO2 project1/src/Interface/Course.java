package Interface;

import java.util.Objects;

public class Course implements Comparable<Course>, Cloneable {
    private String courseCode;
    private String courseName;
    private int credits;

    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    // Implement Comparable to compare courses by course code
    @Override
    public int compareTo(Course other) {
        return this.courseCode.compareTo(other.courseCode);
    }

    // Implement Cloneable to create a deep copy
    @Override
    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return credits == course.credits &&
                Objects.equals(courseCode, course.courseCode) &&
                Objects.equals(courseName, course.courseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseCode, courseName, credits);
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseName + " (" + credits + " credits)";
    }
}
